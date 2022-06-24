package at.jku.mosumo.generator.framework.twin;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.Import;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import Monitoring.MOAgent;
import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;
import at.jku.mosumo.generator.framework.util.MonitoringQueryUtils;
import at.jku.mosumo.generator.framework.util.Utils;

public class TwinManager extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "TwinManager";
	public static final String BROKER = "broker";
	public static final String TOPIC = "topic";

	public TwinManager(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		javaClass.setPackage(MonitoringGeneratorUtils.TWIN_PACKAGE).setName(CLASS_NAME);
		addFields(javaClass);
		getInstanceMethod(javaClass);
		initializeMethod(javaClass);
		registerListenerMethod(javaClass);
		prepareQueryEngineMethod(javaClass);
		processMethod(javaClass);
		getMethods(javaClass);
		registerMethods(javaClass);
		checkConstraintsMethod(javaClass);

		createCompilationUnit(getPackageFragmentRoot(), MonitoringGeneratorUtils.TWIN_PACKAGE, CLASS_NAME + ".java",
				javaClass.toString(), getMonitor());
	}

	private void registerListenerMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("registerListener").setPrivate();
		StringBuilder body = new StringBuilder();
		body.append("container.eAdapters().add(new MiddlewareForwardingAdapter(null));");
		method.setBody(body.toString());

	}

	private void checkConstraintsMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("checkConstraints").setPublic();
		method.addParameter("Object...", "elems");
		StringBuilder body = new StringBuilder();
		body.append("");
		// body.append("//TODO: register your constraints here");
		body.append(getMoConfig().getSystem().getEClass().getName() + "ViatraQueryExecutor.executeQueries(elems);");
		method.setBody(body.toString());
		// method.getJavaDoc().setFullText("TODO: register your constraints here;");

	}

	private void prepareQueryEngineMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("prepareQueryEngine").setPrivate()
				.setReturnType("ViatraQueryEngine");
		method.addParameter("EMFScope", "scope");
		StringBuilder body = new StringBuilder();
		body.append("ViatraQueryEngine engine = ViatraQueryEngine.on(scope);\n"
				+ getMoConfig().getSystem().getEClass().getName() + "ViatraQueryExecutor.initialize(engine);"
				+ "return engine;");
		System.out.println(body.toString());
		// method.getJavaDoc().setFullText("TODO: link your viatra query file here:
		// QueryFilename.instance().prepare(engine);");
		method.setBody(body.toString());

	}

	private void processMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("process").setPublic();
		method.addParameter(String.class, "topic");
		method.addParameter(String.class, "message");
		StringBuilder body = new StringBuilder();
		body.append(
				"try {\n" + "			MessageHandler.process(topic, message);\n" + "		} catch (Exception e) {\n"
						+ "			LOGGER.error(ExceptionUtils.getStackTrace(e));\n" + "		}");
		method.setBody(body.toString());

	}

	private void initializeMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("initialize").setPublic();
		StringBuilder body = new StringBuilder();
		String packageName = StringUtils.capitalize(getMoConfig().getSystem().getEClass().getEPackage().getName());

		String systemName = getMoConfig().getSystem().getEClass().getName();
		body.append("" + "container = " + packageName + "Factory.eINSTANCE.create" + systemName + "();\n"
				+ "EPackage.Registry.INSTANCE.put(" + packageName + "Package.eINSTANCE.getNsURI(), " + packageName
				+ "Package.eINSTANCE);\n" + "instances = new HashMap<>();\n"
				+ "EMFScope scope = new EMFScope(this.container);\n" + "//registerWellBehavefeature();\n"
				+ "this.engine = prepareQueryEngine(scope);\n" + "registerListener();\n");

		method.setBody(body.toString());

	}

	public void getInstanceMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> getInstanceMethod = javaClass.addMethod().setStatic(true).setName("getInstance")
				.setReturnType(javaClass.getName()).setPublic();
		String bodyStr = "if (INSTANCE == null) {\n" + "synchronized (" + javaClass.getName() + ".class) { \n"
				+ "if (INSTANCE == null) {\n" + "INSTANCE = new TwinManager();\n" + "}\n" + "}\n" + "}\n"
				+ "return INSTANCE;\n";

		getInstanceMethod.setBody(bodyStr);
	}

	public void getMethods(JavaClassSource javaClass) {

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			generateGetMethod(agent, javaClass);
		}
	}

	public void registerMethods(JavaClassSource javaClass) {

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			generateRegisterMethod(agent, javaClass);
		}
	}

	private void generateRegisterMethod(MOAgent agent, JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("register").setPublic();
		method.addParameter(String.class, "id");
		method.addParameter(agent.getName(), "elem");

		method.setBody("instances.put(elem.getId(), elem);\n container.get" + Utils.tailToLower(agent.getName())
				+ "s().add(elem); elem.eAdapters().add(new MiddlewareForwardingAdapter(elem.getId()));");

	}

	private void generateGetMethod(MOAgent agent, JavaClassSource javaClass) {
		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("get").setReturnType(agent.getName())
				.setPublic();
		method.addParameter(String.class, "id");
		method.setBody("return (" + agent.getEClass().getName() + ") instances.get(id);");

	}

	private void addFields(JavaClassSource javaClass) {

		javaClass.addImport("org.apache.commons.lang3.exception.ExceptionUtils");
		javaClass.addImport("org.eclipse.emf.ecore.EPackage");
		javaClass.addImport("java.util.*");
		javaClass.addImport("org.eclipse.viatra.query.runtime.api.ViatraQueryEngine");
		javaClass.addImport("org.eclipse.viatra.query.runtime.emf.EMFScope");
		javaClass.addImport("at.jku.se.mosumo.tools.logging.ILogger");
		javaClass.addImport("at.jku.se.mosumo.tools.logging.LoggerProvider");

		javaClass.addImport(getMoConfig().getSystem().getEClass().getName());

		String systemName = StringUtils.capitalize(getMoConfig().getSystem().getEClass().getName());
		javaClass.addImport("query." + systemName + "ViatraQueryExecutor");

		String packageName = StringUtils.capitalize(getMoConfig().getSystem().getEClass().getEPackage().getName());

//		javaClass.addImport(getMoConfig().getSystem().getEClass().getName() + "."
//				+ packageName + "Package");
//		javaClass.addImport(getMoConfig().getSystem().getEClass().getName() + "."
//				+ packageName + "Factory");

//		javaClass.addImport(getMoConfig().getEPackage().getName() + "." + packageName + "Package");
//		javaClass.addImport(getMoConfig().getEPackage().getName()+ "." + packageName + "Factory");
//		javaClass.addImport(getMoConfig().getEPackage().getName()+ "." + getMoConfig().getSystem().getEClass().getName());
		
	
//		getMoConfig().getSystem().getAgents().forEach(agent -> {
//			// javaClass.addImport(agent.getEClass().getName());
//			String agentname = MonitoringGeneratorUtils.composeQualifiedName(getMoConfig(), agent);
//			javaClass.addImport(agentname);
//			System.out.println("ADDING:" + agentname);
//
//		});
		//javaClass.addImport(MonitoringGeneratorUtils.getSourcePackage(getMoConfig())+ ".*");
		
		
		
		javaClass.addImport(MonitoringGeneratorUtils.getFullQualifiedPackage(getMoConfig()));
		javaClass.addImport(MonitoringGeneratorUtils.getFullQualifiedFactory(getMoConfig()));
		getMoConfig().getSystem().getAgents().forEach(agent -> {
			javaClass.addImport(MonitoringGeneratorUtils.getSourcePackage(getMoConfig())+ "."+agent.getName());
			
		});
		javaClass.addImport(MonitoringGeneratorUtils.getSourcePackage(getMoConfig())+ "."+getMoConfig().getSystem().getEClass().getName());
		 

		MonitoringQueryUtils.getAllMOElements(getMoConfig())
				.forEach(moElement -> javaClass.addImport(moElement.getEClass().getName()));

		javaClass.addField().setName("INSTANCE").setVolatile(true).setStatic(true).setType(CLASS_NAME);

		javaClass.addImport("api.*");
		javaClass.addField().setName("LOGGER").setType("ILogger")
				.setLiteralInitializer("LoggerProvider.getLogger(" + javaClass.getName() + ".class)").setPrivate()
				.setStatic(true).setFinal(true);

		javaClass.addField().setName("container").setType(getMoConfig().getSystem().getEClass().getName()); // TODO
																											// make
																											// generic!
		javaClass.addField().setName("engine").setType("ViatraQueryEngine");
		javaClass.addField().setName("instances").setType("Map");

	}

//def doEMFSetup() {
//	EPackage.Registry.INSTANCE.put(MonitoringmmPackage.eINSTANCE.nsURI, MonitoringmmPackage.eINSTANCE)
//	Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
//}
//	
}
