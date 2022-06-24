/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.impl;

import at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus;
import at.jku.lit.grum.turtlebot.model.turtlebot.BotSystem;
import at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics;
import at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement;
import at.jku.lit.grum.turtlebot.model.turtlebot.JointState;
import at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan;
import at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField;
import at.jku.lit.grum.turtlebot.model.turtlebot.Odometry;
import at.jku.lit.grum.turtlebot.model.turtlebot.Sensor;
import at.jku.lit.grum.turtlebot.model.turtlebot.SensorState;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotFactory;
import at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage;
import at.jku.lit.grum.turtlebot.model.turtlebot.Velocity;
import at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtlebotPackageImpl extends EPackageImpl implements TurtlebotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jointStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass magneticFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass velocityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laserScanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turtleBotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botSystemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TurtlebotPackageImpl() {
		super(eNS_URI, TurtlebotFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TurtlebotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TurtlebotPackage init() {
		if (isInited)
			return (TurtlebotPackage) EPackage.Registry.INSTANCE.getEPackage(TurtlebotPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTurtlebotPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TurtlebotPackageImpl theTurtlebotPackage = registeredTurtlebotPackage instanceof TurtlebotPackageImpl
				? (TurtlebotPackageImpl) registeredTurtlebotPackage
				: new TurtlebotPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTurtlebotPackage.createPackageContents();

		// Initialize created meta-data
		theTurtlebotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTurtlebotPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TurtlebotPackage.eNS_URI, theTurtlebotPackage);
		return theTurtlebotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatteryStatus() {
		return batteryStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryStatus_Voltage() {
		return (EAttribute) batteryStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryStatus_Percentage() {
		return (EAttribute) batteryStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryStatus_PowerSupplyTemperature() {
		return (EAttribute) batteryStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJointState() {
		return jointStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJointState_EffortLeftJoint() {
		return (EAttribute) jointStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJointState_EffortRightJoint() {
		return (EAttribute) jointStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMagneticField() {
		return magneticFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMagneticField_X() {
		return (EAttribute) magneticFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMagneticField_Y() {
		return (EAttribute) magneticFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMagneticField_Z() {
		return (EAttribute) magneticFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionInfo() {
		return versionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInfo_Hardware() {
		return (EAttribute) versionInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInfo_Firmware() {
		return (EAttribute) versionInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInfo_Software() {
		return (EAttribute) versionInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVelocity() {
		return velocityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVelocity_Rotation() {
		return (EAttribute) velocityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVelocity_Speed() {
		return (EAttribute) velocityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_PartsPerMillion() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOdometry() {
		return odometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOdometry_MovedDistance() {
		return (EAttribute) odometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnostics() {
		return diagnosticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnostics_LevelOfOperationIMUSensor() {
		return (EAttribute) diagnosticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnostics_LevelOfOperationActuator() {
		return (EAttribute) diagnosticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnostics_LevelOfOperationLidarSensor() {
		return (EAttribute) diagnosticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnostics_LevelOfOperationPowerSystem() {
		return (EAttribute) diagnosticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnostics_LevelOfOperationAnalogButton() {
		return (EAttribute) diagnosticsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorState() {
		return sensorStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorState_Illumination() {
		return (EAttribute) sensorStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorState_Cliff() {
		return (EAttribute) sensorStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaserScan() {
		return laserScanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaserScan_SmallestRange() {
		return (EAttribute) laserScanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdableElement() {
		return idableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdableElement_Id() {
		return (EAttribute) idableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurtleBot() {
		return turtleBotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Batterystatus() {
		return (EReference) turtleBotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Velocity() {
		return (EReference) turtleBotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Diagnostics() {
		return (EReference) turtleBotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Jointstate() {
		return (EReference) turtleBotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Magneticfield() {
		return (EReference) turtleBotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Sensorstate() {
		return (EReference) turtleBotEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Versioninfo() {
		return (EReference) turtleBotEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Sensor() {
		return (EReference) turtleBotEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Odometry() {
		return (EReference) turtleBotEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurtleBot_Laserscan() {
		return (EReference) turtleBotEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotSystem() {
		return botSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBotSystem_Turtlebots() {
		return (EReference) botSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtlebotFactory getTurtlebotFactory() {
		return (TurtlebotFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		batteryStatusEClass = createEClass(BATTERY_STATUS);
		createEAttribute(batteryStatusEClass, BATTERY_STATUS__VOLTAGE);
		createEAttribute(batteryStatusEClass, BATTERY_STATUS__PERCENTAGE);
		createEAttribute(batteryStatusEClass, BATTERY_STATUS__POWER_SUPPLY_TEMPERATURE);

		jointStateEClass = createEClass(JOINT_STATE);
		createEAttribute(jointStateEClass, JOINT_STATE__EFFORT_LEFT_JOINT);
		createEAttribute(jointStateEClass, JOINT_STATE__EFFORT_RIGHT_JOINT);

		magneticFieldEClass = createEClass(MAGNETIC_FIELD);
		createEAttribute(magneticFieldEClass, MAGNETIC_FIELD__X);
		createEAttribute(magneticFieldEClass, MAGNETIC_FIELD__Y);
		createEAttribute(magneticFieldEClass, MAGNETIC_FIELD__Z);

		versionInfoEClass = createEClass(VERSION_INFO);
		createEAttribute(versionInfoEClass, VERSION_INFO__HARDWARE);
		createEAttribute(versionInfoEClass, VERSION_INFO__FIRMWARE);
		createEAttribute(versionInfoEClass, VERSION_INFO__SOFTWARE);

		velocityEClass = createEClass(VELOCITY);
		createEAttribute(velocityEClass, VELOCITY__ROTATION);
		createEAttribute(velocityEClass, VELOCITY__SPEED);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__PARTS_PER_MILLION);

		odometryEClass = createEClass(ODOMETRY);
		createEAttribute(odometryEClass, ODOMETRY__MOVED_DISTANCE);

		diagnosticsEClass = createEClass(DIAGNOSTICS);
		createEAttribute(diagnosticsEClass, DIAGNOSTICS__LEVEL_OF_OPERATION_IMU_SENSOR);
		createEAttribute(diagnosticsEClass, DIAGNOSTICS__LEVEL_OF_OPERATION_ACTUATOR);
		createEAttribute(diagnosticsEClass, DIAGNOSTICS__LEVEL_OF_OPERATION_LIDAR_SENSOR);
		createEAttribute(diagnosticsEClass, DIAGNOSTICS__LEVEL_OF_OPERATION_POWER_SYSTEM);
		createEAttribute(diagnosticsEClass, DIAGNOSTICS__LEVEL_OF_OPERATION_ANALOG_BUTTON);

		sensorStateEClass = createEClass(SENSOR_STATE);
		createEAttribute(sensorStateEClass, SENSOR_STATE__ILLUMINATION);
		createEAttribute(sensorStateEClass, SENSOR_STATE__CLIFF);

		laserScanEClass = createEClass(LASER_SCAN);
		createEAttribute(laserScanEClass, LASER_SCAN__SMALLEST_RANGE);

		idableElementEClass = createEClass(IDABLE_ELEMENT);
		createEAttribute(idableElementEClass, IDABLE_ELEMENT__ID);

		turtleBotEClass = createEClass(TURTLE_BOT);
		createEReference(turtleBotEClass, TURTLE_BOT__BATTERYSTATUS);
		createEReference(turtleBotEClass, TURTLE_BOT__VELOCITY);
		createEReference(turtleBotEClass, TURTLE_BOT__DIAGNOSTICS);
		createEReference(turtleBotEClass, TURTLE_BOT__JOINTSTATE);
		createEReference(turtleBotEClass, TURTLE_BOT__MAGNETICFIELD);
		createEReference(turtleBotEClass, TURTLE_BOT__SENSORSTATE);
		createEReference(turtleBotEClass, TURTLE_BOT__VERSIONINFO);
		createEReference(turtleBotEClass, TURTLE_BOT__SENSOR);
		createEReference(turtleBotEClass, TURTLE_BOT__ODOMETRY);
		createEReference(turtleBotEClass, TURTLE_BOT__LASERSCAN);

		botSystemEClass = createEClass(BOT_SYSTEM);
		createEReference(botSystemEClass, BOT_SYSTEM__TURTLEBOTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		batteryStatusEClass.getESuperTypes().add(this.getIdableElement());
		jointStateEClass.getESuperTypes().add(this.getIdableElement());
		magneticFieldEClass.getESuperTypes().add(this.getIdableElement());
		versionInfoEClass.getESuperTypes().add(this.getIdableElement());
		velocityEClass.getESuperTypes().add(this.getIdableElement());
		sensorEClass.getESuperTypes().add(this.getIdableElement());
		odometryEClass.getESuperTypes().add(this.getIdableElement());
		diagnosticsEClass.getESuperTypes().add(this.getIdableElement());
		sensorStateEClass.getESuperTypes().add(this.getIdableElement());
		laserScanEClass.getESuperTypes().add(this.getIdableElement());
		turtleBotEClass.getESuperTypes().add(this.getIdableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(batteryStatusEClass, BatteryStatus.class, "BatteryStatus", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatteryStatus_Voltage(), ecorePackage.getEFloatObject(), "voltage", null, 0, 1,
				BatteryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryStatus_Percentage(), ecorePackage.getEFloatObject(), "percentage", null, 0, 1,
				BatteryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryStatus_PowerSupplyTemperature(), ecorePackage.getEByteObject(),
				"powerSupplyTemperature", null, 0, 1, BatteryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jointStateEClass, JointState.class, "JointState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJointState_EffortLeftJoint(), ecorePackage.getEFloatObject(), "effortLeftJoint", null, 0, 1,
				JointState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJointState_EffortRightJoint(), ecorePackage.getEFloatObject(), "effortRightJoint", null, 0, 1,
				JointState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(magneticFieldEClass, MagneticField.class, "MagneticField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMagneticField_X(), ecorePackage.getEFloatObject(), "x", null, 0, 1, MagneticField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMagneticField_Y(), ecorePackage.getEFloatObject(), "y", null, 0, 1, MagneticField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMagneticField_Z(), ecorePackage.getEFloatObject(), "z", null, 0, 1, MagneticField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionInfoEClass, VersionInfo.class, "VersionInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionInfo_Hardware(), ecorePackage.getEString(), "hardware", null, 0, 1, VersionInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInfo_Firmware(), ecorePackage.getEString(), "firmware", null, 0, 1, VersionInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionInfo_Software(), ecorePackage.getEString(), "software", null, 0, 1, VersionInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(velocityEClass, Velocity.class, "Velocity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVelocity_Rotation(), ecorePackage.getEFloatObject(), "rotation", null, 0, 1, Velocity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVelocity_Speed(), ecorePackage.getEFloatObject(), "speed", null, 0, 1, Velocity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_PartsPerMillion(), ecorePackage.getEDouble(), "partsPerMillion", null, 0, 1,
				Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(odometryEClass, Odometry.class, "Odometry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOdometry_MovedDistance(), ecorePackage.getEDoubleObject(), "movedDistance", null, 0, 1,
				Odometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(diagnosticsEClass, Diagnostics.class, "Diagnostics", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagnostics_LevelOfOperationIMUSensor(), ecorePackage.getEIntegerObject(),
				"levelOfOperationIMUSensor", null, 0, 1, Diagnostics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnostics_LevelOfOperationActuator(), ecorePackage.getEIntegerObject(),
				"levelOfOperationActuator", null, 0, 1, Diagnostics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnostics_LevelOfOperationLidarSensor(), ecorePackage.getEIntegerObject(),
				"levelOfOperationLidarSensor", null, 0, 1, Diagnostics.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnostics_LevelOfOperationPowerSystem(), ecorePackage.getEIntegerObject(),
				"levelOfOperationPowerSystem", null, 0, 1, Diagnostics.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnostics_LevelOfOperationAnalogButton(), ecorePackage.getEIntegerObject(),
				"levelOfOperationAnalogButton", null, 0, 1, Diagnostics.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorStateEClass, SensorState.class, "SensorState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorState_Illumination(), ecorePackage.getEFloatObject(), "illumination", null, 0, 1,
				SensorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorState_Cliff(), ecorePackage.getEFloatObject(), "cliff", null, 0, 1, SensorState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(laserScanEClass, LaserScan.class, "LaserScan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLaserScan_SmallestRange(), ecorePackage.getEFloatObject(), "smallestRange", null, 0, 1,
				LaserScan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(idableElementEClass, IdableElement.class, "IdableElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdableElement_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, IdableElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turtleBotEClass, TurtleBot.class, "TurtleBot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurtleBot_Batterystatus(), this.getBatteryStatus(), null, "batterystatus", null, 1, 1,
				TurtleBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Velocity(), this.getVelocity(), null, "velocity", null, 1, 1, TurtleBot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Diagnostics(), this.getDiagnostics(), null, "diagnostics", null, 1, 1,
				TurtleBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Jointstate(), this.getJointState(), null, "jointstate", null, 1, 1, TurtleBot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Magneticfield(), this.getMagneticField(), null, "magneticfield", null, 1, 1,
				TurtleBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Sensorstate(), this.getSensorState(), null, "sensorstate", null, 1, 1,
				TurtleBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Versioninfo(), this.getVersionInfo(), null, "versioninfo", null, 1, 1,
				TurtleBot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Sensor(), this.getSensor(), null, "sensor", null, 1, 1, TurtleBot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Odometry(), this.getOdometry(), null, "odometry", null, 1, 1, TurtleBot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurtleBot_Laserscan(), this.getLaserScan(), null, "laserscan", null, 1, 1, TurtleBot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(botSystemEClass, BotSystem.class, "BotSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBotSystem_Turtlebots(), this.getTurtleBot(), null, "turtlebots", null, 0, -1, BotSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TurtlebotPackageImpl
