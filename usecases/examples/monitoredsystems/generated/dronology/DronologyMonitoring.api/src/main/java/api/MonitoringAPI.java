package api;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import java.text.DateFormat;

public class MonitoringAPI {

	private static final Logger LOGGER = LogManager.getLogger(MonitoringAPI.class);
	private static final MQTTPublisher publisher = MQTTPublisher.getInstance();
	private static final Gson GSON = new GsonBuilder().enableComplexMapKeySerialization().serializeNulls()
			.setDateFormat(DateFormat.LONG).setVersion(1.0).serializeSpecialFloatingPointValues()
			.serializeSpecialFloatingPointValues().create();

	static public void init() throws Exception {
		publisher.connect(BrokerConfig.URL);
	}

	static public void registerDrone(java.lang.String elementid) {
		String message = String.format("{ \"id\" : \"%s\" }", elementid);
		String topic = StringUtils.join(Constants.REGISTER, Constants.TOPIC_SEPARATOR, "drone");
		try {
			publisher.publish(topic, message);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}

	static public void updateoperationmode(java.lang.String parent, java.lang.Object message) {
		String topic = StringUtils.join(parent, Constants.TOPIC_SEPARATOR, "operationmode");
		String mqttmessage = GSON.toJson(message);
		try {
			publisher.publish(topic, mqttmessage);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}

	static public void updatedronestate(java.lang.String parent, java.lang.Object message) {
		String topic = StringUtils.join(parent, Constants.TOPIC_SEPARATOR, "dronestate");
		String mqttmessage = GSON.toJson(message);
		try {
			publisher.publish(topic, mqttmessage);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}

	static public void updatedronecommand(java.lang.String parent, java.lang.Object message) {
		String topic = StringUtils.join(parent, Constants.TOPIC_SEPARATOR, "dronecommand");
		String mqttmessage = GSON.toJson(message);
		try {
			publisher.publish(topic, mqttmessage);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}

	static public void updateflightcontrollerdata(java.lang.String parent, java.lang.Object message) {
		String topic = StringUtils.join(parent, Constants.TOPIC_SEPARATOR, "flightcontrollerdata");
		String mqttmessage = GSON.toJson(message);
		try {
			publisher.publish(topic, mqttmessage);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}

	static public void updateflightplan(java.lang.String parent, java.lang.Object message) {
		String topic = StringUtils.join(parent, Constants.TOPIC_SEPARATOR, "flightplan");
		String mqttmessage = GSON.toJson(message);
		try {
			publisher.publish(topic, mqttmessage);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}

	static public void updatestartupchecks(java.lang.String parent, java.lang.Object message) {
		String topic = StringUtils.join(parent, Constants.TOPIC_SEPARATOR, "startupchecks");
		String mqttmessage = GSON.toJson(message);
		try {
			publisher.publish(topic, mqttmessage);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}
}