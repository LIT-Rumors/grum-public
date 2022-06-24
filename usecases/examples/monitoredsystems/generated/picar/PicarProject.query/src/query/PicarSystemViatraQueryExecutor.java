package query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;

import at.jku.lit.grum.picar.model.picar.Location;
import at.jku.lit.grum.picar.model.picar.Status;
import at.jku.se.mosumo.tools.logging.ILogger;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import query.util.DistanceUtil;

public class PicarSystemViatraQueryExecutor {

	private static final ILogger LOGGER = LoggerProvider.getLogger(PicarSystemViatraQueryExecutor.class);
	private static ViatraQueryEngine engine;

	static public void initialize(ViatraQueryEngine engine) {
		PicarSystemViatraQueryExecutor.engine = engine;
		PicarSystemQueries.instance().prepare(engine);
	}

	/**
	 * TODO: call checks here
	 */
	static public void executeQueries(Object... elems) {
		if (elems[1] instanceof Status) {
			checkForModeViolation();
		}
		if (elems[1] instanceof Location) {
			checkForDistanceViolation();
		}

	}

	static private void checkForModeViolation() {
		CheckOperationMode.Matcher matcher = CheckOperationMode.Matcher.on(engine);
		for (CheckOperationMode.Match match : matcher.getAllMatches()) {
			LOGGER.missionError("Operation Mode Check Failed! for '" + match.getCar().getId() + "' - Status:"
					+ match.getOperationmode());
		}
	}

	static private void checkForDistanceViolation() {
		CheckDrivingDistane.Matcher matcher = CheckDrivingDistane.Matcher.on(engine);
		for (CheckDrivingDistane.Match match : matcher.getAllMatches()) {
			LOGGER.missionError("Geofence breach for '" + match.getCar().getId() + "' max distance "
					+ match.getCar().getGeofence_range() + " exceeded -->> "
					+ DistanceUtil.getCurrentDistance(match.getCar()));
		}
	}
}