package at.jku.mosumo.generator.framework.util;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import Monitoring.DerivedProperty;
import Monitoring.MOAgent;
import Monitoring.MOConfig;
import Monitoring.MOProperty;

public class MonitoringGeneratorUtils {

	public static final String MAVEN_NATURE = "org.eclipse.m2e.core.maven2Nature";
	public static final String VIATRA_NATURE = "org.eclipse.viatra.query.projectnature";
	public static final String XTEXT_NATURE = "org.eclipse.xtext.ui.shared.xtextNature";
	public static final String PLUGIN_NATURE = "org.eclipse.pde.PluginNature";
	public static final String REQUIRED_PLUGIN = "org.eclipse.pde.core.requiredPlugins";
	public static final String MANIFEST_BUILDER = "org.eclipse.pde.ManifestBuilder";
	public static final String SCHEMA_BUILDER = "org.eclipse.pde.SchemaBuilder";
	public static final String MAVEN_BUILDER = "org.eclipse.pde.SchemaBuilder";
	public static final String JAVA_SE_11 = "JavaSE-11";
	public static final String MAVEN_CLASS_PATH = "org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER";
	public static final String MAVEN_CLASS_PATH_ATTRIBUTE = "org.eclipse.jst.component.dependency";
	public static final String MAVEN_CLASS_PATH_VALUE = "/WEB-INF/lib";

	public static final String MQTT_PACKAGE = "mqtt";
	public static final String JAVA_EXTENSION = "java";

	public static final String API_PACKAGE = "api";
	public static final String MIDDLEWARE_PACKAGE = "middleware";
	public static final String TWIN_PACKAGE = "twin";
	public static final String QUERY_PACKAGE = "query";
	public static final String UI_PACKAGE = "ui";

	// Folders
	public static final String SOURCE_FOLDER = "src";
	public static final String MAIN_FOLDER = "main";
	public static final String TARGET_FOLDER = "target";
	public static final String CLASSES_FOLDER = "classes";
	public static final String JAVA_FOLDER = "java";

	private MonitoringGeneratorUtils() {
		throw new AssertionError("This class cannot be inherited");
	}

	public static final Resource loadMonitoringResource(IFile file) {
		ResourceSet reset = new ResourceSetImpl();
		return reset.getResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
	}

	public static final MOConfig getMOConfig(Resource resource) {
		return (MOConfig) resource.getContents().get(0);
	}

//	public static String composeQualifiedName(MOConfig config, MOElement prop) {
//		return config.getEPackage().getName()+'.'+prop.getName();
//	}

	public static String composeQualifiedName(MOConfig config, MOAgent prop) {
		var name = prop.getEClass().getName();

		return findProjectName(config)+"."+config.getEPackage().getName() + '.' + name;
	}

	public static String composeQualifiedName(MOConfig config, MOProperty prop) {
		var name = prop.getEClass().getName();

		return findProjectName(config)+"."+config.getEPackage().getName() + '.' + name;
	}

	public static String composeQualifiedName(MOConfig moConfig, DerivedProperty prop) {
		var name = prop.getEClass().getName();

		return findProjectName(moConfig)+"."+moConfig.getEPackage().getName() + '.' + name;
	}

	public static String findProjectName(MOConfig moConfig) {
		EPackageImpl epack =  (EPackageImpl)moConfig.getSystem().getEClass().eContainer();
		Resource res = epack.eResource();
		return res.getURI().segment(1);
	}
	
	
	public static String getSourcePackage(MOConfig moConfig) {
		return findProjectName(moConfig) +"." +moConfig.getEPackage().getName();
	}
	
	
	public static String getFullQualifiedPackage(MOConfig moConfig) {
		return getSourcePackage(moConfig)+"."+StringUtils.capitalize(moConfig.getEPackage().getName())+"Package";
	}
	public static String getFullQualifiedFactory(MOConfig moConfig) {
		return getSourcePackage(moConfig)+"."+StringUtils.capitalize(moConfig.getEPackage().getName())+"Factory";
	}
	
}
