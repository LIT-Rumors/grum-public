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

	static public void registerPicar(java.lang.String elementid) {
		String message = String.format("{ \"id\" : \"%s\" }", elementid);
		String topic = StringUtils.join(Constants.REGISTER, Constants.TOPIC_SEPARATOR, "picar");
		try {
			publisher.publish(topic, message);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}

	static public void updatelocation(java.lang.String parent, java.lang.Object message) {
		String topic = StringUtils.join(parent, Constants.TOPIC_SEPARATOR, "location");
		String mqttmessage = GSON.toJson(message);
		try {
			publisher.publish(topic, mqttmessage);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}

	static public void updatestatus(java.lang.String parent, java.lang.Object message) {
		String topic = StringUtils.join(parent, Constants.TOPIC_SEPARATOR, "status");
		String mqttmessage = GSON.toJson(message);
		try {
			publisher.publish(topic, mqttmessage);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}
}