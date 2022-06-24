package api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;


public class MQTTPublisher  {

	private static final Logger LOGGER = LogManager.getLogger(MQTTPublisher.class);

	private static volatile MQTTPublisher instance;

	private String broker;// = "tcp://localhost:1883";
	private MqttClient mqttClient;

	private MQTTPublisher() {

	}

	public static MQTTPublisher getInstance() {
		if (instance == null) {
			synchronized (MQTTPublisher.class) {
				if (instance == null) {
					instance = new MQTTPublisher();
				}
			}
		}
		return instance;
	}

	public void connect(String broker) throws PublishException {
		this.broker = broker;
		try {
			mqttClient = new MqttClient(broker, String.valueOf(System.nanoTime()));

			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true); // no persistent session
			connOpts.setKeepAliveInterval(1000);
			int qos = 1;

			mqttClient.connect();
			mqttClient.setCallback(new MqttCallback() {

				@Override
				public void messageArrived(String topic, MqttMessage message) throws Exception {
					// TwinManager.getInstance().process(topic, new String(message.getPayload()));
				}

				@Override
				public void deliveryComplete(IMqttDeliveryToken token) {
				}

				@Override
				public void connectionLost(Throwable cause) {
					LOGGER.warn("Connection Lost!");
				}
			});
			LOGGER.info("Connected to MQTT server - " + broker +" - " + mqttClient.isConnected());
		} catch (MqttException e) {
			throw new PublishException(e.getMessage());
		}
	}

	public void publish(String topic, String message) throws PublishException {
		if (mqttClient == null || !mqttClient.isConnected()) {
			throw new RuntimeException("Not connected!");
		}
		try {
			MqttMessage msg = new MqttMessage();
			msg.setPayload(message.getBytes());

			mqttClient.publish(topic, msg);
		} catch (MqttException e) {
			throw new PublishException(e.getMessage());
		}
	}

}
