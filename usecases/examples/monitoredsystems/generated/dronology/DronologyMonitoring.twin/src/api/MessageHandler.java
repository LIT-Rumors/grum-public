package api;

import twin.TwinManager;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import at.jku.se.mosumo.tools.logging.ILogger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import at.jku.se.mosumo.monitoring.util.RegexUtil;
import at.jku.lit.grum.dronology.model.dronology.Drone;
import at.jku.lit.grum.dronology.model.dronology.Systemhealth;

public class MessageHandler {

	private static final ILogger LOGGER = LoggerProvider.getLogger(MessageHandler.class);

	static public void process(java.lang.String topic, java.lang.String message) throws Exception {
		Object elem = MessageFactory.getInstance().process(topic, message);
		if (elem instanceof at.jku.lit.grum.dronology.model.dronology.Drone) {
			TwinManager.getInstance().register(((at.jku.lit.grum.dronology.model.dronology.Drone) elem).getId(),
					(Drone) elem);
			LOGGER.info("new at.jku.lit.grum.dronology.model.dronology.Drone added: " + ((Drone) elem).getId());
		}
		if (elem instanceof at.jku.lit.grum.dronology.model.dronology.Operationmode) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.dronology.model.dronology.Drone runtimeinst = TwinManager.getInstance().get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.dronology.model.dronology.Drone) runtimeinst)
						.setOperationmode((at.jku.lit.grum.dronology.model.dronology.Operationmode) elem);
				LOGGER.debug("at.jku.lit.grum.dronology.model.dronology.Operationmode updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.dronology.model.dronology.Dronestate) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.dronology.model.dronology.Drone runtimeinst = TwinManager.getInstance().get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.dronology.model.dronology.Drone) runtimeinst)
						.setDronestate((at.jku.lit.grum.dronology.model.dronology.Dronestate) elem);
				LOGGER.debug("at.jku.lit.grum.dronology.model.dronology.Dronestate updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.dronology.model.dronology.Dronecommand) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.dronology.model.dronology.Drone runtimeinst = TwinManager.getInstance().get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.dronology.model.dronology.Drone) runtimeinst)
						.setDronecommand((at.jku.lit.grum.dronology.model.dronology.Dronecommand) elem);
				LOGGER.debug("at.jku.lit.grum.dronology.model.dronology.Dronecommand updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.dronology.model.dronology.FlightControllerData) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.dronology.model.dronology.Drone runtimeinst = TwinManager.getInstance().get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.dronology.model.dronology.Drone) runtimeinst)
						.setFlightcontrollerdata((at.jku.lit.grum.dronology.model.dronology.FlightControllerData) elem);
				LOGGER.debug("at.jku.lit.grum.dronology.model.dronology.FlightControllerData updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.dronology.model.dronology.FlightPlan) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.dronology.model.dronology.Drone runtimeinst = TwinManager.getInstance().get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.dronology.model.dronology.Drone) runtimeinst)
						.setFlightplan((at.jku.lit.grum.dronology.model.dronology.FlightPlan) elem);
				LOGGER.debug("at.jku.lit.grum.dronology.model.dronology.FlightPlan updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.dronology.model.dronology.Startupchecks) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.dronology.model.dronology.Drone runtimeinst = TwinManager.getInstance().get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.dronology.model.dronology.Drone) runtimeinst)
						.setStartupchecks((at.jku.lit.grum.dronology.model.dronology.Startupchecks) elem);
				LOGGER.debug("at.jku.lit.grum.dronology.model.dronology.Startupchecks updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.dronology.model.dronology.Systemhealth) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.dronology.model.dronology.Drone runtimeinst = TwinManager.getInstance().get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.dronology.model.dronology.Drone) runtimeinst)
						.setSystemhealth((at.jku.lit.grum.dronology.model.dronology.Systemhealth) elem);
				LOGGER.debug("at.jku.lit.grum.dronology.model.dronology.Systemhealth updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.warn("Instance not registererd: " + instanceName);
			}
		}
	}
}