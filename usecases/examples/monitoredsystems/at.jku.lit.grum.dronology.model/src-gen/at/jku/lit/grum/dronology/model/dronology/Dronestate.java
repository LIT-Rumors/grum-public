/**
 */
package at.jku.lit.grum.dronology.model.dronology;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dronestate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getLocation <em>Location</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getBatterystatus <em>Batterystatus</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#isArmed <em>Armed</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getGroundspeed <em>Groundspeed</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getMode <em>Mode</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getArmable <em>Armable</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronestate()
 * @model
 * @generated
 */
public interface Dronestate extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LLACoordinate)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronestate_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LLACoordinate getLocation();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LLACoordinate value);

	/**
	 * Returns the value of the '<em><b>Batterystatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batterystatus</em>' containment reference.
	 * @see #setBatterystatus(BatteryStatus)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronestate_Batterystatus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BatteryStatus getBatterystatus();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getBatterystatus <em>Batterystatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batterystatus</em>' containment reference.
	 * @see #getBatterystatus()
	 * @generated
	 */
	void setBatterystatus(BatteryStatus value);

	/**
	 * Returns the value of the '<em><b>Armed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armed</em>' attribute.
	 * @see #setArmed(boolean)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronestate_Armed()
	 * @model
	 * @generated
	 */
	boolean isArmed();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#isArmed <em>Armed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armed</em>' attribute.
	 * @see #isArmed()
	 * @generated
	 */
	void setArmed(boolean value);

	/**
	 * Returns the value of the '<em><b>Groundspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groundspeed</em>' attribute.
	 * @see #setGroundspeed(double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronestate_Groundspeed()
	 * @model
	 * @generated
	 */
	double getGroundspeed();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getGroundspeed <em>Groundspeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groundspeed</em>' attribute.
	 * @see #getGroundspeed()
	 * @generated
	 */
	void setGroundspeed(double value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link at.jku.lit.grum.dronology.model.dronology.FlightMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightMode
	 * @see #setMode(FlightMode)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronestate_Mode()
	 * @model
	 * @generated
	 */
	FlightMode getMode();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(FlightMode value);

	/**
	 * Returns the value of the '<em><b>Armable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armable</em>' attribute.
	 * @see #setArmable(Boolean)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronestate_Armable()
	 * @model default="false"
	 * @generated
	 */
	Boolean getArmable();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getArmable <em>Armable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armable</em>' attribute.
	 * @see #getArmable()
	 * @generated
	 */
	void setArmable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDronestate_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Dronestate#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // Dronestate
