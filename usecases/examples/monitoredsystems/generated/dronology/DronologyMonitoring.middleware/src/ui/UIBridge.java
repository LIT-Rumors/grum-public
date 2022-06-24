package ui;

import api.MessageFactory;
import api.BrokerConfig;
import middleware.MonitoringMiddleware;
import mqtt.MQTTPublisher;
import at.jku.se.mosumo.monitoring.util.ManagedHashTableList;
import mqtt.MQTTSubscriber;
import mqtt.PublishException;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import at.jku.se.mosumo.tools.logging.ILogger;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;
import validation.IViolation;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UIBridge {

	private static final ILogger LOGGER = LoggerProvider.getLogger(UIBridge.class);
	static String prefix;
	static String parent;
	final static String regex = "\"id\"\\s?:\\s?\"(.*?)\"";
	static private final ObjectMapper mapper = new ObjectMapper();
	static private final List<RegisterElem> registered = new ArrayList<>();

	static public void main(String[] args) {
		try {
			MonitoringMiddleware.getInstance().init();
			connect();
			register();
			announceSystem();
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

	static void connect() throws Exception {
		MQTTSubscriber c = new MQTTSubscriber(BrokerConfig.URL);
		c.connect((t, m) -> {
			if (t.equals("requestregistered")) {
				try {
					String jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(registered);
					MQTTPublisher.getInstance().publish("getregistered", jsonResult);
				} catch (Exception e) {
					LOGGER.error(e);
				}
			}
		});
		c.subscribe("requestregistered");
	}

	static void register() {
		MonitoringMiddleware.getInstance().registerDroneRegistered(e -> {
			registerElement(((at.jku.lit.grum.dronology.model.dronology.Drone) e).getId());
		});
		MonitoringMiddleware.getInstance().registerOperationmodeStateChange(e -> {
			updateElement(e);
		});
		MonitoringMiddleware.getInstance().registerDronestateStateChange(e -> {
			updateElement(e);
		});
		MonitoringMiddleware.getInstance().registerDronecommandStateChange(e -> {
			updateElement(e);
		});
		MonitoringMiddleware.getInstance().registerFlightControllerDataStateChange(e -> {
			updateElement(e);
		});
		MonitoringMiddleware.getInstance().registerFlightPlanStateChange(e -> {
			updateElement(e);
		});
		MonitoringMiddleware.getInstance().registerStartupchecksStateChange(e -> {
			updateElement(e);
		});
		MonitoringMiddleware.getInstance().registerSystemhealthStateChange(e -> {
			updateElement(e);
		});
	}

	static void updateElement(java.lang.Object e) {
		try {
			String jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
			String elemName = e.getClass().getInterfaces()[0].getSimpleName();
			String agentid = getId(jsonResult);
			MQTTPublisher.getInstance().publish(prefix + "/" + agentid + "/" + elemName, jsonResult);
		} catch (Exception ex) {
			LOGGER.error(ex);
		}
	}

	static String getId(java.lang.String jsonResult) {
		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(jsonResult);
		if (matcher.find()) {
			for (int i = 1; i <= matcher.groupCount(); i++) {
				return matcher.group(i).trim();
			}
		}
		return "";
	}

	static public void announceSystem() {
		RegisterElem elem = new RegisterElem("DroneSystem", "DroneSystem", "", " DroneSystem");
		prefix = "DroneSystem";
		parent = "DroneSystem";
		elem.setHeartbeat(999999);
		String jsonResult;
		try {
			jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(elem);
			MQTTPublisher.getInstance().publish("register", jsonResult);
			registered.add(elem);
		} catch (Exception ex) {
			LOGGER.error(ex);
		}
	}

	static void registerElement(java.lang.String id) {
		try {
			RegisterElem elem = new RegisterElem(id, "at.jku.lit.grum.dronology.model.dronology.Drone", "DroneSystem",
					prefix + "/" + id);
			String jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(elem);
			registered.add(elem);
			MQTTPublisher.getInstance().publish("register", jsonResult);
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}
}