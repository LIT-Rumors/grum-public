package at.jku.se.mosumo.generator.api.ros.api;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import Monitoring.MOConfig;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;

/***
 * Generates a python file that forwards the air quality sensor messages to a
 * ROS topic.
 * 
 * @author Marco Stadler
 *
 */
public class AirSensorForwarder extends AbstractJavaSource implements FileSourceCommand {

	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public AirSensorForwarder(IPackageFragmentRoot packageFragmentRoot, MOConfig moConfig, IProgressMonitor monitor) {
		super(packageFragmentRoot, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		var mqttPythonScript = new StringBuilder();

		var connectionUrl = getMoConfig().getServers().get(0).getConnectionURL();
		var host = connectionUrl.substring(0, connectionUrl.indexOf(':'));
		var port = connectionUrl.substring(connectionUrl.indexOf(':') + 1);

		mqttPythonScript.append("#!/usr/bin/env python").append(LINE_SEPARATOR).append("import json")
				.append(LINE_SEPARATOR).append("import rospy").append(LINE_SEPARATOR)
				.append("from paho.mqtt import client as mqtt_client").append(LINE_SEPARATOR)
				.append("from std_msgs.msg import String").append(LINE_SEPARATOR).append(LINE_SEPARATOR)
				.append("pub = rospy.Publisher('ros_sensor/air_sensor', String, queue_size=10)").append(LINE_SEPARATOR)
				.append(LINE_SEPARATOR).append(LINE_SEPARATOR)
				.append("def on_message_received(client, userdata, message):").append(LINE_SEPARATOR)
				.append("    do_ros_publish(str(message.payload.decode('utf-8')))").append(LINE_SEPARATOR)
				.append(LINE_SEPARATOR).append(LINE_SEPARATOR).append("def do_ros_publish(sensor_msg):")
				.append(LINE_SEPARATOR).append("    global pub").append(LINE_SEPARATOR)
				.append("    rospy.loginfo(sensor_msg)").append(LINE_SEPARATOR).append("    pub.publish(sensor_msg)")
				.append(LINE_SEPARATOR).append(LINE_SEPARATOR).append(LINE_SEPARATOR).append("def init_mqtt():")
				.append(LINE_SEPARATOR).append("    client = mqtt_client.Client('mqtt_client_air_forwarder')")
				.append(LINE_SEPARATOR).append("    client.connect('" + host + "', " + port + ")")
				.append(LINE_SEPARATOR).append(LINE_SEPARATOR).append("    client.on_message = on_message_received")
				.append(LINE_SEPARATOR).append(LINE_SEPARATOR).append("    client.loop_start()").append(LINE_SEPARATOR)
				.append(LINE_SEPARATOR).append("    client.subscribe(\"sensors/co2/CO2-1\")").append(LINE_SEPARATOR)
				.append(LINE_SEPARATOR).append("    rospy.spin()").append(LINE_SEPARATOR).append(LINE_SEPARATOR)
				.append(LINE_SEPARATOR).append("if __name__ == '__main__':").append(LINE_SEPARATOR).append("    try:")
				.append(LINE_SEPARATOR).append("        rospy.init_node('turtle_listener', anonymous=True)")
				.append(LINE_SEPARATOR).append(LINE_SEPARATOR).append("        init_mqtt()").append(LINE_SEPARATOR)
				.append("    except rospy.ROSInterruptException:").append(LINE_SEPARATOR).append("        pass")
				.append(LINE_SEPARATOR).append(LINE_SEPARATOR);

		// replace tabs with spaces
		String result = mqttPythonScript.toString().replace("\t", "    ");

		// create the file
		write(getPackageFragmentRoot().getJavaProject().getProject(),
				"/air_sensor_forwarder_pkg/scripts/air_sensor_forwarder.py", result);
	}

}
