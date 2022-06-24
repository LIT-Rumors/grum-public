/**
 */
package at.jku.lit.grum.turtlebot.model.turtlebot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getPowerSupplyTemperature <em>Power Supply Temperature</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getBatteryStatus()
 * @model
 * @generated
 */
public interface BatteryStatus extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #setVoltage(Float)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getBatteryStatus_Voltage()
	 * @model
	 * @generated
	 */
	Float getVoltage();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(Float value);

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(Float)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getBatteryStatus_Percentage()
	 * @model
	 * @generated
	 */
	Float getPercentage();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(Float value);

	/**
	 * Returns the value of the '<em><b>Power Supply Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Supply Temperature</em>' attribute.
	 * @see #setPowerSupplyTemperature(Byte)
	 * @see at.jku.lit.grum.turtlebot.model.turtlebot.TurtlebotPackage#getBatteryStatus_PowerSupplyTemperature()
	 * @model
	 * @generated
	 */
	Byte getPowerSupplyTemperature();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.turtlebot.model.turtlebot.BatteryStatus#getPowerSupplyTemperature <em>Power Supply Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Supply Temperature</em>' attribute.
	 * @see #getPowerSupplyTemperature()
	 * @generated
	 */
	void setPowerSupplyTemperature(Byte value);

} // BatteryStatus
