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
			subscriber.subscribe(FORWARD_PREFIX + "/_turtlebot");
			subscriber.subscribe(FORWARD_PREFIX + "/_batterystatus");
			subscriber.subscribe(FORWARD_PREFIX + "/_diagnostics");
			subscriber.subscribe(FORWARD_PREFIX + "/_jointstate");
			subscriber.subscribe(FORWARD_PREFIX + "/_laserscan");
			subscriber.subscribe(FORWARD_PREFIX + "/_magneticfield");
			subscriber.subscribe(FORWARD_PREFIX + "/_odometry");
			subscriber.subscribe(FORWARD_PREFIX + "/_sensor");
			subscriber.subscribe(FORWARD_PREFIX + "/_velocity");
			subscriber.subscribe(FORWARD_PREFIX + "/_versioninfo");
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

	public void registerBatteryStatusStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus.class, listener);
	}

	public void registerDiagnosticsStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics.class, listener);
	}

	public void registerJointStateStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.turtlebot.model.turtlebot.JointState.class, listener);
	}

	public void registerLaserScanStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan.class, listener);
	}

	public void registerMagneticFieldStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField.class, listener);
	}

	public void registerOdometryStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.turtlebot.model.turtlebot.Odometry.class, listener);
	}

	public void registerSensorStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.turtlebot.model.turtlebot.Sensor.class, listener);
	}

	public void registerVelocityStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.turtlebot.model.turtlebot.Velocity.class, listener);
	}

	public void registerVersionInfoStateChange(IElementListener listener) {
		listeners.add(at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo.class, listener);
	}

	public void registerTurtleBotRegistered(IElementListener listener) {
		listeners.add(at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot.class, listener);
	}
}