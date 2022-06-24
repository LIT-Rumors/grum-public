package at.jku.mosumo.generator.api.java.api;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import Monitoring.MOAgent;
import Monitoring.MOConfig;
import Monitoring.MOElement;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;

public class MonitoringAPI extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "MonitoringAPI";

	public MonitoringAPI(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		javaClass.setPackage(MonitoringGeneratorUtils.API_PACKAGE).setName(CLASS_NAME);

		addFields(javaClass);
		initMethod(javaClass);
		propertyMethods(javaClass);

		createCompilationUnit(getPackageFragmentRoot(), MonitoringGeneratorUtils.API_PACKAGE, CLASS_NAME + ".java",
				javaClass.toString(), getMonitor());

	}

	private void initMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("init").setReturnType("void")
				.addThrows(Exception.class).setStatic(true).setPublic();

		StringBuilder body = new StringBuilder();
		body.append("publisher.connect(BrokerConfig.URL);");

		method.setBody(body.toString());

	}

	private void addFields(JavaClassSource javaClass) {

		javaClass.addImport("org.apache.commons.lang3.exception.ExceptionUtils");
		javaClass.addImport("org.apache.commons.lang3.StringUtils");
		javaClass.addImport("org.apache.logging.log4j.LogManager");
		javaClass.addImport("org.apache.logging.log4j.Logger");
		javaClass.addImport("com.google.gson.GsonBuilder");
		javaClass.addImport("com.google.gson.FieldNamingPolicy");
		javaClass.addImport("com.google.gson.Gson");
		javaClass.addImport("java.text.DateFormat");

		javaClass.addField().setName("LOGGER").setType("Logger")
				.setLiteralInitializer("LogManager.getLogger(" + javaClass.getName() + ".class)").setPrivate()
				.setStatic(true).setFinal(true);

		javaClass.addField().setName("publisher").setType("MQTTPublisher")
				.setLiteralInitializer("MQTTPublisher.getInstance()").setPrivate().setStatic(true).setFinal(true);

//		javaClass.addField().setName("publisher").setType("IMessagePublisher")
//				.setLiteralInitializer("PublisherFactory.getInstance().getPublisher()").setPrivate().setStatic(true)
//				.setFinal(true);

		javaClass.addField().setName("GSON").setType("Gson").setLiteralInitializer(
				"new GsonBuilder().enableComplexMapKeySerialization().serializeNulls().setDateFormat(DateFormat.LONG).setVersion(1.0).serializeSpecialFloatingPointValues().serializeSpecialFloatingPointValues().create())")
				.setPrivate().setStatic(true).setFinal(true);

	}

	private void propertyMethods(JavaClassSource javaClass) {
//
//		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("process").setReturnType("void")
//				.setStatic(true).setPublic();
//		method.addThrows(Exception.class);
//		StringBuilder body = new StringBuilder();
//		method.addParameter(String.class, "topic");
//		method.addParameter(String.class, "message");
//		body.append("Object elem = MessageFactory.getInstance().process(topic, message);\n");

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			createAgentRegisterMethod(agent, javaClass);
		}
		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			for (MOElement prop : agent.getElements()) {
				registerMethod(prop, javaClass);
			}
		}

		// method.setBody(body.toString());

	}

	private void createAgentRegisterMethod(MOAgent agent, JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("register" + agent.getName())
				.setReturnType("void").setStatic(true).setPublic();
		method.addParameter(String.class, "elementid");

		StringBuilder body = new StringBuilder();
		body.append("" + "String message = String.format(\"{ \\\"id\\\" : \\\"%s\\\" }\", elementid);\n"
				+ "String topic = StringUtils.join(Constants.REGISTER, Constants.TOPIC_SEPARATOR, \"" + agent.getTopic()
				+ "\");\n" + "try{\n" + "publisher.publish(topic, message);\n"
				+ "} catch (Exception e) {	LOGGER.error(ExceptionUtils.getStackTrace(e));}\n");
		System.out.println(body.toString());
		method.setBody(body.toString());

	}

	private void registerMethod(MOElement property, JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("update" + property.getName())
				.setReturnType("void").setStatic(true).setPublic();
		method.addParameter(String.class, "parent");
		method.addParameter(Object.class, "message");

		StringBuilder body = new StringBuilder();
		body.append("" + "String topic = StringUtils.join(parent, Constants.TOPIC_SEPARATOR,\"" + property.getTopic()
				+ "\");" + "String mqttmessage = GSON.toJson(message);" + "try{"
				+ "publisher.publish(topic, mqttmessage);"
				+ "} catch (Exception e) {	LOGGER.error(ExceptionUtils.getStackTrace(e));}");
		method.setBody(body.toString());
	}

}