/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.Sensor#getPartsPerMillion <em>Parts Per Million</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Parts Per Million</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts Per Million</em>' attribute.
	 * @see #setPartsPerMillion(double)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getSensor_PartsPerMillion()
	 * @model
	 * @generated
	 */
	double getPartsPerMillion();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.Sensor#getPartsPerMillion <em>Parts Per Million</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parts Per Million</em>' attribute.
	 * @see #getPartsPerMillion()
	 * @generated
	 */
	void setPartsPerMillion(double value);

} // Sensor
