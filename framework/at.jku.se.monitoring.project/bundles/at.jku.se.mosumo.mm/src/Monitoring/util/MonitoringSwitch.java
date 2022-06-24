/**
 */
package Monitoring.util;

import Monitoring.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Monitoring.MonitoringPackage
 * @generated
 */
public class MonitoringSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MonitoringPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringSwitch() {
		if (modelPackage == null) {
			modelPackage = MonitoringPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MonitoringPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MonitoringPackage.MONITORABLE_ELEMENT: {
				MonitorableElement monitorableElement = (MonitorableElement)theEObject;
				T result = caseMonitorableElement(monitorableElement);
				if (result == null) result = caseNamedElement(monitorableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MonitoringPackage.MO_AGENT: {
				MOAgent moAgent = (MOAgent)theEObject;
				T result = caseMOAgent(moAgent);
				if (result == null) result = caseMonitorableElement(moAgent);
				if (result == null) result = caseNamedElement(moAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MonitoringPackage.MO_CONFIG: {
				MOConfig moConfig = (MOConfig)theEObject;
				T result = caseMOConfig(moConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MonitoringPackage.MO_ELEMENT: {
				MOElement moElement = (MOElement)theEObject;
				T result = caseMOElement(moElement);
				if (result == null) result = caseMonitorableElement(moElement);
				if (result == null) result = caseNamedElement(moElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MonitoringPackage.MO_PROPERTY: {
				MOProperty moProperty = (MOProperty)theEObject;
				T result = caseMOProperty(moProperty);
				if (result == null) result = caseMOElement(moProperty);
				if (result == null) result = caseMonitorableElement(moProperty);
				if (result == null) result = caseNamedElement(moProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MonitoringPackage.MO_VALUE: {
				MOValue moValue = (MOValue)theEObject;
				T result = caseMOValue(moValue);
				if (result == null) result = caseMOElement(moValue);
				if (result == null) result = caseMonitorableElement(moValue);
				if (result == null) result = caseNamedElement(moValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MonitoringPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = caseNamedElement(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MonitoringPackage.CONNECTION_OPTIONS: {
				ConnectionOptions connectionOptions = (ConnectionOptions)theEObject;
				T result = caseConnectionOptions(connectionOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MonitoringPackage.DERIVED_PROPERTY: {
				DerivedProperty derivedProperty = (DerivedProperty)theEObject;
				T result = caseDerivedProperty(derivedProperty);
				if (result == null) result = caseMonitorableElement(derivedProperty);
				if (result == null) result = caseNamedElement(derivedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MonitoringPackage.MO_SYSTEM: {
				MoSystem moSystem = (MoSystem)theEObject;
				T result = caseMoSystem(moSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitorable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitorable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitorableElement(MonitorableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MO Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MO Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOAgent(MOAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MO Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MO Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOConfig(MOConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MO Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MO Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOElement(MOElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MO Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MO Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOProperty(MOProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MO Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MO Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOValue(MOValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionOptions(ConnectionOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedProperty(DerivedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mo System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoSystem(MoSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MonitoringSwitch
