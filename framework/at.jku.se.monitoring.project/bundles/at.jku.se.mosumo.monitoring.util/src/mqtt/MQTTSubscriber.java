package mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

import at.jku.se.mosumo.tools.logging.ILogger;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import measure.TimingObject;

/**
 *
 *
 * Utility Class for connecting to an MQTT broker and subscribing to topics
 * 
 * @author michael
 *
 */
public class MQTTSubscriber {

	private static final ILogger LOGGER = LoggerProvider.getLogger(MQTTSubscriber.class);

	private final String broker;// = "tcp://localhost:1883";
	private MqttClient mqttClient;

	public MQTTSubscriber(String broker) {
		this.broker = broker;
	}

	public void connect(final IMessageListener listener) throws MqttSecurityException, MqttException {
		mqttClient = new MqttClient(broker, String.valueOf(System.nanoTime()));
		MqttConnectOptions connOpts = new MqttConnectOptions();
		connOpts.setCleanSession(true); // no persistent session
		connOpts.setKeepAliveInterval(1000);
		int qos = 1;

		mqttClient.connect();
		mqttClient.setCallback(new MqttCallback() {

			@Override
			public void messageArrived(String topic, MqttMessage message) throws Exception {
				listener.messageArrived(topic,new String(message.getPayload()));
				if(listener instanceof ITimingMessageListener) {
					TimingObject  timingObject = TimingObject.create(topic);
					((ITimingMessageListener)listener).messageArrived(topic,new String(message.getPayload()),timingObject);
				}
				
			}

			@Override
			public void deliveryComplete(IMqttDeliveryToken token) {
			}

			@Override
			public void connectionLost(Throwable cause) {
			}
		});
		LOGGER.info("Connected to MQTT server" + broker);
	}

	public void subscribe(String topic) throws MqttException {
		if (mqttClient == null || !mqttClient.isConnected()) {
			throw new RuntimeException("Not connected!");
		}
		mqttClient.subscribe(topic);
		LOGGER.info("subscribed to topic: "+topic);
	}

}
