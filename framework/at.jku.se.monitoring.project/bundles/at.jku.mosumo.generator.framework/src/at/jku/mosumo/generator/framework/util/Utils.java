package at.jku.mosumo.generator.framework.util;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.ui.jarpackager.IJarExportRunnable;
import org.eclipse.jdt.ui.jarpackager.JarPackageData;

public class Utils {

	public static String firstToLower(String string) {
		return Character.toLowerCase(string.charAt(0)) + string.substring(1);
	}

	public static String firstToUpper(String string) {
		return Character.toUpperCase(string.charAt(0)) + string.substring(1);
	}

	public static String tailToLower(String string) {
		return Character.toUpperCase(string.charAt(0)) + string.substring(1).toLowerCase();
	}

	public static String replaceLast(String string, String toReplace, String replacement) {
		int pos = string.lastIndexOf(toReplace);
		if (pos > -1) {
			return string.substring(0, pos) + replacement + string.substring(pos + toReplace.length());
		} else {
			return string;
		}
	}

	public static void createJarFromBundleName(String projectName, IPath path) {

		final JarPackageData jarPackageData = new JarPackageData();
		jarPackageData.setExportJavaFiles(true);
		jarPackageData.setExportErrors(true);
		jarPackageData.setExportWarnings(true);
		jarPackageData.setExportClassFiles(true);
		jarPackageData.setExportOutputFolders(true);
		jarPackageData.setIncludeDirectoryEntries(true);
		jarPackageData.setElements(new Object[] { ResourcesPlugin.getWorkspace().getRoot().getProject(projectName) });
		IJarExportRunnable exportJar = jarPackageData.createJarExportRunnable(null);

		
		//Very ugly hardcoded version workaround - needs fixing! 
		IPath versioned_path = path.uptoSegment(path.segmentCount() - 1)
				.append(path.lastSegment().replace(".jar", "_0.0.1.jar"));
		jarPackageData.setJarLocation(versioned_path);
		try {
			exportJar.run(new NullProgressMonitor());
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
