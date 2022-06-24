/**
 */
package Monitoring.impl;

import Monitoring.MOConfig;
import Monitoring.MoSystem;
import Monitoring.MonitoringPackage;
import Monitoring.Server;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MO Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Monitoring.impl.MOConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link Monitoring.impl.MOConfigImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link Monitoring.impl.MOConfigImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link Monitoring.impl.MOConfigImpl#getDefaultServer <em>Default Server</em>}</li>
 *   <li>{@link Monitoring.impl.MOConfigImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link Monitoring.impl.MOConfigImpl#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link Monitoring.impl.MOConfigImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MOConfigImpl extends MinimalEObjectImpl.Container implements MOConfig {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> servers;

	/**
	 * The cached value of the '{@link #getDefaultServer() <em>Default Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultServer()
	 * @generated
	 * @ordered
	 */
	protected Server defaultServer;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEPackage() <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage ePackage;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected MoSystem system;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MOConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitoringPackage.Literals.MO_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.MO_CONFIG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.MO_CONFIG__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Server> getServers() {
		if (servers == null) {
			servers = new EObjectContainmentEList<Server>(Server.class, this, MonitoringPackage.MO_CONFIG__SERVERS);
		}
		return servers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getDefaultServer() {
		if (defaultServer != null && defaultServer.eIsProxy()) {
			InternalEObject oldDefaultServer = (InternalEObject)defaultServer;
			defaultServer = (Server)eResolveProxy(oldDefaultServer);
			if (defaultServer != oldDefaultServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MonitoringPackage.MO_CONFIG__DEFAULT_SERVER, oldDefaultServer, defaultServer));
			}
		}
		return defaultServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetDefaultServer() {
		return defaultServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultServer(Server newDefaultServer) {
		Server oldDefaultServer = defaultServer;
		defaultServer = newDefaultServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.MO_CONFIG__DEFAULT_SERVER, oldDefaultServer, defaultServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.MO_CONFIG__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getEPackage() {
		if (ePackage != null && ePackage.eIsProxy()) {
			InternalEObject oldEPackage = (InternalEObject)ePackage;
			ePackage = (EPackage)eResolveProxy(oldEPackage);
			if (ePackage != oldEPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MonitoringPackage.MO_CONFIG__EPACKAGE, oldEPackage, ePackage));
			}
		}
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetEPackage() {
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEPackage(EPackage newEPackage) {
		EPackage oldEPackage = ePackage;
		ePackage = newEPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.MO_CONFIG__EPACKAGE, oldEPackage, ePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoSystem getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(MoSystem newSystem, NotificationChain msgs) {
		MoSystem oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MonitoringPackage.MO_CONFIG__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(MoSystem newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MonitoringPackage.MO_CONFIG__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MonitoringPackage.MO_CONFIG__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.MO_CONFIG__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MonitoringPackage.MO_CONFIG__SERVERS:
				return ((InternalEList<?>)getServers()).basicRemove(otherEnd, msgs);
			case MonitoringPackage.MO_CONFIG__SYSTEM:
				return basicSetSystem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MonitoringPackage.MO_CONFIG__NAME:
				return getName();
			case MonitoringPackage.MO_CONFIG__NAMESPACE:
				return getNamespace();
			case MonitoringPackage.MO_CONFIG__SERVERS:
				return getServers();
			case MonitoringPackage.MO_CONFIG__DEFAULT_SERVER:
				if (resolve) return getDefaultServer();
				return basicGetDefaultServer();
			case MonitoringPackage.MO_CONFIG__PROJECT_NAME:
				return getProjectName();
			case MonitoringPackage.MO_CONFIG__EPACKAGE:
				if (resolve) return getEPackage();
				return basicGetEPackage();
			case MonitoringPackage.MO_CONFIG__SYSTEM:
				return getSystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MonitoringPackage.MO_CONFIG__NAME:
				setName((String)newValue);
				return;
			case MonitoringPackage.MO_CONFIG__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case MonitoringPackage.MO_CONFIG__SERVERS:
				getServers().clear();
				getServers().addAll((Collection<? extends Server>)newValue);
				return;
			case MonitoringPackage.MO_CONFIG__DEFAULT_SERVER:
				setDefaultServer((Server)newValue);
				return;
			case MonitoringPackage.MO_CONFIG__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case MonitoringPackage.MO_CONFIG__EPACKAGE:
				setEPackage((EPackage)newValue);
				return;
			case MonitoringPackage.MO_CONFIG__SYSTEM:
				setSystem((MoSystem)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MonitoringPackage.MO_CONFIG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MonitoringPackage.MO_CONFIG__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case MonitoringPackage.MO_CONFIG__SERVERS:
				getServers().clear();
				return;
			case MonitoringPackage.MO_CONFIG__DEFAULT_SERVER:
				setDefaultServer((Server)null);
				return;
			case MonitoringPackage.MO_CONFIG__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case MonitoringPackage.MO_CONFIG__EPACKAGE:
				setEPackage((EPackage)null);
				return;
			case MonitoringPackage.MO_CONFIG__SYSTEM:
				setSystem((MoSystem)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MonitoringPackage.MO_CONFIG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MonitoringPackage.MO_CONFIG__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case MonitoringPackage.MO_CONFIG__SERVERS:
				return servers != null && !servers.isEmpty();
			case MonitoringPackage.MO_CONFIG__DEFAULT_SERVER:
				return defaultServer != null;
			case MonitoringPackage.MO_CONFIG__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case MonitoringPackage.MO_CONFIG__EPACKAGE:
				return ePackage != null;
			case MonitoringPackage.MO_CONFIG__SYSTEM:
				return system != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(')');
		return result.toString();
	}

} //MOConfigImpl
