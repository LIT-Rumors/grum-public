echo Update Start Level of Apache Aries (roaster-api->startlevel:2 && roaster-jdt->startlevel:2)

echo org.jboss.forge.roaster.roaster-jdt,2.23.0.Final,plugins/org.jboss.forge.roaster.roaster-jdt_2.23.0.Final.jar,2,true >> configuration/org.eclipse.equinox.simpleconfigurator/bundles.info
echo org.jboss.forge.roaster.roaster-api,2.23.0.Final,plugins/org.jboss.forge.roaster.roaster-api_2.23.0.Final.jar,2,true >> configuration/org.eclipse.equinox.simpleconfigurator/bundles.info
echo org.apache.aries.spifly.dynamic.bundle,1.3.3,plugins/org.apache.aries.spifly.dynamic.bundle_1.3.3.jar,1,true >> configuration/org.eclipse.equinox.simpleconfigurator/bundles.info
echo org.apache.aries.util,1.1.3,plugins/org.apache.aries.util_1.1.3.jar,1,true >> configuration/org.eclipse.equinox.simpleconfigurator/bundles.info
echo "Done"