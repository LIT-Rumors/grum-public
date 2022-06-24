package at.jku.mosumo.generator.framework.projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.resources.ICommand;
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
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;

import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;

public class Project {
	
	//Required parameters
	private final String projectName;
		
	//Optional parameters
	private final boolean isJavaProject;
	private final boolean isPlugin;
	private final boolean isMaven;
	private final boolean isViatraPlugin;
	private final String javaSE;
	
	//Result parameter
	private IProject pro;
	private IJavaProject javaPro;
	private Map<String,IFolder> mapOfFolders;
	
	Project(BuilderProject builderProject) {
		this.projectName = builderProject.getProjectName();
		this.isJavaProject = builderProject.isJavaProject();
		this.isPlugin = builderProject.isPlugin();
		this.isMaven = builderProject.isMaven();	
		this.javaSE = builderProject.getJavaSE();
		this.isViatraPlugin = builderProject.isViatraPlugin();
	}	
	
	public String getProjectName() {
		return projectName;
	}
	
	public boolean isJavaProject() {
		return isJavaProject;
	}
	
	public boolean isPlugin() {
		return isPlugin;
	}
	
	public boolean isMaven() {
		return isMaven;
	}
	
	public boolean isViatraPlugin() {
		return isViatraPlugin;
	}
	
	public IProject createProject(IProgressMonitor monitor, boolean delete) {
		final IWorkspaceRunnable createProject = new IWorkspaceRunnable() {
			
			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				if( delete && exists()) {
					deleteProject(monitor);
				}
				createPro(monitor);				
			}
		};
		
		try {
			ResourcesPlugin.getWorkspace().run(createProject, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return pro;
	}

	private void createPro(IProgressMonitor monitor) {
		this.pro = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (!this.pro.exists()) {		
	    	try {
	    		this.mapOfFolders = new HashMap<>();
	    		this.pro.create(monitor);
	    		this.pro.open(monitor);
				addNatures(monitor);
				addSchemaBuilders(monitor);
				createFolders(monitor);
				configureClassPath(monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}		
	}	

	private void addSchemaBuilders(IProgressMonitor monitor) {
		if (isJavaProject() || isMaven() || isPlugin()) {
			final var builders = new ArrayList<ICommand>();
			ICommand java;
			try {
				java = pro.getDescription().newCommand();
				java.setBuilderName(JavaCore.BUILDER_ID);
		        builders.add(java);
		        
		        if (isPlugin) {
		        	final ICommand manifest = pro.getDescription().newCommand();
		            manifest.setBuilderName(MonitoringGeneratorUtils.MANIFEST_BUILDER);
		            builders.add(manifest);

		            final ICommand schema = pro.getDescription().newCommand();
		            schema.setBuilderName(MonitoringGeneratorUtils.SCHEMA_BUILDER);
		            builders.add(schema);
		        }
		        if (isMaven()) {
		            final ICommand mvnSchema = pro.getDescription().newCommand();
		            mvnSchema.setBuilderName(MonitoringGeneratorUtils.MAVEN_BUILDER);
		            builders.add(mvnSchema);
		        }
		       
		        ICommand[] buildersSpecs = builders.toArray(new ICommand[builders.size()]);
		        pro.getDescription().setBuildSpec(buildersSpecs);
			} catch (CoreException e) {
				e.printStackTrace();
			}			
		}		
	}

	private void createFolders(IProgressMonitor monitor) {
		if(isMaven) {
			createMavenFolders(monitor);
		} else if (isPlugin) {
			createPluginFolders(monitor);
		} else if (isJavaProject)
			createSrcFolder(monitor);
	}

	private void createPluginFolders(IProgressMonitor monitor) {
		createSrcFolder(monitor);		
	}

	private Map<String,IFolder> createSrcFolder(IProgressMonitor monitor) {
		final var srcFolder = createFolder(pro, "src", monitor);
		this.mapOfFolders.put("src", srcFolder);
		return mapOfFolders;
	}

	private void createMavenFolders(IProgressMonitor monitor) {
		createSrcFolder(monitor);
		// src/main
		IFolder srcMain = createFolder(mapOfFolders.get(MonitoringGeneratorUtils.SOURCE_FOLDER), MonitoringGeneratorUtils.MAIN_FOLDER, monitor);
		// src/main/java
		IFolder srcMainJava = createFolder(srcMain, MonitoringGeneratorUtils.JAVA_FOLDER, monitor);
		// Create our target output folder
		IFolder targetFolder = createFolder(pro, MonitoringGeneratorUtils.TARGET_FOLDER, monitor);
		// Create our classes output folder
		IFolder classesFolder = createFolder(targetFolder, MonitoringGeneratorUtils.CLASSES_FOLDER, monitor);	
		this.mapOfFolders.put(MonitoringGeneratorUtils.MAIN_FOLDER, srcMain);
		this.mapOfFolders.put(MonitoringGeneratorUtils.JAVA_FOLDER, srcMainJava);
		this.mapOfFolders.put(MonitoringGeneratorUtils.CLASSES_FOLDER, classesFolder);		
	}

	private void addNatures(IProgressMonitor monitor) {
		final IProjectDescription description;
		try {
			description = pro.getDescription();
			description.setNatureIds(getNatures());
			pro.setDescription(description, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	private String[] getNatures() {
		final var listOfNatures = new LinkedList<String>();
		if (isMaven()) {
			listOfNatures.add(JavaCore.NATURE_ID);
			listOfNatures.add(MonitoringGeneratorUtils.MAVEN_NATURE);
		} 
		if (isPlugin()) {
			listOfNatures.add(JavaCore.NATURE_ID);
			listOfNatures.add(MonitoringGeneratorUtils.PLUGIN_NATURE);
		}
		if (isViatraPlugin()) {
			listOfNatures.add(MonitoringGeneratorUtils.VIATRA_NATURE);
			listOfNatures.add(MonitoringGeneratorUtils.XTEXT_NATURE);
		}
		return listOfNatures.toArray(new String[0]);
	}
	
	private void configureClassPath(IProgressMonitor monitor) {
		this.javaPro = JavaCore.create(pro);
		final var entries = new ArrayList<IClasspathEntry>();
		final var executionEnvironmentsManager = JavaRuntime.getExecutionEnvironmentsManager();
		final var executionEnvironments = executionEnvironmentsManager.getExecutionEnvironments();
		for (IExecutionEnvironment iExecutionEnvironment : executionEnvironments) {
		    // We will look for JavaSE-11 as the JRE container to add to our classpath
			 if (this.getJavaSE().equals(iExecutionEnvironment.getId())) {
			       entries.add(JavaCore.newContainerEntry(JavaRuntime.newJREContainerPath(iExecutionEnvironment)));
		        break;
		    }
		}
		
		if (isMaven) {
			// Let's add the maven container to our classpath to let the maven plug-in 
			//add the dependencies computed from a pom.xml file to our classpath
			IClasspathEntry mavenEntry = JavaCore
					.newContainerEntry(new Path(MonitoringGeneratorUtils.MAVEN_CLASS_PATH), 
							new IAccessRule[0],
							new IClasspathAttribute[] 
									{JavaCore.newClasspathAttribute(MonitoringGeneratorUtils.MAVEN_CLASS_PATH_ATTRIBUTE, 
											MonitoringGeneratorUtils.MAVEN_CLASS_PATH_VALUE) }, false);
			
			entries.add(mavenEntry);
			try {
				javaPro.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
				// Let's add target/classes as our output folder for compiled ".class"
				javaPro.setOutputLocation(mapOfFolders.get("classes").getFullPath(), monitor);
				
				// Now let's add our source folder and output folder to our classpath
				final var oldEntries = javaPro.getRawClasspath();
				// +1 for our src/main/java entry
				final var newEntries = new IClasspathEntry[oldEntries.length + 1];
				System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);

				final var srcPackageRoot = javaPro.getPackageFragmentRoot(mapOfFolders.get(MonitoringGeneratorUtils.CLASSES_FOLDER));
				newEntries[oldEntries.length] = JavaCore.newSourceEntry(srcPackageRoot.getPath(), new Path[] {}, new Path[] {}, 
						mapOfFolders.get(MonitoringGeneratorUtils.CLASSES_FOLDER).getFullPath());

				javaPro.setRawClasspath(newEntries, null);		
				
			} catch (JavaModelException e) {
				e.printStackTrace();
			}			
		}	
		
		if (isPlugin) {
			try {
				javaPro.setOutputLocation(new Path("/" + projectName + "/bin"), monitor);
				final IClasspathEntry srcClasspathEntry = JavaCore.newSourceEntry(mapOfFolders.get(MonitoringGeneratorUtils.SOURCE_FOLDER).getFullPath());
				entries.add(0, srcClasspathEntry);		    
				entries.add(JavaCore.newContainerEntry(new Path(MonitoringGeneratorUtils.REQUIRED_PLUGIN)));		    
		   
				javaPro.setRawClasspath(entries.toArray(new IClasspathEntry[0]),
				      monitor);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
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
	
	public String getJavaSE() {
		return javaSE;
	}

	public IProject getProject() {
		return pro;
	}
	
	public IJavaProject getJavaPro() {
		return javaPro;
	}
	
	public Map<String, IFolder> getMapOfFolders() {
		return mapOfFolders;
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
