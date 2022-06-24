package at.jku.mosumo.generator.framework.generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.MiscFile;
import at.jku.mosumo.generator.framework.core.PackageResource;
import at.jku.mosumo.generator.framework.middleware.Middleware;
import at.jku.mosumo.generator.framework.middleware.MiddlewarePOMFile;
import at.jku.mosumo.generator.framework.shared.MessageFactory;
import at.jku.mosumo.generator.framework.util.BrokerConfig;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;
import at.jku.mosumo.generator.framework.util.Utils;

public class GenerateMiddlewareService {

	private final IPackageFragmentRoot packageFragmentRoot;
	private final MOConfig moConfig;
	private final IProgressMonitor monitor;
	private final IProject srcIProject;

	public GenerateMiddlewareService(IProject srcProject, IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig,
			IProgressMonitor monitor) {
		this.packageFragmentRoot = packageFragmentRoot;
		this.moConfig = moConfig;
		this.monitor = monitor;
		this.srcIProject = srcProject;
	}

	// Main method (1) Create an array of all classes (2) Generate all the src code
	public void generateAll() {
		List<Runnable> allJavaFiles = init();
		execute(allJavaFiles);
		
		// Source Project jar Generation
		Path pathMosumoMM = new Path(getPackageFragmentRoot().getPath().segment(0) + "/libs/" + this.srcIProject.getName() + ".jar");		
		Utils.createJarFromBundleName(this.srcIProject.getName(), pathMosumoMM);
	}

	// Generate all the java sources
	private void execute(List<Runnable> allJavaFiles) {
		allJavaFiles.forEach(Runnable::run);
	}

	// Add All Classes
	private List<Runnable> init() {
		final var allJavaFiles = new LinkedList<Runnable>();

		allJavaFiles.add(() -> new Middleware(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		allJavaFiles.add(() -> new MessageFactory(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		allJavaFiles.add(() -> new BrokerConfig(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());

		allJavaFiles.add(() -> new BrokerConfig(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());

		allJavaFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(), "resources/log4j2.xml",
				"/src/main/resources/log4j2.xml", "at.jku.mosumo.generator.api.java").createFileSource());

		//TODO: temporary workaround for addind the dependency to the ecore jar file
		// JAR FILE is not added yet automatically needs to be exported manually!
		PackageResource packres = null;
		if (moConfig.getSystem().getEClass() != null) {
			String projectName = MonitoringGeneratorUtils.findProjectName(moConfig);
			packres = new PackageResource(getPackageFragmentRoot(), moConfig, getMonitor(), "resources",
					projectName + "_0.0.1.jar", "/libs", "at.jku.mosumo.generator.framework");
		}
		
		PackageResource packUtil = new PackageResource(getPackageFragmentRoot(), moConfig, getMonitor(), "resources",
				"at.jku.se.mosumo.monitoring.util", "/libs", "at.jku.mosumo.generator.framework");
		PackageResource packmmm = new PackageResource(getPackageFragmentRoot(), moConfig, getMonitor(), "resources",
				"at.jku.se.mosumo.mm", "/libs", "at.jku.mosumo.generator.framework");
		PackageResource packlogger = new PackageResource(getPackageFragmentRoot(), moConfig, getMonitor(), "resources",
				"at.jku.se.mosumo.tools.logging_1.0.0-SNAPSHOT", "/libs", "at.jku.mosumo.generator.framework");

		//allJavaFiles.add(() -> packres.createFileSource());
		allJavaFiles.add(() -> packUtil.createFileSource());
		allJavaFiles.add(() -> packmmm.createFileSource());
		allJavaFiles.add(() -> packlogger.createFileSource());
				
		List<PackageResource> jarList = new ArrayList<>();
		jarList.add(packres);
		jarList.add(packUtil);
		jarList.add(packmmm);
		jarList.add(packlogger);
		allJavaFiles.add(() -> new MiddlewarePOMFile(getPackageFragmentRoot(), moConfig, jarList, getMonitor())
				.createFileSource());		

		return allJavaFiles;
	}

	public IPackageFragmentRoot getPackageFragmentRoot() {
		return packageFragmentRoot;
	}

	public IProgressMonitor getMonitor() {
		return monitor;
	}
}
