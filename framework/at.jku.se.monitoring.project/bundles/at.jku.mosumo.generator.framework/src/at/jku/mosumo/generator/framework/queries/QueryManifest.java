package at.jku.mosumo.generator.framework.queries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.osgi.internal.loader.EquinoxClassLoader;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;

public class QueryManifest extends AbstractJavaSource implements FileSourceCommand{

	public QueryManifest(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig,
			IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);		
	}

	@Override
	public void createFileSource() {		
		final StringBuilder maniContent = new StringBuilder("Manifest-Version: 1.0\n");
		maniContent.append("Bundle-ManifestVersion: 2\n")
				   .append("Bundle-Name: " + getPackageFragmentRoot().getJavaProject().getProject().getName() + "\n")
				   .append("Bundle-SymbolicName: " + getPackageFragmentRoot().getJavaProject().getProject().getName() + "; singleton:=true\n")
				   .append("Bundle-Version: 1.0.0\n")
				   .append("Bundle-RequiredExecutionEnvironment: " + MonitoringGeneratorUtils.JAVA_SE_11 + "\r\n")
				   .append("Export-Package: query\n")
				   .append("Bundle-ActivationPolicy: lazy\r\n")
				   ;
		
		
		List<String> requiredBundles = new ArrayList<>(defaultBundles);
		String projectName =  MonitoringGeneratorUtils.findProjectName(getMoConfig());
		requiredBundles.add(projectName);
		
		
		if (!requiredBundles.isEmpty()) {
			maniContent.append("Require-Bundle:");
			for(final var requiredBundleIterator = requiredBundles.iterator();requiredBundleIterator.hasNext();) {
				maniContent.append(" " + requiredBundleIterator.next());
				 if (requiredBundleIterator.hasNext()) {
	                 maniContent.append(",\n");
	             } else {
	            	 maniContent.append("\n");
	             }
			}
		}		
		
		write(getPackageFragmentRoot().getJavaProject().getProject().getFolder("META-INF"), "MANIFEST.MF", maniContent.toString());		
	} 
	
	/*TODO It would be nice to get rid of this code using Roaster..is this possible?*/	
	public static final List<String> defaultBundles = Arrays.asList("at.jku.se.mosumo.monitoring.util",
																		"at.jku.se.mosumo.tools.logging",
																		"org.eclipse.paho.client.mqttv3",
 																		"org.emfjson.jackson",
																		"com.fasterxml.jackson.core.jackson-databind",
																		"org.eclipse.emf.ecore.xmi",
																		 "org.eclipse.viatra.query.runtime",
																		 "com.fasterxml.jackson.core.jackson-databind",
																		 "com.fasterxml.jackson.core.jackson-core",
																		 "at.jku.se.mosumo.mm",
																		 "org.apache.log4j",
																		 "org.apache.logging.log4j",
																		 "com.fasterxml.jackson.core.jackson-annotations"
																		);

}
