package twin;

import at.jku.se.mosumo.monitoring.util.*;
import at.jku.se.mosumo.tools.logging.ILogger;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import api.*;
import mqtt.*;

public class DigitalTwinRunner {

	private static final ILogger LOGGER = LoggerProvider.getLogger(DigitalTwinRunner.class);

	public void setup() throws Exception {
		MQTTSubscriber manager = new MQTTSubscriber(BrokerConfig.URL);
		manager.connect((topic, message) -> {
			TwinManager.getInstance().process(topic, message);
		});
		MQTTPublisher.getInstance().connect(BrokerConfig.URL);
		manager.subscribe("register/drone");
		manager.subscribe("+/operationmode");
		manager.subscribe("+/dronestate");
		manager.subscribe("+/dronecommand");
		manager.subscribe("+/flightcontrollerdata");
		manager.subscribe("+/flightplan");
		manager.subscribe("+/startupchecks");
		manager.subscribe("+/systemhealth");
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