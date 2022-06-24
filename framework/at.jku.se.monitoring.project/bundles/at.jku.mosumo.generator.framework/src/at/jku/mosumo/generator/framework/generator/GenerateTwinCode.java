package at.jku.mosumo.generator.framework.generator;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.MiscFile;
import at.jku.mosumo.generator.framework.middleware.Middleware;
import at.jku.mosumo.generator.framework.shared.MessageFactory;
import at.jku.mosumo.generator.framework.shared.MessageHandler;
import at.jku.mosumo.generator.framework.twin.DigitalTwinRunner;
import at.jku.mosumo.generator.framework.twin.MiddlewareForwardingAdapter;
import at.jku.mosumo.generator.framework.twin.TwinManager;
import at.jku.mosumo.generator.framework.twin.TwinManifest;
import at.jku.mosumo.generator.framework.util.BrokerConfig;

public class GenerateTwinCode {

	private final IPackageFragmentRoot packageFragmentRoot;
	private final MOConfig moConfig;
	private final IProgressMonitor monitor;

	public GenerateTwinCode(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
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

		allJavaFiles.add(() -> new TwinManifest(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());

//		allJavaFiles.add(() -> new TwinPOMFile(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());

		allJavaFiles.add(() -> new MessageFactory(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		allJavaFiles.add(() -> new MessageHandler(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		allJavaFiles
				.add(() -> new DigitalTwinRunner(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		allJavaFiles.add(() -> new TwinManager(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		allJavaFiles.add(() -> new MiddlewareForwardingAdapter(getPackageFragmentRoot(), moConfig, getMonitor())
				.createFileSource());
		allJavaFiles.add(() -> new BrokerConfig(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());

		allJavaFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(), "resources/log4j2.xml",
				"/src/main/resources/log4j2.xml", "at.jku.mosumo.generator.framework").createFileSource());
		allJavaFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(), "resources/log4j2.xml",
				"/resources/log4j2.xml", "at.jku.mosumo.generator.framework").createFileSource());

		
		allJavaFiles.add(() -> new Middleware(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		
		return allJavaFiles;
	}

	public IPackageFragmentRoot getPackageFragmentRoot() {
		return packageFragmentRoot;
	}

	public IProgressMonitor getMonitor() {
		return monitor;
	}
}
