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

public abstract class AbstractPomFile extends AbstractJavaSource {

	private static final String FILE_ROOT = "resources";

	protected AbstractPomFile(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	protected String readDependencies(String filename, String location) {

		try {
			Bundle bundle = Platform.getBundle(location);
			URL fileURL = bundle.getEntry(FILE_ROOT + "/" + filename);

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