/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Odometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.Odometry#getMovedDistance <em>Moved Distance</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getOdometry()
 * @model
 * @generated
 */
public interface Odometry extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Moved Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moved Distance</em>' attribute.
	 * @see #setMovedDistance(Double)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getOdometry_MovedDistance()
	 * @model
	 * @generated
	 */
	Double getMovedDistance();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Odometry#getMovedDistance <em>Moved Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moved Distance</em>' attribute.
	 * @see #getMovedDistance()
	 * @generated
	 */
	void setMovedDistance(Double value);

} // Odometry
