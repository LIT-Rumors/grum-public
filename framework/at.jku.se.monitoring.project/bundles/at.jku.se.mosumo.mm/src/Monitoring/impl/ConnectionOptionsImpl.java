/**
 */
package Monitoring.impl;

import Monitoring.ConnectionOptions;
import Monitoring.MonitoringPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Monitoring.impl.ConnectionOptionsImpl#isAutomaticReconnect <em>Automatic Reconnect</em>}</li>
 *   <li>{@link Monitoring.impl.ConnectionOptionsImpl#isCleanSession <em>Clean Session</em>}</li>
 *   <li>{@link Monitoring.impl.ConnectionOptionsImpl#getConnectionTimeOut <em>Connection Time Out</em>}</li>
 *   <li>{@link Monitoring.impl.ConnectionOptionsImpl#getSetMaxInflight <em>Set Max Inflight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionOptionsImpl extends MinimalEObjectImpl.Container implements ConnectionOptions {
	/**
	 * The default value of the '{@link #isAutomaticReconnect() <em>Automatic Reconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticReconnect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATIC_RECONNECT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutomaticReconnect() <em>Automatic Reconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticReconnect()
	 * @generated
	 * @ordered
	 */
	protected boolean automaticReconnect = AUTOMATIC_RECONNECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCleanSession() <em>Clean Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanSession()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLEAN_SESSION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCleanSession() <em>Clean Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanSession()
	 * @generated
	 * @ordered
	 */
	protected boolean cleanSession = CLEAN_SESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionTimeOut() <em>Connection Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONNECTION_TIME_OUT_EDEFAULT = new Integer(10);

	/**
	 * The cached value of the '{@link #getConnectionTimeOut() <em>Connection Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeOut()
	 * @generated
	 * @ordered
	 */
	protected Integer connectionTimeOut = CONNECTION_TIME_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetMaxInflight() <em>Set Max Inflight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetMaxInflight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SET_MAX_INFLIGHT_EDEFAULT = new Integer(50);

	/**
	 * The cached value of the '{@link #getSetMaxInflight() <em>Set Max Inflight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetMaxInflight()
	 * @generated
	 * @ordered
	 */
	protected Integer setMaxInflight = SET_MAX_INFLIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitoringPackage.Literals.CONNECTION_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutomaticReconnect() {
		return automaticReconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticReconnect(boolean newAutomaticReconnect) {
		boolean oldAutomaticReconnect = automaticReconnect;
		automaticReconnect = newAutomaticReconnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.CONNECTION_OPTIONS__AUTOMATIC_RECONNECT, oldAutomaticReconnect, automaticReconnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCleanSession() {
		return cleanSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCleanSession(boolean newCleanSession) {
		boolean oldCleanSession = cleanSession;
		cleanSession = newCleanSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.CONNECTION_OPTIONS__CLEAN_SESSION, oldCleanSession, cleanSession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getConnectionTimeOut() {
		return connectionTimeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionTimeOut(Integer newConnectionTimeOut) {
		Integer oldConnectionTimeOut = connectionTimeOut;
		connectionTimeOut = newConnectionTimeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.CONNECTION_OPTIONS__CONNECTION_TIME_OUT, oldConnectionTimeOut, connectionTimeOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSetMaxInflight() {
		return setMaxInflight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetMaxInflight(Integer newSetMaxInflight) {
		Integer oldSetMaxInflight = setMaxInflight;
		setMaxInflight = newSetMaxInflight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.CONNECTION_OPTIONS__SET_MAX_INFLIGHT, oldSetMaxInflight, setMaxInflight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MonitoringPackage.CONNECTION_OPTIONS__AUTOMATIC_RECONNECT:
				return isAutomaticReconnect();
			case MonitoringPackage.CONNECTION_OPTIONS__CLEAN_SESSION:
				return isCleanSession();
			case MonitoringPackage.CONNECTION_OPTIONS__CONNECTION_TIME_OUT:
				return getConnectionTimeOut();
			case MonitoringPackage.CONNECTION_OPTIONS__SET_MAX_INFLIGHT:
				return getSetMaxInflight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MonitoringPackage.CONNECTION_OPTIONS__AUTOMATIC_RECONNECT:
				setAutomaticReconnect((Boolean)newValue);
				return;
			case MonitoringPackage.CONNECTION_OPTIONS__CLEAN_SESSION:
				setCleanSession((Boolean)newValue);
				return;
			case MonitoringPackage.CONNECTION_OPTIONS__CONNECTION_TIME_OUT:
				setConnectionTimeOut((Integer)newValue);
				return;
			case MonitoringPackage.CONNECTION_OPTIONS__SET_MAX_INFLIGHT:
				setSetMaxInflight((Integer)newValue);
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
			case MonitoringPackage.CONNECTION_OPTIONS__AUTOMATIC_RECONNECT:
				setAutomaticReconnect(AUTOMATIC_RECONNECT_EDEFAULT);
				return;
			case MonitoringPackage.CONNECTION_OPTIONS__CLEAN_SESSION:
				setCleanSession(CLEAN_SESSION_EDEFAULT);
				return;
			case MonitoringPackage.CONNECTION_OPTIONS__CONNECTION_TIME_OUT:
				setConnectionTimeOut(CONNECTION_TIME_OUT_EDEFAULT);
				return;
			case MonitoringPackage.CONNECTION_OPTIONS__SET_MAX_INFLIGHT:
				setSetMaxInflight(SET_MAX_INFLIGHT_EDEFAULT);
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
			case MonitoringPackage.CONNECTION_OPTIONS__AUTOMATIC_RECONNECT:
				return automaticReconnect != AUTOMATIC_RECONNECT_EDEFAULT;
			case MonitoringPackage.CONNECTION_OPTIONS__CLEAN_SESSION:
				return cleanSession != CLEAN_SESSION_EDEFAULT;
			case MonitoringPackage.CONNECTION_OPTIONS__CONNECTION_TIME_OUT:
				return CONNECTION_TIME_OUT_EDEFAULT == null ? connectionTimeOut != null : !CONNECTION_TIME_OUT_EDEFAULT.equals(connectionTimeOut);
			case MonitoringPackage.CONNECTION_OPTIONS__SET_MAX_INFLIGHT:
				return SET_MAX_INFLIGHT_EDEFAULT == null ? setMaxInflight != null : !SET_MAX_INFLIGHT_EDEFAULT.equals(setMaxInflight);
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
		result.append(" (automaticReconnect: ");
		result.append(automaticReconnect);
		result.append(", cleanSession: ");
		result.append(cleanSession);
		result.append(", connectionTimeOut: ");
		result.append(connectionTimeOut);
		result.append(", setMaxInflight: ");
		result.append(setMaxInflight);
		result.append(')');
		return result.toString();
	}

} //ConnectionOptionsImpl
