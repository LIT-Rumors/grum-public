package at.jku.se.mosumo.generator.api.ros.api;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;

/***
 * Generates a pyhon file containing a MQTT connector based on the server
 * specification in the ecore model.
 * 
 * @author Marco Stadler
 *
 */
public class MQTTFile extends AbstractJavaSource implements FileSourceCommand {

	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public MQTTFile(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		var mqttPythonScript = new StringBuilder();

		var connectionUrl = getMoConfig().getServers().get(0).getConnectionURL();
		var host = connectionUrl.substring(0, connectionUrl.indexOf(':'));
		var port = connectionUrl.substring(connectionUrl.indexOf(':') + 1);

		mqttPythonScript.append("#!/usr/bin/env python").append(LINE_SEPARATOR).append("import json")
				.append(LINE_SEPARATOR).append("from paho.mqtt import client as mqtt_client").append(LINE_SEPARATOR)
				.append(LINE_SEPARATOR).append("class MQTTForwarder:").append(LINE_SEPARATOR).append(LINE_SEPARATOR)
				.append("    def init(self):").append(LINE_SEPARATOR).append("        self.connect_mqtt()")
				.append(LINE_SEPARATOR).append(LINE_SEPARATOR).append("    def connect_mqtt(self):")
				.append(LINE_SEPARATOR).append("        def on_connect(client, userdata, flags, rc):")
				.append(LINE_SEPARATOR).append("            if rc == 0:").append(LINE_SEPARATOR)
				.append("                print(\"Connected to MQTT Broker!\")").append(LINE_SEPARATOR)
				.append("            else:").append(LINE_SEPARATOR)
				.append("                print(\"Failed to connect, return code %d \\n \", rc)").append(LINE_SEPARATOR);

		mqttPythonScript.append("        # Set Connecting Client ID").append(LINE_SEPARATOR)
				.append("        client = mqtt_client.Client('client_id')").append(LINE_SEPARATOR)
				.append("        client.on_connect = on_connect").append(LINE_SEPARATOR)
				.append("        client.connect('" + host + "', " + port + ")").append(LINE_SEPARATOR)
				.append("        self.client = client").append(LINE_SEPARATOR).append(LINE_SEPARATOR)
				.append("    def publish(self, topic, message):").append(LINE_SEPARATOR)
				.append("        self.client.publish(topic, str(message))").append(LINE_SEPARATOR)
				.append(LINE_SEPARATOR);

		// replace tabs with spaces
		String result = mqttPythonScript.toString().replace("\t", "    ");

		// create the file
		write(getPackageFragmentRoot().getJavaProject().getProject(),
				"/turtle_monitoring_pkg/scripts/generated_mqtt.py", result);
	}

}
