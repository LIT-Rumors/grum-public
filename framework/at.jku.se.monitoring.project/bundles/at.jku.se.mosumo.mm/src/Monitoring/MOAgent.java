/**
 */
package Monitoring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MO Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Monitoring.MOAgent#getEClass <em>EClass</em>}</li>
 *   <li>{@link Monitoring.MOAgent#getElements <em>Elements</em>}</li>
 *   <li>{@link Monitoring.MOAgent#getServer <em>Server</em>}</li>
 *   <li>{@link Monitoring.MOAgent#getDerivedproperties <em>Derivedproperties</em>}</li>
 * </ul>
 *
 * @see Monitoring.MonitoringPackage#getMOAgent()
 * @model
 * @generated
 */
public interface MOAgent extends MonitorableElement {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see Monitoring.MonitoringPackage#getMOAgent_EClass()
	 * @model
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link Monitoring.MOAgent#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Monitoring.MOElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see Monitoring.MonitoringPackage#getMOAgent_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MOElement> getElements();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(Server)
	 * @see Monitoring.MonitoringPackage#getMOAgent_Server()
	 * @model
	 * @generated
	 */
	Server getServer();

	/**
	 * Sets the value of the '{@link Monitoring.MOAgent#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Server value);

	/**
	 * Returns the value of the '<em><b>Derivedproperties</b></em>' containment reference list.
	 * The list contents are of type {@link Monitoring.DerivedProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivedproperties</em>' containment reference list.
	 * @see Monitoring.MonitoringPackage#getMOAgent_Derivedproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DerivedProperty> getDerivedproperties();

} // MOAgent
