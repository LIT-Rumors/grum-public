package at.jku.mosumo.generator.framework.util;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;

public class BrokerConfig extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "BrokerConfig";

	public BrokerConfig(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		javaClass.setPackage(MonitoringGeneratorUtils.API_PACKAGE).setName(CLASS_NAME);

		addFields(javaClass);
		
		String classz = javaClass.toString();
		
		classz= addStaticInitializer(classz);

		createCompilationUnit(getPackageFragmentRoot(), MonitoringGeneratorUtils.API_PACKAGE, CLASS_NAME + ".java",
				classz, getMonitor());

	}

	private String addStaticInitializer(String classz) {
		String st = "static{"
				+ "String custurl = System.getProperty(\"broker\");\n"
				+ "		if(custurl!=null) {\n"
				+ "			URL = custurl;\n"
				+ "		}"
				+ "}}";
			return Utils.replaceLast(classz, "}", st);
		
	}

	private void addFields(JavaClassSource javaClass) {

		javaClass.addField().setName("URL").setPublic().setType("String").setStringInitializer(getMoConfig().getDefaultServer().getConnectionURL()).setStatic(true)
				.setFinal(false); 
		
		

	}

}
