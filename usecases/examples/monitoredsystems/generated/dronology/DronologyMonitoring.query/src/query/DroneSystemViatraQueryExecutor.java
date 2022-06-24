package query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;

import middleware.MonitoringMiddleware;
import validation.IConstraint;
import validation.IViolation;
import validation.ValidationFactory;

public class DroneSystemViatraQueryExecutor {

	private static final IConstraint cstSpeed = ValidationFactory.createConstraint("cst", "speedLimit", "viatra");
	private static final IConstraint cstAltitude = ValidationFactory.createConstraint("cst", "altitudeLimit", "viatra");
	private static final IConstraint cstBattery = ValidationFactory.createConstraint("cst", "batteryLimit", "viatra");
	private static final IConstraint cstArming = ValidationFactory.createConstraint("cst", "cstArmingStatus", "viatra");
	private static final IConstraint cstStatus = ValidationFactory.createConstraint("cst", "cstSystemStatus", "viatra");
	private static final IConstraint cstHealth = ValidationFactory.createConstraint("cst", "cstHealth", "viatra");
	private static final IConstraint cstWaypoint = ValidationFactory.createConstraint("cst", "cstWaypoint", "viatra");

	public static void checkSpeedLimit(ViatraQueryEngine engine, String reason) {
		SpeedLimit.Matcher matcher = SpeedLimit.Matcher.on(engine);
		for (SpeedLimit.Match match : matcher.getAllMatches()) {
			String id = match.getDrone().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getDrone().getId(), cstSpeed, match.getDrone());
			// System.out.println("Exceed Speed:" + match.getDrone().getId() + " Speed: " +
			// match.getGroundSpeed());

			// MonitoringMiddleware.getInstance().sendViolation(vl);

		}

	}

	public static void checkAltitudeLimit(ViatraQueryEngine engine, String reason) {

		AltitudeLimit.Matcher matcher = AltitudeLimit.Matcher.on(engine);
		for (AltitudeLimit.Match match : matcher.getAllMatches()) {
			String id = match.getDrone().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getDrone().getId(), cstAltitude, match.getDrone());
			// System.out.println("Exceed Altitude:" + match.getDrone().getId() + "
			// Altitude: " + match.getAltitude());
			// MonitoringMiddleware.getInstance().sendViolation(vl);
		}

	}

	public static void checkBatteryLimit(ViatraQueryEngine engine, String reason) {

		BatteryLevel.Matcher matcher = BatteryLevel.Matcher.on(engine);
		for (BatteryLevel.Match match : matcher.getAllMatches()) {

			String id = match.getDrone().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getDrone().getId(), cstBattery, match.getDrone());
			// System.out.println("Battery:" + match.getDrone().getId() + " Battery: " +
			// match.getLevel());
			// MonitoringMiddleware.getInstance().sendViolation(vl);
		}

	}

	public static void checkStartupArming(ViatraQueryEngine engine, String reason) {

		StartupCheckArming.Matcher matcher = StartupCheckArming.Matcher.on(engine);
		for (StartupCheckArming.Match match : matcher.getAllMatches()) {
			String id = match.getDrone().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getDrone().getId(), cstArming, match.getDrone());
			// System.out.println("Arming:" + match.getDrone().getId() + " Status: " +
			// match.getArmingstatus());
			// MonitoringMiddleware.getInstance().sendViolation(vl);
		}

	}

	public static void checkWaypointCommands(ViatraQueryEngine engine, String reason) {
		WaypointCheck.Matcher matcher = WaypointCheck.Matcher.on(engine);
		for (WaypointCheck.Match match : matcher.getAllMatches()) {
			String id = match.getDrone().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getDrone().getId(), cstWaypoint, match.getDrone());
			// System.out.println("Waypoint invalid:" + match.getDrone().getId() + "
			// Waypoint: [" + match.getLatitude()
			// + "," + match.getLongitude() + "," + match.getAltitude() + "]");
			// MonitoringMiddleware.getInstance().sendViolation(vl);
		}
	}

	public static void checkDerivedHealth(ViatraQueryEngine engine, String reason) {

		SatGPSCheck.Matcher matcher = SatGPSCheck.Matcher.on(engine);
		boolean triggered = false;
		for (SatGPSCheck.Match match : matcher.getAllMatches()) {
			triggered = true;
			String id = match.getDrone().getId();
			if (!id.equals(reason)) {
				continue;
			}

			if ((match.getDrone().getSystemhealth() == null
					|| !match.getDrone().getSystemhealth().getStatus().equals("low"))) {
				IViolation vl = ValidationFactory.createViolation(match.getDrone().getId(), cstHealth,
						match.getDrone());
				/// System.out.println("UAV Health:" + match.getDrone().getId() + " Status: "
				// + match.getDrone().getFlightcontrollerdata().getNum_satellites());
				// MonitoringMiddleware.getInstance().sendViolation(vl);
				MonitoringMiddleware.getInstance().setSystemhealth(match.getDrone().getId(), "{\"status\" :  \"low\"}");

			}
		}
		if (!triggered) {
			setOKStatus(engine, reason);

		}

	}

	private static void setOKStatus(ViatraQueryEngine engine, String reason) {
		SatGPSCheckOK.Matcher matcher = SatGPSCheckOK.Matcher.on(engine);

		for (SatGPSCheckOK.Match match : matcher.getAllMatches()) {
			String id = match.getDrone().getId();
			if (!id.equals(reason)) {
				continue;
			}

			if ((match.getDrone().getSystemhealth() == null
					|| !match.getDrone().getSystemhealth().getStatus().equals("ok"))) {
				System.out.println("SET OK STATUS");
				MonitoringMiddleware.getInstance().setSystemhealth(match.getDrone().getId(), "{\"status\" : \"ok\"}");
			}
		}

	}

	public static void checkStartupSystemStatus(ViatraQueryEngine engine, String reason) {
		StartupCheckSystemStatus.Matcher matcher = StartupCheckSystemStatus.Matcher.on(engine);
		for (StartupCheckSystemStatus.Match match : matcher.getAllMatches()) {
			String id = match.getDrone().getId();
			if (!id.equals(reason)) {
				continue;
			}

			IViolation vl = ValidationFactory.createViolation(match.getDrone().getId(), cstStatus, match.getDrone());
			System.out.println("Status:" + match.getDrone().getId() + " Status: "
					+ match.getDrone().getStartupchecks().getSystemstatus());
			// MonitoringMiddleware.getInstance().sendViolation(vl);
		}

	}

	public static void initialize(ViatraQueryEngine engine) {
		// TODO Auto-generated method stub

	}

	public static void executeQueries(Object[] elems) {
		// TODO Auto-generated method stub

	}

}