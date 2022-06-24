/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage
 * @generated
 */
public interface TurtlebotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TurtlebotFactory eINSTANCE = at.jku.lit.grum.turtlebot.model.turtlebot.impl.TurtlebotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Battery Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Status</em>'.
	 * @generated
	 */
	BatteryStatus createBatteryStatus();

	/**
	 * Returns a new object of class '<em>Joint State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joint State</em>'.
	 * @generated
	 */
	JointState createJointState();

	/**
	 * Returns a new object of class '<em>Magnetic Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Magnetic Field</em>'.
	 * @generated
	 */
	MagneticField createMagneticField();

	/**
	 * Returns a new object of class '<em>Version Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Info</em>'.
	 * @generated
	 */
	VersionInfo createVersionInfo();

	/**
	 * Returns a new object of class '<em>Velocity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Velocity</em>'.
	 * @generated
	 */
	Velocity createVelocity();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Odometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Odometry</em>'.
	 * @generated
	 */
	Odometry createOdometry();

	/**
	 * Returns a new object of class '<em>Diagnostics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostics</em>'.
	 * @generated
	 */
	Diagnostics createDiagnostics();

	/**
	 * Returns a new object of class '<em>Sensor State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor State</em>'.
	 * @generated
	 */
	SensorState createSensorState();

	/**
	 * Returns a new object of class '<em>Laser Scan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Laser Scan</em>'.
	 * @generated
	 */
	LaserScan createLaserScan();

	/**
	 * Returns a new object of class '<em>Turtle Bot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turtle Bot</em>'.
	 * @generated
	 */
	TurtleBot createTurtleBot();

	/**
	 * Returns a new object of class '<em>Bot System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bot System</em>'.
	 * @generated
	 */
	BotSystem createBotSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TurtlebotPackage getTurtlebotPackage();

} //TurtlebotFactory
