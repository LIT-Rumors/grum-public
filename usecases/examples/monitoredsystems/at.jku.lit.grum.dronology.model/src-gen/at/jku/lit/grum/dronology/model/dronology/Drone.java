/**
 */
package at.jku.lit.grum.dronology.model.dronology;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Drone#getDronestate <em>Dronestate</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Drone#getDronecommand <em>Dronecommand</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Drone#getHomelocation <em>Homelocation</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Drone#getStartupchecks <em>Startupchecks</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Drone#getGeofenceDistance <em>Geofence Distance</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Drone#getOperationmode <em>Operationmode</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Drone#getFlightplan <em>Flightplan</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Drone#getSystemhealth <em>Systemhealth</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Drone#getFlightcontrollerdata <em>Flightcontrollerdata</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDrone()
 * @model
 * @generated
 */
public interface Drone extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Dronestate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dronestate</em>' containment reference.
	 * @see #setDronestate(Dronestate)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDrone_Dronestate()
	 * @model containment="true"
	 * @generated
	 */
	Dronestate getDronestate();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getDronestate <em>Dronestate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dronestate</em>' containment reference.
	 * @see #getDronestate()
	 * @generated
	 */
	void setDronestate(Dronestate value);

	/**
	 * Returns the value of the '<em><b>Dronecommand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dronecommand</em>' containment reference.
	 * @see #setDronecommand(Dronecommand)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDrone_Dronecommand()
	 * @model containment="true"
	 * @generated
	 */
	Dronecommand getDronecommand();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getDronecommand <em>Dronecommand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dronecommand</em>' containment reference.
	 * @see #getDronecommand()
	 * @generated
	 */
	void setDronecommand(Dronecommand value);

	/**
	 * Returns the value of the '<em><b>Homelocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homelocation</em>' containment reference.
	 * @see #setHomelocation(LLACoordinate)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDrone_Homelocation()
	 * @model containment="true"
	 * @generated
	 */
	LLACoordinate getHomelocation();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getHomelocation <em>Homelocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homelocation</em>' containment reference.
	 * @see #getHomelocation()
	 * @generated
	 */
	void setHomelocation(LLACoordinate value);

	/**
	 * Returns the value of the '<em><b>Startupchecks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startupchecks</em>' containment reference.
	 * @see #setStartupchecks(Startupchecks)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDrone_Startupchecks()
	 * @model containment="true"
	 * @generated
	 */
	Startupchecks getStartupchecks();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getStartupchecks <em>Startupchecks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startupchecks</em>' containment reference.
	 * @see #getStartupchecks()
	 * @generated
	 */
	void setStartupchecks(Startupchecks value);

	/**
	 * Returns the value of the '<em><b>Geofence Distance</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geofence Distance</em>' attribute.
	 * @see #setGeofenceDistance(Double)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDrone_GeofenceDistance()
	 * @model default="0.0" derived="true"
	 * @generated
	 */
	Double getGeofenceDistance();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getGeofenceDistance <em>Geofence Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geofence Distance</em>' attribute.
	 * @see #getGeofenceDistance()
	 * @generated
	 */
	void setGeofenceDistance(Double value);

	/**
	 * Returns the value of the '<em><b>Operationmode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationmode</em>' containment reference.
	 * @see #setOperationmode(Operationmode)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDrone_Operationmode()
	 * @model containment="true"
	 * @generated
	 */
	Operationmode getOperationmode();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getOperationmode <em>Operationmode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operationmode</em>' containment reference.
	 * @see #getOperationmode()
	 * @generated
	 */
	void setOperationmode(Operationmode value);

	/**
	 * Returns the value of the '<em><b>Flightplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flightplan</em>' containment reference.
	 * @see #setFlightplan(FlightPlan)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDrone_Flightplan()
	 * @model containment="true"
	 * @generated
	 */
	FlightPlan getFlightplan();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getFlightplan <em>Flightplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flightplan</em>' containment reference.
	 * @see #getFlightplan()
	 * @generated
	 */
	void setFlightplan(FlightPlan value);

	/**
	 * Returns the value of the '<em><b>Systemhealth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemhealth</em>' containment reference.
	 * @see #setSystemhealth(Systemhealth)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDrone_Systemhealth()
	 * @model containment="true"
	 * @generated
	 */
	Systemhealth getSystemhealth();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getSystemhealth <em>Systemhealth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemhealth</em>' containment reference.
	 * @see #getSystemhealth()
	 * @generated
	 */
	void setSystemhealth(Systemhealth value);

	/**
	 * Returns the value of the '<em><b>Flightcontrollerdata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flightcontrollerdata</em>' containment reference.
	 * @see #setFlightcontrollerdata(FlightControllerData)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getDrone_Flightcontrollerdata()
	 * @model containment="true"
	 * @generated
	 */
	FlightControllerData getFlightcontrollerdata();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Drone#getFlightcontrollerdata <em>Flightcontrollerdata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flightcontrollerdata</em>' containment reference.
	 * @see #getFlightcontrollerdata()
	 * @generated
	 */
	void setFlightcontrollerdata(FlightControllerData value);

} // Drone
