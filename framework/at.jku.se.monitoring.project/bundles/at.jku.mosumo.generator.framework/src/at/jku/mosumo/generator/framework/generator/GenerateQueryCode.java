package at.jku.mosumo.generator.framework.generator;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.MiscFile;
import at.jku.mosumo.generator.framework.queries.QueryExecutionFile;
import at.jku.mosumo.generator.framework.queries.QueryFile;
import at.jku.mosumo.generator.framework.queries.QueryManifest;

public class GenerateQueryCode {

	private final IPackageFragmentRoot packageFragmentRoot;
	private final MOConfig moConfig;
	private final IProgressMonitor monitor;

	public GenerateQueryCode(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
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

		allJavaFiles.add(() -> new QueryManifest(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		allJavaFiles.add(() -> new QueryFile(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		allJavaFiles
				.add(() -> new QueryExecutionFile(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
//		allJavaFiles.add(() -> new MessageFactory(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
//		allJavaFiles.add(() -> new BrokerConfig(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());

		// Does not seem to work, .classpath file gets overwriten.
		allJavaFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(), "resources/.classpath",
				"/.classpath", "at.jku.mosumo.generator.framework").createFileSource(true));

		return allJavaFiles;
	}

	public IPackageFragmentRoot getPackageFragmentRoot() {
		return packageFragmentRoot;
	}

	public IProgressMonitor getMonitor() {
		return monitor;
	}
}
