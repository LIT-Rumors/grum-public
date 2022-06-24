/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Velocity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.Velocity#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.Velocity#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getVelocity()
 * @model
 * @generated
 */
public interface Velocity extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(Float)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getVelocity_Rotation()
	 * @model
	 * @generated
	 */
	Float getRotation();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Velocity#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(Float value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(Float)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getVelocity_Speed()
	 * @model
	 * @generated
	 */
	Float getSpeed();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Velocity#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Float value);

} // Velocity
