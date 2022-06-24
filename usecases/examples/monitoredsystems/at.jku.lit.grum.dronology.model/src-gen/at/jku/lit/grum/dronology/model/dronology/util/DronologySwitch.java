/**
 */
package at.jku.lit.grum.dronology.model.dronology.util;

import at.jku.lit.grum.dronology.model.dronology.*;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage
 * @generated
 */
public class DronologySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DronologyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronologySwitch() {
		if (modelPackage == null) {
			modelPackage = DronologyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DronologyPackage.DRONE_SYSTEM: {
			DroneSystem droneSystem = (DroneSystem) theEObject;
			T result = caseDroneSystem(droneSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.DRONE: {
			Drone drone = (Drone) theEObject;
			T result = caseDrone(drone);
			if (result == null)
				result = caseIdableElement(drone);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.BATTERY_STATUS: {
			BatteryStatus batteryStatus = (BatteryStatus) theEObject;
			T result = caseBatteryStatus(batteryStatus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.SYSTEMHEALTH: {
			Systemhealth systemhealth = (Systemhealth) theEObject;
			T result = caseSystemhealth(systemhealth);
			if (result == null)
				result = caseIdableElement(systemhealth);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.DRONESTATE: {
			Dronestate dronestate = (Dronestate) theEObject;
			T result = caseDronestate(dronestate);
			if (result == null)
				result = caseIdableElement(dronestate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.IDABLE_ELEMENT: {
			IdableElement idableElement = (IdableElement) theEObject;
			T result = caseIdableElement(idableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.OPERATIONMODE: {
			Operationmode operationmode = (Operationmode) theEObject;
			T result = caseOperationmode(operationmode);
			if (result == null)
				result = caseIdableElement(operationmode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.FLIGHT_CONTROLLER_DATA: {
			FlightControllerData flightControllerData = (FlightControllerData) theEObject;
			T result = caseFlightControllerData(flightControllerData);
			if (result == null)
				result = caseIdableElement(flightControllerData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.DRONECOMMAND: {
			Dronecommand dronecommand = (Dronecommand) theEObject;
			T result = caseDronecommand(dronecommand);
			if (result == null)
				result = caseIdableElement(dronecommand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.FLIGHT_PLAN: {
			FlightPlan flightPlan = (FlightPlan) theEObject;
			T result = caseFlightPlan(flightPlan);
			if (result == null)
				result = caseIdableElement(flightPlan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.STARTUPCHECKS: {
			Startupchecks startupchecks = (Startupchecks) theEObject;
			T result = caseStartupchecks(startupchecks);
			if (result == null)
				result = caseIdableElement(startupchecks);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.LLA_COORDINATE: {
			LLACoordinate llaCoordinate = (LLACoordinate) theEObject;
			T result = caseLLACoordinate(llaCoordinate);
			if (result == null)
				result = caseIdableElement(llaCoordinate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DronologyPackage.STRING_TO_STRING_MAP: {
			@SuppressWarnings("unchecked")
			Map.Entry<String, BigDecimal> stringToStringMap = (Map.Entry<String, BigDecimal>) theEObject;
			T result = caseStringToStringMap(stringToStringMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drone System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drone System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDroneSystem(DroneSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrone(Drone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatteryStatus(BatteryStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemhealth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemhealth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemhealth(Systemhealth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dronestate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dronestate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDronestate(Dronestate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Idable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdableElement(IdableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operationmode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operationmode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationmode(Operationmode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Controller Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Controller Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightControllerData(FlightControllerData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dronecommand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dronecommand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDronecommand(Dronecommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flight Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flight Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlightPlan(FlightPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Startupchecks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Startupchecks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartupchecks(Startupchecks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LLA Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LLA Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLLACoordinate(LLACoordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To String Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStringMap(Map.Entry<String, BigDecimal> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DronologySwitch
