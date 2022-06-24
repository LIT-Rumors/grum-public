/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.impl;

import at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.DiagnosticsImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.DiagnosticsImpl#getLevelOfOperationIMUSensor <em>Level Of Operation IMU Sensor</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.DiagnosticsImpl#getLevelOfOperationActuator <em>Level Of Operation Actuator</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.DiagnosticsImpl#getLevelOfOperationLidarSensor <em>Level Of Operation Lidar Sensor</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.DiagnosticsImpl#getLevelOfOperationPowerSystem <em>Level Of Operation Power System</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.DiagnosticsImpl#getLevelOfOperationAnalogButton <em>Level Of Operation Analog Button</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosticsImpl extends MinimalEObjectImpl.Container implements Diagnostics {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelOfOperationIMUSensor() <em>Level Of Operation IMU Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfOperationIMUSensor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LEVEL_OF_OPERATION_IMU_SENSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelOfOperationIMUSensor() <em>Level Of Operation IMU Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfOperationIMUSensor()
	 * @generated
	 * @ordered
	 */
	protected Integer levelOfOperationIMUSensor = LEVEL_OF_OPERATION_IMU_SENSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelOfOperationActuator() <em>Level Of Operation Actuator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfOperationActuator()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LEVEL_OF_OPERATION_ACTUATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelOfOperationActuator() <em>Level Of Operation Actuator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfOperationActuator()
	 * @generated
	 * @ordered
	 */
	protected Integer levelOfOperationActuator = LEVEL_OF_OPERATION_ACTUATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelOfOperationLidarSensor() <em>Level Of Operation Lidar Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfOperationLidarSensor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LEVEL_OF_OPERATION_LIDAR_SENSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelOfOperationLidarSensor() <em>Level Of Operation Lidar Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfOperationLidarSensor()
	 * @generated
	 * @ordered
	 */
	protected Integer levelOfOperationLidarSensor = LEVEL_OF_OPERATION_LIDAR_SENSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelOfOperationPowerSystem() <em>Level Of Operation Power System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfOperationPowerSystem()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LEVEL_OF_OPERATION_POWER_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelOfOperationPowerSystem() <em>Level Of Operation Power System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfOperationPowerSystem()
	 * @generated
	 * @ordered
	 */
	protected Integer levelOfOperationPowerSystem = LEVEL_OF_OPERATION_POWER_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelOfOperationAnalogButton() <em>Level Of Operation Analog Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfOperationAnalogButton()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LEVEL_OF_OPERATION_ANALOG_BUTTON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelOfOperationAnalogButton() <em>Level Of Operation Analog Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfOperationAnalogButton()
	 * @generated
	 * @ordered
	 */
	protected Integer levelOfOperationAnalogButton = LEVEL_OF_OPERATION_ANALOG_BUTTON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TurtlebotPackage.Literals.DIAGNOSTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TurtlebotPackage.DIAGNOSTICS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLevelOfOperationIMUSensor() {
		return levelOfOperationIMUSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelOfOperationIMUSensor(Integer newLevelOfOperationIMUSensor) {
		Integer oldLevelOfOperationIMUSensor = levelOfOperationIMUSensor;
		levelOfOperationIMUSensor = newLevelOfOperationIMUSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_IMU_SENSOR, oldLevelOfOperationIMUSensor,
					levelOfOperationIMUSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLevelOfOperationActuator() {
		return levelOfOperationActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelOfOperationActuator(Integer newLevelOfOperationActuator) {
		Integer oldLevelOfOperationActuator = levelOfOperationActuator;
		levelOfOperationActuator = newLevelOfOperationActuator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_ACTUATOR, oldLevelOfOperationActuator,
					levelOfOperationActuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLevelOfOperationLidarSensor() {
		return levelOfOperationLidarSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelOfOperationLidarSensor(Integer newLevelOfOperationLidarSensor) {
		Integer oldLevelOfOperationLidarSensor = levelOfOperationLidarSensor;
		levelOfOperationLidarSensor = newLevelOfOperationLidarSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_LIDAR_SENSOR, oldLevelOfOperationLidarSensor,
					levelOfOperationLidarSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLevelOfOperationPowerSystem() {
		return levelOfOperationPowerSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelOfOperationPowerSystem(Integer newLevelOfOperationPowerSystem) {
		Integer oldLevelOfOperationPowerSystem = levelOfOperationPowerSystem;
		levelOfOperationPowerSystem = newLevelOfOperationPowerSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_POWER_SYSTEM, oldLevelOfOperationPowerSystem,
					levelOfOperationPowerSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLevelOfOperationAnalogButton() {
		return levelOfOperationAnalogButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelOfOperationAnalogButton(Integer newLevelOfOperationAnalogButton) {
		Integer oldLevelOfOperationAnalogButton = levelOfOperationAnalogButton;
		levelOfOperationAnalogButton = newLevelOfOperationAnalogButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_ANALOG_BUTTON, oldLevelOfOperationAnalogButton,
					levelOfOperationAnalogButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TurtlebotPackage.DIAGNOSTICS__ID:
			return getId();
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_IMU_SENSOR:
			return getLevelOfOperationIMUSensor();
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_ACTUATOR:
			return getLevelOfOperationActuator();
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_LIDAR_SENSOR:
			return getLevelOfOperationLidarSensor();
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_POWER_SYSTEM:
			return getLevelOfOperationPowerSystem();
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_ANALOG_BUTTON:
			return getLevelOfOperationAnalogButton();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TurtlebotPackage.DIAGNOSTICS__ID:
			setId((String) newValue);
			return;
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_IMU_SENSOR:
			setLevelOfOperationIMUSensor((Integer) newValue);
			return;
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_ACTUATOR:
			setLevelOfOperationActuator((Integer) newValue);
			return;
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_LIDAR_SENSOR:
			setLevelOfOperationLidarSensor((Integer) newValue);
			return;
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_POWER_SYSTEM:
			setLevelOfOperationPowerSystem((Integer) newValue);
			return;
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_ANALOG_BUTTON:
			setLevelOfOperationAnalogButton((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TurtlebotPackage.DIAGNOSTICS__ID:
			setId(ID_EDEFAULT);
			return;
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_IMU_SENSOR:
			setLevelOfOperationIMUSensor(LEVEL_OF_OPERATION_IMU_SENSOR_EDEFAULT);
			return;
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_ACTUATOR:
			setLevelOfOperationActuator(LEVEL_OF_OPERATION_ACTUATOR_EDEFAULT);
			return;
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_LIDAR_SENSOR:
			setLevelOfOperationLidarSensor(LEVEL_OF_OPERATION_LIDAR_SENSOR_EDEFAULT);
			return;
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_POWER_SYSTEM:
			setLevelOfOperationPowerSystem(LEVEL_OF_OPERATION_POWER_SYSTEM_EDEFAULT);
			return;
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_ANALOG_BUTTON:
			setLevelOfOperationAnalogButton(LEVEL_OF_OPERATION_ANALOG_BUTTON_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TurtlebotPackage.DIAGNOSTICS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_IMU_SENSOR:
			return LEVEL_OF_OPERATION_IMU_SENSOR_EDEFAULT == null ? levelOfOperationIMUSensor != null
					: !LEVEL_OF_OPERATION_IMU_SENSOR_EDEFAULT.equals(levelOfOperationIMUSensor);
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_ACTUATOR:
			return LEVEL_OF_OPERATION_ACTUATOR_EDEFAULT == null ? levelOfOperationActuator != null
					: !LEVEL_OF_OPERATION_ACTUATOR_EDEFAULT.equals(levelOfOperationActuator);
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_LIDAR_SENSOR:
			return LEVEL_OF_OPERATION_LIDAR_SENSOR_EDEFAULT == null ? levelOfOperationLidarSensor != null
					: !LEVEL_OF_OPERATION_LIDAR_SENSOR_EDEFAULT.equals(levelOfOperationLidarSensor);
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_POWER_SYSTEM:
			return LEVEL_OF_OPERATION_POWER_SYSTEM_EDEFAULT == null ? levelOfOperationPowerSystem != null
					: !LEVEL_OF_OPERATION_POWER_SYSTEM_EDEFAULT.equals(levelOfOperationPowerSystem);
		case TurtlebotPackage.DIAGNOSTICS__LEVEL_OF_OPERATION_ANALOG_BUTTON:
			return LEVEL_OF_OPERATION_ANALOG_BUTTON_EDEFAULT == null ? levelOfOperationAnalogButton != null
					: !LEVEL_OF_OPERATION_ANALOG_BUTTON_EDEFAULT.equals(levelOfOperationAnalogButton);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", levelOfOperationIMUSensor: ");
		result.append(levelOfOperationIMUSensor);
		result.append(", levelOfOperationActuator: ");
		result.append(levelOfOperationActuator);
		result.append(", levelOfOperationLidarSensor: ");
		result.append(levelOfOperationLidarSensor);
		result.append(", levelOfOperationPowerSystem: ");
		result.append(levelOfOperationPowerSystem);
		result.append(", levelOfOperationAnalogButton: ");
		result.append(levelOfOperationAnalogButton);
		result.append(')');
		return result.toString();
	}

} //DiagnosticsImpl
