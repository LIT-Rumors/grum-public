/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.SensorState#getIllumination <em>Illumination</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.SensorState#getCliff <em>Cliff</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getSensorState()
 * @model
 * @generated
 */
public interface SensorState extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Illumination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illumination</em>' attribute.
	 * @see #setIllumination(Float)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getSensorState_Illumination()
	 * @model
	 * @generated
	 */
	Float getIllumination();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.SensorState#getIllumination <em>Illumination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Illumination</em>' attribute.
	 * @see #getIllumination()
	 * @generated
	 */
	void setIllumination(Float value);

	/**
	 * Returns the value of the '<em><b>Cliff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliff</em>' attribute.
	 * @see #setCliff(Float)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getSensorState_Cliff()
	 * @model
	 * @generated
	 */
	Float getCliff();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.SensorState#getCliff <em>Cliff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cliff</em>' attribute.
	 * @see #getCliff()
	 * @generated
	 */
	void setCliff(Float value);

} // SensorState
