package at.jku.mosumo.generator.framework.queries;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;

public class QueryFile extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "Queries";

	public QueryFile(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {

		String classz = "package query;\n"
				+ " \n"
				+ "//import \"http://www.example.org/dronology\"\n"
				+ "import \"http://www.eclipse.org/emf/2002/Ecore\"\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "pattern simpleCheck() {\n"
				+ "	check(5 > 25);\n"
				+ "}\n"
				+ "";

		write(getPackageFragmentRoot().getJavaProject().getProject().getFolder("src").getFolder("query"),
				getMoConfig().getSystem().getEClass().getName() + CLASS_NAME + ".vql", classz);

	}

}
