/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turtle Bot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getBatterystatus <em>Batterystatus</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getJointstate <em>Jointstate</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getMagneticfield <em>Magneticfield</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getSensorstate <em>Sensorstate</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getVersioninfo <em>Versioninfo</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getSensor <em>Sensor</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getOdometry <em>Odometry</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getLaserscan <em>Laserscan</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getTurtleBot()
 * @model
 * @generated
 */
public interface TurtleBot extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Batterystatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batterystatus</em>' containment reference.
	 * @see #setBatterystatus(BatteryStatus)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getTurtleBot_Batterystatus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BatteryStatus getBatterystatus();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getBatterystatus <em>Batterystatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batterystatus</em>' containment reference.
	 * @see #getBatterystatus()
	 * @generated
	 */
	void setBatterystatus(BatteryStatus value);

	/**
	 * Returns the value of the '<em><b>Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity</em>' containment reference.
	 * @see #setVelocity(Velocity)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getTurtleBot_Velocity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Velocity getVelocity();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getVelocity <em>Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity</em>' containment reference.
	 * @see #getVelocity()
	 * @generated
	 */
	void setVelocity(Velocity value);

	/**
	 * Returns the value of the '<em><b>Diagnostics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostics</em>' containment reference.
	 * @see #setDiagnostics(Diagnostics)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getTurtleBot_Diagnostics()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Diagnostics getDiagnostics();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getDiagnostics <em>Diagnostics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostics</em>' containment reference.
	 * @see #getDiagnostics()
	 * @generated
	 */
	void setDiagnostics(Diagnostics value);

	/**
	 * Returns the value of the '<em><b>Jointstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jointstate</em>' containment reference.
	 * @see #setJointstate(JointState)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getTurtleBot_Jointstate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JointState getJointstate();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getJointstate <em>Jointstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jointstate</em>' containment reference.
	 * @see #getJointstate()
	 * @generated
	 */
	void setJointstate(JointState value);

	/**
	 * Returns the value of the '<em><b>Magneticfield</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magneticfield</em>' containment reference.
	 * @see #setMagneticfield(MagneticField)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getTurtleBot_Magneticfield()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MagneticField getMagneticfield();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getMagneticfield <em>Magneticfield</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magneticfield</em>' containment reference.
	 * @see #getMagneticfield()
	 * @generated
	 */
	void setMagneticfield(MagneticField value);

	/**
	 * Returns the value of the '<em><b>Sensorstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensorstate</em>' containment reference.
	 * @see #setSensorstate(SensorState)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getTurtleBot_Sensorstate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SensorState getSensorstate();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getSensorstate <em>Sensorstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensorstate</em>' containment reference.
	 * @see #getSensorstate()
	 * @generated
	 */
	void setSensorstate(SensorState value);

	/**
	 * Returns the value of the '<em><b>Versioninfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioninfo</em>' containment reference.
	 * @see #setVersioninfo(VersionInfo)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getTurtleBot_Versioninfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VersionInfo getVersioninfo();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getVersioninfo <em>Versioninfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioninfo</em>' containment reference.
	 * @see #getVersioninfo()
	 * @generated
	 */
	void setVersioninfo(VersionInfo value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference.
	 * @see #setSensor(Sensor)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getTurtleBot_Sensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getSensor <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' containment reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Odometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odometry</em>' containment reference.
	 * @see #setOdometry(Odometry)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getTurtleBot_Odometry()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Odometry getOdometry();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getOdometry <em>Odometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odometry</em>' containment reference.
	 * @see #getOdometry()
	 * @generated
	 */
	void setOdometry(Odometry value);

	/**
	 * Returns the value of the '<em><b>Laserscan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laserscan</em>' containment reference.
	 * @see #setLaserscan(LaserScan)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getTurtleBot_Laserscan()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LaserScan getLaserscan();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.TurtleBot#getLaserscan <em>Laserscan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laserscan</em>' containment reference.
	 * @see #getLaserscan()
	 * @generated
	 */
	void setLaserscan(LaserScan value);

} // TurtleBot
