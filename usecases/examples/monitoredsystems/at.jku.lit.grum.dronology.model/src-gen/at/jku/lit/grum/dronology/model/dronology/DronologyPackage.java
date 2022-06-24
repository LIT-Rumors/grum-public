/**
 */
package at.jku.lit.grum.dronology.model.dronology;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyFactory
 * @model kind="package"
 * @generated
 */
public interface DronologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dronology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lit.jku.at/grum/dronology";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dronology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DronologyPackage eINSTANCE = at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneSystemImpl <em>Drone System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DroneSystemImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getDroneSystem()
	 * @generated
	 */
	int DRONE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Drones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_SYSTEM__DRONES = 0;

	/**
	 * The number of structural features of the '<em>Drone System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Drone System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.IdableElement <em>Idable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.IdableElement
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getIdableElement()
	 * @generated
	 */
	int IDABLE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDABLE_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Idable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Idable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl <em>Drone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getDrone()
	 * @generated
	 */
	int DRONE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Dronestate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__DRONESTATE = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dronecommand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__DRONECOMMAND = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Homelocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__HOMELOCATION = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Startupchecks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__STARTUPCHECKS = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Geofence Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__GEOFENCE_DISTANCE = IDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operationmode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__OPERATIONMODE = IDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Flightplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__FLIGHTPLAN = IDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Systemhealth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__SYSTEMHEALTH = IDABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Flightcontrollerdata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__FLIGHTCONTROLLERDATA = IDABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.BatteryStatusImpl <em>Battery Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.BatteryStatusImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getBatteryStatus()
	 * @generated
	 */
	int BATTERY_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__VOLTAGE = 1;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__CURRENT = 2;

	/**
	 * The number of structural features of the '<em>Battery Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Battery Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.SystemhealthImpl <em>Systemhealth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.SystemhealthImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getSystemhealth()
	 * @generated
	 */
	int SYSTEMHEALTH = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMHEALTH__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMHEALTH__STATUS = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Systemhealth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMHEALTH_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Systemhealth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMHEALTH_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl <em>Dronestate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getDronestate()
	 * @generated
	 */
	int DRONESTATE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONESTATE__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONESTATE__LOCATION = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Batterystatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONESTATE__BATTERYSTATUS = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Armed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONESTATE__ARMED = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Groundspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONESTATE__GROUNDSPEED = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONESTATE__MODE = IDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Armable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONESTATE__ARMABLE = IDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONESTATE__STATUS = IDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dronestate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONESTATE_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dronestate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONESTATE_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.OperationmodeImpl <em>Operationmode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.OperationmodeImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getOperationmode()
	 * @generated
	 */
	int OPERATIONMODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONMODE__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONMODE__MODE = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is In Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONMODE__IS_IN_MISSION = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mission Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONMODE__MISSION_NAME = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operationmode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONMODE_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operationmode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONMODE_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl <em>Flight Controller Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getFlightControllerData()
	 * @generated
	 */
	int FLIGHT_CONTROLLER_DATA = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTROLLER_DATA__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Num satellites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTROLLER_DATA__NUM_SATELLITES = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTROLLER_DATA__EPH = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Epv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTROLLER_DATA__EPV = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTROLLER_DATA__ROLL = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTROLLER_DATA__PITCH = IDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTROLLER_DATA__YAW = IDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fix type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTROLLER_DATA__FIX_TYPE = IDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Flight Controller Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTROLLER_DATA_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Flight Controller Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_CONTROLLER_DATA_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.DronecommandImpl <em>Dronecommand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronecommandImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getDronecommand()
	 * @generated
	 */
	int DRONECOMMAND = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONECOMMAND__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Commandid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONECOMMAND__COMMANDID = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONECOMMAND__TIMESTAMP = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONECOMMAND__COMMAND = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONECOMMAND__X = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONECOMMAND__Y = IDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONECOMMAND__Z = IDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dronecommand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONECOMMAND_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Dronecommand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONECOMMAND_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl <em>Flight Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getFlightPlan()
	 * @generated
	 */
	int FLIGHT_PLAN = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PLAN__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PLAN__START_TIME = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PLAN__END_TIME = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flight ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PLAN__FLIGHT_ID = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PLAN__START_LOCATION = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PLAN__END_LOCATION = IDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PLAN__STATUS = IDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Flight Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PLAN_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Flight Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_PLAN_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.StartupchecksImpl <em>Startupchecks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.StartupchecksImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getStartupchecks()
	 * @generated
	 */
	int STARTUPCHECKS = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUPCHECKS__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Armingstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUPCHECKS__ARMINGSTATUS = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Systemstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUPCHECKS__SYSTEMSTATUS = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUPCHECKS__MODE = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num satellites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUPCHECKS__NUM_SATELLITES = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Armable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUPCHECKS__ARMABLE = IDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Startupchecks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUPCHECKS_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Startupchecks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUPCHECKS_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.LLACoordinateImpl <em>LLA Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.LLACoordinateImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getLLACoordinate()
	 * @generated
	 */
	int LLA_COORDINATE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLA_COORDINATE__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLA_COORDINATE__Y = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLA_COORDINATE__Z = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLA_COORDINATE__X = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LLA Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLA_COORDINATE_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>LLA Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLA_COORDINATE_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.StringToStringMapImpl
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlanStatus <em>Flight Plan Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlanStatus
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getFlightPlanStatus()
	 * @generated
	 */
	int FLIGHT_PLAN_STATUS = 13;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.SystemStatus <em>System Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.SystemStatus
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getSystemStatus()
	 * @generated
	 */
	int SYSTEM_STATUS = 14;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.dronology.model.dronology.FlightMode <em>Flight Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightMode
	 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getFlightMode()
	 * @generated
	 */
	int FLIGHT_MODE = 15;

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.DroneSystem <em>Drone System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone System</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.DroneSystem
	 * @generated
	 */
	EClass getDroneSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.lit.grum.dronology.model.dronology.DroneSystem#getDrones <em>Drones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drones</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.DroneSystem#getDrones()
	 * @see #getDroneSystem()
	 * @generated
	 */
	EReference getDroneSystem_Drones();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Drone
	 * @generated
	 */
	EClass getDrone();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getDronestate <em>Dronestate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dronestate</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Drone#getDronestate()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Dronestate();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getDronecommand <em>Dronecommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dronecommand</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Drone#getDronecommand()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Dronecommand();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getHomelocation <em>Homelocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Homelocation</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Drone#getHomelocation()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Homelocation();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getStartupchecks <em>Startupchecks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Startupchecks</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Drone#getStartupchecks()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Startupchecks();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getGeofenceDistance <em>Geofence Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geofence Distance</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Drone#getGeofenceDistance()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_GeofenceDistance();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getOperationmode <em>Operationmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operationmode</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Drone#getOperationmode()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Operationmode();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getFlightplan <em>Flightplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flightplan</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Drone#getFlightplan()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Flightplan();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getSystemhealth <em>Systemhealth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Systemhealth</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Drone#getSystemhealth()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Systemhealth();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getFlightcontrollerdata <em>Flightcontrollerdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flightcontrollerdata</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Drone#getFlightcontrollerdata()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Flightcontrollerdata();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.BatteryStatus <em>Battery Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Status</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.BatteryStatus
	 * @generated
	 */
	EClass getBatteryStatus();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getLevel()
	 * @see #getBatteryStatus()
	 * @generated
	 */
	EAttribute getBatteryStatus_Level();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getVoltage()
	 * @see #getBatteryStatus()
	 * @generated
	 */
	EAttribute getBatteryStatus_Voltage();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getCurrent()
	 * @see #getBatteryStatus()
	 * @generated
	 */
	EAttribute getBatteryStatus_Current();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.Systemhealth <em>Systemhealth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systemhealth</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Systemhealth
	 * @generated
	 */
	EClass getSystemhealth();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Systemhealth#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Systemhealth#getStatus()
	 * @see #getSystemhealth()
	 * @generated
	 */
	EAttribute getSystemhealth_Status();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate <em>Dronestate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dronestate</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronestate
	 * @generated
	 */
	EClass getDronestate();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronestate#getLocation()
	 * @see #getDronestate()
	 * @generated
	 */
	EReference getDronestate_Location();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getBatterystatus <em>Batterystatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Batterystatus</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronestate#getBatterystatus()
	 * @see #getDronestate()
	 * @generated
	 */
	EReference getDronestate_Batterystatus();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#isArmed <em>Armed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armed</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronestate#isArmed()
	 * @see #getDronestate()
	 * @generated
	 */
	EAttribute getDronestate_Armed();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getGroundspeed <em>Groundspeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groundspeed</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronestate#getGroundspeed()
	 * @see #getDronestate()
	 * @generated
	 */
	EAttribute getDronestate_Groundspeed();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronestate#getMode()
	 * @see #getDronestate()
	 * @generated
	 */
	EAttribute getDronestate_Mode();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getArmable <em>Armable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armable</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronestate#getArmable()
	 * @see #getDronestate()
	 * @generated
	 */
	EAttribute getDronestate_Armable();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronestate#getStatus()
	 * @see #getDronestate()
	 * @generated
	 */
	EAttribute getDronestate_Status();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.IdableElement <em>Idable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idable Element</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.IdableElement
	 * @generated
	 */
	EClass getIdableElement();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.IdableElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.IdableElement#getId()
	 * @see #getIdableElement()
	 * @generated
	 */
	EAttribute getIdableElement_Id();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.Operationmode <em>Operationmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operationmode</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Operationmode
	 * @generated
	 */
	EClass getOperationmode();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Operationmode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Operationmode#getMode()
	 * @see #getOperationmode()
	 * @generated
	 */
	EAttribute getOperationmode_Mode();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Operationmode#isIsInMission <em>Is In Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is In Mission</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Operationmode#isIsInMission()
	 * @see #getOperationmode()
	 * @generated
	 */
	EAttribute getOperationmode_IsInMission();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Operationmode#getMissionName <em>Mission Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mission Name</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Operationmode#getMissionName()
	 * @see #getOperationmode()
	 * @generated
	 */
	EAttribute getOperationmode_MissionName();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData <em>Flight Controller Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight Controller Data</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightControllerData
	 * @generated
	 */
	EClass getFlightControllerData();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getNum_satellites <em>Num satellites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num satellites</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getNum_satellites()
	 * @see #getFlightControllerData()
	 * @generated
	 */
	EAttribute getFlightControllerData_Num_satellites();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getEph <em>Eph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eph</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getEph()
	 * @see #getFlightControllerData()
	 * @generated
	 */
	EAttribute getFlightControllerData_Eph();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getEpv <em>Epv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epv</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getEpv()
	 * @see #getFlightControllerData()
	 * @generated
	 */
	EAttribute getFlightControllerData_Epv();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getRoll()
	 * @see #getFlightControllerData()
	 * @generated
	 */
	EAttribute getFlightControllerData_Roll();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getPitch()
	 * @see #getFlightControllerData()
	 * @generated
	 */
	EAttribute getFlightControllerData_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getYaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getYaw()
	 * @see #getFlightControllerData()
	 * @generated
	 */
	EAttribute getFlightControllerData_Yaw();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getFix_type <em>Fix type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fix type</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightControllerData#getFix_type()
	 * @see #getFlightControllerData()
	 * @generated
	 */
	EAttribute getFlightControllerData_Fix_type();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand <em>Dronecommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dronecommand</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronecommand
	 * @generated
	 */
	EClass getDronecommand();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getCommandid <em>Commandid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commandid</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronecommand#getCommandid()
	 * @see #getDronecommand()
	 * @generated
	 */
	EAttribute getDronecommand_Commandid();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronecommand#getTimestamp()
	 * @see #getDronecommand()
	 * @generated
	 */
	EAttribute getDronecommand_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronecommand#getCommand()
	 * @see #getDronecommand()
	 * @generated
	 */
	EAttribute getDronecommand_Command();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronecommand#getX()
	 * @see #getDronecommand()
	 * @generated
	 */
	EAttribute getDronecommand_X();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronecommand#getY()
	 * @see #getDronecommand()
	 * @generated
	 */
	EAttribute getDronecommand_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Dronecommand#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Dronecommand#getZ()
	 * @see #getDronecommand()
	 * @generated
	 */
	EAttribute getDronecommand_Z();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan <em>Flight Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight Plan</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlan
	 * @generated
	 */
	EClass getFlightPlan();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStartTime()
	 * @see #getFlightPlan()
	 * @generated
	 */
	EAttribute getFlightPlan_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlan#getEndTime()
	 * @see #getFlightPlan()
	 * @generated
	 */
	EAttribute getFlightPlan_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getFlightID <em>Flight ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flight ID</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlan#getFlightID()
	 * @see #getFlightPlan()
	 * @generated
	 */
	EAttribute getFlightPlan_FlightID();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStartLocation <em>Start Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Location</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStartLocation()
	 * @see #getFlightPlan()
	 * @generated
	 */
	EReference getFlightPlan_StartLocation();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getEndLocation <em>End Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Location</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlan#getEndLocation()
	 * @see #getFlightPlan()
	 * @generated
	 */
	EReference getFlightPlan_EndLocation();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStatus()
	 * @see #getFlightPlan()
	 * @generated
	 */
	EAttribute getFlightPlan_Status();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks <em>Startupchecks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Startupchecks</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Startupchecks
	 * @generated
	 */
	EClass getStartupchecks();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getArmingstatus <em>Armingstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armingstatus</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Startupchecks#getArmingstatus()
	 * @see #getStartupchecks()
	 * @generated
	 */
	EAttribute getStartupchecks_Armingstatus();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getSystemstatus <em>Systemstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Systemstatus</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Startupchecks#getSystemstatus()
	 * @see #getStartupchecks()
	 * @generated
	 */
	EAttribute getStartupchecks_Systemstatus();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Startupchecks#getMode()
	 * @see #getStartupchecks()
	 * @generated
	 */
	EAttribute getStartupchecks_Mode();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getNum_satellites <em>Num satellites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num satellites</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Startupchecks#getNum_satellites()
	 * @see #getStartupchecks()
	 * @generated
	 */
	EAttribute getStartupchecks_Num_satellites();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getArmable <em>Armable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armable</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.Startupchecks#getArmable()
	 * @see #getStartupchecks()
	 * @generated
	 */
	EAttribute getStartupchecks_Armable();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.dronology.model.dronology.LLACoordinate <em>LLA Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LLA Coordinate</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.LLACoordinate
	 * @generated
	 */
	EClass getLLACoordinate();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.LLACoordinate#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.LLACoordinate#getY()
	 * @see #getLLACoordinate()
	 * @generated
	 */
	EAttribute getLLACoordinate_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.LLACoordinate#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.LLACoordinate#getZ()
	 * @see #getLLACoordinate()
	 * @generated
	 */
	EAttribute getLLACoordinate_Z();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.dronology.model.dronology.LLACoordinate#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.LLACoordinate#getX()
	 * @see #getLLACoordinate()
	 * @generated
	 */
	EAttribute getLLACoordinate_X();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        valueDataType="org.eclipse.emf.ecore.EBigDecimal"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the meta object for enum '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlanStatus <em>Flight Plan Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flight Plan Status</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlanStatus
	 * @generated
	 */
	EEnum getFlightPlanStatus();

	/**
	 * Returns the meta object for enum '{@link at.jku.lit.grum.dronology.model.dronology.SystemStatus <em>System Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Status</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.SystemStatus
	 * @generated
	 */
	EEnum getSystemStatus();

	/**
	 * Returns the meta object for enum '{@link at.jku.lit.grum.dronology.model.dronology.FlightMode <em>Flight Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flight Mode</em>'.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightMode
	 * @generated
	 */
	EEnum getFlightMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DronologyFactory getDronologyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneSystemImpl <em>Drone System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DroneSystemImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getDroneSystem()
		 * @generated
		 */
		EClass DRONE_SYSTEM = eINSTANCE.getDroneSystem();

		/**
		 * The meta object literal for the '<em><b>Drones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_SYSTEM__DRONES = eINSTANCE.getDroneSystem_Drones();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl <em>Drone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getDrone()
		 * @generated
		 */
		EClass DRONE = eINSTANCE.getDrone();

		/**
		 * The meta object literal for the '<em><b>Dronestate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__DRONESTATE = eINSTANCE.getDrone_Dronestate();

		/**
		 * The meta object literal for the '<em><b>Dronecommand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__DRONECOMMAND = eINSTANCE.getDrone_Dronecommand();

		/**
		 * The meta object literal for the '<em><b>Homelocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__HOMELOCATION = eINSTANCE.getDrone_Homelocation();

		/**
		 * The meta object literal for the '<em><b>Startupchecks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__STARTUPCHECKS = eINSTANCE.getDrone_Startupchecks();

		/**
		 * The meta object literal for the '<em><b>Geofence Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__GEOFENCE_DISTANCE = eINSTANCE.getDrone_GeofenceDistance();

		/**
		 * The meta object literal for the '<em><b>Operationmode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__OPERATIONMODE = eINSTANCE.getDrone_Operationmode();

		/**
		 * The meta object literal for the '<em><b>Flightplan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__FLIGHTPLAN = eINSTANCE.getDrone_Flightplan();

		/**
		 * The meta object literal for the '<em><b>Systemhealth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__SYSTEMHEALTH = eINSTANCE.getDrone_Systemhealth();

		/**
		 * The meta object literal for the '<em><b>Flightcontrollerdata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__FLIGHTCONTROLLERDATA = eINSTANCE.getDrone_Flightcontrollerdata();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.BatteryStatusImpl <em>Battery Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.BatteryStatusImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getBatteryStatus()
		 * @generated
		 */
		EClass BATTERY_STATUS = eINSTANCE.getBatteryStatus();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_STATUS__LEVEL = eINSTANCE.getBatteryStatus_Level();

		/**
		 * The meta object literal for the '<em><b>Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_STATUS__VOLTAGE = eINSTANCE.getBatteryStatus_Voltage();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_STATUS__CURRENT = eINSTANCE.getBatteryStatus_Current();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.SystemhealthImpl <em>Systemhealth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.SystemhealthImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getSystemhealth()
		 * @generated
		 */
		EClass SYSTEMHEALTH = eINSTANCE.getSystemhealth();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEMHEALTH__STATUS = eINSTANCE.getSystemhealth_Status();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl <em>Dronestate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getDronestate()
		 * @generated
		 */
		EClass DRONESTATE = eINSTANCE.getDronestate();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONESTATE__LOCATION = eINSTANCE.getDronestate_Location();

		/**
		 * The meta object literal for the '<em><b>Batterystatus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONESTATE__BATTERYSTATUS = eINSTANCE.getDronestate_Batterystatus();

		/**
		 * The meta object literal for the '<em><b>Armed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONESTATE__ARMED = eINSTANCE.getDronestate_Armed();

		/**
		 * The meta object literal for the '<em><b>Groundspeed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONESTATE__GROUNDSPEED = eINSTANCE.getDronestate_Groundspeed();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONESTATE__MODE = eINSTANCE.getDronestate_Mode();

		/**
		 * The meta object literal for the '<em><b>Armable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONESTATE__ARMABLE = eINSTANCE.getDronestate_Armable();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONESTATE__STATUS = eINSTANCE.getDronestate_Status();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.IdableElement <em>Idable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.IdableElement
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getIdableElement()
		 * @generated
		 */
		EClass IDABLE_ELEMENT = eINSTANCE.getIdableElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDABLE_ELEMENT__ID = eINSTANCE.getIdableElement_Id();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.OperationmodeImpl <em>Operationmode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.OperationmodeImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getOperationmode()
		 * @generated
		 */
		EClass OPERATIONMODE = eINSTANCE.getOperationmode();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONMODE__MODE = eINSTANCE.getOperationmode_Mode();

		/**
		 * The meta object literal for the '<em><b>Is In Mission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONMODE__IS_IN_MISSION = eINSTANCE.getOperationmode_IsInMission();

		/**
		 * The meta object literal for the '<em><b>Mission Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONMODE__MISSION_NAME = eINSTANCE.getOperationmode_MissionName();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl <em>Flight Controller Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getFlightControllerData()
		 * @generated
		 */
		EClass FLIGHT_CONTROLLER_DATA = eINSTANCE.getFlightControllerData();

		/**
		 * The meta object literal for the '<em><b>Num satellites</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_CONTROLLER_DATA__NUM_SATELLITES = eINSTANCE.getFlightControllerData_Num_satellites();

		/**
		 * The meta object literal for the '<em><b>Eph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_CONTROLLER_DATA__EPH = eINSTANCE.getFlightControllerData_Eph();

		/**
		 * The meta object literal for the '<em><b>Epv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_CONTROLLER_DATA__EPV = eINSTANCE.getFlightControllerData_Epv();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_CONTROLLER_DATA__ROLL = eINSTANCE.getFlightControllerData_Roll();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_CONTROLLER_DATA__PITCH = eINSTANCE.getFlightControllerData_Pitch();

		/**
		 * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_CONTROLLER_DATA__YAW = eINSTANCE.getFlightControllerData_Yaw();

		/**
		 * The meta object literal for the '<em><b>Fix type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_CONTROLLER_DATA__FIX_TYPE = eINSTANCE.getFlightControllerData_Fix_type();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.DronecommandImpl <em>Dronecommand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronecommandImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getDronecommand()
		 * @generated
		 */
		EClass DRONECOMMAND = eINSTANCE.getDronecommand();

		/**
		 * The meta object literal for the '<em><b>Commandid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONECOMMAND__COMMANDID = eINSTANCE.getDronecommand_Commandid();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONECOMMAND__TIMESTAMP = eINSTANCE.getDronecommand_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONECOMMAND__COMMAND = eINSTANCE.getDronecommand_Command();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONECOMMAND__X = eINSTANCE.getDronecommand_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONECOMMAND__Y = eINSTANCE.getDronecommand_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONECOMMAND__Z = eINSTANCE.getDronecommand_Z();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl <em>Flight Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getFlightPlan()
		 * @generated
		 */
		EClass FLIGHT_PLAN = eINSTANCE.getFlightPlan();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PLAN__START_TIME = eINSTANCE.getFlightPlan_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PLAN__END_TIME = eINSTANCE.getFlightPlan_EndTime();

		/**
		 * The meta object literal for the '<em><b>Flight ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PLAN__FLIGHT_ID = eINSTANCE.getFlightPlan_FlightID();

		/**
		 * The meta object literal for the '<em><b>Start Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_PLAN__START_LOCATION = eINSTANCE.getFlightPlan_StartLocation();

		/**
		 * The meta object literal for the '<em><b>End Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT_PLAN__END_LOCATION = eINSTANCE.getFlightPlan_EndLocation();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT_PLAN__STATUS = eINSTANCE.getFlightPlan_Status();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.StartupchecksImpl <em>Startupchecks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.StartupchecksImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getStartupchecks()
		 * @generated
		 */
		EClass STARTUPCHECKS = eINSTANCE.getStartupchecks();

		/**
		 * The meta object literal for the '<em><b>Armingstatus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUPCHECKS__ARMINGSTATUS = eINSTANCE.getStartupchecks_Armingstatus();

		/**
		 * The meta object literal for the '<em><b>Systemstatus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUPCHECKS__SYSTEMSTATUS = eINSTANCE.getStartupchecks_Systemstatus();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUPCHECKS__MODE = eINSTANCE.getStartupchecks_Mode();

		/**
		 * The meta object literal for the '<em><b>Num satellites</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUPCHECKS__NUM_SATELLITES = eINSTANCE.getStartupchecks_Num_satellites();

		/**
		 * The meta object literal for the '<em><b>Armable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUPCHECKS__ARMABLE = eINSTANCE.getStartupchecks_Armable();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.LLACoordinateImpl <em>LLA Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.LLACoordinateImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getLLACoordinate()
		 * @generated
		 */
		EClass LLA_COORDINATE = eINSTANCE.getLLACoordinate();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLA_COORDINATE__Y = eINSTANCE.getLLACoordinate_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLA_COORDINATE__Z = eINSTANCE.getLLACoordinate_Z();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLA_COORDINATE__X = eINSTANCE.getLLACoordinate_X();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.StringToStringMapImpl
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlanStatus <em>Flight Plan Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlanStatus
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getFlightPlanStatus()
		 * @generated
		 */
		EEnum FLIGHT_PLAN_STATUS = eINSTANCE.getFlightPlanStatus();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.SystemStatus <em>System Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.SystemStatus
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getSystemStatus()
		 * @generated
		 */
		EEnum SYSTEM_STATUS = eINSTANCE.getSystemStatus();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.dronology.model.dronology.FlightMode <em>Flight Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.dronology.model.dronology.FlightMode
		 * @see at.jku.lit.grum.dronology.model.dronology.impl.DronologyPackageImpl#getFlightMode()
		 * @generated
		 */
		EEnum FLIGHT_MODE = eINSTANCE.getFlightMode();

	}

} //DronologyPackage
