package api;

import Monitoring.MonitoringPackage;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.emfjson.jackson.module.EMFModule;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.eclipse.emf.common.util.URI;
import at.jku.se.mosumo.monitoring.util.*;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import at.jku.se.mosumo.tools.logging.ILogger;
import java.util.Map;
import at.jku.lit.grum.picar.model.picar.PicarPackage;

public class MessageFactory {

	private static final ILogger LOGGER = LoggerProvider.getLogger(MessageFactory.class);
	private JsonResourceFactory factory;
	private ObjectMapper mapper;
	private ResourceSetImpl resourceSet;
	private Resource resource;
	volatile static private MessageFactory INSTANCE;

	MessageFactory() {
		init();
	}

	static public MessageFactory getInstance() {
		if (INSTANCE == null) {
			synchronized (MessageFactory.class) {
				if (INSTANCE == null) {
					INSTANCE = new MessageFactory();
				}
			}
		}
		return INSTANCE;
	}

	public Pair toJson(java.lang.Object o) throws Exception {
		String jsonString = mapper.writeValueAsString(o);
		String topic = "";
		if (o instanceof at.jku.lit.grum.picar.model.picar.Picar) {
			topic = "picar";
		}
		if (o instanceof at.jku.lit.grum.picar.model.picar.Location) {
			topic = "location";
		}
		if (o instanceof at.jku.lit.grum.picar.model.picar.Status) {
			topic = "status";
		}
		return Pair.create(topic, jsonString);
	}

	void init() {
		try {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("monitoring", new XMIResourceFactoryImpl());
			resourceSet = new ResourceSetImpl();
			resourceSet.getPackageRegistry().put(PicarPackage.eINSTANCE.getNsURI(), PicarPackage.eINSTANCE);
			resourceSet.getPackageRegistry().put(MonitoringPackage.eINSTANCE.getNsURI(), MonitoringPackage.eINSTANCE);
			mapper = new ObjectMapper();
			EMFModule module = new EMFModule();
			mapper.registerModule(module);
			factory = new JsonResourceFactory(mapper);
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

	public Object process(java.lang.String topic, java.lang.String message) throws Exception {
		String type = topic.startsWith("register")
				? topic.replace("register/", "")
				: RegexUtil.getSingle(RegexUtil.TOPIC_TAIL_PATTERN, topic);
		switch (type) {
			case "picar" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.picar.model.picar.Picar element = mapper.reader()
						.forType(at.jku.lit.grum.picar.model.picar.Picar.class).readValue(data);
				element.setId(data.get("id").toString().replace("\"", ""));
				return element;
			}
			case "location" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.picar.model.picar.Location element = mapper.reader()
						.forType(at.jku.lit.grum.picar.model.picar.Location.class).readValue(data);
				return element;
			}
			case "status" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.picar.model.picar.Status element = mapper.reader()
						.forType(at.jku.lit.grum.picar.model.picar.Status.class).readValue(data);
				return element;
			}
			default :
				throw new DeserializationException("Can not process Element " + topic);
		}
	}
}