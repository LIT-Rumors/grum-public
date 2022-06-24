//package at.jku.mosumo.generator.framework.middleware;
//
//import java.net.URL;
//import java.util.Collections;
//import java.util.Enumeration;
//import java.util.List;
//
//import org.eclipse.core.runtime.IProgressMonitor;
//import org.eclipse.core.runtime.Platform;
//import org.eclipse.jdt.core.IPackageFragmentRoot;
//import org.osgi.framework.Bundle;
//
//import Monitoring.MOConfig;
//import at.jku.mosumo.generator.framework.core.AbstractPomFile;
//import at.jku.mosumo.generator.framework.core.FileSourceCommand;
//import at.jku.mosumo.generator.framework.core.PackageResource;
//import sun.tools.jar.resources.jar;
//
//public class APIPOMFile extends AbstractPomFile implements FileSourceCommand {
//
//	private List<PackageResource> jarList;
//
//	public APIPOMFile(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, List<PackageResource> jarList,
//			IProgressMonitor monitor) {
//		super(packageFragmentRoot, moConfig, monitor);
//		this.jarList = jarList == null ? Collections.emptyList() : jarList;
//	}
//
//	@Override
//	public void createFileSource() {
//
//		for (PackageResource s : jarList) {
//			System.out.println(s.getFileName());
//		}
//
//		final String pomFile = "<project xmlns=\"http://maven.apache.org/POM/4.0.0\"\r\n"
//				+ "	xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n"
//				+ "	xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">\r\n"
//				+ "	<modelVersion>4.0.0</modelVersion>\r\n" + "	<groupId>at.jku.se.mosumo.gen</groupId>\r\n"
//				+ "	<artifactId>#ID#</artifactId>\r\n" + "	<version>0.0.1-SNAPSHOT</version>\r\n"
//				+ "	<properties>\r\n" + "		<maven.compiler.target>1.8</maven.compiler.target>\r\n"
//				+ "		<maven.compiler.source>1.8</maven.compiler.source>\r\n"
//				+ "		<roaster.version>1.8</roaster.version>\r\n" + "	</properties>"
//
//				+ "<repositories>\r\n" + "<repository>\r\n" + "	<id>viatra</id>\r\n"
//				+ "<name>Viatra Repository Mirror</name>\r\n" + "<layout>default</layout>\r\n"
//				+ "<url> https://repo.eclipse.org/content/groups/viatra2/</url>\r\n" + "<snapshots>\r\n"
//				+ "		<enabled>false</enabled>\r\n" + "</snapshots>\r\n" + "</repository>\r\n" + "</repositories>\r\n"
//				+ "<dependencies>" + "<dependency>\r\n" + "  <groupId>org.eclipse.paho</groupId>\r\n"
//				+ "  <artifactId>org.eclipse.paho.client.mqttv3</artifactId>\r\n" + "  <version>1.2.5</version>\r\n"
//				+ "</dependency>\r\n" + readDependencies("api.deps", "at.jku.mosumo.generator.api.java")
//				+ attachDependencies() + "</dependencies>\r\n" + "</project>";
//
//		String fcontents = pomFile.replace("#ID#", getMoConfig().getNamespace() + ".api");
//		write(getPackageFragmentRoot().getJavaProject().getProject(), "pom.xml", fcontents);
//	}
//
//	private String attachDependencies() {
//		StringBuilder sb = new StringBuilder();
//		for (PackageResource res : jarList) {
//			sb.append(atttachResource(res.getFileName()));
//		}
//		return sb.toString();
//	}
//
//	private String atttachResource(String fileName) {
//	
//		String[] split = fileName.split("_");
//		
//
//		
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append(" 	<dependency>\n"
//				+ "			<groupId>"+split[0]+"</groupId>\n"
//				+ "			<artifactId>"+split[0]+"</artifactId>\n"
//				+ "			<version>"+split[1].replace(".jar", "")+"</version>\n"
//				+"          <scope>system</scope>\n"
//				+"          <systemPath>${basedir}/lib/"+ fileName+"</systemPath>\n"
//				+ "		</dependency>\n");
//		 
//		return sb.toString();
//
//	}
//
//}
