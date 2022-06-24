/**
 */
package at.jku.lit.grum.dronology.model.dronology;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operationmode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Operationmode#getMode <em>Mode</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Operationmode#isIsInMission <em>Is In Mission</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Operationmode#getMissionName <em>Mission Name</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getOperationmode()
 * @model
 * @generated
 */
public interface Operationmode extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getOperationmode_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Operationmode#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Is In Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is In Mission</em>' attribute.
	 * @see #setIsInMission(boolean)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getOperationmode_IsInMission()
	 * @model
	 * @generated
	 */
	boolean isIsInMission();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Operationmode#isIsInMission <em>Is In Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is In Mission</em>' attribute.
	 * @see #isIsInMission()
	 * @generated
	 */
	void setIsInMission(boolean value);

	/**
	 * Returns the value of the '<em><b>Mission Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Name</em>' attribute.
	 * @see #setMissionName(String)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getOperationmode_MissionName()
	 * @model
	 * @generated
	 */
	String getMissionName();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Operationmode#getMissionName <em>Mission Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Name</em>' attribute.
	 * @see #getMissionName()
	 * @generated
	 */
	void setMissionName(String value);

} // Operationmode
