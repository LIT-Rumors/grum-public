/**
 */
package Monitoring.impl;

import Monitoring.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonitoringFactoryImpl extends EFactoryImpl implements MonitoringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MonitoringFactory init() {
		try {
			MonitoringFactory theMonitoringFactory = (MonitoringFactory)EPackage.Registry.INSTANCE.getEFactory(MonitoringPackage.eNS_URI);
			if (theMonitoringFactory != null) {
				return theMonitoringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MonitoringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MonitoringPackage.MO_AGENT: return createMOAgent();
			case MonitoringPackage.MO_CONFIG: return createMOConfig();
			case MonitoringPackage.MO_PROPERTY: return createMOProperty();
			case MonitoringPackage.MO_VALUE: return createMOValue();
			case MonitoringPackage.SERVER: return createServer();
			case MonitoringPackage.CONNECTION_OPTIONS: return createConnectionOptions();
			case MonitoringPackage.DERIVED_PROPERTY: return createDerivedProperty();
			case MonitoringPackage.MO_SYSTEM: return createMoSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOAgent createMOAgent() {
		MOAgentImpl moAgent = new MOAgentImpl();
		return moAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOConfig createMOConfig() {
		MOConfigImpl moConfig = new MOConfigImpl();
		return moConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOProperty createMOProperty() {
		MOPropertyImpl moProperty = new MOPropertyImpl();
		return moProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOValue createMOValue() {
		MOValueImpl moValue = new MOValueImpl();
		return moValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionOptions createConnectionOptions() {
		ConnectionOptionsImpl connectionOptions = new ConnectionOptionsImpl();
		return connectionOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedProperty createDerivedProperty() {
		DerivedPropertyImpl derivedProperty = new DerivedPropertyImpl();
		return derivedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoSystem createMoSystem() {
		MoSystemImpl moSystem = new MoSystemImpl();
		return moSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringPackage getMonitoringPackage() {
		return (MonitoringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MonitoringPackage getPackage() {
		return MonitoringPackage.eINSTANCE;
	}

} //MonitoringFactoryImpl
