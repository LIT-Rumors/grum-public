package at.jku.se.mosumo.generator.api.ros.api;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import Monitoring.MOAgent;
import Monitoring.MOConfig;
import Monitoring.MOElement;
import at.jku.mosumo.generator.framework.core.AbstractJavaSource;
import at.jku.mosumo.generator.framework.core.FileSourceCommand;

/***
 * This class takes the instance of the aDM ecore model and generates respective
 * API forwarders according to the meta model.
 * 
 * @author Marco Stadler
 *
 */
public class ROSMonitoringAPI extends AbstractJavaSource implements FileSourceCommand {

	public static final String CLASS_NAME = "ROSMonitoringAPI";
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public ROSMonitoringAPI(IPackageFragmentRoot root, MOConfig moConfig, IProgressMonitor monitor) {
		super(root, moConfig, monitor);
	}

	@Override
	public void createFileSource() {
		StringBuilder apiPythonScript = new StringBuilder();

		apiPythonScript.append(getPythonHeaderAndImports());
		apiPythonScript.append(LINE_SEPARATOR).append(LINE_SEPARATOR);
		apiPythonScript.append(getInitMethod());
		apiPythonScript.append(LINE_SEPARATOR).append(LINE_SEPARATOR).append(LINE_SEPARATOR);
		apiPythonScript.append("# ###################### DYNAMIC GENERATED CODE #######################");
		apiPythonScript.append(LINE_SEPARATOR).append(LINE_SEPARATOR);

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			apiPythonScript.append(createAgentRegisterMethod(agent));
			apiPythonScript.append(LINE_SEPARATOR).append(LINE_SEPARATOR);
		}

		apiPythonScript.append("# update methods").append(LINE_SEPARATOR).append(LINE_SEPARATOR);

		for (MOAgent agent : getMoConfig().getSystem().getAgents()) {
			for (MOElement prop : agent.getElements()) {
				apiPythonScript.append(getMQTTForwardMethod(prop));
				apiPythonScript.append(LINE_SEPARATOR).append(LINE_SEPARATOR);
			}
		}

		apiPythonScript.append("# ###################### END DYNAMIC GENERATED CODE #######################");
		apiPythonScript.append(LINE_SEPARATOR);

		// replace tabs with spaces
		String result = apiPythonScript.toString().replace("\t", "    ");

		// create the file
		write(getPackageFragmentRoot().getJavaProject().getProject(),
				"/turtle_monitoring_pkg/scripts/generated_ros_api.py", result);
	}

	private Object getInitMethod() {
		var initMethod = new StringBuilder();

		initMethod.append("def init_api():").append(LINE_SEPARATOR).append("    global mqtt_forwarder")
				.append(LINE_SEPARATOR).append("    mqtt_forwarder.init()").append(LINE_SEPARATOR)
				.append(LINE_SEPARATOR);

		return initMethod;
	}

	private Object getMQTTForwardMethod(MOElement prop) {
		var topicMethod = new StringBuilder();

		topicMethod
				.append("def update_" + prop.getName() + "(parent, message):  " + LINE_SEPARATOR
						+ "    mqtt_forwarder.publish(parent + '/" + prop.getTopic() + "', message)")
				.append(LINE_SEPARATOR);

		return topicMethod;
	}

	private Object createAgentRegisterMethod(MOAgent agent) {
		var registerAgent = new StringBuilder();
		registerAgent.append("# register a bot").append(LINE_SEPARATOR)
				.append("def register_" + agent.getName() + "(element_id):").append(LINE_SEPARATOR)
				.append("    mqtt_forwarder.publish('register/" + agent.getTopic() + "', element_id)").append(LINE_SEPARATOR);

		return registerAgent;
	}

	/***
	 * Some basic stuff in the head of the python script
	 * 
	 * @return the header as String
	 */
	private Object getPythonHeaderAndImports() {
		var pythonHeader = new StringBuilder();
		pythonHeader.append("#!/usr/bin/env python").append(LINE_SEPARATOR).append(LINE_SEPARATOR)
				.append("from generated_mqtt import MQTTForwarder").append(LINE_SEPARATOR)
				.append("mqtt_forwarder = MQTTForwarder()").append(LINE_SEPARATOR);

		return pythonHeader;
	}

}
