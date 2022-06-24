## Building from the sources

# Requirements

1. [Java 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)

2. Install/Download Eclipse

At this moment, we are using Eclipse 2022-03 IDE Java and DSL Developers. This Eclipse IDE can be download from the [Eclipse Download Page](https://www.eclipse.org/downloads/packages/release/2022-03/r/). 

<img src="/wiki/images/eclipse-version.png" alt="Eclipse Package">

Note: Please, ensure that Eclipse is actually using Java 11. To do this, go to Windows -> Preferences, and then, Java -> Installed JRE. Take a look at the following screenshot: 

<img src="/wiki/images/eclipse-configure-Java-JRE-11.png" alt="Eclipse Preferences -> Java Installed JRE">

3. Update Maven

Install the latest version of Maven using this Update Site: https://download.eclipse.org/technology/m2e/releases/latest/

Note: To install this please in the Eclipse menu go to Help->Install New Software and add the link provided above. Then, install the components as the following screenshot:

<img src="/wiki/images/install-latest-maven-version.png" alt="Install Maven Latest Version">

4. Import Projects

Either if you clone the repository or download the code. Import the project within the folder ``at.jku.se.monitoring.project``. Like the following screenshot:

<img src="/wiki/images/import-projects.png" alt="Import GruM Projects">

5. Target Platform

After all the projects are imported it is needed to "Set the Target Platform" in order to download all the dependencies. Please, go to the project "at.jku.se.monitoring.target" within the releng folder and double-click to the file "at.jku.se.monitoring.target" and activate the target platform (top right corner). See the following screenshot:

<img src="/wiki/images/target-platform-reload.png" alt="Reload Target Platform">

Note: A preconfigured run configuration can be found in `/at.jku.se.monitoring.target/launchconfig/Run-EclipseWithGenerator.launch`

# Optional Requirements

1. Ecore Diagram Editor**
	To be able to view and edit the ecore diagrams (*.aird-Files) this Plugin is required.	In eclipse workspace go to Help > Install New Software > --All Available Sites-- > Modeling > Ecore Diagram Editor (SDK). 
	If there is an GTK binding error, (occures on Ubuntu), install these libs via terminal: `libwebkit2gtk-4.0-37`, `libwebkit2gtk-4.0-37-gtk2` and restart eclipse.

