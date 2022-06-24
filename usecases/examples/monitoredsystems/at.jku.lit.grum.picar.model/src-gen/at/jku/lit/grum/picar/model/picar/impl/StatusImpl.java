/**
 */
package at.jku.lit.grum.picar.model.picar.impl;

import at.jku.lit.grum.picar.model.picar.PicarPackage;
import at.jku.lit.grum.picar.model.picar.Status;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.impl.StatusImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.impl.StatusImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.impl.StatusImpl#getOperationmode <em>Operationmode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusImpl extends MinimalEObjectImpl.Container implements Status {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected boolean initialized = INITIALIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationmode() <em>Operationmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationmode()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATIONMODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationmode() <em>Operationmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationmode()
	 * @generated
	 * @ordered
	 */
	protected String operationmode = OPERATIONMODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicarPackage.Literals.STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicarPackage.STATUS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialized(boolean newInitialized) {
		boolean oldInitialized = initialized;
		initialized = newInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicarPackage.STATUS__INITIALIZED, oldInitialized,
					initialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationmode() {
		return operationmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationmode(String newOperationmode) {
		String oldOperationmode = operationmode;
		operationmode = newOperationmode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicarPackage.STATUS__OPERATIONMODE, oldOperationmode,
					operationmode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PicarPackage.STATUS__ID:
			return getId();
		case PicarPackage.STATUS__INITIALIZED:
			return isInitialized();
		case PicarPackage.STATUS__OPERATIONMODE:
			return getOperationmode();
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
		case PicarPackage.STATUS__ID:
			setId((String) newValue);
			return;
		case PicarPackage.STATUS__INITIALIZED:
			setInitialized((Boolean) newValue);
			return;
		case PicarPackage.STATUS__OPERATIONMODE:
			setOperationmode((String) newValue);
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
		case PicarPackage.STATUS__ID:
			setId(ID_EDEFAULT);
			return;
		case PicarPackage.STATUS__INITIALIZED:
			setInitialized(INITIALIZED_EDEFAULT);
			return;
		case PicarPackage.STATUS__OPERATIONMODE:
			setOperationmode(OPERATIONMODE_EDEFAULT);
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
		case PicarPackage.STATUS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case PicarPackage.STATUS__INITIALIZED:
			return initialized != INITIALIZED_EDEFAULT;
		case PicarPackage.STATUS__OPERATIONMODE:
			return OPERATIONMODE_EDEFAULT == null ? operationmode != null
					: !OPERATIONMODE_EDEFAULT.equals(operationmode);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", initialized: ");
		result.append(initialized);
		result.append(", operationmode: ");
		result.append(operationmode);
		result.append(')');
		return result.toString();
	}

} //StatusImpl
