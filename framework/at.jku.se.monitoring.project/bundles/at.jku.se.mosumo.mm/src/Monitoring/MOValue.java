/**
 */
package Monitoring;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MO Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Monitoring.MOValue#getEAttribute <em>EAttribute</em>}</li>
 * </ul>
 *
 * @see Monitoring.MonitoringPackage#getMOValue()
 * @model
 * @generated
 */
public interface MOValue extends MOElement {
	/**
	 * Returns the value of the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute</em>' reference.
	 * @see #setEAttribute(EAttribute)
	 * @see Monitoring.MonitoringPackage#getMOValue_EAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getEAttribute();

	/**
	 * Sets the value of the '{@link Monitoring.MOValue#getEAttribute <em>EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAttribute</em>' reference.
	 * @see #getEAttribute()
	 * @generated
	 */
	void setEAttribute(EAttribute value);

} // MOValue
