package at.jku.mosumo.generator.framework.middleware;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;
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
import at.jku.se.mosumo.monitoring.util.ManagedHashTableList;
import at.jku.se.mosumo.tools.logging.ILogger;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import mqtt.IElementListener;
import mqtt.MQTTPublisher;
import mqtt.MQTTSubscriber;
import validation.IViolation;

public class Middleware extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "MonitoringMiddleware";
	public static final String BROKER = "broker";
	public static final String TOPIC = "topic";

	public Middleware(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		javaClass.setPackage(MonitoringGeneratorUtils.MIDDLEWARE_PACKAGE).setName(CLASS_NAME);
		addFields(javaClass);
		getInstanceMethod(javaClass);
		initMethod(javaClass);
		notifyMethod(javaClass);
		sendViolationMethod(javaClass);
		messageArrivedMethod(javaClass);
		registerChangeListenerMethod(javaClass);
		setMethods(javaClass);
		createCompilationUnit(getPackageFragmentRoot(), MonitoringGeneratorUtils.MIDDLEWARE_PACKAGE,
				CLASS_NAME + ".java", javaClass.toString(), getMonitor());
		
		
	
	}

	private void setMethods(JavaClassSource javaClass) {
		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			for (DerivedProperty c : agent.getDerivedproperties()) {
				createDerivedPropertySetter(javaClass, c);
			}
		}
	}

	private void createDerivedPropertySetter(JavaClassSource javaClass, DerivedProperty prop) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("set" + prop.getEClass().getName())
				.setReturnType("void").setPublic();
		method.addParameter(String.class, "agentid");
		method.addParameter(String.class, "value");
		
		String body = "" + "try {\n" + "MQTTPublisher.getInstance().publish(agentid+\"/" + prop.getTopic()
		+ "\", value);\n" + "} catch (Exception e) {\n" + "LOGGER.error(e);\n" + "}";
		method.setBody(body);
		
	}

	private void registerChangeListenerMethod(JavaClassSource javaClass) {
		MonitoringQueryUtils
			.getAllMOElements(getMoConfig())
			.forEach(moElement -> createPropertyListener(moElement, javaClass));
		
		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			createAgentListener(agent,javaClass);
			for (DerivedProperty c : agent.getDerivedproperties()) {
				createPropertyListener( c, javaClass);
			}
		}
		
		
	}

	private void createPropertyListener(MOProperty prop, JavaClassSource javaClass) {
		
		var name = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), prop);
		
		MethodSource<JavaClassSource> method = javaClass.addMethod()
				.setName("register" + prop.getEClass().getName() + "StateChange").setReturnType("void").setPublic();
		method.addParameter("IElementListener", "listener");
		method.setBody("listeners.add(" + name + ".class,listener);");
	}
	
	
	private void createAgentListener(MOAgent agent, JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod()
				.setName("register" + agent.getEClass().getName() + "Registered").setReturnType("void").setPublic();
		
		var name = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), agent);
		
		method.addParameter("IElementListener", "listener");
		method.setBody("listeners.add(" + name + ".class,listener);");
	}

	private void createPropertyListener(DerivedProperty prop, JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod()
				.setName("register" + prop.getEClass().getName() + "StateChange").setReturnType("void").setPublic();
		
		var name = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), prop);
		
		method.addParameter("IElementListener", "listener");
		method.setBody("listeners.add(" + name + ".class,listener);");
	}
	
	private void notifyMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("notify").setReturnType("void")
				.setPublic();
		method.addThrows(Exception.class);
		final var body = new StringBuilder();
		method.addParameter(Object.class, "elem");

		body.append("Class<?> interf = elem.getClass().getInterfaces()[0];\n"
				+ "for (IElementListener i : listeners.get(interf)) {\n" + "i.updateElement(elem);\n" + "}\n");

		method.setBody(body.toString());
	}

	private void initMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("init").setReturnType("void").setPublic()
				.addThrows(Exception.class);
		final var body = new StringBuilder();

		body.append("subscriber = new MQTTSubscriber(BrokerConfig.URL);"
				+ "MQTTPublisher.getInstance().connect(BrokerConfig.URL);\n" + "try {\n"
				+ "subscriber.connect((topic, message) -> {\n" + "messageArrived(topic, message);\n" + "});\n"+
				
				getAgentSubscriptions()+
				getPropertySubscription()+
				getDerivedPropertySubscription()
				
				//+ "subscriber.subscribe(FORWARD_PREFIX + \"/_State\");\n" 
				
				
				
				+ "} catch (Exception e) {\n"
				+ "LOGGER.error(e);\n" + "}");
		method.setBody(body.toString());

	}
	
	private String getAgentSubscriptions() {
		StringBuilder sb = new StringBuilder();
		for (MOAgent a : getMoConfig().getSystem().getAgents()) {
			sb.append("subscriber.subscribe(FORWARD_PREFIX+\"/_" + a.getTopic() + "\");\n");
		}
		return sb.toString();
	}

	private String getPropertySubscription() {
		StringBuilder sb = new StringBuilder();
		for (MOAgent a : getMoConfig().getSystem().getAgents()) {
			for (MOElement prop : a.getElements()) {
				sb.append("subscriber.subscribe(FORWARD_PREFIX+\"/_" + prop.getTopic() + "\");\n");
			}
		}
		return sb.toString();
	}
	
	private String getDerivedPropertySubscription() {
		StringBuilder sb = new StringBuilder();
		for (MOAgent a : getMoConfig().getSystem().getAgents()) {
			for (DerivedProperty prop : a.getDerivedproperties()) {
				sb.append("subscriber.subscribe(FORWARD_PREFIX+\"/_" + prop.getTopic() + "\");\n");
			}
		}
		return sb.toString();
	}


	private void sendViolationMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("sendViolation").setReturnType("void")
				.setPublic();
		method.addParameter("IViolation", "violation");
		StringBuilder body = new StringBuilder();

		body.append("LOGGER.info(\"NEW VIOLATION:\" + violation.toString());");
		method.setBody(body.toString());
	}

	private void messageArrivedMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("messageArrived").setReturnType("void")
				.setPublic();
		method.addParameter(String.class, "topic");
		method.addParameter(String.class, "message");

		StringBuilder body = new StringBuilder();
		body.append("" + "try {\n" + 
		"topic = topic.replace(FORWARD_PREFIX+\"/_\", \"\");"+
		"Object elem = MessageFactory.getInstance().process(topic, message);\n"
				+ "notify( elem);\n" + "} catch (Exception e) {\n" + "	LOGGER.error(e);\n" + "}");
		method.setBody(body.toString());

	}

	private void addFields(JavaClassSource javaClass) {
		javaClass.addImport("api.MessageFactory");
		javaClass.addImport("api.BrokerConfig");
		javaClass.addImport(MQTTPublisher.class);
		javaClass.addImport(ManagedHashTableList.class);
		javaClass.addImport(MQTTSubscriber.class);
		javaClass.addImport(IElementListener.class);
		javaClass.addImport(LoggerProvider.class);
		javaClass.addImport(ILogger.class);
		javaClass.addImport(MqttSecurityException.class);
		javaClass.addImport(IViolation.class);
		
		//Import the MOProperty Classes
		MonitoringQueryUtils
				.getAllMOElements(getMoConfig())
				//.forEach(moElement -> javaClass.addImport(moElement.getEClass().getInstanceClass()));	
				// TODO: ---CLASSNAMING---
				.forEach(moElement -> javaClass.addImport(moElement.getEClass().getName()));	
		
		
		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			javaClass.addImport(agent.getEClass().getName());
			for (DerivedProperty prop : agent.getDerivedproperties()) {
				javaClass.addImport(prop.getEClass().getName());
			}

		}
		
		javaClass.addField().setName("LOGGER").setType("ILogger")
				.setLiteralInitializer("LoggerProvider.getLogger(" + javaClass.getName() + ".class)").setPrivate()
				.setStatic(true).setFinal(true);
		javaClass.addField().setName("subscriber").setType("MQTTSubscriber");
		javaClass.addField().setName("INSTANCE").setVolatile(true).setStatic(true).setType(CLASS_NAME);

		javaClass.addField().setName("listeners").setType(" ManagedHashTableList<Class, IElementListener>")
				.setLiteralInitializer("new ManagedHashTableList<>()").setPrivate().setFinal(true);
		javaClass.addField().setName("FORWARD_PREFIX").setType("String")
				.setLiteralInitializer("\"_MiddlewareFordward\"").setPrivate().setFinal(true);
	}

	public void getInstanceMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> getInstanceMethod = javaClass.addMethod().setStatic(true).setName("getInstance")
				.setReturnType(javaClass.getName()).setPublic();
		String bodyStr = "if (INSTANCE == null) {\n" + "synchronized (" + javaClass.getName() + ".class) { \n"
				+ "if (INSTANCE == null) {\n" + "INSTANCE = new MonitoringMiddleware();\n" + "}\n" + "}\n" + "}\n"
				+ "return INSTANCE;\n";

		getInstanceMethod.setBody(bodyStr);
	}

//def doEMFSetup() {
//	EPackage.Registry.INSTANCE.put(MonitoringmmPackage.eINSTANCE.nsURI, MonitoringmmPackage.eINSTANCE)
//	Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
//}
//	
}
