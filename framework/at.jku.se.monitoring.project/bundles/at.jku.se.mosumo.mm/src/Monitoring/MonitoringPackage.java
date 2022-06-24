/**
 */
package Monitoring;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Monitoring.MonitoringFactory
 * @model kind="package"
 * @generated
 */
public interface MonitoringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Monitoring";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.se.jku.at/monitoring/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "monitoring";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonitoringPackage eINSTANCE = Monitoring.impl.MonitoringPackageImpl.init();

	/**
	 * The meta object id for the '{@link Monitoring.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Monitoring.impl.NamedElementImpl
	 * @see Monitoring.impl.MonitoringPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Monitoring.impl.MonitorableElementImpl <em>Monitorable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Monitoring.impl.MonitorableElementImpl
	 * @see Monitoring.impl.MonitoringPackageImpl#getMonitorableElement()
	 * @generated
	 */
	int MONITORABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_ELEMENT__TOPIC = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_ELEMENT__SYNC = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Monitorable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Monitorable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Monitoring.impl.MOAgentImpl <em>MO Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Monitoring.impl.MOAgentImpl
	 * @see Monitoring.impl.MonitoringPackageImpl#getMOAgent()
	 * @generated
	 */
	int MO_AGENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_AGENT__NAME = MONITORABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_AGENT__TOPIC = MONITORABLE_ELEMENT__TOPIC;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_AGENT__SYNC = MONITORABLE_ELEMENT__SYNC;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_AGENT__ECLASS = MONITORABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_AGENT__ELEMENTS = MONITORABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_AGENT__SERVER = MONITORABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Derivedproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_AGENT__DERIVEDPROPERTIES = MONITORABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MO Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_AGENT_FEATURE_COUNT = MONITORABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>MO Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_AGENT_OPERATION_COUNT = MONITORABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Monitoring.impl.MOConfigImpl <em>MO Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Monitoring.impl.MOConfigImpl
	 * @see Monitoring.impl.MonitoringPackageImpl#getMOConfig()
	 * @generated
	 */
	int MO_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CONFIG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CONFIG__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CONFIG__SERVERS = 2;

	/**
	 * The feature id for the '<em><b>Default Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CONFIG__DEFAULT_SERVER = 3;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CONFIG__PROJECT_NAME = 4;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CONFIG__EPACKAGE = 5;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CONFIG__SYSTEM = 6;

	/**
	 * The number of structural features of the '<em>MO Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CONFIG_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>MO Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Monitoring.impl.MOElementImpl <em>MO Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Monitoring.impl.MOElementImpl
	 * @see Monitoring.impl.MonitoringPackageImpl#getMOElement()
	 * @generated
	 */
	int MO_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_ELEMENT__NAME = MONITORABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_ELEMENT__TOPIC = MONITORABLE_ELEMENT__TOPIC;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_ELEMENT__SYNC = MONITORABLE_ELEMENT__SYNC;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_ELEMENT__PROPERTIES = MONITORABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MO Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_ELEMENT_FEATURE_COUNT = MONITORABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MO Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_ELEMENT_OPERATION_COUNT = MONITORABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Monitoring.impl.MOPropertyImpl <em>MO Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Monitoring.impl.MOPropertyImpl
	 * @see Monitoring.impl.MonitoringPackageImpl#getMOProperty()
	 * @generated
	 */
	int MO_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_PROPERTY__NAME = MO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_PROPERTY__TOPIC = MO_ELEMENT__TOPIC;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_PROPERTY__SYNC = MO_ELEMENT__SYNC;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_PROPERTY__PROPERTIES = MO_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_PROPERTY__ECLASS = MO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MO Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_PROPERTY_FEATURE_COUNT = MO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MO Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_PROPERTY_OPERATION_COUNT = MO_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Monitoring.impl.MOValueImpl <em>MO Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Monitoring.impl.MOValueImpl
	 * @see Monitoring.impl.MonitoringPackageImpl#getMOValue()
	 * @generated
	 */
	int MO_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_VALUE__NAME = MO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_VALUE__TOPIC = MO_ELEMENT__TOPIC;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_VALUE__SYNC = MO_ELEMENT__SYNC;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_VALUE__PROPERTIES = MO_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_VALUE__EATTRIBUTE = MO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MO Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_VALUE_FEATURE_COUNT = MO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MO Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_VALUE_OPERATION_COUNT = MO_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Monitoring.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Monitoring.impl.ServerImpl
	 * @see Monitoring.impl.MonitoringPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTION_URL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTION_OPTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Monitoring.impl.ConnectionOptionsImpl <em>Connection Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Monitoring.impl.ConnectionOptionsImpl
	 * @see Monitoring.impl.MonitoringPackageImpl#getConnectionOptions()
	 * @generated
	 */
	int CONNECTION_OPTIONS = 8;

	/**
	 * The feature id for the '<em><b>Automatic Reconnect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPTIONS__AUTOMATIC_RECONNECT = 0;

	/**
	 * The feature id for the '<em><b>Clean Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPTIONS__CLEAN_SESSION = 1;

	/**
	 * The feature id for the '<em><b>Connection Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPTIONS__CONNECTION_TIME_OUT = 2;

	/**
	 * The feature id for the '<em><b>Set Max Inflight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPTIONS__SET_MAX_INFLIGHT = 3;

	/**
	 * The number of structural features of the '<em>Connection Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPTIONS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connection Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Monitoring.impl.DerivedPropertyImpl <em>Derived Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Monitoring.impl.DerivedPropertyImpl
	 * @see Monitoring.impl.MonitoringPackageImpl#getDerivedProperty()
	 * @generated
	 */
	int DERIVED_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_PROPERTY__NAME = MONITORABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_PROPERTY__TOPIC = MONITORABLE_ELEMENT__TOPIC;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_PROPERTY__SYNC = MONITORABLE_ELEMENT__SYNC;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_PROPERTY__ECLASS = MONITORABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_PROPERTY_FEATURE_COUNT = MONITORABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Derived Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_PROPERTY_OPERATION_COUNT = MONITORABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link Monitoring.impl.MoSystemImpl <em>Mo System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Monitoring.impl.MoSystemImpl
	 * @see Monitoring.impl.MonitoringPackageImpl#getMoSystem()
	 * @generated
	 */
	int MO_SYSTEM = 10;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_SYSTEM__ECLASS = 0;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_SYSTEM__AGENTS = 1;

	/**
	 * The number of structural features of the '<em>Mo System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mo System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_SYSTEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Monitoring.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see Monitoring.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Monitoring.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Monitoring.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link Monitoring.MonitorableElement <em>Monitorable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitorable Element</em>'.
	 * @see Monitoring.MonitorableElement
	 * @generated
	 */
	EClass getMonitorableElement();

	/**
	 * Returns the meta object for the attribute '{@link Monitoring.MonitorableElement#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see Monitoring.MonitorableElement#getTopic()
	 * @see #getMonitorableElement()
	 * @generated
	 */
	EAttribute getMonitorableElement_Topic();

	/**
	 * Returns the meta object for the attribute '{@link Monitoring.MonitorableElement#isSync <em>Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync</em>'.
	 * @see Monitoring.MonitorableElement#isSync()
	 * @see #getMonitorableElement()
	 * @generated
	 */
	EAttribute getMonitorableElement_Sync();

	/**
	 * Returns the meta object for class '{@link Monitoring.MOAgent <em>MO Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MO Agent</em>'.
	 * @see Monitoring.MOAgent
	 * @generated
	 */
	EClass getMOAgent();

	/**
	 * Returns the meta object for the reference '{@link Monitoring.MOAgent#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see Monitoring.MOAgent#getEClass()
	 * @see #getMOAgent()
	 * @generated
	 */
	EReference getMOAgent_EClass();

	/**
	 * Returns the meta object for the containment reference list '{@link Monitoring.MOAgent#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see Monitoring.MOAgent#getElements()
	 * @see #getMOAgent()
	 * @generated
	 */
	EReference getMOAgent_Elements();

	/**
	 * Returns the meta object for the reference '{@link Monitoring.MOAgent#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see Monitoring.MOAgent#getServer()
	 * @see #getMOAgent()
	 * @generated
	 */
	EReference getMOAgent_Server();

	/**
	 * Returns the meta object for the containment reference list '{@link Monitoring.MOAgent#getDerivedproperties <em>Derivedproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derivedproperties</em>'.
	 * @see Monitoring.MOAgent#getDerivedproperties()
	 * @see #getMOAgent()
	 * @generated
	 */
	EReference getMOAgent_Derivedproperties();

	/**
	 * Returns the meta object for class '{@link Monitoring.MOConfig <em>MO Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MO Config</em>'.
	 * @see Monitoring.MOConfig
	 * @generated
	 */
	EClass getMOConfig();

	/**
	 * Returns the meta object for the attribute '{@link Monitoring.MOConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Monitoring.MOConfig#getName()
	 * @see #getMOConfig()
	 * @generated
	 */
	EAttribute getMOConfig_Name();

	/**
	 * Returns the meta object for the attribute '{@link Monitoring.MOConfig#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see Monitoring.MOConfig#getNamespace()
	 * @see #getMOConfig()
	 * @generated
	 */
	EAttribute getMOConfig_Namespace();

	/**
	 * Returns the meta object for the containment reference list '{@link Monitoring.MOConfig#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see Monitoring.MOConfig#getServers()
	 * @see #getMOConfig()
	 * @generated
	 */
	EReference getMOConfig_Servers();

	/**
	 * Returns the meta object for the reference '{@link Monitoring.MOConfig#getDefaultServer <em>Default Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Server</em>'.
	 * @see Monitoring.MOConfig#getDefaultServer()
	 * @see #getMOConfig()
	 * @generated
	 */
	EReference getMOConfig_DefaultServer();

	/**
	 * Returns the meta object for the attribute '{@link Monitoring.MOConfig#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see Monitoring.MOConfig#getProjectName()
	 * @see #getMOConfig()
	 * @generated
	 */
	EAttribute getMOConfig_ProjectName();

	/**
	 * Returns the meta object for the reference '{@link Monitoring.MOConfig#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see Monitoring.MOConfig#getEPackage()
	 * @see #getMOConfig()
	 * @generated
	 */
	EReference getMOConfig_EPackage();

	/**
	 * Returns the meta object for the containment reference '{@link Monitoring.MOConfig#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see Monitoring.MOConfig#getSystem()
	 * @see #getMOConfig()
	 * @generated
	 */
	EReference getMOConfig_System();

	/**
	 * Returns the meta object for class '{@link Monitoring.MOElement <em>MO Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MO Element</em>'.
	 * @see Monitoring.MOElement
	 * @generated
	 */
	EClass getMOElement();

	/**
	 * Returns the meta object for the containment reference list '{@link Monitoring.MOElement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see Monitoring.MOElement#getProperties()
	 * @see #getMOElement()
	 * @generated
	 */
	EReference getMOElement_Properties();

	/**
	 * Returns the meta object for class '{@link Monitoring.MOProperty <em>MO Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MO Property</em>'.
	 * @see Monitoring.MOProperty
	 * @generated
	 */
	EClass getMOProperty();

	/**
	 * Returns the meta object for the reference '{@link Monitoring.MOProperty#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see Monitoring.MOProperty#getEClass()
	 * @see #getMOProperty()
	 * @generated
	 */
	EReference getMOProperty_EClass();

	/**
	 * Returns the meta object for class '{@link Monitoring.MOValue <em>MO Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MO Value</em>'.
	 * @see Monitoring.MOValue
	 * @generated
	 */
	EClass getMOValue();

	/**
	 * Returns the meta object for the reference '{@link Monitoring.MOValue#getEAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute</em>'.
	 * @see Monitoring.MOValue#getEAttribute()
	 * @see #getMOValue()
	 * @generated
	 */
	EReference getMOValue_EAttribute();

	/**
	 * Returns the meta object for class '{@link Monitoring.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see Monitoring.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link Monitoring.Server#getConnectionURL <em>Connection URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection URL</em>'.
	 * @see Monitoring.Server#getConnectionURL()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_ConnectionURL();

	/**
	 * Returns the meta object for the containment reference '{@link Monitoring.Server#getConnectionOptions <em>Connection Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Options</em>'.
	 * @see Monitoring.Server#getConnectionOptions()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_ConnectionOptions();

	/**
	 * Returns the meta object for class '{@link Monitoring.ConnectionOptions <em>Connection Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Options</em>'.
	 * @see Monitoring.ConnectionOptions
	 * @generated
	 */
	EClass getConnectionOptions();

	/**
	 * Returns the meta object for the attribute '{@link Monitoring.ConnectionOptions#isAutomaticReconnect <em>Automatic Reconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Reconnect</em>'.
	 * @see Monitoring.ConnectionOptions#isAutomaticReconnect()
	 * @see #getConnectionOptions()
	 * @generated
	 */
	EAttribute getConnectionOptions_AutomaticReconnect();

	/**
	 * Returns the meta object for the attribute '{@link Monitoring.ConnectionOptions#isCleanSession <em>Clean Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clean Session</em>'.
	 * @see Monitoring.ConnectionOptions#isCleanSession()
	 * @see #getConnectionOptions()
	 * @generated
	 */
	EAttribute getConnectionOptions_CleanSession();

	/**
	 * Returns the meta object for the attribute '{@link Monitoring.ConnectionOptions#getConnectionTimeOut <em>Connection Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Time Out</em>'.
	 * @see Monitoring.ConnectionOptions#getConnectionTimeOut()
	 * @see #getConnectionOptions()
	 * @generated
	 */
	EAttribute getConnectionOptions_ConnectionTimeOut();

	/**
	 * Returns the meta object for the attribute '{@link Monitoring.ConnectionOptions#getSetMaxInflight <em>Set Max Inflight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Max Inflight</em>'.
	 * @see Monitoring.ConnectionOptions#getSetMaxInflight()
	 * @see #getConnectionOptions()
	 * @generated
	 */
	EAttribute getConnectionOptions_SetMaxInflight();

	/**
	 * Returns the meta object for class '{@link Monitoring.DerivedProperty <em>Derived Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Property</em>'.
	 * @see Monitoring.DerivedProperty
	 * @generated
	 */
	EClass getDerivedProperty();

	/**
	 * Returns the meta object for the reference '{@link Monitoring.DerivedProperty#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see Monitoring.DerivedProperty#getEClass()
	 * @see #getDerivedProperty()
	 * @generated
	 */
	EReference getDerivedProperty_EClass();

	/**
	 * Returns the meta object for class '{@link Monitoring.MoSystem <em>Mo System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo System</em>'.
	 * @see Monitoring.MoSystem
	 * @generated
	 */
	EClass getMoSystem();

	/**
	 * Returns the meta object for the reference '{@link Monitoring.MoSystem#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see Monitoring.MoSystem#getEClass()
	 * @see #getMoSystem()
	 * @generated
	 */
	EReference getMoSystem_EClass();

	/**
	 * Returns the meta object for the containment reference list '{@link Monitoring.MoSystem#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see Monitoring.MoSystem#getAgents()
	 * @see #getMoSystem()
	 * @generated
	 */
	EReference getMoSystem_Agents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MonitoringFactory getMonitoringFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Monitoring.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Monitoring.impl.NamedElementImpl
		 * @see Monitoring.impl.MonitoringPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link Monitoring.impl.MonitorableElementImpl <em>Monitorable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Monitoring.impl.MonitorableElementImpl
		 * @see Monitoring.impl.MonitoringPackageImpl#getMonitorableElement()
		 * @generated
		 */
		EClass MONITORABLE_ELEMENT = eINSTANCE.getMonitorableElement();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORABLE_ELEMENT__TOPIC = eINSTANCE.getMonitorableElement_Topic();

		/**
		 * The meta object literal for the '<em><b>Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORABLE_ELEMENT__SYNC = eINSTANCE.getMonitorableElement_Sync();

		/**
		 * The meta object literal for the '{@link Monitoring.impl.MOAgentImpl <em>MO Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Monitoring.impl.MOAgentImpl
		 * @see Monitoring.impl.MonitoringPackageImpl#getMOAgent()
		 * @generated
		 */
		EClass MO_AGENT = eINSTANCE.getMOAgent();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_AGENT__ECLASS = eINSTANCE.getMOAgent_EClass();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_AGENT__ELEMENTS = eINSTANCE.getMOAgent_Elements();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_AGENT__SERVER = eINSTANCE.getMOAgent_Server();

		/**
		 * The meta object literal for the '<em><b>Derivedproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_AGENT__DERIVEDPROPERTIES = eINSTANCE.getMOAgent_Derivedproperties();

		/**
		 * The meta object literal for the '{@link Monitoring.impl.MOConfigImpl <em>MO Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Monitoring.impl.MOConfigImpl
		 * @see Monitoring.impl.MonitoringPackageImpl#getMOConfig()
		 * @generated
		 */
		EClass MO_CONFIG = eINSTANCE.getMOConfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO_CONFIG__NAME = eINSTANCE.getMOConfig_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO_CONFIG__NAMESPACE = eINSTANCE.getMOConfig_Namespace();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CONFIG__SERVERS = eINSTANCE.getMOConfig_Servers();

		/**
		 * The meta object literal for the '<em><b>Default Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CONFIG__DEFAULT_SERVER = eINSTANCE.getMOConfig_DefaultServer();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO_CONFIG__PROJECT_NAME = eINSTANCE.getMOConfig_ProjectName();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CONFIG__EPACKAGE = eINSTANCE.getMOConfig_EPackage();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CONFIG__SYSTEM = eINSTANCE.getMOConfig_System();

		/**
		 * The meta object literal for the '{@link Monitoring.impl.MOElementImpl <em>MO Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Monitoring.impl.MOElementImpl
		 * @see Monitoring.impl.MonitoringPackageImpl#getMOElement()
		 * @generated
		 */
		EClass MO_ELEMENT = eINSTANCE.getMOElement();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_ELEMENT__PROPERTIES = eINSTANCE.getMOElement_Properties();

		/**
		 * The meta object literal for the '{@link Monitoring.impl.MOPropertyImpl <em>MO Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Monitoring.impl.MOPropertyImpl
		 * @see Monitoring.impl.MonitoringPackageImpl#getMOProperty()
		 * @generated
		 */
		EClass MO_PROPERTY = eINSTANCE.getMOProperty();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_PROPERTY__ECLASS = eINSTANCE.getMOProperty_EClass();

		/**
		 * The meta object literal for the '{@link Monitoring.impl.MOValueImpl <em>MO Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Monitoring.impl.MOValueImpl
		 * @see Monitoring.impl.MonitoringPackageImpl#getMOValue()
		 * @generated
		 */
		EClass MO_VALUE = eINSTANCE.getMOValue();

		/**
		 * The meta object literal for the '<em><b>EAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_VALUE__EATTRIBUTE = eINSTANCE.getMOValue_EAttribute();

		/**
		 * The meta object literal for the '{@link Monitoring.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Monitoring.impl.ServerImpl
		 * @see Monitoring.impl.MonitoringPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Connection URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__CONNECTION_URL = eINSTANCE.getServer_ConnectionURL();

		/**
		 * The meta object literal for the '<em><b>Connection Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CONNECTION_OPTIONS = eINSTANCE.getServer_ConnectionOptions();

		/**
		 * The meta object literal for the '{@link Monitoring.impl.ConnectionOptionsImpl <em>Connection Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Monitoring.impl.ConnectionOptionsImpl
		 * @see Monitoring.impl.MonitoringPackageImpl#getConnectionOptions()
		 * @generated
		 */
		EClass CONNECTION_OPTIONS = eINSTANCE.getConnectionOptions();

		/**
		 * The meta object literal for the '<em><b>Automatic Reconnect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_OPTIONS__AUTOMATIC_RECONNECT = eINSTANCE.getConnectionOptions_AutomaticReconnect();

		/**
		 * The meta object literal for the '<em><b>Clean Session</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_OPTIONS__CLEAN_SESSION = eINSTANCE.getConnectionOptions_CleanSession();

		/**
		 * The meta object literal for the '<em><b>Connection Time Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_OPTIONS__CONNECTION_TIME_OUT = eINSTANCE.getConnectionOptions_ConnectionTimeOut();

		/**
		 * The meta object literal for the '<em><b>Set Max Inflight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_OPTIONS__SET_MAX_INFLIGHT = eINSTANCE.getConnectionOptions_SetMaxInflight();

		/**
		 * The meta object literal for the '{@link Monitoring.impl.DerivedPropertyImpl <em>Derived Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Monitoring.impl.DerivedPropertyImpl
		 * @see Monitoring.impl.MonitoringPackageImpl#getDerivedProperty()
		 * @generated
		 */
		EClass DERIVED_PROPERTY = eINSTANCE.getDerivedProperty();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_PROPERTY__ECLASS = eINSTANCE.getDerivedProperty_EClass();

		/**
		 * The meta object literal for the '{@link Monitoring.impl.MoSystemImpl <em>Mo System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Monitoring.impl.MoSystemImpl
		 * @see Monitoring.impl.MonitoringPackageImpl#getMoSystem()
		 * @generated
		 */
		EClass MO_SYSTEM = eINSTANCE.getMoSystem();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_SYSTEM__ECLASS = eINSTANCE.getMoSystem_EClass();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_SYSTEM__AGENTS = eINSTANCE.getMoSystem_Agents();

	}

} //MonitoringPackage
