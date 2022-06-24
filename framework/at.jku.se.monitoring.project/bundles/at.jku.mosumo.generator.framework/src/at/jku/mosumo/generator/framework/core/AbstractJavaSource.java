package at.jku.mosumo.generator.framework.core;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import Monitoring.MOConfig;

public abstract class AbstractJavaSource {
	
	private final IPackageFragmentRoot packageFragmentRoot;
	private final MOConfig moConfig;
	private final IProgressMonitor monitor;
	
	protected AbstractJavaSource(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		this.packageFragmentRoot = packageFragmentRoot;
		this.moConfig = moConfig;
		this.monitor = monitor;
	}
	
	public IPackageFragmentRoot getPackageFragmentRoot() {
		return packageFragmentRoot;
	}
	
	public MOConfig getMoConfig() {
		return moConfig;
	}
	
	public IProgressMonitor getMonitor() {
		return monitor;
	}
}