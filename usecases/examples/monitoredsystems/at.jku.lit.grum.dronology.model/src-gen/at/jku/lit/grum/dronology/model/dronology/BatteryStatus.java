/**
 */
package at.jku.lit.grum.dronology.model.dronology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getLevel <em>Level</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getBatteryStatus()
 * @model
 * @generated
 */
public interface BatteryStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(Double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getBatteryStatus_Level()
	 * @model
	 * @generated
	 */
	Double getLevel();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Double value);

	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #setVoltage(Double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getBatteryStatus_Voltage()
	 * @model
	 * @generated
	 */
	Double getVoltage();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(Double value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(Double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getBatteryStatus_Current()
	 * @model
	 * @generated
	 */
	Double getCurrent();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.BatteryStatus#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(Double value);

} // BatteryStatus
