/**
 */
package Monitoring.impl;

import Monitoring.ConnectionOptions;
import Monitoring.MonitoringPackage;
import Monitoring.Server;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Monitoring.impl.ServerImpl#getConnectionURL <em>Connection URL</em>}</li>
 *   <li>{@link Monitoring.impl.ServerImpl#getConnectionOptions <em>Connection Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends NamedElementImpl implements Server {
	/**
	 * The default value of the '{@link #getConnectionURL() <em>Connection URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionURL()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionURL() <em>Connection URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionURL()
	 * @generated
	 * @ordered
	 */
	protected String connectionURL = CONNECTION_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectionOptions() <em>Connection Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionOptions()
	 * @generated
	 * @ordered
	 */
	protected ConnectionOptions connectionOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitoringPackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectionURL() {
		return connectionURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionURL(String newConnectionURL) {
		String oldConnectionURL = connectionURL;
		connectionURL = newConnectionURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SERVER__CONNECTION_URL, oldConnectionURL, connectionURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionOptions getConnectionOptions() {
		return connectionOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionOptions(ConnectionOptions newConnectionOptions, NotificationChain msgs) {
		ConnectionOptions oldConnectionOptions = connectionOptions;
		connectionOptions = newConnectionOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MonitoringPackage.SERVER__CONNECTION_OPTIONS, oldConnectionOptions, newConnectionOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionOptions(ConnectionOptions newConnectionOptions) {
		if (newConnectionOptions != connectionOptions) {
			NotificationChain msgs = null;
			if (connectionOptions != null)
				msgs = ((InternalEObject)connectionOptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MonitoringPackage.SERVER__CONNECTION_OPTIONS, null, msgs);
			if (newConnectionOptions != null)
				msgs = ((InternalEObject)newConnectionOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MonitoringPackage.SERVER__CONNECTION_OPTIONS, null, msgs);
			msgs = basicSetConnectionOptions(newConnectionOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SERVER__CONNECTION_OPTIONS, newConnectionOptions, newConnectionOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MonitoringPackage.SERVER__CONNECTION_OPTIONS:
				return basicSetConnectionOptions(null, msgs);
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
			case MonitoringPackage.SERVER__CONNECTION_URL:
				return getConnectionURL();
			case MonitoringPackage.SERVER__CONNECTION_OPTIONS:
				return getConnectionOptions();
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
			case MonitoringPackage.SERVER__CONNECTION_URL:
				setConnectionURL((String)newValue);
				return;
			case MonitoringPackage.SERVER__CONNECTION_OPTIONS:
				setConnectionOptions((ConnectionOptions)newValue);
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
			case MonitoringPackage.SERVER__CONNECTION_URL:
				setConnectionURL(CONNECTION_URL_EDEFAULT);
				return;
			case MonitoringPackage.SERVER__CONNECTION_OPTIONS:
				setConnectionOptions((ConnectionOptions)null);
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
			case MonitoringPackage.SERVER__CONNECTION_URL:
				return CONNECTION_URL_EDEFAULT == null ? connectionURL != null : !CONNECTION_URL_EDEFAULT.equals(connectionURL);
			case MonitoringPackage.SERVER__CONNECTION_OPTIONS:
				return connectionOptions != null;
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
		result.append(" (connectionURL: ");
		result.append(connectionURL);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
