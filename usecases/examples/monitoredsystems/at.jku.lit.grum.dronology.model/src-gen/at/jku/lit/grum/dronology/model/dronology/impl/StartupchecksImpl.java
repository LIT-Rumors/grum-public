/**
 */
package at.jku.lit.grum.dronology.model.dronology.impl;

import at.jku.lit.grum.dronology.model.dronology.DronologyPackage;
import at.jku.lit.grum.dronology.model.dronology.FlightMode;
import at.jku.lit.grum.dronology.model.dronology.Startupchecks;
import at.jku.lit.grum.dronology.model.dronology.SystemStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Startupchecks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.StartupchecksImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.StartupchecksImpl#getArmingstatus <em>Armingstatus</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.StartupchecksImpl#getSystemstatus <em>Systemstatus</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.StartupchecksImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.StartupchecksImpl#getNum_satellites <em>Num satellites</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.StartupchecksImpl#getArmable <em>Armable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartupchecksImpl extends MinimalEObjectImpl.Container implements Startupchecks {
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
	 * The default value of the '{@link #getArmingstatus() <em>Armingstatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmingstatus()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ARMINGSTATUS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getArmingstatus() <em>Armingstatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmingstatus()
	 * @generated
	 * @ordered
	 */
	protected Boolean armingstatus = ARMINGSTATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemstatus() <em>Systemstatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemstatus()
	 * @generated
	 * @ordered
	 */
	protected static final SystemStatus SYSTEMSTATUS_EDEFAULT = SystemStatus.STANDBY;

	/**
	 * The cached value of the '{@link #getSystemstatus() <em>Systemstatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemstatus()
	 * @generated
	 * @ordered
	 */
	protected SystemStatus systemstatus = SYSTEMSTATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final FlightMode MODE_EDEFAULT = FlightMode.GUIDED;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected FlightMode mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNum_satellites() <em>Num satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_satellites()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_SATELLITES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNum_satellites() <em>Num satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_satellites()
	 * @generated
	 * @ordered
	 */
	protected Integer num_satellites = NUM_SATELLITES_EDEFAULT;

	/**
	 * The default value of the '{@link #getArmable() <em>Armable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ARMABLE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getArmable() <em>Armable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmable()
	 * @generated
	 * @ordered
	 */
	protected Boolean armable = ARMABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartupchecksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronologyPackage.Literals.STARTUPCHECKS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.STARTUPCHECKS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getArmingstatus() {
		return armingstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmingstatus(Boolean newArmingstatus) {
		Boolean oldArmingstatus = armingstatus;
		armingstatus = newArmingstatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.STARTUPCHECKS__ARMINGSTATUS,
					oldArmingstatus, armingstatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStatus getSystemstatus() {
		return systemstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemstatus(SystemStatus newSystemstatus) {
		SystemStatus oldSystemstatus = systemstatus;
		systemstatus = newSystemstatus == null ? SYSTEMSTATUS_EDEFAULT : newSystemstatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.STARTUPCHECKS__SYSTEMSTATUS,
					oldSystemstatus, systemstatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(FlightMode newMode) {
		FlightMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.STARTUPCHECKS__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNum_satellites() {
		return num_satellites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_satellites(Integer newNum_satellites) {
		Integer oldNum_satellites = num_satellites;
		num_satellites = newNum_satellites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.STARTUPCHECKS__NUM_SATELLITES,
					oldNum_satellites, num_satellites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getArmable() {
		return armable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmable(Boolean newArmable) {
		Boolean oldArmable = armable;
		armable = newArmable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.STARTUPCHECKS__ARMABLE, oldArmable,
					armable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DronologyPackage.STARTUPCHECKS__ID:
			return getId();
		case DronologyPackage.STARTUPCHECKS__ARMINGSTATUS:
			return getArmingstatus();
		case DronologyPackage.STARTUPCHECKS__SYSTEMSTATUS:
			return getSystemstatus();
		case DronologyPackage.STARTUPCHECKS__MODE:
			return getMode();
		case DronologyPackage.STARTUPCHECKS__NUM_SATELLITES:
			return getNum_satellites();
		case DronologyPackage.STARTUPCHECKS__ARMABLE:
			return getArmable();
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
		case DronologyPackage.STARTUPCHECKS__ID:
			setId((String) newValue);
			return;
		case DronologyPackage.STARTUPCHECKS__ARMINGSTATUS:
			setArmingstatus((Boolean) newValue);
			return;
		case DronologyPackage.STARTUPCHECKS__SYSTEMSTATUS:
			setSystemstatus((SystemStatus) newValue);
			return;
		case DronologyPackage.STARTUPCHECKS__MODE:
			setMode((FlightMode) newValue);
			return;
		case DronologyPackage.STARTUPCHECKS__NUM_SATELLITES:
			setNum_satellites((Integer) newValue);
			return;
		case DronologyPackage.STARTUPCHECKS__ARMABLE:
			setArmable((Boolean) newValue);
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
		case DronologyPackage.STARTUPCHECKS__ID:
			setId(ID_EDEFAULT);
			return;
		case DronologyPackage.STARTUPCHECKS__ARMINGSTATUS:
			setArmingstatus(ARMINGSTATUS_EDEFAULT);
			return;
		case DronologyPackage.STARTUPCHECKS__SYSTEMSTATUS:
			setSystemstatus(SYSTEMSTATUS_EDEFAULT);
			return;
		case DronologyPackage.STARTUPCHECKS__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case DronologyPackage.STARTUPCHECKS__NUM_SATELLITES:
			setNum_satellites(NUM_SATELLITES_EDEFAULT);
			return;
		case DronologyPackage.STARTUPCHECKS__ARMABLE:
			setArmable(ARMABLE_EDEFAULT);
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
		case DronologyPackage.STARTUPCHECKS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DronologyPackage.STARTUPCHECKS__ARMINGSTATUS:
			return ARMINGSTATUS_EDEFAULT == null ? armingstatus != null : !ARMINGSTATUS_EDEFAULT.equals(armingstatus);
		case DronologyPackage.STARTUPCHECKS__SYSTEMSTATUS:
			return systemstatus != SYSTEMSTATUS_EDEFAULT;
		case DronologyPackage.STARTUPCHECKS__MODE:
			return mode != MODE_EDEFAULT;
		case DronologyPackage.STARTUPCHECKS__NUM_SATELLITES:
			return NUM_SATELLITES_EDEFAULT == null ? num_satellites != null
					: !NUM_SATELLITES_EDEFAULT.equals(num_satellites);
		case DronologyPackage.STARTUPCHECKS__ARMABLE:
			return ARMABLE_EDEFAULT == null ? armable != null : !ARMABLE_EDEFAULT.equals(armable);
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
		result.append(", armingstatus: ");
		result.append(armingstatus);
		result.append(", systemstatus: ");
		result.append(systemstatus);
		result.append(", mode: ");
		result.append(mode);
		result.append(", num_satellites: ");
		result.append(num_satellites);
		result.append(", armable: ");
		result.append(armable);
		result.append(')');
		return result.toString();
	}

} //StartupchecksImpl
