/**
 */
package Monitoring.util;

import Monitoring.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Monitoring.MonitoringPackage
 * @generated
 */
public class MonitoringAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MonitoringPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MonitoringPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringSwitch<Adapter> modelSwitch =
		new MonitoringSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseMonitorableElement(MonitorableElement object) {
				return createMonitorableElementAdapter();
			}
			@Override
			public Adapter caseMOAgent(MOAgent object) {
				return createMOAgentAdapter();
			}
			@Override
			public Adapter caseMOConfig(MOConfig object) {
				return createMOConfigAdapter();
			}
			@Override
			public Adapter caseMOElement(MOElement object) {
				return createMOElementAdapter();
			}
			@Override
			public Adapter caseMOProperty(MOProperty object) {
				return createMOPropertyAdapter();
			}
			@Override
			public Adapter caseMOValue(MOValue object) {
				return createMOValueAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseConnectionOptions(ConnectionOptions object) {
				return createConnectionOptionsAdapter();
			}
			@Override
			public Adapter caseDerivedProperty(DerivedProperty object) {
				return createDerivedPropertyAdapter();
			}
			@Override
			public Adapter caseMoSystem(MoSystem object) {
				return createMoSystemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Monitoring.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Monitoring.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Monitoring.MonitorableElement <em>Monitorable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Monitoring.MonitorableElement
	 * @generated
	 */
	public Adapter createMonitorableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Monitoring.MOAgent <em>MO Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Monitoring.MOAgent
	 * @generated
	 */
	public Adapter createMOAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Monitoring.MOConfig <em>MO Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Monitoring.MOConfig
	 * @generated
	 */
	public Adapter createMOConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Monitoring.MOElement <em>MO Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Monitoring.MOElement
	 * @generated
	 */
	public Adapter createMOElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Monitoring.MOProperty <em>MO Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Monitoring.MOProperty
	 * @generated
	 */
	public Adapter createMOPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Monitoring.MOValue <em>MO Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Monitoring.MOValue
	 * @generated
	 */
	public Adapter createMOValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Monitoring.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Monitoring.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Monitoring.ConnectionOptions <em>Connection Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Monitoring.ConnectionOptions
	 * @generated
	 */
	public Adapter createConnectionOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Monitoring.DerivedProperty <em>Derived Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Monitoring.DerivedProperty
	 * @generated
	 */
	public Adapter createDerivedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Monitoring.MoSystem <em>Mo System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Monitoring.MoSystem
	 * @generated
	 */
	public Adapter createMoSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MonitoringAdapterFactory
