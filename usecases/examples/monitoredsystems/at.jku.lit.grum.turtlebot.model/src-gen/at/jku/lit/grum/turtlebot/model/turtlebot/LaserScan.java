/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Laser Scan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan#getSmallestRange <em>Smallest Range</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getLaserScan()
 * @model
 * @generated
 */
public interface LaserScan extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Smallest Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smallest Range</em>' attribute.
	 * @see #setSmallestRange(Float)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getLaserScan_SmallestRange()
	 * @model
	 * @generated
	 */
	Float getSmallestRange();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.LaserScan#getSmallestRange <em>Smallest Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smallest Range</em>' attribute.
	 * @see #getSmallestRange()
	 * @generated
	 */
	void setSmallestRange(Float value);

} // LaserScan
