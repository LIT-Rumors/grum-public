/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot.util;

import at.jku.lit.grum.turtlebot.model.turtlebot.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage
 * @generated
 */
public class TurtlebotAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TurtlebotPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtlebotAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TurtlebotPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurtlebotSwitch<Adapter> modelSwitch = new TurtlebotSwitch<Adapter>() {
		@Override
		public Adapter caseBatteryStatus(BatteryStatus object) {
			return createBatteryStatusAdapter();
		}

		@Override
		public Adapter caseJointState(JointState object) {
			return createJointStateAdapter();
		}

		@Override
		public Adapter caseMagneticField(MagneticField object) {
			return createMagneticFieldAdapter();
		}

		@Override
		public Adapter caseVersionInfo(VersionInfo object) {
			return createVersionInfoAdapter();
		}

		@Override
		public Adapter caseVelocity(Velocity object) {
			return createVelocityAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseOdometry(Odometry object) {
			return createOdometryAdapter();
		}

		@Override
		public Adapter caseDiagnostics(Diagnostics object) {
			return createDiagnosticsAdapter();
		}

		@Override
		public Adapter caseSensorState(SensorState object) {
			return createSensorStateAdapter();
		}

		@Override
		public Adapter caseLaserScan(LaserScan object) {
			return createLaserScanAdapter();
		}

		@Override
		public Adapter caseIdableElement(IdableElement object) {
			return createIdableElementAdapter();
		}

		@Override
		public Adapter caseTurtleBot(TurtleBot object) {
			return createTurtleBotAdapter();
		}

		@Override
		public Adapter caseBotSystem(BotSystem object) {
			return createBotSystemAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus <em>Battery Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus
	 * @generated
	 */
	public Adapter createBatteryStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.JointState <em>Joint State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.JointState
	 * @generated
	 */
	public Adapter createJointStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField <em>Magnetic Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.MagneticField
	 * @generated
	 */
	public Adapter createMagneticFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo <em>Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.VersionInfo
	 * @generated
	 */
	public Adapter createVersionInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Velocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Velocity
	 * @generated
	 */
	public Adapter createVelocityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Odometry <em>Odometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Odometry
	 * @generated
	 */
	public Adapter createOdometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics <em>Diagnostics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.Diagnostics
	 * @generated
	 */
	public Adapter createDiagnosticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.SensorState <em>Sensor State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.SensorState
	 * @generated
	 */
	public Adapter createSensorStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan <em>Laser Scan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan
	 * @generated
	 */
	public Adapter createLaserScanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement <em>Idable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.IdableElement
	 * @generated
	 */
	public Adapter createIdableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot <em>Turtle Bot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot
	 * @generated
	 */
	public Adapter createTurtleBotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.lit.grum.turtlebot.model.turtlebot.BotSystem <em>Bot System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.BotSystem
	 * @generated
	 */
	public Adapter createBotSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TurtlebotAdapterFactory
