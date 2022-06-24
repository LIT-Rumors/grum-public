package at.jku.mosumo.generator.api.java.menu;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.progress.UIJob;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.api.java.generator.GenerateJavaAPICode;
import at.jku.mosumo.generator.framework.generator.GenerateMiddlewarePlugin;
import at.jku.mosumo.generator.framework.generator.GenerateMiddlewareService;
import at.jku.mosumo.generator.framework.generator.GenerateQueryCode;
import at.jku.mosumo.generator.framework.generator.GenerateTwinCode;
import at.jku.mosumo.generator.framework.projects.BuilderProject;
import at.jku.mosumo.generator.framework.projects.CreateMavenProject;
import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;

public class CodeGeneratorExecutor {

	public static void generate(IProject srcProject, MOConfig moConfig) {

		
		class GenerateCodeJob extends Job {
		      public GenerateCodeJob() {
		         super("Generating GRuB Platform");
		      }
		      public IStatus run(IProgressMonitor pr) {
		    	pr.beginTask("Generating Query Plugin...", 1);
		  		generateQueryPlugin(moConfig, pr);
		  		pr.beginTask("Generating Middleware Plugin...", 2);
				generateMiddlewarePlugin(moConfig, pr);
				pr.beginTask("Generating Twin Plugin...", 3);
				generateTwinPlugin(moConfig, pr);
				pr.beginTask("Generating Service Maven Project...", 4);
				generateMiddlewareServiceProject(srcProject, moConfig, pr);
				pr.beginTask("Generating API Maven Project...", 5);
				generateApiProject(moConfig, pr);
		         return Status.OK_STATUS;
		      }
		   };
		   Job generateJob = new GenerateCodeJob();
		   generateJob.setUser(true);
		   generateJob.schedule();
	}

	private static void generateQueryPlugin(MOConfig moConfig, IProgressMonitor pr) {
		final var plugin = new BuilderProject(moConfig.getProjectName() + ".query").setPlugin(true).build();
		if (plugin.exists()) {
			return;
		}
		plugin.createProject(pr, false);
		final var pluginMiddlewarePackageRoot = plugin.getJavaPro()
				.getPackageFragmentRoot(plugin.getMapOfFolders().get(MonitoringGeneratorUtils.SOURCE_FOLDER));

		new GenerateQueryCode(pluginMiddlewarePackageRoot, moConfig, pr).generateAll();

	}

	private static void generateMiddlewarePlugin(final MOConfig moConfig, IProgressMonitor pr) {
		final var plugin = new BuilderProject(moConfig.getProjectName() + ".middleware").setPlugin(true).build();
		plugin.createProject(pr, true);
		final var pluginMiddlewarePackageRoot = plugin.getJavaPro()
				.getPackageFragmentRoot(plugin.getMapOfFolders().get(MonitoringGeneratorUtils.SOURCE_FOLDER));

		new GenerateMiddlewarePlugin(pluginMiddlewarePackageRoot, moConfig,  pr).generateAll();
	}

	private static void generateTwinPlugin(final MOConfig moConfig, IProgressMonitor pr) {
		final var plugin = new BuilderProject(moConfig.getProjectName() + ".twin").setPlugin(true).build();
		plugin.createProject(pr, true);

		final var packageRoot = plugin.getJavaPro()
				.getPackageFragmentRoot(plugin.getMapOfFolders().get(MonitoringGeneratorUtils.SOURCE_FOLDER));

		new GenerateTwinCode(packageRoot, moConfig, pr).generateAll();
	}

	private static void generateMiddlewareServiceProject(IProject srcProject, MOConfig moConfig, IProgressMonitor pr) {

		final var mavenProjectAPI = new CreateMavenProject(moConfig.getProjectName() + ".service.middleware")
				.createMavenProjectRun(pr, true);

		new GenerateMiddlewareService(srcProject, mavenProjectAPI.getSrcPackageRoot(), moConfig, pr).generateAll();

	}

	private static void generateApiProject(MOConfig moConfig, IProgressMonitor pr) {
		final var mavenProjectAPI = new CreateMavenProject(moConfig.getProjectName() + ".api").createMavenProjectRun(pr,
				true);

		new GenerateJavaAPICode(mavenProjectAPI.getSrcPackageRoot(), moConfig, pr).generateAll();
	}

}
