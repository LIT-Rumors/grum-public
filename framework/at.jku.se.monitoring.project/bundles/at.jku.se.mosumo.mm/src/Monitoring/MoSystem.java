/**
 */
package Monitoring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mo System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Monitoring.MoSystem#getEClass <em>EClass</em>}</li>
 *   <li>{@link Monitoring.MoSystem#getAgents <em>Agents</em>}</li>
 * </ul>
 *
 * @see Monitoring.MonitoringPackage#getMoSystem()
 * @model
 * @generated
 */
public interface MoSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see Monitoring.MonitoringPackage#getMoSystem_EClass()
	 * @model
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link Monitoring.MoSystem#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link Monitoring.MOAgent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see Monitoring.MonitoringPackage#getMoSystem_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<MOAgent> getAgents();

} // MoSystem
