/**
 */
package at.jku.lit.grum.picar.model.picar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.Location#getLat <em>Lat</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.Location#getLon <em>Lon</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.Location#getAlt <em>Alt</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(double)
	 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getLocation_Lat()
	 * @model
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.picar.model.picar.Location#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #setLon(double)
	 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getLocation_Lon()
	 * @model
	 * @generated
	 */
	double getLon();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.picar.model.picar.Location#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #getLon()
	 * @generated
	 */
	void setLon(double value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(double)
	 * @see at.jku.lit.grum.picar.model.picar.PicarPackage#getLocation_Alt()
	 * @model
	 * @generated
	 */
	double getAlt();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.picar.model.picar.Location#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(double value);

} // Location
