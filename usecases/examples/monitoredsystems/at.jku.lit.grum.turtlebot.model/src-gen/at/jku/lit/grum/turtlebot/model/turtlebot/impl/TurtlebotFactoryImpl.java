/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.impl;

import at.jku.lit.grum.turtlebot.model.turtlebot.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtlebotFactoryImpl extends EFactoryImpl implements TurtlebotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TurtlebotFactory init() {
		try {
			TurtlebotFactory theTurtlebotFactory = (TurtlebotFactory) EPackage.Registry.INSTANCE
					.getEFactory(TurtlebotPackage.eNS_URI);
			if (theTurtlebotFactory != null) {
				return theTurtlebotFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TurtlebotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtlebotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TurtlebotPackage.BATTERY_STATUS:
			return createBatteryStatus();
		case TurtlebotPackage.JOINT_STATE:
			return createJointState();
		case TurtlebotPackage.MAGNETIC_FIELD:
			return createMagneticField();
		case TurtlebotPackage.VERSION_INFO:
			return createVersionInfo();
		case TurtlebotPackage.VELOCITY:
			return createVelocity();
		case TurtlebotPackage.SENSOR:
			return createSensor();
		case TurtlebotPackage.ODOMETRY:
			return createOdometry();
		case TurtlebotPackage.DIAGNOSTICS:
			return createDiagnostics();
		case TurtlebotPackage.SENSOR_STATE:
			return createSensorState();
		case TurtlebotPackage.LASER_SCAN:
			return createLaserScan();
		case TurtlebotPackage.TURTLE_BOT:
			return createTurtleBot();
		case TurtlebotPackage.BOT_SYSTEM:
			return createBotSystem();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryStatus createBatteryStatus() {
		BatteryStatusImpl batteryStatus = new BatteryStatusImpl();
		return batteryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointState createJointState() {
		JointStateImpl jointState = new JointStateImpl();
		return jointState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagneticField createMagneticField() {
		MagneticFieldImpl magneticField = new MagneticFieldImpl();
		return magneticField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionInfo createVersionInfo() {
		VersionInfoImpl versionInfo = new VersionInfoImpl();
		return versionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Velocity createVelocity() {
		VelocityImpl velocity = new VelocityImpl();
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Odometry createOdometry() {
		OdometryImpl odometry = new OdometryImpl();
		return odometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagnostics createDiagnostics() {
		DiagnosticsImpl diagnostics = new DiagnosticsImpl();
		return diagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorState createSensorState() {
		SensorStateImpl sensorState = new SensorStateImpl();
		return sensorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaserScan createLaserScan() {
		LaserScanImpl laserScan = new LaserScanImpl();
		return laserScan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtleBot createTurtleBot() {
		TurtleBotImpl turtleBot = new TurtleBotImpl();
		return turtleBot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BotSystem createBotSystem() {
		BotSystemImpl botSystem = new BotSystemImpl();
		return botSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtlebotPackage getTurtlebotPackage() {
		return (TurtlebotPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TurtlebotPackage getPackage() {
		return TurtlebotPackage.eINSTANCE;
	}

} //TurtlebotFactoryImpl
