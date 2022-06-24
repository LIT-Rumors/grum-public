/**
 */
package at.jku.lit.grum.picar.model.picar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.Picar#getLocation <em>Location</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.Picar#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.Picar#getStatus <em>Status</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.Picar#getStartlocation <em>Startlocation</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.Picar#getGeofence_range <em>Geofence range</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getPicar()
 * @model
 * @generated
 */
public interface Picar extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getPicar_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.picar.model.picar.Picar#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getPicar_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.picar.model.picar.Picar#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getPicar_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.picar.model.picar.Picar#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Startlocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startlocation</em>' containment reference.
	 * @see #setStartlocation(Location)
	 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getPicar_Startlocation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getStartlocation();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.picar.model.picar.Picar#getStartlocation <em>Startlocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startlocation</em>' containment reference.
	 * @see #getStartlocation()
	 * @generated
	 */
	void setStartlocation(Location value);

	/**
	 * Returns the value of the '<em><b>Geofence range</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geofence range</em>' attribute.
	 * @see #setGeofence_range(double)
	 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getPicar_Geofence_range()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getGeofence_range();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.picar.model.picar.Picar#getGeofence_range <em>Geofence range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geofence range</em>' attribute.
	 * @see #getGeofence_range()
	 * @generated
	 */
	void setGeofence_range(double value);

} // Picar
