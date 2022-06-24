package query;

import javax.tools.Diagnostic;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;

import at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus;
import at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement;
import at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan;
import at.jku.lit.grum.turtlebot.model.turtlebot.Sensor;
import at.jku.lit.grum.turtlebot.model.turtlebot.Velocity;
import middleware.MonitoringMiddleware;
import validation.IConstraint;
import validation.IViolation;
import validation.ValidationFactory;

public class BotSystemViatraQueryExecutor {

	static final IConstraint cstMaxVelocity = ValidationFactory.createConstraint("cst", "maxVelocity", "viatra");
	static final IConstraint cstBatteryLevel = ValidationFactory.createConstraint("cst", "batteryLevel", "viatra");
	static final IConstraint cstVoltage = ValidationFactory.createConstraint("cst", "voltage", "viatra");
	static final IConstraint cstPowerSupply = ValidationFactory.createConstraint("cst", "powerSupply", "viatra");
	static final IConstraint cstDiagError = ValidationFactory.createConstraint("cst", "diagError", "viatra");
	static final IConstraint cstCo2Value = ValidationFactory.createConstraint("cst", "co2Value", "viatra");
	static final IConstraint cstDistance = ValidationFactory.createConstraint("cst", "distance", "viatra");
	private static ViatraQueryEngine engine;

	public static void checkBatteryLeve(ViatraQueryEngine engine, String reason) {

		MinBatteryLevel.Matcher matcher = MinBatteryLevel.Matcher.on(engine);
		for (MinBatteryLevel.Match match : matcher.getAllMatches()) {

			String id = match.getBot().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getBot().getId(), cstBatteryLevel, match.getBot());
			// System.out.println("Exceed Speed:" + match.getDrone().getId() + " Speed: " +
			// match.getGroundSpeed());
			MonitoringMiddleware.getInstance().sendViolation(vl);

		}
	}

	public static void checkMaxVelocity(ViatraQueryEngine engine, String reason) {

		MaxVelocity.Matcher matcher = MaxVelocity.Matcher.on(engine);
		for (MaxVelocity.Match match : matcher.getAllMatches()) {
			String id = match.getBot().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getBot().getId(), cstMaxVelocity, match.getBot());
			// System.out.println("Exceed Speed:" + match.getDrone().getId() + " Speed: " +
			// match.getGroundSpeed());

			MonitoringMiddleware.getInstance().sendViolation(vl);

		}

	}

	public static void checkBatteryVoltage(ViatraQueryEngine engine, String reason) {

		boolean triggered = false;

		BatteryVoltage.Matcher matcher = BatteryVoltage.Matcher.on(engine);
		for (BatteryVoltage.Match match : matcher.getAllMatches()) {
			triggered = true;
			String id = match.getBot().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getBot().getId(), cstVoltage, match.getBot());
			// System.out.println("Exceed Speed:" + match.getDrone().getId() + " Speed: " +
			// match.getGroundSpeed());

			MonitoringMiddleware.getInstance().sendViolation(vl);

		}

	}

	public static void checkPowerSystemHealth(ViatraQueryEngine engine, String reason) {

		PowerSupplyStatus.Matcher matcher = PowerSupplyStatus.Matcher.on(engine);
		for (PowerSupplyStatus.Match match : matcher.getAllMatches()) {

			String id = match.getBot().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getBot().getId(), cstPowerSupply, match.getBot());
			// System.out.println("Exceed Speed:" + match.getDrone().getId() + " Speed: " +
			// match.getGroundSpeed());

			MonitoringMiddleware.getInstance().sendViolation(vl);

		}

	}

	public static void checkDiagnosticsError(ViatraQueryEngine engine, String reason) {

		DiagnosticsError.Matcher matcher = DiagnosticsError.Matcher.on(engine);
		for (DiagnosticsError.Match match : matcher.getAllMatches()) {

			String id = match.getBot().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getBot().getId(), cstDiagError, match.getBot());
			// System.out.println("Exceed Speed:" + match.getDrone().getId() + " Speed: " +
			// match.getGroundSpeed());
			MonitoringMiddleware.getInstance().sendViolation(vl);

		}

	}

	public static void checkCo2value(ViatraQueryEngine engine, String reason) {

		Co2value.Matcher matcher = Co2value.Matcher.on(engine);
		for (Co2value.Match match : matcher.getAllMatches()) {

			String id = match.getBot().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getBot().getId(), cstCo2Value, match.getBot());
			// System.out.println("Exceed Speed:" + match.getDrone().getId() + " Speed: " +
			// match.getGroundSpeed());

			MonitoringMiddleware.getInstance().sendViolation(vl);

		}

	}

	public static void checkDistanceValue(ViatraQueryEngine engine, String reason) {

		DistanceValue.Matcher matcher = DistanceValue.Matcher.on(engine);
		for (DistanceValue.Match match : matcher.getAllMatches()) {

			String id = match.getBot().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getBot().getId(), cstDistance, match.getBot());
			// System.out.println("Exceed Speed:" + match.getDrone().getId() + " Speed: " +
			// match.getGroundSpeed());

			MonitoringMiddleware.getInstance().sendViolation(vl);

		}

	}

	static public void initialize(ViatraQueryEngine engine) {
		BotSystemViatraQueryExecutor.engine = engine;
		BotSystemQueries.instance().prepare(engine);
	}

	public static void executeQueries(Object[] elems) {
		String reason = ((IdableElement) elems[0]).getId();

		if (elems[1] instanceof BatteryStatus) {
			checkBatteryLeve(engine, ((IdableElement) elems[0]).getId());
			checkBatteryVoltage(engine, reason);
			checkPowerSystemHealth(engine, reason);
		}
		if (elems[1] instanceof Velocity) {
			checkMaxVelocity(engine, reason);
		}
		if (elems[1] instanceof Diagnostic) {
			checkDiagnosticsError(engine, reason);
		}
		if (elems[1] instanceof Sensor) {
			checkCo2value(engine, reason);
		}
		if (elems[1] instanceof LaserScan) {
			checkDistanceValue(engine, reason);
		}
	}

}