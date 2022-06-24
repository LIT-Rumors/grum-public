/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotFactory
 * @model kind="package"
 * @generated
 */
public interface TurtlebotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "turtlebot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lit.jku.at/grum/turtlebot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "turtlebot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TurtlebotPackage eINSTANCE = at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement <em>Idable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getIdableElement()
	 * @generated
	 */
	int IDABLE_ELEMENT = 10;

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
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.BatteryStatusImpl <em>Battery Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.BatteryStatusImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getBatteryStatus()
	 * @generated
	 */
	int BATTERY_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__VOLTAGE = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__PERCENTAGE = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power Supply Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__POWER_SUPPLY_TEMPERATURE = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Battery Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Battery Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.JointStateImpl <em>Joint State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.JointStateImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getJointState()
	 * @generated
	 */
	int JOINT_STATE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_STATE__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Effort Left Joint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_STATE__EFFORT_LEFT_JOINT = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effort Right Joint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_STATE__EFFORT_RIGHT_JOINT = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Joint State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_STATE_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Joint State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_STATE_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.MagneticFieldImpl <em>Magnetic Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.MagneticFieldImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getMagneticField()
	 * @generated
	 */
	int MAGNETIC_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_FIELD__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_FIELD__X = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_FIELD__Y = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_FIELD__Z = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Magnetic Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_FIELD_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Magnetic Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_FIELD_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.VersionInfoImpl <em>Version Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.VersionInfoImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getVersionInfo()
	 * @generated
	 */
	int VERSION_INFO = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__HARDWARE = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Firmware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__FIRMWARE = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Software</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__SOFTWARE = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Version Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Version Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.VelocityImpl <em>Velocity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.VelocityImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getVelocity()
	 * @generated
	 */
	int VELOCITY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY__ROTATION = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY__SPEED = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Velocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Velocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Parts Per Million</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PARTS_PER_MILLION = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.OdometryImpl <em>Odometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.OdometryImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getOdometry()
	 * @generated
	 */
	int ODOMETRY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODOMETRY__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Moved Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODOMETRY__MOVED_DISTANCE = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Odometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODOMETRY_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Odometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODOMETRY_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.DiagnosticsImpl <em>Diagnostics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.DiagnosticsImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getDiagnostics()
	 * @generated
	 */
	int DIAGNOSTICS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Level Of Operation IMU Sensor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS__LEVEL_OF_OPERATION_IMU_SENSOR = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level Of Operation Actuator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS__LEVEL_OF_OPERATION_ACTUATOR = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level Of Operation Lidar Sensor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS__LEVEL_OF_OPERATION_LIDAR_SENSOR = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level Of Operation Power System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS__LEVEL_OF_OPERATION_POWER_SYSTEM = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level Of Operation Analog Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS__LEVEL_OF_OPERATION_ANALOG_BUTTON = IDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Diagnostics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Diagnostics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorStateImpl <em>Sensor State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorStateImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getSensorState()
	 * @generated
	 */
	int SENSOR_STATE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_STATE__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Illumination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_STATE__ILLUMINATION = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cliff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_STATE__CLIFF = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_STATE_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_STATE_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.LaserScanImpl <em>Laser Scan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.LaserScanImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getLaserScan()
	 * @generated
	 */
	int LASER_SCAN = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_SCAN__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Smallest Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_SCAN__SMALLEST_RANGE = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Laser Scan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_SCAN_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Laser Scan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LASER_SCAN_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl <em>Turtle Bot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getTurtleBot()
	 * @generated
	 */
	int TURTLE_BOT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__ID = IDABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Batterystatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__BATTERYSTATUS = IDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__VELOCITY = IDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__DIAGNOSTICS = IDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jointstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__JOINTSTATE = IDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Magneticfield</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__MAGNETICFIELD = IDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sensorstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__SENSORSTATE = IDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Versioninfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__VERSIONINFO = IDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__SENSOR = IDABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Odometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__ODOMETRY = IDABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Laserscan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__LASERSCAN = IDABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Turtle Bot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT_FEATURE_COUNT = IDABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Turtle Bot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT_OPERATION_COUNT = IDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.BotSystemImpl <em>Bot System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.BotSystemImpl
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getBotSystem()
	 * @generated
	 */
	int BOT_SYSTEM = 12;

	/**
	 * The feature id for the '<em><b>Turtlebots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOT_SYSTEM__TURTLEBOTS = 0;

	/**
	 * The number of structural features of the '<em>Bot System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOT_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bot System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOT_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus <em>Battery Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Status</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus
	 * @generated
	 */
	EClass getBatteryStatus();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getVoltage()
	 * @see #getBatteryStatus()
	 * @generated
	 */
	EAttribute getBatteryStatus_Voltage();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getPercentage()
	 * @see #getBatteryStatus()
	 * @generated
	 */
	EAttribute getBatteryStatus_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getPowerSupplyTemperature <em>Power Supply Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Supply Temperature</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getPowerSupplyTemperature()
	 * @see #getBatteryStatus()
	 * @generated
	 */
	EAttribute getBatteryStatus_PowerSupplyTemperature();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.JointState <em>Joint State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint State</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.JointState
	 * @generated
	 */
	EClass getJointState();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.JointState#getEffortLeftJoint <em>Effort Left Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effort Left Joint</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.JointState#getEffortLeftJoint()
	 * @see #getJointState()
	 * @generated
	 */
	EAttribute getJointState_EffortLeftJoint();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.JointState#getEffortRightJoint <em>Effort Right Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effort Right Joint</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.JointState#getEffortRightJoint()
	 * @see #getJointState()
	 * @generated
	 */
	EAttribute getJointState_EffortRightJoint();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField <em>Magnetic Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Magnetic Field</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField
	 * @generated
	 */
	EClass getMagneticField();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField#getX()
	 * @see #getMagneticField()
	 * @generated
	 */
	EAttribute getMagneticField_X();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField#getY()
	 * @see #getMagneticField()
	 * @generated
	 */
	EAttribute getMagneticField_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField#getZ()
	 * @see #getMagneticField()
	 * @generated
	 */
	EAttribute getMagneticField_Z();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo <em>Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Info</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo
	 * @generated
	 */
	EClass getVersionInfo();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getHardware()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Hardware();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getFirmware <em>Firmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmware</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getFirmware()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Firmware();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo#getSoftware()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Software();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Velocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Velocity</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Velocity
	 * @generated
	 */
	EClass getVelocity();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Velocity#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Velocity#getRotation()
	 * @see #getVelocity()
	 * @generated
	 */
	EAttribute getVelocity_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Velocity#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Velocity#getSpeed()
	 * @see #getVelocity()
	 * @generated
	 */
	EAttribute getVelocity_Speed();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Sensor#getPartsPerMillion <em>Parts Per Million</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parts Per Million</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Sensor#getPartsPerMillion()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_PartsPerMillion();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Odometry <em>Odometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Odometry</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Odometry
	 * @generated
	 */
	EClass getOdometry();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Odometry#getMovedDistance <em>Moved Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moved Distance</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Odometry#getMovedDistance()
	 * @see #getOdometry()
	 * @generated
	 */
	EAttribute getOdometry_MovedDistance();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics <em>Diagnostics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostics</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics
	 * @generated
	 */
	EClass getDiagnostics();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics#getLevelOfOperationIMUSensor <em>Level Of Operation IMU Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Of Operation IMU Sensor</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics#getLevelOfOperationIMUSensor()
	 * @see #getDiagnostics()
	 * @generated
	 */
	EAttribute getDiagnostics_LevelOfOperationIMUSensor();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics#getLevelOfOperationActuator <em>Level Of Operation Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Of Operation Actuator</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics#getLevelOfOperationActuator()
	 * @see #getDiagnostics()
	 * @generated
	 */
	EAttribute getDiagnostics_LevelOfOperationActuator();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics#getLevelOfOperationLidarSensor <em>Level Of Operation Lidar Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Of Operation Lidar Sensor</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics#getLevelOfOperationLidarSensor()
	 * @see #getDiagnostics()
	 * @generated
	 */
	EAttribute getDiagnostics_LevelOfOperationLidarSensor();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics#getLevelOfOperationPowerSystem <em>Level Of Operation Power System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Of Operation Power System</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics#getLevelOfOperationPowerSystem()
	 * @see #getDiagnostics()
	 * @generated
	 */
	EAttribute getDiagnostics_LevelOfOperationPowerSystem();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics#getLevelOfOperationAnalogButton <em>Level Of Operation Analog Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Of Operation Analog Button</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics#getLevelOfOperationAnalogButton()
	 * @see #getDiagnostics()
	 * @generated
	 */
	EAttribute getDiagnostics_LevelOfOperationAnalogButton();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.SensorState <em>Sensor State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor State</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.SensorState
	 * @generated
	 */
	EClass getSensorState();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.SensorState#getIllumination <em>Illumination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Illumination</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.SensorState#getIllumination()
	 * @see #getSensorState()
	 * @generated
	 */
	EAttribute getSensorState_Illumination();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.SensorState#getCliff <em>Cliff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cliff</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.SensorState#getCliff()
	 * @see #getSensorState()
	 * @generated
	 */
	EAttribute getSensorState_Cliff();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan <em>Laser Scan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Laser Scan</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan
	 * @generated
	 */
	EClass getLaserScan();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan#getSmallestRange <em>Smallest Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smallest Range</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan#getSmallestRange()
	 * @see #getLaserScan()
	 * @generated
	 */
	EAttribute getLaserScan_SmallestRange();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement <em>Idable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idable Element</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement
	 * @generated
	 */
	EClass getIdableElement();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement#getId()
	 * @see #getIdableElement()
	 * @generated
	 */
	EAttribute getIdableElement_Id();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot <em>Turtle Bot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turtle Bot</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot
	 * @generated
	 */
	EClass getTurtleBot();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getBatterystatus <em>Batterystatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Batterystatus</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getBatterystatus()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Batterystatus();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Velocity</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getVelocity()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Velocity();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getDiagnostics <em>Diagnostics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagnostics</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getDiagnostics()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Diagnostics();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getJointstate <em>Jointstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jointstate</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getJointstate()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Jointstate();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getMagneticfield <em>Magneticfield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Magneticfield</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getMagneticfield()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Magneticfield();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getSensorstate <em>Sensorstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensorstate</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getSensorstate()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Sensorstate();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getVersioninfo <em>Versioninfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Versioninfo</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getVersioninfo()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Versioninfo();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensor</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getSensor()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Sensor();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getOdometry <em>Odometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Odometry</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getOdometry()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Odometry();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getLaserscan <em>Laserscan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Laserscan</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getLaserscan()
	 * @see #getTurtleBot()
	 * @generated
	 */
	EReference getTurtleBot_Laserscan();

	/**
	 * Returns the meta object for class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.BotSystem <em>Bot System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bot System</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.BotSystem
	 * @generated
	 */
	EClass getBotSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.lit.grum.turtlebot.model.turtlebot.BotSystem#getTurtlebots <em>Turtlebots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Turtlebots</em>'.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.BotSystem#getTurtlebots()
	 * @see #getBotSystem()
	 * @generated
	 */
	EReference getBotSystem_Turtlebots();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TurtlebotFactory getTurtlebotFactory();

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
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.BatteryStatusImpl <em>Battery Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.BatteryStatusImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getBatteryStatus()
		 * @generated
		 */
		EClass BATTERY_STATUS = eINSTANCE.getBatteryStatus();

		/**
		 * The meta object literal for the '<em><b>Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_STATUS__VOLTAGE = eINSTANCE.getBatteryStatus_Voltage();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_STATUS__PERCENTAGE = eINSTANCE.getBatteryStatus_Percentage();

		/**
		 * The meta object literal for the '<em><b>Power Supply Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_STATUS__POWER_SUPPLY_TEMPERATURE = eINSTANCE.getBatteryStatus_PowerSupplyTemperature();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.JointStateImpl <em>Joint State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.JointStateImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getJointState()
		 * @generated
		 */
		EClass JOINT_STATE = eINSTANCE.getJointState();

		/**
		 * The meta object literal for the '<em><b>Effort Left Joint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT_STATE__EFFORT_LEFT_JOINT = eINSTANCE.getJointState_EffortLeftJoint();

		/**
		 * The meta object literal for the '<em><b>Effort Right Joint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT_STATE__EFFORT_RIGHT_JOINT = eINSTANCE.getJointState_EffortRightJoint();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.MagneticFieldImpl <em>Magnetic Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.MagneticFieldImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getMagneticField()
		 * @generated
		 */
		EClass MAGNETIC_FIELD = eINSTANCE.getMagneticField();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAGNETIC_FIELD__X = eINSTANCE.getMagneticField_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAGNETIC_FIELD__Y = eINSTANCE.getMagneticField_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAGNETIC_FIELD__Z = eINSTANCE.getMagneticField_Z();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.VersionInfoImpl <em>Version Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.VersionInfoImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getVersionInfo()
		 * @generated
		 */
		EClass VERSION_INFO = eINSTANCE.getVersionInfo();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFO__HARDWARE = eINSTANCE.getVersionInfo_Hardware();

		/**
		 * The meta object literal for the '<em><b>Firmware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFO__FIRMWARE = eINSTANCE.getVersionInfo_Firmware();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFO__SOFTWARE = eINSTANCE.getVersionInfo_Software();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.VelocityImpl <em>Velocity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.VelocityImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getVelocity()
		 * @generated
		 */
		EClass VELOCITY = eINSTANCE.getVelocity();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VELOCITY__ROTATION = eINSTANCE.getVelocity_Rotation();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VELOCITY__SPEED = eINSTANCE.getVelocity_Speed();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Parts Per Million</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__PARTS_PER_MILLION = eINSTANCE.getSensor_PartsPerMillion();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.OdometryImpl <em>Odometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.OdometryImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getOdometry()
		 * @generated
		 */
		EClass ODOMETRY = eINSTANCE.getOdometry();

		/**
		 * The meta object literal for the '<em><b>Moved Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ODOMETRY__MOVED_DISTANCE = eINSTANCE.getOdometry_MovedDistance();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.DiagnosticsImpl <em>Diagnostics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.DiagnosticsImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getDiagnostics()
		 * @generated
		 */
		EClass DIAGNOSTICS = eINSTANCE.getDiagnostics();

		/**
		 * The meta object literal for the '<em><b>Level Of Operation IMU Sensor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTICS__LEVEL_OF_OPERATION_IMU_SENSOR = eINSTANCE.getDiagnostics_LevelOfOperationIMUSensor();

		/**
		 * The meta object literal for the '<em><b>Level Of Operation Actuator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTICS__LEVEL_OF_OPERATION_ACTUATOR = eINSTANCE.getDiagnostics_LevelOfOperationActuator();

		/**
		 * The meta object literal for the '<em><b>Level Of Operation Lidar Sensor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTICS__LEVEL_OF_OPERATION_LIDAR_SENSOR = eINSTANCE
				.getDiagnostics_LevelOfOperationLidarSensor();

		/**
		 * The meta object literal for the '<em><b>Level Of Operation Power System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTICS__LEVEL_OF_OPERATION_POWER_SYSTEM = eINSTANCE
				.getDiagnostics_LevelOfOperationPowerSystem();

		/**
		 * The meta object literal for the '<em><b>Level Of Operation Analog Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTICS__LEVEL_OF_OPERATION_ANALOG_BUTTON = eINSTANCE
				.getDiagnostics_LevelOfOperationAnalogButton();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorStateImpl <em>Sensor State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.SensorStateImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getSensorState()
		 * @generated
		 */
		EClass SENSOR_STATE = eINSTANCE.getSensorState();

		/**
		 * The meta object literal for the '<em><b>Illumination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_STATE__ILLUMINATION = eINSTANCE.getSensorState_Illumination();

		/**
		 * The meta object literal for the '<em><b>Cliff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_STATE__CLIFF = eINSTANCE.getSensorState_Cliff();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.LaserScanImpl <em>Laser Scan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.LaserScanImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getLaserScan()
		 * @generated
		 */
		EClass LASER_SCAN = eINSTANCE.getLaserScan();

		/**
		 * The meta object literal for the '<em><b>Smallest Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LASER_SCAN__SMALLEST_RANGE = eINSTANCE.getLaserScan_SmallestRange();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement <em>Idable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getIdableElement()
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
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl <em>Turtle Bot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtleBotImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getTurtleBot()
		 * @generated
		 */
		EClass TURTLE_BOT = eINSTANCE.getTurtleBot();

		/**
		 * The meta object literal for the '<em><b>Batterystatus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__BATTERYSTATUS = eINSTANCE.getTurtleBot_Batterystatus();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__VELOCITY = eINSTANCE.getTurtleBot_Velocity();

		/**
		 * The meta object literal for the '<em><b>Diagnostics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__DIAGNOSTICS = eINSTANCE.getTurtleBot_Diagnostics();

		/**
		 * The meta object literal for the '<em><b>Jointstate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__JOINTSTATE = eINSTANCE.getTurtleBot_Jointstate();

		/**
		 * The meta object literal for the '<em><b>Magneticfield</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__MAGNETICFIELD = eINSTANCE.getTurtleBot_Magneticfield();

		/**
		 * The meta object literal for the '<em><b>Sensorstate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__SENSORSTATE = eINSTANCE.getTurtleBot_Sensorstate();

		/**
		 * The meta object literal for the '<em><b>Versioninfo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__VERSIONINFO = eINSTANCE.getTurtleBot_Versioninfo();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__SENSOR = eINSTANCE.getTurtleBot_Sensor();

		/**
		 * The meta object literal for the '<em><b>Odometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__ODOMETRY = eINSTANCE.getTurtleBot_Odometry();

		/**
		 * The meta object literal for the '<em><b>Laserscan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE_BOT__LASERSCAN = eINSTANCE.getTurtleBot_Laserscan();

		/**
		 * The meta object literal for the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.impl.BotSystemImpl <em>Bot System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.BotSystemImpl
		 * @see at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotPackageImpl#getBotSystem()
		 * @generated
		 */
		EClass BOT_SYSTEM = eINSTANCE.getBotSystem();

		/**
		 * The meta object literal for the '<em><b>Turtlebots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOT_SYSTEM__TURTLEBOTS = eINSTANCE.getBotSystem_Turtlebots();

	}

} //TurtlebotPackage
