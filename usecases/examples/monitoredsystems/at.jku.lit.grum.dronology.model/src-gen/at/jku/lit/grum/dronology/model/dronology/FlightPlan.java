/**
 */
package at.jku.lit.grum.dronology.model.dronology;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getEndTime <em>End Time</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getFlightID <em>Flight ID</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getEndLocation <em>End Location</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightPlan()
 * @model
 * @generated
 */
public interface FlightPlan extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(long)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightPlan_StartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Long"
	 * @generated
	 */
	long getStartTime();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(long value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(long)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightPlan_EndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Long"
	 * @generated
	 */
	long getEndTime();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(long value);

	/**
	 * Returns the value of the '<em><b>Flight ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight ID</em>' attribute.
	 * @see #setFlightID(String)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightPlan_FlightID()
	 * @model
	 * @generated
	 */
	String getFlightID();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getFlightID <em>Flight ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight ID</em>' attribute.
	 * @see #getFlightID()
	 * @generated
	 */
	void setFlightID(String value);

	/**
	 * Returns the value of the '<em><b>Start Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Location</em>' containment reference.
	 * @see #setStartLocation(LLACoordinate)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightPlan_StartLocation()
	 * @model containment="true"
	 * @generated
	 */
	LLACoordinate getStartLocation();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStartLocation <em>Start Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Location</em>' containment reference.
	 * @see #getStartLocation()
	 * @generated
	 */
	void setStartLocation(LLACoordinate value);

	/**
	 * Returns the value of the '<em><b>End Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Location</em>' containment reference.
	 * @see #setEndLocation(LLACoordinate)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightPlan_EndLocation()
	 * @model containment="true"
	 * @generated
	 */
	LLACoordinate getEndLocation();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getEndLocation <em>End Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Location</em>' containment reference.
	 * @see #getEndLocation()
	 * @generated
	 */
	void setEndLocation(LLACoordinate value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link at.jku.lit.grum.dronology.model.dronology.FlightPlanStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlanStatus
	 * @see #setStatus(FlightPlanStatus)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightPlan_Status()
	 * @model
	 * @generated
	 */
	FlightPlanStatus getStatus();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.FlightPlan#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see at.jku.lit.grum.dronology.model.dronology.FlightPlanStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FlightPlanStatus value);

} // FlightPlan
