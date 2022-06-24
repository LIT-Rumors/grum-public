/**
 */
package at.jku.lit.grum.dronology.model.dronology.impl;

import at.jku.lit.grum.dronology.model.dronology.BatteryStatus;
import at.jku.lit.grum.dronology.model.dronology.Dronestate;
import at.jku.lit.grum.dronology.model.dronology.DronologyPackage;
import at.jku.lit.grum.dronology.model.dronology.FlightMode;
import at.jku.lit.grum.dronology.model.dronology.LLACoordinate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dronestate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl#getBatterystatus <em>Batterystatus</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl#isArmed <em>Armed</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl#getGroundspeed <em>Groundspeed</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl#getArmable <em>Armable</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DronestateImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DronestateImpl extends MinimalEObjectImpl.Container implements Dronestate {
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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LLACoordinate location;

	/**
	 * The cached value of the '{@link #getBatterystatus() <em>Batterystatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatterystatus()
	 * @generated
	 * @ordered
	 */
	protected BatteryStatus batterystatus;

	/**
	 * The default value of the '{@link #isArmed() <em>Armed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArmed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArmed() <em>Armed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArmed()
	 * @generated
	 * @ordered
	 */
	protected boolean armed = ARMED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroundspeed() <em>Groundspeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundspeed()
	 * @generated
	 * @ordered
	 */
	protected static final double GROUNDSPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGroundspeed() <em>Groundspeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundspeed()
	 * @generated
	 * @ordered
	 */
	protected double groundspeed = GROUNDSPEED_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DronestateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronologyPackage.Literals.DRONESTATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONESTATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLACoordinate getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LLACoordinate newLocation, NotificationChain msgs) {
		LLACoordinate oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.DRONESTATE__LOCATION, oldLocation, newLocation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LLACoordinate newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONESTATE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONESTATE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONESTATE__LOCATION, newLocation,
					newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryStatus getBatterystatus() {
		return batterystatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBatterystatus(BatteryStatus newBatterystatus, NotificationChain msgs) {
		BatteryStatus oldBatterystatus = batterystatus;
		batterystatus = newBatterystatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.DRONESTATE__BATTERYSTATUS, oldBatterystatus, newBatterystatus);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatterystatus(BatteryStatus newBatterystatus) {
		if (newBatterystatus != batterystatus) {
			NotificationChain msgs = null;
			if (batterystatus != null)
				msgs = ((InternalEObject) batterystatus).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONESTATE__BATTERYSTATUS, null, msgs);
			if (newBatterystatus != null)
				msgs = ((InternalEObject) newBatterystatus).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONESTATE__BATTERYSTATUS, null, msgs);
			msgs = basicSetBatterystatus(newBatterystatus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONESTATE__BATTERYSTATUS,
					newBatterystatus, newBatterystatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArmed() {
		return armed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmed(boolean newArmed) {
		boolean oldArmed = armed;
		armed = newArmed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONESTATE__ARMED, oldArmed, armed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGroundspeed() {
		return groundspeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundspeed(double newGroundspeed) {
		double oldGroundspeed = groundspeed;
		groundspeed = newGroundspeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONESTATE__GROUNDSPEED,
					oldGroundspeed, groundspeed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONESTATE__MODE, oldMode, mode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONESTATE__ARMABLE, oldArmable,
					armable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONESTATE__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DronologyPackage.DRONESTATE__LOCATION:
			return basicSetLocation(null, msgs);
		case DronologyPackage.DRONESTATE__BATTERYSTATUS:
			return basicSetBatterystatus(null, msgs);
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
		case DronologyPackage.DRONESTATE__ID:
			return getId();
		case DronologyPackage.DRONESTATE__LOCATION:
			return getLocation();
		case DronologyPackage.DRONESTATE__BATTERYSTATUS:
			return getBatterystatus();
		case DronologyPackage.DRONESTATE__ARMED:
			return isArmed();
		case DronologyPackage.DRONESTATE__GROUNDSPEED:
			return getGroundspeed();
		case DronologyPackage.DRONESTATE__MODE:
			return getMode();
		case DronologyPackage.DRONESTATE__ARMABLE:
			return getArmable();
		case DronologyPackage.DRONESTATE__STATUS:
			return getStatus();
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
		case DronologyPackage.DRONESTATE__ID:
			setId((String) newValue);
			return;
		case DronologyPackage.DRONESTATE__LOCATION:
			setLocation((LLACoordinate) newValue);
			return;
		case DronologyPackage.DRONESTATE__BATTERYSTATUS:
			setBatterystatus((BatteryStatus) newValue);
			return;
		case DronologyPackage.DRONESTATE__ARMED:
			setArmed((Boolean) newValue);
			return;
		case DronologyPackage.DRONESTATE__GROUNDSPEED:
			setGroundspeed((Double) newValue);
			return;
		case DronologyPackage.DRONESTATE__MODE:
			setMode((FlightMode) newValue);
			return;
		case DronologyPackage.DRONESTATE__ARMABLE:
			setArmable((Boolean) newValue);
			return;
		case DronologyPackage.DRONESTATE__STATUS:
			setStatus((String) newValue);
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
		case DronologyPackage.DRONESTATE__ID:
			setId(ID_EDEFAULT);
			return;
		case DronologyPackage.DRONESTATE__LOCATION:
			setLocation((LLACoordinate) null);
			return;
		case DronologyPackage.DRONESTATE__BATTERYSTATUS:
			setBatterystatus((BatteryStatus) null);
			return;
		case DronologyPackage.DRONESTATE__ARMED:
			setArmed(ARMED_EDEFAULT);
			return;
		case DronologyPackage.DRONESTATE__GROUNDSPEED:
			setGroundspeed(GROUNDSPEED_EDEFAULT);
			return;
		case DronologyPackage.DRONESTATE__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case DronologyPackage.DRONESTATE__ARMABLE:
			setArmable(ARMABLE_EDEFAULT);
			return;
		case DronologyPackage.DRONESTATE__STATUS:
			setStatus(STATUS_EDEFAULT);
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
		case DronologyPackage.DRONESTATE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DronologyPackage.DRONESTATE__LOCATION:
			return location != null;
		case DronologyPackage.DRONESTATE__BATTERYSTATUS:
			return batterystatus != null;
		case DronologyPackage.DRONESTATE__ARMED:
			return armed != ARMED_EDEFAULT;
		case DronologyPackage.DRONESTATE__GROUNDSPEED:
			return groundspeed != GROUNDSPEED_EDEFAULT;
		case DronologyPackage.DRONESTATE__MODE:
			return mode != MODE_EDEFAULT;
		case DronologyPackage.DRONESTATE__ARMABLE:
			return ARMABLE_EDEFAULT == null ? armable != null : !ARMABLE_EDEFAULT.equals(armable);
		case DronologyPackage.DRONESTATE__STATUS:
			return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(", armed: ");
		result.append(armed);
		result.append(", groundspeed: ");
		result.append(groundspeed);
		result.append(", mode: ");
		result.append(mode);
		result.append(", armable: ");
		result.append(armable);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //DronestateImpl
