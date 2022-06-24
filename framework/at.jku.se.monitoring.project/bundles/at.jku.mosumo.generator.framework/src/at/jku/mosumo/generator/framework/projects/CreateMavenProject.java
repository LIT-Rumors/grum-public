package at.jku.mosumo.generator.framework.projects;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;

import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;

//TODO Builder Pattern?
public class CreateMavenProject {

	private final String projectName;
	private IProject project;
	private IJavaProject javaProject;
	private IFolder srcMainJavaFolder;
	private IPackageFragmentRoot srcPackageRoot;

	public CreateMavenProject(String projectName) {
		this.projectName = projectName;
		this.project = null;
		this.javaProject = null;
		this.srcMainJavaFolder = null;
		this.srcPackageRoot = null;
	}

	public CreateMavenProject createMavenProjectRun(final IProgressMonitor monitor, boolean delete) {
		final IWorkspaceRunnable createProject = new IWorkspaceRunnable() {

			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				if (delete && exists()) {
					deleteProject(monitor);
				}
				createMavenProject(monitor);
			}
		};

		try {
			ResourcesPlugin.getWorkspace().run(createProject, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return this;
	}

	public CreateMavenProject createMavenProject(final IProgressMonitor monitor) {
		IProject pro = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (!pro.exists()) {
			try {
				pro.create(monitor);
				pro.open(monitor);
				javaAndMavenProject(pro, monitor);
				javaProject(pro, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return this;
	}

	// Configure the project to be a Java project and a maven project
	private void javaAndMavenProject(final IProject project, final IProgressMonitor monitor) {
		final IProjectDescription description;
		try {
			description = project.getDescription();
			description.setNatureIds(new String[] { JavaCore.NATURE_ID, MonitoringGeneratorUtils.MAVEN_NATURE });
			project.setDescription(description, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void javaProject(final IProject project, IProgressMonitor monitor) {
		this.javaProject = JavaCore.create(project);
		final var entries = new ArrayList<IClasspathEntry>();
		final var executionEnvironmentsManager = JavaRuntime.getExecutionEnvironmentsManager();
		final var executionEnvironments = executionEnvironmentsManager.getExecutionEnvironments();
		for (IExecutionEnvironment iExecutionEnvironment : executionEnvironments) {
			// We will look for JavaSE-11 as the JRE container to add to our classpath
			if (MonitoringGeneratorUtils.JAVA_SE_11.equals(iExecutionEnvironment.getId())) {
				entries.add(JavaCore.newContainerEntry(JavaRuntime.newJREContainerPath(iExecutionEnvironment)));
				break;
			}
		}

		// Let's add the maven container to our classpath to let the maven plug-in
		// add the dependencies computed from a pom.xml file to our classpath
		IClasspathEntry mavenEntry = JavaCore.newContainerEntry(new Path(MonitoringGeneratorUtils.MAVEN_CLASS_PATH),
				new IAccessRule[0],
				new IClasspathAttribute[] {
						JavaCore.newClasspathAttribute(MonitoringGeneratorUtils.MAVEN_CLASS_PATH_ATTRIBUTE,
								MonitoringGeneratorUtils.MAVEN_CLASS_PATH_VALUE) },
				false);
		entries.add(mavenEntry);
		// src
		IFolder src = createFolder(project, "src", monitor);
		// src/main
		IFolder srcMain = createFolder(src, "main", monitor);
		// src/main/java
		this.srcMainJavaFolder = createFolder(srcMain, "java", monitor);

		// Create our target output folder
		IFolder targetFolder = createFolder(project, "target", monitor);
		// Create our classes output folder
		IFolder classesFolder = createFolder(targetFolder, "classes", monitor);
		try {
			javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
			// Let's add target/classes as our output folder for compiled ".class"
			javaProject.setOutputLocation(classesFolder.getFullPath(), monitor);

			// Now let's add our source folder and output folder to our classpath
			final var oldEntries = javaProject.getRawClasspath();
			// +1 for our src/main/java entry
			final var newEntries = new IClasspathEntry[oldEntries.length + 1];
			System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);

			this.srcPackageRoot = javaProject.getPackageFragmentRoot(this.srcMainJavaFolder);
			newEntries[oldEntries.length] = JavaCore.newSourceEntry(srcPackageRoot.getPath(), new Path[] {},
					new Path[] {}, classesFolder.getFullPath());

			javaProject.setRawClasspath(newEntries, null);

		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}

	private IFolder createFolder(final IContainer container, final String folderName, final IProgressMonitor monitor) {
		IFolder newFolder = container.getFolder(new Path(folderName));
		try {
			newFolder.create(true, true, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return newFolder;
	}

	// Getters
	public IProject getProject() {
		return project;
	}

	// TODO probably this is not necessary. It can be retrieve using
	// JavaCore.create(IProject)
	public IJavaProject getJavaProject() {
		return javaProject;
	}

	public IFolder getSrcMainJavaFolder() {
		return srcMainJavaFolder;
	}

	public IPackageFragmentRoot getSrcPackageRoot() {
		return srcPackageRoot;
	}

	public boolean exists() {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).exists();
	}

	public void deleteProject(IProgressMonitor progressMonitor) throws CoreException {
		IProject pro = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		pro.delete(true, new NullProgressMonitor());
		pro.getParent().refreshLocal(IProject.DEPTH_INFINITE,
				new NullProgressMonitor());
		
	}
}
