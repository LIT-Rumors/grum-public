package at.jku.mosumo.generator.framework.projects;

import at.jku.mosumo.generator.framework.util.MonitoringGeneratorUtils;

public class BuilderProject {
	
	//Required parameters
	private final String projectName;
	
	//Optional parameters
	private boolean isJavaProject = false;
	private boolean isPlugin = false;
	private boolean isMaven = false;
	private String javaSE = MonitoringGeneratorUtils.JAVA_SE_11;
		
	public BuilderProject(String projectName) {
		this.projectName = projectName;		
	}
	
	public BuilderProject setJavaProject(boolean isJavaProject) {
		this.isJavaProject = isJavaProject;
		return this;
	}
	
	public BuilderProject setPlugin(boolean isPlugin) {
		this.isPlugin = isPlugin;
		return this;
	}
	
	public BuilderProject setMaven(boolean isMaven) {
		this.isMaven = isMaven;
		return this;
	}
	
	public BuilderProject setJavaSE(String javaSE) {
		this.javaSE = javaSE;
		return this;
	} 
	
	public Project build() {
		return new Project(this);
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public boolean isJavaProject() {
		return isJavaProject;
	}
	
	public boolean isMaven() {
		return isMaven;
	}
	
	public boolean isPlugin() {
		return isPlugin;
	}
	
	public String getJavaSE() {
		return javaSE;
	}
}
