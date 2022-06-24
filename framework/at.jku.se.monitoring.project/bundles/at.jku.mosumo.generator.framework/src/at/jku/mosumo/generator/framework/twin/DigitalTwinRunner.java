package at.jku.mosumo.generator.framework.twin;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import Monitoring.DerivedProperty;
import Monitoring.MOAgent;
import Monitoring.MOConfig;
import Monitoring.MOElement;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;

public class DigitalTwinRunner extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "DigitalTwinRunner";
	public static final String BROKER = "broker";
	public static final String TOPIC = "topic";

	public DigitalTwinRunner(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		javaClass.setPackage(MonitoringGeneratorUtils.TWIN_PACKAGE).setName(CLASS_NAME);
		addFields(javaClass);
		setupMethod(javaClass);
		mainMethod(javaClass);

		createCompilationUnit(getPackageFragmentRoot(), MonitoringGeneratorUtils.TWIN_PACKAGE, CLASS_NAME + ".java",
				javaClass.toString(), getMonitor());
	}

	private void mainMethod(JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("main").setReturnType("void")
				.setStatic(true).setPublic();
		method.addParameter("String[]", "args");
		method.addThrows(Exception.class);
		StringBuilder body = new StringBuilder();
		body.append("try {\n" + "	new DigitalTwinRunner().setup();\n" + "} catch (Exception e) {\n"
				+ "	e.printStackTrace();\n" + "}\n");

		method.setBody(body.toString());
	}

	private void setupMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("setup").setReturnType("void").setPublic();
		method.addThrows(Exception.class);
		StringBuilder body = new StringBuilder();
		body.append("MQTTSubscriber manager = new MQTTSubscriber(BrokerConfig.URL);\n"
				+ "manager.connect((topic, message) -> {\n" + "TwinManager.getInstance().process(topic, message);\n"
				+ "	});\n" +

				"MQTTPublisher.getInstance().connect(BrokerConfig.URL);\n" +

				getAgentSubscriptions() + getPropertySubscription()+getDerivedPropertySubscription()

				+ "TwinManager.getInstance().initialize();\n");

		method.setBody(body.toString());

	}

	private String getAgentSubscriptions() {
		StringBuilder sb = new StringBuilder();
		for (MOAgent a : getMoConfig().getSystem().getAgents()) {
			sb.append("manager.subscribe(\"register/" + a.getTopic() + "\");\n");
		}
		return sb.toString();
	}

	private String getPropertySubscription() {
		StringBuilder sb = new StringBuilder();
		for (MOAgent a : getMoConfig().getSystem().getAgents()) {
			for (MOElement prop : a.getElements()) {
				sb.append("manager.subscribe(\"+/" + prop.getTopic() + "\");\n");
			}
		}
		return sb.toString();
	}
	
	private String getDerivedPropertySubscription() {
		StringBuilder sb = new StringBuilder();
		for (MOAgent a : getMoConfig().getSystem().getAgents()) {
			for (DerivedProperty prop : a.getDerivedproperties()) {
				sb.append("manager.subscribe(\"+/" + prop.getTopic() + "\");\n");
			}
		}
		return sb.toString();
	}

	private void addFields(JavaClassSource javaClass) {
		javaClass.addImport("at.jku.se.mosumo.monitoring.util.*");
		javaClass.addImport("at.jku.se.mosumo.tools.logging.ILogger");
		javaClass.addImport("at.jku.se.mosumo.tools.logging.LoggerProvider");
		javaClass.addImport("api.*");
		javaClass.addImport("mqtt.*");

		javaClass.addField().setName("LOGGER").setType("ILogger")
				.setLiteralInitializer("LoggerProvider.getLogger(" + javaClass.getName() + ".class)").setPrivate()
				.setStatic(true).setFinal(true);

	}

}
