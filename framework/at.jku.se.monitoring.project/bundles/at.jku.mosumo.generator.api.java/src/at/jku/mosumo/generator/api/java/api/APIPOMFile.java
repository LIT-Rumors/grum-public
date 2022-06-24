package at.jku.mosumo.generator.api.java.api;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.AbstractPomFile;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;

public class APIPOMFile extends AbstractPomFile implements FileSourceCommand {

	public APIPOMFile(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {

		final String pomFile = "<project xmlns=\"http://maven.apache.org/POM/4.0.0\"\r\n"
				+ "	xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n"
				+ "	xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">\r\n"
				+ "	<modelVersion>4.0.0</modelVersion>\r\n" + "	<groupId>at.jku.se.mosumo.gen</groupId>\r\n"
				+ "	<artifactId>#ID#</artifactId>\r\n"
				+ "	<version>0.0.1-SNAPSHOT</version>\r\n" + "	<properties>\r\n"
				+ "		<maven.compiler.target>1.8</maven.compiler.target>\r\n"
				+ "		<maven.compiler.source>1.8</maven.compiler.source>\r\n"
				+ "		<roaster.version>1.8</roaster.version>\r\n" + "	</properties>"

				+ "<repositories>\r\n" + "<repository>\r\n" + "	<id>viatra</id>\r\n"
				+ "<name>Viatra Repository Mirror</name>\r\n" + "<layout>default</layout>\r\n"
				+ "<url> https://repo.eclipse.org/content/groups/viatra2/</url>\r\n" + "<snapshots>\r\n"
				+ "		<enabled>false</enabled>\r\n" + "</snapshots>\r\n" + "</repository>\r\n" + "</repositories>\r\n"
				+ "<dependencies>" + "<dependency>\r\n" + "  <groupId>org.eclipse.paho</groupId>\r\n"
				+ "  <artifactId>org.eclipse.paho.client.mqttv3</artifactId>\r\n" + "  <version>1.2.5</version>\r\n"
				+ "</dependency>\r\n"  + readDependencies("api.deps","at.jku.mosumo.generator.api.java")
				+ "</dependencies>\r\n" + "</project>";

		
		String fcontents = pomFile.replace("#ID#",  getMoConfig().getProjectName()+".api");
		write(getPackageFragmentRoot().getJavaProject().getProject(), "pom.xml", fcontents);
	}

}
