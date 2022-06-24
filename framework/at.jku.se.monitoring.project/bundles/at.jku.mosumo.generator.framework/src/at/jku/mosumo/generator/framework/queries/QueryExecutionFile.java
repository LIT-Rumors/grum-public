package at.jku.mosumo.generator.framework.queries;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;

public class QueryExecutionFile extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "ViatraQueryExecutor";

	public QueryExecutionFile(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		javaClass.setPackage(MonitoringGeneratorUtils.QUERY_PACKAGE)
				.setName(getMoConfig().getSystem().getEClass().getName() + CLASS_NAME);
		addFields(javaClass);
		initializeMethod(javaClass);

		executeQueries(javaClass);
		testCheckMethod(javaClass);

		createCompilationUnit(getPackageFragmentRoot(), MonitoringGeneratorUtils.QUERY_PACKAGE,
				getMoConfig().getSystem().getEClass().getName() + CLASS_NAME + ".java", javaClass.toString(),
				getMonitor());
	}

	private void testCheckMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("checkForTestViolations").setStatic(true)
				.setPrivate();
		StringBuilder body = new StringBuilder();
		body.append("SimpleCheck.Matcher matcher = SimpleCheck.Matcher.on(engine);\n");
		body.append("for (SimpleCheck.Match match : matcher.getAllMatches()) {\n");
		body.append("System.out.println(\"Error!\");\n");
		body.append("};\n");
		method.setBody(body.toString());
	}

	private void executeQueries(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> method = javaClass.addMethod().setStatic(true).setName("executeQueries").setPublic();
		method.addParameter("Object...", "elems");
		StringBuilder body = new StringBuilder();
		body.append("");
		method.setBody(body.toString());
		method.getJavaDoc().setFullText("TODO: call checks here");

	}

	private void initializeMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("initialize").setStatic(true).setPublic();
		method.addParameter("ViatraQueryEngine", "engine");
		StringBuilder body = new StringBuilder();
		body.append(javaClass.getName()+".engine=engine;\n");
		body.append(getMoConfig().getSystem().getEClass().getName() + "Queries.instance().prepare(engine);\n");

		method.setBody(body.toString());

	}

	private void addFields(JavaClassSource javaClass) {
//
//		javaClass.addImport("org.apache.commons.lang3.exception.ExceptionUtils");
//		javaClass.addImport("org.eclipse.emf.ecore.EPackage");
//		javaClass.addImport("java.util.*");
//		javaClass.addImport("org.eclipse.viatra.query.runtime.api.ViatraQueryEngine");
//		javaClass.addImport("org.eclipse.viatra.query.runtime.emf.EMFScope");
		javaClass.addImport("at.jku.se.mosumo.tools.logging.ILogger");
		javaClass.addImport("at.jku.se.mosumo.tools.logging.LoggerProvider");
		javaClass.addImport("org.eclipse.viatra.query.runtime.api.ViatraQueryEngine");
//
//		javaClass.addImport(getMoConfig().getSystem().getEClass().getInstanceClass());
//
//		String packageName = getMoConfig().getSystem().getEClass().getEPackage().getName();
//
//		javaClass.addImport(getMoConfig().getSystem().getEClass().getInstanceClass().getPackageName() + "."
//				+ packageName + "Package");
//		javaClass.addImport(getMoConfig().getSystem().getEClass().getInstanceClass().getPackageName() + "."
//				+ packageName + "Factory");
//
//		getMoConfig().getSystem().getAgents()
//				.forEach(agent -> javaClass.addImport(agent.getEClass().getInstanceClass()));
//
//		MonitoringQueryUtils.getAllMOElements(getMoConfig())
//				.forEach(moElement -> javaClass.addImport(moElement.getEClass().getInstanceClass()));
//
//		javaClass.addField().setName("INSTANCE").setVolatile(true).setStatic(true).setType(CLASS_NAME);
//
//		javaClass.addImport("api.*");
		javaClass.addField().setName("LOGGER").setType("ILogger")
				.setLiteralInitializer("LoggerProvider.getLogger(" + javaClass.getName() + ".class)").setPrivate()
				.setStatic(true).setFinal(true);

		javaClass.addField().setName("engine").setType("ViatraQueryEngine").setPrivate().setStatic(true);
//		javaClass.addField().setName("container").setType(getMoConfig().getSystem().getEClass().getInstanceClass()); // TODO
//																														// make
//																														// generic!
//		javaClass.addField().setName("engine").setType("ViatraQueryEngine");
//		javaClass.addField().setName("instances").setType("Map");

	}

//def doEMFSetup() {
//	EPackage.Registry.INSTANCE.put(MonitoringmmPackage.eINSTANCE.nsURI, MonitoringmmPackage.eINSTANCE)
//	Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
//}
//	
}
