package at.jku.mosumo.generator.framework.shared;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import Monitoring.DerivedProperty;
import Monitoring.MOAgent;
import Monitoring.MOConfig;
import Monitoring.MOElement;
import Monitoring.MOProperty;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;
import at.jku.mosumo.generator.framework.util.MonitoringQueryUtils;

public class MessageFactory extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "MessageFactory";
	public static final String BROKER = "broker";
	public static final String TOPIC = "topic";

	public MessageFactory(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		javaClass.setPackage(MonitoringGeneratorUtils.API_PACKAGE).setName(CLASS_NAME);
		addFields(javaClass);
		addConstructor(javaClass);
		getInstanceMethod(javaClass);
		toJSONMethod(javaClass);
		initMethod(javaClass);
		processMethod(javaClass);

		createCompilationUnit(getPackageFragmentRoot(), MonitoringGeneratorUtils.API_PACKAGE, CLASS_NAME + ".java",
				javaClass.toString(), getMonitor());
	}

	private void initMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> initMethod = javaClass.addMethod().setStatic(false).setName("init");

		String packageName =  StringUtils.capitalize(getMoConfig().getSystem().getEClass().getEPackage().getName());
		StringBuilder bodyString = new StringBuilder();
		bodyString.append("try{" + "Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;\n"
				+ "Map<String, Object> m = reg.getExtensionToFactoryMap();\n"
				+ "m.put(\"monitoring\", new XMIResourceFactoryImpl());\n" + "resourceSet = new ResourceSetImpl();\n"
				+ "resourceSet.getPackageRegistry().put(" + packageName + "Package.eINSTANCE.getNsURI()," + packageName
				+ "Package.eINSTANCE);\n"
				+ "resourceSet.getPackageRegistry().put(MonitoringPackage.eINSTANCE.getNsURI(), MonitoringPackage.eINSTANCE);\n"
				// + "resource =
				// resourceSet.getResource(URI.createURI(\"resources/instance.monitoring\"),
				// true);\n"
				+ "mapper = new ObjectMapper();\n" + "EMFModule module = new EMFModule();\n"
				+ "mapper.registerModule(module);\n" + "factory = new JsonResourceFactory(mapper);\n"
				+ "} catch (Exception e) {\n" + "	LOGGER.error(e);\n" + "}\n");
		initMethod.setBody(bodyString.toString());
	}

	private void addFields(JavaClassSource javaClass) {
		javaClass.addImport("Monitoring.MonitoringPackage");
		javaClass.addImport("com.fasterxml.jackson.databind.JsonNode");
		javaClass.addImport("com.fasterxml.jackson.databind.ObjectMapper");
		javaClass.addImport("org.emfjson.jackson.module.EMFModule");

		javaClass.addImport(Resource.class);
		javaClass.addImport(ResourceSetImpl.class);
		javaClass.addImport(JsonResourceFactory.class);

		javaClass.addImport("org.eclipse.emf.common.util.URI");
		javaClass.addImport("com.fasterxml.jackson.databind.ObjectMapper");

		javaClass.addImport("at.jku.se.mosumo.monitoring.util.*");
		javaClass.addImport("org.eclipse.emf.ecore.resource.Resource");
		javaClass.addImport("org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl");

		javaClass.addImport("at.jku.se.mosumo.tools.logging.LoggerProvider");
		javaClass.addImport("at.jku.se.mosumo.tools.logging.ILogger");

		javaClass.addImport("java.util.Map");
		
		javaClass.addImport(MonitoringGeneratorUtils.getFullQualifiedPackage(getMoConfig()));

		

		// Import the MOProperty Classes
//		MonitoringQueryUtils.getAllMOElements(getMoConfig())
//				.forEach(moElement -> javaClass.addImport(moElement.getEClass().getName()));
//		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
//			javaClass.addImport(agent.getEClass().getName());
//		}
//
//		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
//			for (DerivedProperty prop : agent.getDerivedproperties()) {
//				javaClass.addImport(prop.getEClass().getName());
//			}
//
//		}

		
		//javaClass.addImport(MonitoringGeneratorUtils.getSourcePackage(getMoConfig())+ ".*");
		javaClass.addField().setName("LOGGER").setType("ILogger")
				.setLiteralInitializer("LoggerProvider.getLogger(" + javaClass.getName() + ".class)").setPrivate()
				.setStatic(true).setFinal(true);

		javaClass.addField().setName("factory").setType("JsonResourceFactory").setPrivate();
		javaClass.addField().setName("mapper").setType("ObjectMapper").setPrivate();
		javaClass.addField().setName("resourceSet").setType("ResourceSetImpl").setPrivate();
		javaClass.addField().setName("resource").setType("Resource").setPrivate();
		javaClass.addField().setName("INSTANCE").setType(javaClass.getName()).setVolatile(true).setStatic(true)
				.setPrivate();

	}

	public void addConstructor(JavaClassSource javaClass) {
		javaClass.addMethod().setConstructor(true).setBody("init();");

	}

	public void getInstanceMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> getInstanceMethod = javaClass.addMethod().setStatic(true).setName("getInstance")
				.setReturnType(javaClass.getName()).setPublic();
		String bodyStr = "if (INSTANCE == null) {\n" + "synchronized (" + javaClass.getName() + ".class) { \n"
				+ "if (INSTANCE == null) {\n" + "INSTANCE = new MessageFactory();\n" + "}\n" + "}\n" + "}\n"
				+ "return INSTANCE;\n";
		getInstanceMethod.setBody(bodyStr);
	}

	private void processMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("process").setReturnType("Object")
				.setPublic();
		method.addThrows(Exception.class);
		method.addParameter(String.class, "topic");
		method.addParameter(String.class, "message");
		StringBuilder body = new StringBuilder();
		body.append(
				"String type = topic.startsWith(\"register\")? topic.replace(\"register/\", \"\"):  RegexUtil.getSingle(RegexUtil.TOPIC_TAIL_PATTERN, topic); switch (type) {");

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
		
			var cName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), (MOAgent) agent);
			
			body.append(
					"case  \"" + agent.getTopic() + "\":{" + "JsonNode data = factory.getMapper().readTree(message);\n"
							+ cName + " element = mapper.reader().forType(" + cName + ".class).readValue(data);\n"
							+ "element.setId(data.get(\"id\").toString().replace(\"\\\"\", \"\"));" // TODO dirty
																									// workaround needs
																									// to be fixed!!!!
							+ "return element;}\n");
		}

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			for (MOElement prop : agent.getElements()) {
				var cName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), (MOProperty) prop);
				body.append(
						"case  \"" + prop.getTopic() + "\":{" + "JsonNode data = factory.getMapper().readTree(message);"
								+ cName + " element = mapper.reader().forType(" + cName + ".class).readValue(data);\n"

								+ "return element;}");
			}

			for (DerivedProperty prop : agent.getDerivedproperties()) {
				var cName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), prop);
				body.append(
						"case  \"" + prop.getTopic() + "\":{" + "JsonNode data = factory.getMapper().readTree(message);"
								+ cName + " element = mapper.reader().forType(" + cName + ".class).readValue(data);\n"

								+ "return element;}");
			}

		}
		body.append("default:throw new DeserializationException(\"Can not process Element \"+topic);}");
		method.setBody(body.toString());

	}

	private void toJSONMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("toJson").setReturnType("Pair")
				.setPublic();
		method.addThrows(Exception.class);
		method.addParameter(Object.class, "o");
		StringBuilder body = new StringBuilder();
		body.append("	String jsonString = mapper.writeValueAsString(o);\n" + "		String topic=\"\";");

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			var cName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), agent);
			body.append("if (o instanceof " + cName + "){" + "topic = \"" + agent.getTopic() + "\";}");
		}

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			for (MOElement prop : agent.getElements()) {
				var cName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), (MOProperty) prop);
				body.append("if (o instanceof " + cName + "){" + "topic =\"" + prop.getTopic() + "\";}");
			}

		} 

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			for (DerivedProperty prop : agent.getDerivedproperties()) {
				var cName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), prop);
				body.append("if (o instanceof " + cName + "){" + "topic =\"" + prop.getTopic() + "\";}");
			}

		}

		body.append("return Pair.create(topic, jsonString);");
		method.setBody(body.toString());

	}

//def doEMFSetup() {
//	EPackage.Registry.INSTANCE.put(MonitoringmmPackage.eINSTANCE.nsURI, MonitoringmmPackage.eINSTANCE)
//	Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
//}
//	
}
