package at.jku.lit.grum.extensions.esper;

import at.jku.se.mosumo.tools.logging.ILogger;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import middleware.MonitoringMiddleware;

public class ConstraintRunner {

	private static final ILogger LOGGER = LoggerProvider.getLogger(ConstraintRunner.class);
	private static final EsperManager manager = new EsperManager();

	public static void main(String[] args) {

		manager.init();
		try {
			MonitoringMiddleware.getInstance().init();
		} catch (Exception e1) {
			LOGGER.error(e1);
		}

		MonitoringMiddleware.getInstance().registerDronestateStateChange(event -> {
			updateStateEvent(event);
		});

		MonitoringMiddleware.getInstance().registerFlightPlanStateChange(event -> {
			updateStateEvent(event);
		});
		MonitoringMiddleware.getInstance().registerSystemhealthStateChange(event -> {
			updateStateEvent(event);
		});

		MonitoringMiddleware.getInstance().registerOperationmodeStateChange(event -> {
			updateStateEvent(event);
		});

		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				LOGGER.error(e);
			}
		}

	}

	private static void updateStateEvent(Object event) {
		manager.update(event);

	}

}
