/**
 */
package at.jku.lit.grum.dronology.model.dronology.impl;

import at.jku.lit.grum.dronology.model.dronology.DronologyPackage;
import at.jku.lit.grum.dronology.model.dronology.FlightPlan;
import at.jku.lit.grum.dronology.model.dronology.FlightPlanStatus;
import at.jku.lit.grum.dronology.model.dronology.LLACoordinate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl#getFlightID <em>Flight ID</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl#getEndLocation <em>End Location</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightPlanImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPlanImpl extends MinimalEObjectImpl.Container implements FlightPlan {
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
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final long START_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected long startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final long END_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected long endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlightID() <em>Flight ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightID()
	 * @generated
	 * @ordered
	 */
	protected static final String FLIGHT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlightID() <em>Flight ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightID()
	 * @generated
	 * @ordered
	 */
	protected String flightID = FLIGHT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartLocation() <em>Start Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLocation()
	 * @generated
	 * @ordered
	 */
	protected LLACoordinate startLocation;

	/**
	 * The cached value of the '{@link #getEndLocation() <em>End Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLocation()
	 * @generated
	 * @ordered
	 */
	protected LLACoordinate endLocation;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final FlightPlanStatus STATUS_EDEFAULT = FlightPlanStatus.PLANNED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected FlightPlanStatus status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronologyPackage.Literals.FLIGHT_PLAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_PLAN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(long newStartTime) {
		long oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_PLAN__START_TIME,
					oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(long newEndTime) {
		long oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_PLAN__END_TIME, oldEndTime,
					endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlightID() {
		return flightID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlightID(String newFlightID) {
		String oldFlightID = flightID;
		flightID = newFlightID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_PLAN__FLIGHT_ID, oldFlightID,
					flightID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLACoordinate getStartLocation() {
		return startLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartLocation(LLACoordinate newStartLocation, NotificationChain msgs) {
		LLACoordinate oldStartLocation = startLocation;
		startLocation = newStartLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.FLIGHT_PLAN__START_LOCATION, oldStartLocation, newStartLocation);
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
	public void setStartLocation(LLACoordinate newStartLocation) {
		if (newStartLocation != startLocation) {
			NotificationChain msgs = null;
			if (startLocation != null)
				msgs = ((InternalEObject) startLocation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.FLIGHT_PLAN__START_LOCATION, null, msgs);
			if (newStartLocation != null)
				msgs = ((InternalEObject) newStartLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.FLIGHT_PLAN__START_LOCATION, null, msgs);
			msgs = basicSetStartLocation(newStartLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_PLAN__START_LOCATION,
					newStartLocation, newStartLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLACoordinate getEndLocation() {
		return endLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndLocation(LLACoordinate newEndLocation, NotificationChain msgs) {
		LLACoordinate oldEndLocation = endLocation;
		endLocation = newEndLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.FLIGHT_PLAN__END_LOCATION, oldEndLocation, newEndLocation);
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
	public void setEndLocation(LLACoordinate newEndLocation) {
		if (newEndLocation != endLocation) {
			NotificationChain msgs = null;
			if (endLocation != null)
				msgs = ((InternalEObject) endLocation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.FLIGHT_PLAN__END_LOCATION, null, msgs);
			if (newEndLocation != null)
				msgs = ((InternalEObject) newEndLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.FLIGHT_PLAN__END_LOCATION, null, msgs);
			msgs = basicSetEndLocation(newEndLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_PLAN__END_LOCATION,
					newEndLocation, newEndLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightPlanStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(FlightPlanStatus newStatus) {
		FlightPlanStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_PLAN__STATUS, oldStatus,
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
		case DronologyPackage.FLIGHT_PLAN__START_LOCATION:
			return basicSetStartLocation(null, msgs);
		case DronologyPackage.FLIGHT_PLAN__END_LOCATION:
			return basicSetEndLocation(null, msgs);
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
		case DronologyPackage.FLIGHT_PLAN__ID:
			return getId();
		case DronologyPackage.FLIGHT_PLAN__START_TIME:
			return getStartTime();
		case DronologyPackage.FLIGHT_PLAN__END_TIME:
			return getEndTime();
		case DronologyPackage.FLIGHT_PLAN__FLIGHT_ID:
			return getFlightID();
		case DronologyPackage.FLIGHT_PLAN__START_LOCATION:
			return getStartLocation();
		case DronologyPackage.FLIGHT_PLAN__END_LOCATION:
			return getEndLocation();
		case DronologyPackage.FLIGHT_PLAN__STATUS:
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
		case DronologyPackage.FLIGHT_PLAN__ID:
			setId((String) newValue);
			return;
		case DronologyPackage.FLIGHT_PLAN__START_TIME:
			setStartTime((Long) newValue);
			return;
		case DronologyPackage.FLIGHT_PLAN__END_TIME:
			setEndTime((Long) newValue);
			return;
		case DronologyPackage.FLIGHT_PLAN__FLIGHT_ID:
			setFlightID((String) newValue);
			return;
		case DronologyPackage.FLIGHT_PLAN__START_LOCATION:
			setStartLocation((LLACoordinate) newValue);
			return;
		case DronologyPackage.FLIGHT_PLAN__END_LOCATION:
			setEndLocation((LLACoordinate) newValue);
			return;
		case DronologyPackage.FLIGHT_PLAN__STATUS:
			setStatus((FlightPlanStatus) newValue);
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
		case DronologyPackage.FLIGHT_PLAN__ID:
			setId(ID_EDEFAULT);
			return;
		case DronologyPackage.FLIGHT_PLAN__START_TIME:
			setStartTime(START_TIME_EDEFAULT);
			return;
		case DronologyPackage.FLIGHT_PLAN__END_TIME:
			setEndTime(END_TIME_EDEFAULT);
			return;
		case DronologyPackage.FLIGHT_PLAN__FLIGHT_ID:
			setFlightID(FLIGHT_ID_EDEFAULT);
			return;
		case DronologyPackage.FLIGHT_PLAN__START_LOCATION:
			setStartLocation((LLACoordinate) null);
			return;
		case DronologyPackage.FLIGHT_PLAN__END_LOCATION:
			setEndLocation((LLACoordinate) null);
			return;
		case DronologyPackage.FLIGHT_PLAN__STATUS:
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
		case DronologyPackage.FLIGHT_PLAN__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DronologyPackage.FLIGHT_PLAN__START_TIME:
			return startTime != START_TIME_EDEFAULT;
		case DronologyPackage.FLIGHT_PLAN__END_TIME:
			return endTime != END_TIME_EDEFAULT;
		case DronologyPackage.FLIGHT_PLAN__FLIGHT_ID:
			return FLIGHT_ID_EDEFAULT == null ? flightID != null : !FLIGHT_ID_EDEFAULT.equals(flightID);
		case DronologyPackage.FLIGHT_PLAN__START_LOCATION:
			return startLocation != null;
		case DronologyPackage.FLIGHT_PLAN__END_LOCATION:
			return endLocation != null;
		case DronologyPackage.FLIGHT_PLAN__STATUS:
			return status != STATUS_EDEFAULT;
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
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", flightID: ");
		result.append(flightID);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //FlightPlanImpl
