package at.jku.mosumo.generator.framework.core;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.osgi.framework.Bundle;

import Monitoring.MOConfig;

public class MiscFile implements FileSourceCommand {

	private final IPackageFragmentRoot packageFragmentRoot;
	private final MOConfig moConfig;
	private final IProgressMonitor monitor;
	private String target;
	private String source;
	private String location;

	public MiscFile(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor,
			String source, String target, String location) {
		this.packageFragmentRoot = packageFragmentRoot;
		this.moConfig = moConfig;
		this.monitor = monitor;
		this.source = source;
		this.target = target;
		this.location = location;
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

	@Override
	public void createFileSource() {
		createFileSource(false);
	}

	@Override
	public void createFileSource(boolean replace) {
		String fcontents = readSourceFile(source);

		write(getPackageFragmentRoot().getJavaProject().getProject(), target, fcontents, replace);

	}

	protected String readSourceFile(String filename) {

		try {
			Bundle bundle = Platform.getBundle(location);
			URL fileURL = bundle.getEntry(filename);

			URLConnection conn = fileURL.openConnection();
			String deps = "";

			try (InputStream in = fileURL.openStream()) {
				deps = new String(in.readAllBytes(), StandardCharsets.UTF_8);
			}

			return deps;
		} catch (

		Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "";

	}
}