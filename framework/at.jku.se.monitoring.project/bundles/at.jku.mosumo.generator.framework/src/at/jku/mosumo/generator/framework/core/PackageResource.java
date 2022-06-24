package at.jku.mosumo.generator.framework.core;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.osgi.framework.Bundle;

import Monitoring.MOConfig;
import at.jku.se.mosumo.monitoring.util.Pair;

public class PackageResource implements FileSourceCommand {

	private final IPackageFragmentRoot packageFragmentRoot;
	private final MOConfig moConfig;
	private final IProgressMonitor monitor;
	private String target;
	private String source;
	private String location;
	private String sourceFolder;
	private String fileName;
	private String storedFile;

	public PackageResource(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor,
			String sourceFolder, String fileName, String target, String location) {
		this.packageFragmentRoot = packageFragmentRoot;
		this.moConfig = moConfig;
		this.monitor = monitor;
		this.sourceFolder = sourceFolder;
		this.fileName = fileName;
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
		Pair<String, byte[]> file = readSourceFile(fileName);
		storedFile = file.getFirst();

		write(getPackageFragmentRoot().getJavaProject().getProject(), target + "/" + file.getFirst(), file.getSecond());

	}

	protected Pair<String, byte[]> readSourceFile(String filename) {

		try {
			Bundle bundle = Platform.getBundle(location);
			Enumeration<URL> entries = bundle.findEntries(sourceFolder, filename + "*", false);
			URL e = null;
			while (entries.hasMoreElements()) {
				e = entries.nextElement();
				System.out.println(e);
				break;
			}

//			URL fileURL = bundle.getEntry(filename);

			URLConnection conn = e.openConnection();

			String jarName = FilenameUtils.getName(e.getFile());

			byte[] content;

			try (InputStream in = e.openStream()) {
				content = in.readAllBytes();
			}

			return Pair.create(jarName, content);
		} catch (

		Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public String getFileName() {
		return storedFile != null ? storedFile : fileName;
	}
}