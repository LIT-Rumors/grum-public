package twin;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import at.jku.se.mosumo.monitoring.util.*;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import org.eclipse.emf.common.notify.Notification;
import at.jku.se.mosumo.tools.logging.ILogger;
import com.fasterxml.jackson.databind.ObjectMapper;
import api.*;
import mqtt.*;
import java.util.Map;

public class MiddlewareForwardingAdapter extends AdapterImpl {

	private static final ILogger LOGGER = LoggerProvider.getLogger(MiddlewareForwardingAdapter.class);
	private final String FORWARD_PREFIX = "_MiddlewareFordward";
	String id;
	private ObjectMapper mapper = new ObjectMapper();

	MiddlewareForwardingAdapter(java.lang.String id) {
		this.id = id;
	}

	public void notifyChanged(Notification msg) {
		Object elem = msg.getNewValue();
		LOGGER.info("notify " + id + "->" + elem.toString());
		try {
			Pair<String, String> toSend = MessageFactory.getInstance().toJson(elem);
			if (id != null) {
				Map<String, Object> map = mapper.readValue(toSend.getSecond(), Map.class);
				map.put("id", id);
				String ts = new ObjectMapper().writeValueAsString(map);
				toSend.setSecond(ts);
			}
			MQTTPublisher.getInstance().publish(FORWARD_PREFIX + "/_" + toSend.getFirst(), toSend.getSecond());
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}
}