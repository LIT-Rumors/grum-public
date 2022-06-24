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
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage;

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
		if (o instanceof at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) {
			topic = "turtlebot";
		}
		if (o instanceof at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus) {
			topic = "batterystatus";
		}
		if (o instanceof at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics) {
			topic = "diagnostics";
		}
		if (o instanceof at.jku.lit.grum.turtlebot.model.turtlebot.JointState) {
			topic = "jointstate";
		}
		if (o instanceof at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan) {
			topic = "laserscan";
		}
		if (o instanceof at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField) {
			topic = "magneticfield";
		}
		if (o instanceof at.jku.lit.grum.turtlebot.model.turtlebot.Odometry) {
			topic = "odometry";
		}
		if (o instanceof at.jku.lit.grum.turtlebot.model.turtlebot.Sensor) {
			topic = "sensor";
		}
		if (o instanceof at.jku.lit.grum.turtlebot.model.turtlebot.Velocity) {
			topic = "velocity";
		}
		if (o instanceof at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo) {
			topic = "versioninfo";
		}
		return Pair.create(topic, jsonString);
	}

	void init() {
		try {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("monitoring", new XMIResourceFactoryImpl());
			resourceSet = new ResourceSetImpl();
			resourceSet.getPackageRegistry().put(TurtlebotPackage.eINSTANCE.getNsURI(), TurtlebotPackage.eINSTANCE);
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
			case "turtlebot" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot element = mapper.reader()
						.forType(at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot.class).readValue(data);
				element.setId(data.get("id").toString().replace("\"", ""));
				return element;
			}
			case "batterystatus" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus element = mapper.reader()
						.forType(at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus.class).readValue(data);
				return element;
			}
			case "diagnostics" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics element = mapper.reader()
						.forType(at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics.class).readValue(data);
				return element;
			}
			case "jointstate" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.turtlebot.model.turtlebot.JointState element = mapper.reader()
						.forType(at.jku.lit.grum.turtlebot.model.turtlebot.JointState.class).readValue(data);
				return element;
			}
			case "laserscan" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan element = mapper.reader()
						.forType(at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan.class).readValue(data);
				return element;
			}
			case "magneticfield" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField element = mapper.reader()
						.forType(at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField.class).readValue(data);
				return element;
			}
			case "odometry" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.turtlebot.model.turtlebot.Odometry element = mapper.reader()
						.forType(at.jku.lit.grum.turtlebot.model.turtlebot.Odometry.class).readValue(data);
				return element;
			}
			case "sensor" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.turtlebot.model.turtlebot.Sensor element = mapper.reader()
						.forType(at.jku.lit.grum.turtlebot.model.turtlebot.Sensor.class).readValue(data);
				return element;
			}
			case "velocity" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.turtlebot.model.turtlebot.Velocity element = mapper.reader()
						.forType(at.jku.lit.grum.turtlebot.model.turtlebot.Velocity.class).readValue(data);
				return element;
			}
			case "versioninfo" : {
				JsonNode data = factory.getMapper().readTree(message);
				at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo element = mapper.reader()
						.forType(at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo.class).readValue(data);
				return element;
			}
			default :
				throw new DeserializationException("Can not process Element " + topic);
		}
	}
}