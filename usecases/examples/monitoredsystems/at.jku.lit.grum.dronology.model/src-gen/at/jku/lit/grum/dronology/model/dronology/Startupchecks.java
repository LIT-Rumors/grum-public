/**
 */
package at.jku.lit.grum.dronology.model.dronology;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Startupchecks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getArmingstatus <em>Armingstatus</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getSystemstatus <em>Systemstatus</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getMode <em>Mode</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getNum_satellites <em>Num satellites</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getArmable <em>Armable</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getStartupchecks()
 * @model
 * @generated
 */
public interface Startupchecks extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Armingstatus</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armingstatus</em>' attribute.
	 * @see #setArmingstatus(Boolean)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getStartupchecks_Armingstatus()
	 * @model default="false"
	 * @generated
	 */
	Boolean getArmingstatus();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getArmingstatus <em>Armingstatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armingstatus</em>' attribute.
	 * @see #getArmingstatus()
	 * @generated
	 */
	void setArmingstatus(Boolean value);

	/**
	 * Returns the value of the '<em><b>Systemstatus</b></em>' attribute.
	 * The literals are from the enumeration {@link at.jku.lit.grum.dronology.model.dronology.SystemStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemstatus</em>' attribute.
	 * @see at.jku.lit.grum.dronology.model.dronology.SystemStatus
	 * @see #setSystemstatus(SystemStatus)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getStartupchecks_Systemstatus()
	 * @model
	 * @generated
	 */
	SystemStatus getSystemstatus();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getSystemstatus <em>Systemstatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemstatus</em>' attribute.
	 * @see at.jku.lit.grum.dronology.model.dronology.SystemStatus
	 * @see #getSystemstatus()
	 * @generated
	 */
	void setSystemstatus(SystemStatus value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link at.jku.lit.grum.dronology.model.dronology.FlightMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightMode
	 * @see #setMode(FlightMode)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getStartupchecks_Mode()
	 * @model
	 * @generated
	 */
	FlightMode getMode();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(FlightMode value);

	/**
	 * Returns the value of the '<em><b>Num satellites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num satellites</em>' attribute.
	 * @see #setNum_satellites(Integer)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getStartupchecks_Num_satellites()
	 * @model
	 * @generated
	 */
	Integer getNum_satellites();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getNum_satellites <em>Num satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num satellites</em>' attribute.
	 * @see #getNum_satellites()
	 * @generated
	 */
	void setNum_satellites(Integer value);

	/**
	 * Returns the value of the '<em><b>Armable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armable</em>' attribute.
	 * @see #setArmable(Boolean)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getStartupchecks_Armable()
	 * @model default="false"
	 * @generated
	 */
	Boolean getArmable();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Startupchecks#getArmable <em>Armable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armable</em>' attribute.
	 * @see #getArmable()
	 * @generated
	 */
	void setArmable(Boolean value);

} // Startupchecks
