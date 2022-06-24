package api;

import twin.TwinManager;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import at.jku.se.mosumo.tools.logging.ILogger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import at.jku.se.mosumo.monitoring.util.RegexUtil;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot;

public class MessageHandler {

	private static final ILogger LOGGER = LoggerProvider.getLogger(MessageHandler.class);

	static public void process(java.lang.String topic, java.lang.String message) throws Exception {
		Object elem = MessageFactory.getInstance().process(topic, message);
		if (elem instanceof at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) {
			TwinManager.getInstance().register(((at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) elem).getId(),
					(TurtleBot) elem);
			LOGGER.info("new at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot added: " + ((TurtleBot) elem).getId());
		}
		if (elem instanceof at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot runtimeinst = TwinManager.getInstance()
					.get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) runtimeinst)
						.setBatterystatus((at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus) elem);
				LOGGER.debug("at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot runtimeinst = TwinManager.getInstance()
					.get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) runtimeinst)
						.setDiagnostics((at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics) elem);
				LOGGER.debug("at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.turtlebot.model.turtlebot.JointState) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot runtimeinst = TwinManager.getInstance()
					.get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) runtimeinst)
						.setJointstate((at.jku.lit.grum.turtlebot.model.turtlebot.JointState) elem);
				LOGGER.debug("at.jku.lit.grum.turtlebot.model.turtlebot.JointState updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot runtimeinst = TwinManager.getInstance()
					.get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) runtimeinst)
						.setLaserscan((at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan) elem);
				LOGGER.debug("at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot runtimeinst = TwinManager.getInstance()
					.get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) runtimeinst)
						.setMagneticfield((at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField) elem);
				LOGGER.debug("at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.turtlebot.model.turtlebot.Odometry) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot runtimeinst = TwinManager.getInstance()
					.get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) runtimeinst)
						.setOdometry((at.jku.lit.grum.turtlebot.model.turtlebot.Odometry) elem);
				LOGGER.debug("at.jku.lit.grum.turtlebot.model.turtlebot.Odometry updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.turtlebot.model.turtlebot.Sensor) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot runtimeinst = TwinManager.getInstance()
					.get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) runtimeinst)
						.setSensor((at.jku.lit.grum.turtlebot.model.turtlebot.Sensor) elem);
				LOGGER.debug("at.jku.lit.grum.turtlebot.model.turtlebot.Sensor updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.turtlebot.model.turtlebot.Velocity) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot runtimeinst = TwinManager.getInstance()
					.get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) runtimeinst)
						.setVelocity((at.jku.lit.grum.turtlebot.model.turtlebot.Velocity) elem);
				LOGGER.debug("at.jku.lit.grum.turtlebot.model.turtlebot.Velocity updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot runtimeinst = TwinManager.getInstance()
					.get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot) runtimeinst)
						.setVersioninfo((at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo) elem);
				LOGGER.debug("at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
	}
}