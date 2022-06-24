# Installation

We provide an Update Site as part of this repository.

Requirements: [Java 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html) (Make sure that the compliance level in Eclipse is set to Java 11 as well!)

1. Download Eclipse [2022-03](https://www.eclipse.org/downloads/packages/release/2022-03/r) or [2022-06](https://www.eclipse.org/downloads/packages/release/2022-06/r) (Eclipse IDE for Java and DSL Developers Version)

2. Install the GruM Framework using the following local zipped Update Site: [framework/updatesite](https://github.com/LIT-Rumors/grum-public/blob/main/framework/updatesite/at.jku.se.monitoring.update.eclipse-repository-1.0.0-SNAPSHOT.zip)


4. Instal the Ecore Diagram Editor: To be able to view and edit the ecore diagrams (*.aird-Files) this Plugin is required. In Eclipse go to Help > Install New Software > --All Available Sites-- > Modeling > Ecore Diagram Editor (SDK). 

*(Hint: If there is an GTK binding error, (occures on Ubuntu), install these libs via terminal: libwebkit2gtk-4.0-37, libwebkit2gtk-4.0-37-gtk2 and restart Eclipse)*

4. Install the [Viatra Query Engine](https://www.eclipse.org/viatra/downloads.html) - Viatra Update Site: http://download.eclipse.org/viatra/updates/release/latest

3.  __Extra Step__: Since we are using [Roaster as a Java Parser ](https://github.com/forge/roaster) we need to update the start levels of the apache aries and roaster plugins. So far, we have not been able to fully automate this via the Tycho build (see [Tycho Discussion Forum](https://github.com/eclipse/tycho/discussions/1007)). For this reason, it is necessary to run a small batch file within the same folder where the Eclips executable is (typically the eclipse folder) - Simply copy the the batch for [Windows](update-start-level.bat) or [Linux](update-start-level.sh) into the eclipse folder where you just installed GruM, run it once, and then you are good to go.


Once GruM, Viatra and the Ecore Graphical Editor are installed you can [import the existing models and generated GRuM platforms](/usecases/examples/monitoredsystems) (or create new ones): [Step-by-Step Guide](MODEL_NEW_SYSTEM.md)
