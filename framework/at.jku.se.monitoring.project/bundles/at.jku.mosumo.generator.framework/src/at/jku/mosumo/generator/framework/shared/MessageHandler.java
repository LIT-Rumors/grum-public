package at.jku.mosumo.generator.framework.shared;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IPackageFragmentRoot;
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
import at.jku.mosumo.generator.framework.util.Utils;
import at.jku.se.mosumo.monitoring.util.RegexUtil;

public class MessageHandler extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "MessageHandler";
	public static final String BROKER = "broker";
	public static final String TOPIC = "topic";

	public MessageHandler(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		javaClass.setPackage(MonitoringGeneratorUtils.API_PACKAGE).setName(CLASS_NAME);
		addFields(javaClass);
		processMethod(javaClass);

		createCompilationUnit(getPackageFragmentRoot(), MonitoringGeneratorUtils.API_PACKAGE, CLASS_NAME + ".java",
				javaClass.toString(), getMonitor());
	}

	private void processMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("process").setReturnType("void")
				.setStatic(true).setPublic();
		method.addThrows(Exception.class);
		StringBuilder body = new StringBuilder();
		method.addParameter(String.class, "topic");
		method.addParameter(String.class, "message");
		body.append("Object elem = MessageFactory.getInstance().process(topic, message);\n");

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			generateAgent(agent, body);
		}
		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			;
			for (MOElement prop : agent.getElements()) {
				createProperty(agent, prop, body);
			}
			for (DerivedProperty prop : agent.getDerivedproperties()) {
				createDerivedProperty(agent, prop, body);
			}
		}

		method.setBody(body.toString());

	}

	private void generateAgent(MOAgent agent, StringBuilder body) {
		var cName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), (MOAgent) agent);
		body.append("if (elem instanceof " + cName + "){\n" + "TwinManager.getInstance().register(((" + cName
				+ ") elem).getId(), (" + agent.getName() + ") elem);\n" + "LOGGER.info(\"new " + cName
				+ " added: \" + ((" + agent.getName() + ") elem).getId());}");

	}

	private void createProperty(MOAgent agent, MOElement propperty, StringBuilder body) {

		var cName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), (MOProperty) propperty);
		var aName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), (MOAgent) agent);
		body.append("if (elem instanceof " + cName + ") {\n"
				+ "String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);\n" + aName
				+ " runtimeinst = TwinManager.getInstance().get(instanceName);\n" + "if (runtimeinst != null) {\n"
				+ "((" + aName + ")runtimeinst).set" + Utils.tailToLower(propperty.getName()) + "((" + cName
				+ ") elem);\n" + "LOGGER.debug(\"" + cName + " updated:\" + instanceName);\n"
				+ "TwinManager.getInstance().checkConstraints(runtimeinst,elem);\n" + "} else {\n"
				+ "	LOGGER.warn(\"Instance not registererd: \" + instanceName);\n" + "}\n" + "}");

	}

	private void createDerivedProperty(MOAgent agent, DerivedProperty propperty, StringBuilder body) {
		var cName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), (DerivedProperty) propperty);
		var aName = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), (MOAgent) agent);
		body.append("if (elem instanceof " + cName + ") {\n"
				+ "String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);\n" + aName
				+ " runtimeinst = TwinManager.getInstance().get(instanceName);\n" + "if (runtimeinst != null) {\n"
				+ "((" + aName + ")runtimeinst).set" + Utils.tailToLower(propperty.getName()) + "((" + cName
				+ ") elem);\n" + "LOGGER.debug(\"" + cName + " updated:\" + instanceName);\n"
				+ "TwinManager.getInstance().checkConstraints(runtimeinst,elem);\n" + "} else {\n"
				+ "	LOGGER.warn(\"Instance not registererd: \" + instanceName);\n" + "}\n" + "}");

	}

	private void addFields(JavaClassSource javaClass) {
		javaClass.addImport("twin.TwinManager");

		javaClass.addImport("at.jku.se.mosumo.tools.logging.LoggerProvider");
		javaClass.addImport("at.jku.se.mosumo.tools.logging.ILogger");

		javaClass.addImport(Resource.class);
		javaClass.addImport(ResourceSetImpl.class);
		javaClass.addImport(RegexUtil.class);

		// Import the MOProperty Classes
		MonitoringQueryUtils.getAllMOElements(getMoConfig())
				.forEach(moElement -> javaClass.addImport(moElement.getEClass().getName()));

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			javaClass.addImport(MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), agent));

			for (DerivedProperty prop : agent.getDerivedproperties()) {
				javaClass.addImport(MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), (DerivedProperty)prop));
			}

		}

		javaClass.addField().setName("LOGGER").setType("ILogger")
				.setLiteralInitializer("LoggerProvider.getLogger(" + javaClass.getName() + ".class)").setPrivate()
				.setStatic(true).setFinal(true);

	}

}
