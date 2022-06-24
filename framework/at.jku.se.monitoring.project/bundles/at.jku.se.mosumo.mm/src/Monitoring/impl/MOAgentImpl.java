/**
 */
package Monitoring.impl;

import Monitoring.DerivedProperty;
import Monitoring.MOAgent;
import Monitoring.MOElement;
import Monitoring.MonitoringPackage;
import Monitoring.Server;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MO Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Monitoring.impl.MOAgentImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link Monitoring.impl.MOAgentImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link Monitoring.impl.MOAgentImpl#getServer <em>Server</em>}</li>
 *   <li>{@link Monitoring.impl.MOAgentImpl#getDerivedproperties <em>Derivedproperties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MOAgentImpl extends MonitorableElementImpl implements MOAgent {
	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MOElement> elements;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected Server server;

	/**
	 * The cached value of the '{@link #getDerivedproperties() <em>Derivedproperties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedproperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DerivedProperty> derivedproperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MOAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitoringPackage.Literals.MO_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MonitoringPackage.MO_AGENT__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.MO_AGENT__ECLASS, oldEClass, eClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MOElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<MOElement>(MOElement.class, this, MonitoringPackage.MO_AGENT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (Server)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MonitoringPackage.MO_AGENT__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		Server oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.MO_AGENT__SERVER, oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DerivedProperty> getDerivedproperties() {
		if (derivedproperties == null) {
			derivedproperties = new EObjectContainmentEList<DerivedProperty>(DerivedProperty.class, this, MonitoringPackage.MO_AGENT__DERIVEDPROPERTIES);
		}
		return derivedproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MonitoringPackage.MO_AGENT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case MonitoringPackage.MO_AGENT__DERIVEDPROPERTIES:
				return ((InternalEList<?>)getDerivedproperties()).basicRemove(otherEnd, msgs);
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
			case MonitoringPackage.MO_AGENT__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case MonitoringPackage.MO_AGENT__ELEMENTS:
				return getElements();
			case MonitoringPackage.MO_AGENT__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
			case MonitoringPackage.MO_AGENT__DERIVEDPROPERTIES:
				return getDerivedproperties();
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
			case MonitoringPackage.MO_AGENT__ECLASS:
				setEClass((EClass)newValue);
				return;
			case MonitoringPackage.MO_AGENT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends MOElement>)newValue);
				return;
			case MonitoringPackage.MO_AGENT__SERVER:
				setServer((Server)newValue);
				return;
			case MonitoringPackage.MO_AGENT__DERIVEDPROPERTIES:
				getDerivedproperties().clear();
				getDerivedproperties().addAll((Collection<? extends DerivedProperty>)newValue);
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
			case MonitoringPackage.MO_AGENT__ECLASS:
				setEClass((EClass)null);
				return;
			case MonitoringPackage.MO_AGENT__ELEMENTS:
				getElements().clear();
				return;
			case MonitoringPackage.MO_AGENT__SERVER:
				setServer((Server)null);
				return;
			case MonitoringPackage.MO_AGENT__DERIVEDPROPERTIES:
				getDerivedproperties().clear();
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
			case MonitoringPackage.MO_AGENT__ECLASS:
				return eClass != null;
			case MonitoringPackage.MO_AGENT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case MonitoringPackage.MO_AGENT__SERVER:
				return server != null;
			case MonitoringPackage.MO_AGENT__DERIVEDPROPERTIES:
				return derivedproperties != null && !derivedproperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MOAgentImpl
