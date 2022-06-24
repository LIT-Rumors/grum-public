package middleware;

import api.MessageFactory;
import api.BrokerConfig;
import mqtt.MQTTPublisher;
import at.jku.se.mosumo.monitoring.util.ManagedHashTableList;
import mqtt.MQTTSubscriber;
import mqtt.IElementListener;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import at.jku.se.mosumo.tools.logging.ILogger;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;
import validation.IViolation;

public class MonitoringMiddleware {

	private static final ILogger LOGGER = LoggerProvider.getLogger(MonitoringMiddleware.class);
	MQTTSubscriber subscriber;
	volatile static MonitoringMiddleware INSTANCE;
	private final ManagedHashTableList<Class, IElementListener> listeners = new ManagedHashTableList<>();
	private final String FORWARD_PREFIX = "_MiddlewareFordward";

	static public MonitoringMiddleware getInstance() {
		if (INSTANCE == null) {
			synchronized (MonitoringMiddleware.class) {
				if (INSTANCE == null) {
					INSTANCE = new MonitoringMiddleware();
				}
			}
		}
		return INSTANCE;
	}

	public void init() throws Exception {
		subscriber = new MQTTSubscriber(BrokerConfig.URL);
		MQTTPublisher.getInstance().connect(BrokerConfig.URL);
		try {
			subscriber.connect((topic, message) -> {
				messageArrived(topic, message);
			});
			subscriber.subscribe(FORWARD_PREFIX + "/_drone");
			subscriber.subscribe(FORWARD_PREFIX + "/_operationmode");
			subscriber.subscribe(FORWARD_PREFIX + "/_dronestate");
			subscriber.subscribe(FORWARD_PREFIX + "/_dronecommand");
			subscriber.subscribe(FORWARD_PREFIX + "/_flightcontrollerdata");
			subscriber.subscribe(FORWARD_PREFIX + "/_flightplan");
			subscriber.subscribe(FORWARD_PREFIX + "/_startupchecks");
			subscriber.subscribe(FORWARD_PREFIX + "/_systemhealth");
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

	public void notify(java.lang.Object elem) throws Exception {
		Class<?> interf = elem.getClass().getInterfaces()[0];
		for (IElementListener i : listeners.get(interf)) {
			i.updateElement(elem);
		}
	}

	public void sendViolation(IViolation violation) {
		LOGGER.info("NEW VIOLATION:" + violation.toString());
	}

	public void messageArrived(java.lang.String topic, java.lang.String message) {
		try {
			topic = topic.replace(FORWARD_PREFIX + "/_", "");
			Object elem = MessageFactory.getInstance().process(topic, message);
			notify(elem);
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

	public void registerOperationmodeStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.dronology.model.dronology.Operationmode.class, listener);
	}

	public void registerDronestateStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.dronology.model.dronology.Dronestate.class, listener);
	}

	public void registerDronecommandStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.dronology.model.dronology.Dronecommand.class, listener);
	}

	public void registerFlightControllerDataStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.dronology.model.dronology.FlightControllerData.class, listener);
	}

	public void registerFlightPlanStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.dronology.model.dronology.FlightPlan.class, listener);
	}

	public void registerStartupchecksStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.dronology.model.dronology.Startupchecks.class, listener);
	}

	public void registerDroneRegistered(IElementListener listener) {
		listeners.add(at.jku.lit.grum.dronology.model.dronology.Drone.class, listener);
	}

	public void registerSystemhealthStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.dronology.model.dronology.Systemhealth.class, listener);
	}

	public void setSystemhealth(java.lang.String agentid, java.lang.String value) {
		try {
			MQTTPublisher.getInstance().publish(agentid + "/systemhealth", value);
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}
}