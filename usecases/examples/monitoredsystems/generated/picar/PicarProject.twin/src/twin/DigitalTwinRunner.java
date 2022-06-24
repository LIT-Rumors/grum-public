package twin;

import api.BrokerConfig;
import at.jku.se.mosumo.tools.logging.ILogger;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import mqtt.MQTTPublisher;
import mqtt.MQTTSubscriber;

public class DigitalTwinRunner {

	private static final ILogger LOGGER = LoggerProvider.getLogger(DigitalTwinRunner.class);

	public void setup() throws Exception {
		MQTTSubscriber manager = new MQTTSubscriber(BrokerConfig.URL);
		manager.connect((topic, message) -> {
			TwinManager.getInstance().process(topic, message);
		});
		MQTTPublisher.getInstance().connect(BrokerConfig.URL);
		manager.subscribe("register/picar");
		manager.subscribe("+/location");
		manager.subscribe("+/status");
		TwinManager.getInstance().initialize();
	}

	static public void main(String[] args) throws Exception {
		try {
			new DigitalTwinRunner().setup();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}