package api;

import twin.TwinManager;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import at.jku.se.mosumo.tools.logging.ILogger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import at.jku.se.mosumo.monitoring.util.RegexUtil;
import at.jku.lit.grum.picar.model.picar.Picar;

public class MessageHandler {

	private static final ILogger LOGGER = LoggerProvider.getLogger(MessageHandler.class);

	static public void process(java.lang.String topic, java.lang.String message) throws Exception {
		Object elem = MessageFactory.getInstance().process(topic, message);
		if (elem instanceof at.jku.lit.grum.picar.model.picar.Picar) {
			TwinManager.getInstance().register(((at.jku.lit.grum.picar.model.picar.Picar) elem).getId(), (Picar) elem);
			LOGGER.info("new at.jku.lit.grum.picar.model.picar.Picar added: " + ((Picar) elem).getId());
		}
		if (elem instanceof at.jku.lit.grum.picar.model.picar.Location) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.picar.model.picar.Picar runtimeinst = TwinManager.getInstance().get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.picar.model.picar.Picar) runtimeinst)
						.setLocation((at.jku.lit.grum.picar.model.picar.Location) elem);
				LOGGER.info("at.jku.lit.grum.picar.model.picar.Location updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.info("Instance not registererd: " + instanceName);
			}
		}
		if (elem instanceof at.jku.lit.grum.picar.model.picar.Status) {
			String instanceName = RegexUtil.getSingle(RegexUtil.INSTANCE_PATTERN, topic);
			at.jku.lit.grum.picar.model.picar.Picar runtimeinst = TwinManager.getInstance().get(instanceName);
			if (runtimeinst != null) {
				((at.jku.lit.grum.picar.model.picar.Picar) runtimeinst)
						.setStatus((at.jku.lit.grum.picar.model.picar.Status) elem);
				LOGGER.info("at.jku.lit.grum.picar.model.picar.Status updated:" + instanceName);
				TwinManager.getInstance().checkConstraints(runtimeinst, elem);
			} else {
				LOGGER.info("Instance not registererd: " + instanceName);
			}
		}
	}
}