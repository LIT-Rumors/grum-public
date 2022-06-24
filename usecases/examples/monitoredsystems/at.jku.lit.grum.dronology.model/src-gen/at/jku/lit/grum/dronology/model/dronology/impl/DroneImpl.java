/**
 */
package at.jku.lit.grum.dronology.model.dronology.impl;

import at.jku.lit.grum.dronology.model.dronology.Drone;
import at.jku.lit.grum.dronology.model.dronology.Dronecommand;
import at.jku.lit.grum.dronology.model.dronology.Dronestate;
import at.jku.lit.grum.dronology.model.dronology.DronologyPackage;
import at.jku.lit.grum.dronology.model.dronology.FlightControllerData;
import at.jku.lit.grum.dronology.model.dronology.FlightPlan;
import at.jku.lit.grum.dronology.model.dronology.LLACoordinate;
import at.jku.lit.grum.dronology.model.dronology.Operationmode;
import at.jku.lit.grum.dronology.model.dronology.Startupchecks;
import at.jku.lit.grum.dronology.model.dronology.Systemhealth;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl#getDronestate <em>Dronestate</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl#getDronecommand <em>Dronecommand</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl#getHomelocation <em>Homelocation</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl#getStartupchecks <em>Startupchecks</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl#getGeofenceDistance <em>Geofence Distance</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl#getOperationmode <em>Operationmode</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl#getFlightplan <em>Flightplan</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl#getSystemhealth <em>Systemhealth</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.DroneImpl#getFlightcontrollerdata <em>Flightcontrollerdata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DroneImpl extends MinimalEObjectImpl.Container implements Drone {
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
	 * The cached value of the '{@link #getDronestate() <em>Dronestate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDronestate()
	 * @generated
	 * @ordered
	 */
	protected Dronestate dronestate;

	/**
	 * The cached value of the '{@link #getDronecommand() <em>Dronecommand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDronecommand()
	 * @generated
	 * @ordered
	 */
	protected Dronecommand dronecommand;

	/**
	 * The cached value of the '{@link #getHomelocation() <em>Homelocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomelocation()
	 * @generated
	 * @ordered
	 */
	protected LLACoordinate homelocation;

	/**
	 * The cached value of the '{@link #getStartupchecks() <em>Startupchecks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupchecks()
	 * @generated
	 * @ordered
	 */
	protected Startupchecks startupchecks;

	/**
	 * The default value of the '{@link #getGeofenceDistance() <em>Geofence Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeofenceDistance()
	 * @generated
	 * @ordered
	 */
	protected static final Double GEOFENCE_DISTANCE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getGeofenceDistance() <em>Geofence Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeofenceDistance()
	 * @generated
	 * @ordered
	 */
	protected Double geofenceDistance = GEOFENCE_DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationmode() <em>Operationmode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationmode()
	 * @generated
	 * @ordered
	 */
	protected Operationmode operationmode;

	/**
	 * The cached value of the '{@link #getFlightplan() <em>Flightplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightplan()
	 * @generated
	 * @ordered
	 */
	protected FlightPlan flightplan;

	/**
	 * The cached value of the '{@link #getSystemhealth() <em>Systemhealth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemhealth()
	 * @generated
	 * @ordered
	 */
	protected Systemhealth systemhealth;

	/**
	 * The cached value of the '{@link #getFlightcontrollerdata() <em>Flightcontrollerdata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightcontrollerdata()
	 * @generated
	 * @ordered
	 */
	protected FlightControllerData flightcontrollerdata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronologyPackage.Literals.DRONE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dronestate getDronestate() {
		return dronestate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDronestate(Dronestate newDronestate, NotificationChain msgs) {
		Dronestate oldDronestate = dronestate;
		dronestate = newDronestate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.DRONE__DRONESTATE, oldDronestate, newDronestate);
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
	public void setDronestate(Dronestate newDronestate) {
		if (newDronestate != dronestate) {
			NotificationChain msgs = null;
			if (dronestate != null)
				msgs = ((InternalEObject) dronestate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__DRONESTATE, null, msgs);
			if (newDronestate != null)
				msgs = ((InternalEObject) newDronestate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__DRONESTATE, null, msgs);
			msgs = basicSetDronestate(newDronestate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONE__DRONESTATE, newDronestate,
					newDronestate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dronecommand getDronecommand() {
		return dronecommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDronecommand(Dronecommand newDronecommand, NotificationChain msgs) {
		Dronecommand oldDronecommand = dronecommand;
		dronecommand = newDronecommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.DRONE__DRONECOMMAND, oldDronecommand, newDronecommand);
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
	public void setDronecommand(Dronecommand newDronecommand) {
		if (newDronecommand != dronecommand) {
			NotificationChain msgs = null;
			if (dronecommand != null)
				msgs = ((InternalEObject) dronecommand).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__DRONECOMMAND, null, msgs);
			if (newDronecommand != null)
				msgs = ((InternalEObject) newDronecommand).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__DRONECOMMAND, null, msgs);
			msgs = basicSetDronecommand(newDronecommand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONE__DRONECOMMAND, newDronecommand,
					newDronecommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLACoordinate getHomelocation() {
		return homelocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHomelocation(LLACoordinate newHomelocation, NotificationChain msgs) {
		LLACoordinate oldHomelocation = homelocation;
		homelocation = newHomelocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.DRONE__HOMELOCATION, oldHomelocation, newHomelocation);
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
	public void setHomelocation(LLACoordinate newHomelocation) {
		if (newHomelocation != homelocation) {
			NotificationChain msgs = null;
			if (homelocation != null)
				msgs = ((InternalEObject) homelocation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__HOMELOCATION, null, msgs);
			if (newHomelocation != null)
				msgs = ((InternalEObject) newHomelocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__HOMELOCATION, null, msgs);
			msgs = basicSetHomelocation(newHomelocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONE__HOMELOCATION, newHomelocation,
					newHomelocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Startupchecks getStartupchecks() {
		return startupchecks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartupchecks(Startupchecks newStartupchecks, NotificationChain msgs) {
		Startupchecks oldStartupchecks = startupchecks;
		startupchecks = newStartupchecks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.DRONE__STARTUPCHECKS, oldStartupchecks, newStartupchecks);
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
	public void setStartupchecks(Startupchecks newStartupchecks) {
		if (newStartupchecks != startupchecks) {
			NotificationChain msgs = null;
			if (startupchecks != null)
				msgs = ((InternalEObject) startupchecks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__STARTUPCHECKS, null, msgs);
			if (newStartupchecks != null)
				msgs = ((InternalEObject) newStartupchecks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__STARTUPCHECKS, null, msgs);
			msgs = basicSetStartupchecks(newStartupchecks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONE__STARTUPCHECKS,
					newStartupchecks, newStartupchecks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getGeofenceDistance() {
		return geofenceDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeofenceDistance(Double newGeofenceDistance) {
		Double oldGeofenceDistance = geofenceDistance;
		geofenceDistance = newGeofenceDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONE__GEOFENCE_DISTANCE,
					oldGeofenceDistance, geofenceDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operationmode getOperationmode() {
		return operationmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationmode(Operationmode newOperationmode, NotificationChain msgs) {
		Operationmode oldOperationmode = operationmode;
		operationmode = newOperationmode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.DRONE__OPERATIONMODE, oldOperationmode, newOperationmode);
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
	public void setOperationmode(Operationmode newOperationmode) {
		if (newOperationmode != operationmode) {
			NotificationChain msgs = null;
			if (operationmode != null)
				msgs = ((InternalEObject) operationmode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__OPERATIONMODE, null, msgs);
			if (newOperationmode != null)
				msgs = ((InternalEObject) newOperationmode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__OPERATIONMODE, null, msgs);
			msgs = basicSetOperationmode(newOperationmode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONE__OPERATIONMODE,
					newOperationmode, newOperationmode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightPlan getFlightplan() {
		return flightplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightplan(FlightPlan newFlightplan, NotificationChain msgs) {
		FlightPlan oldFlightplan = flightplan;
		flightplan = newFlightplan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.DRONE__FLIGHTPLAN, oldFlightplan, newFlightplan);
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
	public void setFlightplan(FlightPlan newFlightplan) {
		if (newFlightplan != flightplan) {
			NotificationChain msgs = null;
			if (flightplan != null)
				msgs = ((InternalEObject) flightplan).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__FLIGHTPLAN, null, msgs);
			if (newFlightplan != null)
				msgs = ((InternalEObject) newFlightplan).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__FLIGHTPLAN, null, msgs);
			msgs = basicSetFlightplan(newFlightplan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONE__FLIGHTPLAN, newFlightplan,
					newFlightplan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Systemhealth getSystemhealth() {
		return systemhealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemhealth(Systemhealth newSystemhealth, NotificationChain msgs) {
		Systemhealth oldSystemhealth = systemhealth;
		systemhealth = newSystemhealth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.DRONE__SYSTEMHEALTH, oldSystemhealth, newSystemhealth);
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
	public void setSystemhealth(Systemhealth newSystemhealth) {
		if (newSystemhealth != systemhealth) {
			NotificationChain msgs = null;
			if (systemhealth != null)
				msgs = ((InternalEObject) systemhealth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__SYSTEMHEALTH, null, msgs);
			if (newSystemhealth != null)
				msgs = ((InternalEObject) newSystemhealth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__SYSTEMHEALTH, null, msgs);
			msgs = basicSetSystemhealth(newSystemhealth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONE__SYSTEMHEALTH, newSystemhealth,
					newSystemhealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightControllerData getFlightcontrollerdata() {
		return flightcontrollerdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightcontrollerdata(FlightControllerData newFlightcontrollerdata,
			NotificationChain msgs) {
		FlightControllerData oldFlightcontrollerdata = flightcontrollerdata;
		flightcontrollerdata = newFlightcontrollerdata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DronologyPackage.DRONE__FLIGHTCONTROLLERDATA, oldFlightcontrollerdata, newFlightcontrollerdata);
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
	public void setFlightcontrollerdata(FlightControllerData newFlightcontrollerdata) {
		if (newFlightcontrollerdata != flightcontrollerdata) {
			NotificationChain msgs = null;
			if (flightcontrollerdata != null)
				msgs = ((InternalEObject) flightcontrollerdata).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__FLIGHTCONTROLLERDATA, null, msgs);
			if (newFlightcontrollerdata != null)
				msgs = ((InternalEObject) newFlightcontrollerdata).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DronologyPackage.DRONE__FLIGHTCONTROLLERDATA, null, msgs);
			msgs = basicSetFlightcontrollerdata(newFlightcontrollerdata, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.DRONE__FLIGHTCONTROLLERDATA,
					newFlightcontrollerdata, newFlightcontrollerdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DronologyPackage.DRONE__DRONESTATE:
			return basicSetDronestate(null, msgs);
		case DronologyPackage.DRONE__DRONECOMMAND:
			return basicSetDronecommand(null, msgs);
		case DronologyPackage.DRONE__HOMELOCATION:
			return basicSetHomelocation(null, msgs);
		case DronologyPackage.DRONE__STARTUPCHECKS:
			return basicSetStartupchecks(null, msgs);
		case DronologyPackage.DRONE__OPERATIONMODE:
			return basicSetOperationmode(null, msgs);
		case DronologyPackage.DRONE__FLIGHTPLAN:
			return basicSetFlightplan(null, msgs);
		case DronologyPackage.DRONE__SYSTEMHEALTH:
			return basicSetSystemhealth(null, msgs);
		case DronologyPackage.DRONE__FLIGHTCONTROLLERDATA:
			return basicSetFlightcontrollerdata(null, msgs);
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
		case DronologyPackage.DRONE__ID:
			return getId();
		case DronologyPackage.DRONE__DRONESTATE:
			return getDronestate();
		case DronologyPackage.DRONE__DRONECOMMAND:
			return getDronecommand();
		case DronologyPackage.DRONE__HOMELOCATION:
			return getHomelocation();
		case DronologyPackage.DRONE__STARTUPCHECKS:
			return getStartupchecks();
		case DronologyPackage.DRONE__GEOFENCE_DISTANCE:
			return getGeofenceDistance();
		case DronologyPackage.DRONE__OPERATIONMODE:
			return getOperationmode();
		case DronologyPackage.DRONE__FLIGHTPLAN:
			return getFlightplan();
		case DronologyPackage.DRONE__SYSTEMHEALTH:
			return getSystemhealth();
		case DronologyPackage.DRONE__FLIGHTCONTROLLERDATA:
			return getFlightcontrollerdata();
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
		case DronologyPackage.DRONE__ID:
			setId((String) newValue);
			return;
		case DronologyPackage.DRONE__DRONESTATE:
			setDronestate((Dronestate) newValue);
			return;
		case DronologyPackage.DRONE__DRONECOMMAND:
			setDronecommand((Dronecommand) newValue);
			return;
		case DronologyPackage.DRONE__HOMELOCATION:
			setHomelocation((LLACoordinate) newValue);
			return;
		case DronologyPackage.DRONE__STARTUPCHECKS:
			setStartupchecks((Startupchecks) newValue);
			return;
		case DronologyPackage.DRONE__GEOFENCE_DISTANCE:
			setGeofenceDistance((Double) newValue);
			return;
		case DronologyPackage.DRONE__OPERATIONMODE:
			setOperationmode((Operationmode) newValue);
			return;
		case DronologyPackage.DRONE__FLIGHTPLAN:
			setFlightplan((FlightPlan) newValue);
			return;
		case DronologyPackage.DRONE__SYSTEMHEALTH:
			setSystemhealth((Systemhealth) newValue);
			return;
		case DronologyPackage.DRONE__FLIGHTCONTROLLERDATA:
			setFlightcontrollerdata((FlightControllerData) newValue);
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
		case DronologyPackage.DRONE__ID:
			setId(ID_EDEFAULT);
			return;
		case DronologyPackage.DRONE__DRONESTATE:
			setDronestate((Dronestate) null);
			return;
		case DronologyPackage.DRONE__DRONECOMMAND:
			setDronecommand((Dronecommand) null);
			return;
		case DronologyPackage.DRONE__HOMELOCATION:
			setHomelocation((LLACoordinate) null);
			return;
		case DronologyPackage.DRONE__STARTUPCHECKS:
			setStartupchecks((Startupchecks) null);
			return;
		case DronologyPackage.DRONE__GEOFENCE_DISTANCE:
			setGeofenceDistance(GEOFENCE_DISTANCE_EDEFAULT);
			return;
		case DronologyPackage.DRONE__OPERATIONMODE:
			setOperationmode((Operationmode) null);
			return;
		case DronologyPackage.DRONE__FLIGHTPLAN:
			setFlightplan((FlightPlan) null);
			return;
		case DronologyPackage.DRONE__SYSTEMHEALTH:
			setSystemhealth((Systemhealth) null);
			return;
		case DronologyPackage.DRONE__FLIGHTCONTROLLERDATA:
			setFlightcontrollerdata((FlightControllerData) null);
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
		case DronologyPackage.DRONE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DronologyPackage.DRONE__DRONESTATE:
			return dronestate != null;
		case DronologyPackage.DRONE__DRONECOMMAND:
			return dronecommand != null;
		case DronologyPackage.DRONE__HOMELOCATION:
			return homelocation != null;
		case DronologyPackage.DRONE__STARTUPCHECKS:
			return startupchecks != null;
		case DronologyPackage.DRONE__GEOFENCE_DISTANCE:
			return GEOFENCE_DISTANCE_EDEFAULT == null ? geofenceDistance != null
					: !GEOFENCE_DISTANCE_EDEFAULT.equals(geofenceDistance);
		case DronologyPackage.DRONE__OPERATIONMODE:
			return operationmode != null;
		case DronologyPackage.DRONE__FLIGHTPLAN:
			return flightplan != null;
		case DronologyPackage.DRONE__SYSTEMHEALTH:
			return systemhealth != null;
		case DronologyPackage.DRONE__FLIGHTCONTROLLERDATA:
			return flightcontrollerdata != null;
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
		result.append(", geofenceDistance: ");
		result.append(geofenceDistance);
		result.append(')');
		return result.toString();
	}

} //DroneImpl
