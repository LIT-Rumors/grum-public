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
import at.jku.lit.grum.dronology.model.dronology.DronologyPackage;

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
		if (o instanceof at.jku.lit.grum.dronology.model.dronology.Drone) {
			topic = "drone";
		}
		if (o instanceof at.jku.lit.grum.dronology.model.dronology.Operationmode) {
			topic = "operationmode";
		}
		if (o instanceof at.jku.lit.grum.dronology.model.dronology.Dronestate) {
			topic = "dronestate";
		}
		if (o instanceof at.jku.lit.grum.dronology.model.dronology.Dronecommand) {
			topic = "dronecommand";
		}
		if (o instanceof at.jku.lit.grum.dronology.model.dronology.FlightControllerData) {
			topic = "flightcontrollerdata";
		}
		if (o instanceof at.jku.lit.grum.dronology.model.dronology.FlightPlan) {
			topic = "flightplan";
		}
		if (o instanceof at.jku.lit.grum.dronology.model.dronology.Startupchecks) {
			topic = "startupchecks";
		}
		if (o instanceof at.jku.lit.grum.dronology.model.dronology.Systemhealth) {
			topic = "systemhealth";
		}
		return Pair.create(topic, jsonString);
	}

	void init() {
		try {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("monitoring", new XMIResourceFactoryImpl());
			resourceSet = new ResourceSetImpl();
			resourceSet.getPackageRegistry().put(DronologyPackage.eINSTANCE.getNsURI(), DronologyPackage.eINSTANCE);
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
			case "drone" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.dronology.model.dronology.Drone element = mapper.reader()
						.forType(at.jku.lit.grum.dronology.model.dronology.Drone.class).readValue(data);
				element.setId(data.get("id").toString().replace("\"", ""));
				return element;
			}
			case "operationmode" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.dronology.model.dronology.Operationmode element = mapper.reader()
						.forType(at.jku.lit.grum.dronology.model.dronology.Operationmode.class).readValue(data);
				return element;
			}
			case "dronestate" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.dronology.model.dronology.Dronestate element = mapper.reader()
						.forType(at.jku.lit.grum.dronology.model.dronology.Dronestate.class).readValue(data);
				return element;
			}
			case "dronecommand" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.dronology.model.dronology.Dronecommand element = mapper.reader()
						.forType(at.jku.lit.grum.dronology.model.dronology.Dronecommand.class).readValue(data);
				return element;
			}
			case "flightcontrollerdata" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.dronology.model.dronology.FlightControllerData element = mapper.reader()
						.forType(at.jku.lit.grum.dronology.model.dronology.FlightControllerData.class).readValue(data);
				return element;
			}
			case "flightplan" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.dronology.model.dronology.FlightPlan element = mapper.reader()
						.forType(at.jku.lit.grum.dronology.model.dronology.FlightPlan.class).readValue(data);
				return element;
			}
			case "startupchecks" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.dronology.model.dronology.Startupchecks element = mapper.reader()
						.forType(at.jku.lit.grum.dronology.model.dronology.Startupchecks.class).readValue(data);
				return element;
			}
			case "systemhealth" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.dronology.model.dronology.Systemhealth element = mapper.reader()
						.forType(at.jku.lit.grum.dronology.model.dronology.Systemhealth.class).readValue(data);
				return element;
			}
			default :
				throw new DeserializationException("Can not process Element " + topic);
		}
	}
}