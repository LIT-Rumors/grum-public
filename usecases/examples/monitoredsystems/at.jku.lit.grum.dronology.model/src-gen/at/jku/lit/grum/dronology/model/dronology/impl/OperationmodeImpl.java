/**
 */
package at.jku.lit.grum.dronology.model.dronology.impl;

import at.jku.lit.grum.dronology.model.dronology.DronologyPackage;
import at.jku.lit.grum.dronology.model.dronology.Operationmode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operationmode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.OperationmodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.OperationmodeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.OperationmodeImpl#isIsInMission <em>Is In Mission</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.OperationmodeImpl#getMissionName <em>Mission Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationmodeImpl extends MinimalEObjectImpl.Container implements Operationmode {
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
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInMission() <em>Is In Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInMission()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IN_MISSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInMission() <em>Is In Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInMission()
	 * @generated
	 * @ordered
	 */
	protected boolean isInMission = IS_IN_MISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissionName() <em>Mission Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionName()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissionName() <em>Mission Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionName()
	 * @generated
	 * @ordered
	 */
	protected String missionName = MISSION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationmodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronologyPackage.Literals.OPERATIONMODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.OPERATIONMODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.OPERATIONMODE__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInMission() {
		return isInMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInMission(boolean newIsInMission) {
		boolean oldIsInMission = isInMission;
		isInMission = newIsInMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.OPERATIONMODE__IS_IN_MISSION,
					oldIsInMission, isInMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMissionName() {
		return missionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionName(String newMissionName) {
		String oldMissionName = missionName;
		missionName = newMissionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.OPERATIONMODE__MISSION_NAME,
					oldMissionName, missionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DronologyPackage.OPERATIONMODE__ID:
			return getId();
		case DronologyPackage.OPERATIONMODE__MODE:
			return getMode();
		case DronologyPackage.OPERATIONMODE__IS_IN_MISSION:
			return isIsInMission();
		case DronologyPackage.OPERATIONMODE__MISSION_NAME:
			return getMissionName();
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
		case DronologyPackage.OPERATIONMODE__ID:
			setId((String) newValue);
			return;
		case DronologyPackage.OPERATIONMODE__MODE:
			setMode((String) newValue);
			return;
		case DronologyPackage.OPERATIONMODE__IS_IN_MISSION:
			setIsInMission((Boolean) newValue);
			return;
		case DronologyPackage.OPERATIONMODE__MISSION_NAME:
			setMissionName((String) newValue);
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
		case DronologyPackage.OPERATIONMODE__ID:
			setId(ID_EDEFAULT);
			return;
		case DronologyPackage.OPERATIONMODE__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case DronologyPackage.OPERATIONMODE__IS_IN_MISSION:
			setIsInMission(IS_IN_MISSION_EDEFAULT);
			return;
		case DronologyPackage.OPERATIONMODE__MISSION_NAME:
			setMissionName(MISSION_NAME_EDEFAULT);
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
		case DronologyPackage.OPERATIONMODE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DronologyPackage.OPERATIONMODE__MODE:
			return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
		case DronologyPackage.OPERATIONMODE__IS_IN_MISSION:
			return isInMission != IS_IN_MISSION_EDEFAULT;
		case DronologyPackage.OPERATIONMODE__MISSION_NAME:
			return MISSION_NAME_EDEFAULT == null ? missionName != null : !MISSION_NAME_EDEFAULT.equals(missionName);
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
		result.append(", mode: ");
		result.append(mode);
		result.append(", isInMission: ");
		result.append(isInMission);
		result.append(", missionName: ");
		result.append(missionName);
		result.append(')');
		return result.toString();
	}

} //OperationmodeImpl
