package at.jku.mosumo.generator.framework.twin;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;

public class MiddlewareForwardingAdapter extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "MiddlewareForwardingAdapter";
	public static final String BROKER = "broker";
	public static final String TOPIC = "topic";

	public MiddlewareForwardingAdapter(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig,
			IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		javaClass.setPackage(MonitoringGeneratorUtils.TWIN_PACKAGE).setName(CLASS_NAME)
				.extendSuperType(AdapterImpl.class);
		addFields(javaClass);
		constructor(javaClass);
		notifyChangedMethod(javaClass);

		createCompilationUnit(getPackageFragmentRoot(), MonitoringGeneratorUtils.TWIN_PACKAGE, CLASS_NAME + ".java",
				javaClass.toString(), getMonitor());
	}

	private void constructor(JavaClassSource javaClass) {
		var constr = javaClass.addMethod().setConstructor(true);
		constr.addParameter(String.class, "id");
		constr.setBody("this.id=id;");
	}

	private void notifyChangedMethod(JavaClassSource javaClass) {

		MethodSource<JavaClassSource> method = javaClass.addMethod().setName("notifyChanged").setPublic();
		method.addParameter("Notification", "msg");
		StringBuilder body = new StringBuilder();
		body.append("	Object elem = msg.getNewValue();\n" +
		"LOGGER.debug(\"notify \" + id + \"->\" + elem.toString());"
				
		
				
				+ "	try {\n"
				+ "		Pair<String, String> toSend = MessageFactory.getInstance().toJson(elem);\n"
				+" \n"
				+ "			if (id != null) {\n"
				+ "				Map<String, Object> map = mapper.readValue(toSend.getSecond(), Map.class);\n"
				+ "				map.put(\"id\", id);\n"
				+ "				String ts = new ObjectMapper().writeValueAsString(map);\n"
				+ "				toSend.setSecond(ts);\n"
				+ "			}"
				+ "		MQTTPublisher.getInstance().publish(FORWARD_PREFIX + \"/_\" + toSend.getFirst(),toSend.getSecond());\n"
				+ "	} catch (Exception e) {\n" + "		LOGGER.error(e);\n" + "	}\n" + " \n");
		
	
		method.setBody(body.toString());

	
		
	}

	private void addFields(JavaClassSource javaClass) {
				
		javaClass.addImport("at.jku.se.mosumo.monitoring.util.*");

		javaClass.addImport("at.jku.se.mosumo.tools.logging.LoggerProvider");
		javaClass.addImport("org.eclipse.emf.common.notify.Notification");
		javaClass.addImport("org.eclipse.emf.common.notify.impl.AdapterImpl");
		javaClass.addImport("at.jku.se.mosumo.tools.logging.ILogger");
		javaClass.addImport("at.jku.se.mosumo.tools.logging.LoggerProvider");
		javaClass.addImport("com.fasterxml.jackson.databind.ObjectMapper");
		javaClass.addImport("api.*");
		javaClass.addImport("mqtt.*");
		javaClass.addImport(Map.class);
		
		
		//javaClass.addImport("at.jku.se.mosumo.dronology.mm.Dronology.*");

		javaClass.addField().setName("LOGGER").setType("ILogger")
				.setLiteralInitializer("LoggerProvider.getLogger(" + javaClass.getName() + ".class)").setPrivate()
				.setStatic(true).setFinal(true);
		javaClass.addField().setName("FORWARD_PREFIX").setType("String")
				.setLiteralInitializer("\"_MiddlewareFordward\"").setPrivate().setFinal(true);
		javaClass.addField().setName("id").setType(String.class);

		javaClass.addField().setName("mapper").setType("ObjectMapper")
				.setLiteralInitializer("new ObjectMapper()").setPrivate();
	}

}
