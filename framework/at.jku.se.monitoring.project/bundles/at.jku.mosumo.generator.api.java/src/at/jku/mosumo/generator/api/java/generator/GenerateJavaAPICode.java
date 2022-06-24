package at.jku.mosumo.generator.api.java.generator;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.api.java.api.APIPOMFile;
import at.jku.mosumo.generator.api.java.api.MonitoringAPI;
import at.jku.mosumo.generator.framework.core.MiscFile;
import at.jku.mosumo.generator.framework.util.BrokerConfig;

public class GenerateJavaAPICode {

	private final IPackageFragmentRoot packageFragmentRoot;
	private final MOConfig moConfig;
	private final IProgressMonitor monitor;

	public GenerateJavaAPICode(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		this.packageFragmentRoot = packageFragmentRoot;
		this.moConfig = moConfig;
		this.monitor = monitor;
	}

	// Main method (1) Create an array of all classes (2) Generate all the src code
	public void generateAll() {
		List<Runnable> allJavaFiles = init();
		execute(allJavaFiles);
	}

	// Generate all the java sources
	private void execute(List<Runnable> allJavaFiles) {
		allJavaFiles.forEach(Runnable::run);
	}

	// Add All Classes
	private List<Runnable> init() {
		final var allJavaFiles = new LinkedList<Runnable>();

		allJavaFiles.add(() -> new APIPOMFile(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());

		allJavaFiles.add(() -> new MonitoringAPI(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		
		
		allJavaFiles.add(() -> new BrokerConfig(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		
	
		allJavaFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(), "resources/log4j2.xml",
				"/src/main/resources/log4j2.xml", "at.jku.mosumo.generator.api.java").createFileSource());
		allJavaFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(), "resources/Constants.java",
				"/src/main/java/api/Constants.java", "at.jku.mosumo.generator.api.java").createFileSource());
		allJavaFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(), "resources/MQTTPublisher.java",
				"/src/main/java/api/MQTTPublisher.java", "at.jku.mosumo.generator.api.java").createFileSource());
		allJavaFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(), "resources/PublishException.java",
				"/src/main/java/api/PublishException.java", "at.jku.mosumo.generator.api.java").createFileSource());
 
		return allJavaFiles;
	}

	public IPackageFragmentRoot getPackageFragmentRoot() {
		return packageFragmentRoot;
	}

	public IProgressMonitor getMonitor() {
		return monitor;
	}
}
