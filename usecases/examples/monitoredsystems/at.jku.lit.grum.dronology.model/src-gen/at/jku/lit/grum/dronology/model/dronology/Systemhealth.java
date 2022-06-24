/**
 */
package at.jku.lit.grum.dronology.model.dronology;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systemhealth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.Systemhealth#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getSystemhealth()
 * @model
 * @generated
 */
public interface Systemhealth extends IdableElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getSystemhealth_Status()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link at.jku.lit.grum.dronology.model.dronology.Systemhealth#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // Systemhealth
