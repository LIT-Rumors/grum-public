/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.util;

import at.jku.lit.grum.turtlebot.model.turtlebot.*;

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
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage
 * @generated
 */
public class TurtlebotSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TurtlebotPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtlebotSwitch() {
		if (modelPackage == null) {
			modelPackage = TurtlebotPackage.eINSTANCE;
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
		case TurtlebotPackage.BATTERY_STATUS: {
			BatteryStatus batteryStatus = (BatteryStatus) theEObject;
			T result = caseBatteryStatus(batteryStatus);
			if (result == null)
				result = caseIdableElement(batteryStatus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.JOINT_STATE: {
			JointState jointState = (JointState) theEObject;
			T result = caseJointState(jointState);
			if (result == null)
				result = caseIdableElement(jointState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.MAGNETIC_FIELD: {
			MagneticField magneticField = (MagneticField) theEObject;
			T result = caseMagneticField(magneticField);
			if (result == null)
				result = caseIdableElement(magneticField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.VERSION_INFO: {
			VersionInfo versionInfo = (VersionInfo) theEObject;
			T result = caseVersionInfo(versionInfo);
			if (result == null)
				result = caseIdableElement(versionInfo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.VELOCITY: {
			Velocity velocity = (Velocity) theEObject;
			T result = caseVelocity(velocity);
			if (result == null)
				result = caseIdableElement(velocity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseIdableElement(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.ODOMETRY: {
			Odometry odometry = (Odometry) theEObject;
			T result = caseOdometry(odometry);
			if (result == null)
				result = caseIdableElement(odometry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.DIAGNOSTICS: {
			Diagnostics diagnostics = (Diagnostics) theEObject;
			T result = caseDiagnostics(diagnostics);
			if (result == null)
				result = caseIdableElement(diagnostics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.SENSOR_STATE: {
			SensorState sensorState = (SensorState) theEObject;
			T result = caseSensorState(sensorState);
			if (result == null)
				result = caseIdableElement(sensorState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.LASER_SCAN: {
			LaserScan laserScan = (LaserScan) theEObject;
			T result = caseLaserScan(laserScan);
			if (result == null)
				result = caseIdableElement(laserScan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.IDABLE_ELEMENT: {
			IdableElement idableElement = (IdableElement) theEObject;
			T result = caseIdableElement(idableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.TURTLE_BOT: {
			TurtleBot turtleBot = (TurtleBot) theEObject;
			T result = caseTurtleBot(turtleBot);
			if (result == null)
				result = caseIdableElement(turtleBot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TurtlebotPackage.BOT_SYSTEM: {
			BotSystem botSystem = (BotSystem) theEObject;
			T result = caseBotSystem(botSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Joint State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joint State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJointState(JointState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Magnetic Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Magnetic Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMagneticField(MagneticField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionInfo(VersionInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Velocity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Velocity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVelocity(Velocity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Odometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Odometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOdometry(Odometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnostics(Diagnostics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorState(SensorState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Laser Scan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Laser Scan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaserScan(LaserScan object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Turtle Bot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turtle Bot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurtleBot(TurtleBot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bot System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bot System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotSystem(BotSystem object) {
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

} //TurtlebotSwitch
