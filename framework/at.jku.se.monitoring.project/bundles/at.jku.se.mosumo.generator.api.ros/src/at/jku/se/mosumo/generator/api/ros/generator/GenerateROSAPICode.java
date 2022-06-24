package at.jku.se.mosumo.generator.api.ros.generator;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.MiscFile;
import at.jku.se.mosumo.generator.api.ros.api.AirSensorForwarder;
import at.jku.se.mosumo.generator.api.ros.api.MQTTFile;
import at.jku.se.mosumo.generator.api.ros.api.ROSMonitoringAPI;

public class GenerateROSAPICode {

	IPackageFragmentRoot packageFragmentRoot;
	MOConfig moConfig;
	IProgressMonitor monitor;

	public GenerateROSAPICode(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		this.packageFragmentRoot = packageFragmentRoot;
		this.moConfig = moConfig;
		this.monitor = monitor;
	}

	// Main method (1) Create an array of all classes (2) Generate all the src code
	public void generateAll() {
		List<Runnable> allROSAPIFiles = init();
		execute(allROSAPIFiles);
	}

	private void execute(List<Runnable> allROSAPIFiles) {
		allROSAPIFiles.forEach(Runnable::run);
	}

	private List<Runnable> init() {
		final var allFiles = new LinkedList<Runnable>();

		// turtle_monitoring_pkg
		allFiles.add(() -> new ROSMonitoringAPI(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		allFiles.add(() -> new MQTTFile(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		allFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(),
				"resources/turtle_monitoring_pkg/scripts/application.py",
				"/turtle_monitoring_pkg/scripts/application.py", "at.jku.se.mosumo.generator.api.ros")
						.createFileSource());
		allFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(),
				"resources/turtle_monitoring_pkg/scripts/__init__.py", "/turtle_monitoring_pkg/scripts/__init__.py",
				"at.jku.se.mosumo.generator.api.ros").createFileSource());
		allFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(),
				"resources/turtle_monitoring_pkg/scripts/utils.py", "/turtle_monitoring_pkg/scripts/utils.py",
				"at.jku.se.mosumo.generator.api.ros").createFileSource());
		allFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(),
				"resources/turtle_monitoring_pkg/CMakeLists.txt", "/turtle_monitoring_pkg/CMakeLists.txt",
				"at.jku.se.mosumo.generator.api.ros").createFileSource());
		allFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(),
				"resources/turtle_monitoring_pkg/package.xml", "/turtle_monitoring_pkg/package.xml",
				"at.jku.se.mosumo.generator.api.ros").createFileSource());

		// air_sensor_forwarder_pkg
		allFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(),
				"resources/air_sensor_forwarder_pkg/package.xml", "/air_sensor_forwarder_pkg/package.xml",
				"at.jku.se.mosumo.generator.api.ros").createFileSource());
		allFiles.add(() -> new MiscFile(getPackageFragmentRoot(), moConfig, getMonitor(),
				"resources/air_sensor_forwarder_pkg/CMakeLists.txt", "/air_sensor_forwarder_pkg/CMakeLists.txt",
				"at.jku.se.mosumo.generator.api.ros").createFileSource());
		allFiles.add(() -> new AirSensorForwarder(getPackageFragmentRoot(), moConfig, getMonitor()).createFileSource());
		return allFiles;
	}

	public IPackageFragmentRoot getPackageFragmentRoot() {
		return packageFragmentRoot;
	}

	public IProgressMonitor getMonitor() {
		return monitor;
	}
}
