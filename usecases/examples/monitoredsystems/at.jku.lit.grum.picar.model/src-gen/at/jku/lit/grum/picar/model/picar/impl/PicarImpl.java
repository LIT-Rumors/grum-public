/**
 */
package at.jku.lit.grum.picar.model.picar.impl;

import at.jku.lit.grum.picar.model.picar.Location;
import at.jku.lit.grum.picar.model.picar.Picar;
import at.jku.lit.grum.picar.model.picar.PicarPackage;
import at.jku.lit.grum.picar.model.picar.Status;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.impl.PicarImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.impl.PicarImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.impl.PicarImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.impl.PicarImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.impl.PicarImpl#getStartlocation <em>Startlocation</em>}</li>
 *   <li>{@link at.jku.lit.grum.picar.model.picar.impl.PicarImpl#getGeofence_range <em>Geofence range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PicarImpl extends MinimalEObjectImpl.Container implements Picar {
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
	protected Location location;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getStartlocation() <em>Startlocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartlocation()
	 * @generated
	 * @ordered
	 */
	protected Location startlocation;

	/**
	 * The default value of the '{@link #getGeofence_range() <em>Geofence range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeofence_range()
	 * @generated
	 * @ordered
	 */
	protected static final double GEOFENCE_RANGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGeofence_range() <em>Geofence range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeofence_range()
	 * @generated
	 * @ordered
	 */
	protected double geofence_range = GEOFENCE_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PicarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicarPackage.Literals.PICAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PicarPackage.PICAR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicarPackage.PICAR__LOCATION,
					oldLocation, newLocation);
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
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PicarPackage.PICAR__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PicarPackage.PICAR__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicarPackage.PICAR__LOCATION, newLocation,
					newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicarPackage.PICAR__IDENTIFIER, oldIdentifier,
					identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicarPackage.PICAR__STATUS,
					oldStatus, newStatus);
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
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject) status).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PicarPackage.PICAR__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject) newStatus).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PicarPackage.PICAR__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicarPackage.PICAR__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getStartlocation() {
		return startlocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartlocation(Location newStartlocation, NotificationChain msgs) {
		Location oldStartlocation = startlocation;
		startlocation = newStartlocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PicarPackage.PICAR__STARTLOCATION, oldStartlocation, newStartlocation);
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
	public void setStartlocation(Location newStartlocation) {
		if (newStartlocation != startlocation) {
			NotificationChain msgs = null;
			if (startlocation != null)
				msgs = ((InternalEObject) startlocation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PicarPackage.PICAR__STARTLOCATION, null, msgs);
			if (newStartlocation != null)
				msgs = ((InternalEObject) newStartlocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PicarPackage.PICAR__STARTLOCATION, null, msgs);
			msgs = basicSetStartlocation(newStartlocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicarPackage.PICAR__STARTLOCATION, newStartlocation,
					newStartlocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGeofence_range() {
		return geofence_range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeofence_range(double newGeofence_range) {
		double oldGeofence_range = geofence_range;
		geofence_range = newGeofence_range;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicarPackage.PICAR__GEOFENCE_RANGE, oldGeofence_range,
					geofence_range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PicarPackage.PICAR__LOCATION:
			return basicSetLocation(null, msgs);
		case PicarPackage.PICAR__STATUS:
			return basicSetStatus(null, msgs);
		case PicarPackage.PICAR__STARTLOCATION:
			return basicSetStartlocation(null, msgs);
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
		case PicarPackage.PICAR__ID:
			return getId();
		case PicarPackage.PICAR__LOCATION:
			return getLocation();
		case PicarPackage.PICAR__IDENTIFIER:
			return getIdentifier();
		case PicarPackage.PICAR__STATUS:
			return getStatus();
		case PicarPackage.PICAR__STARTLOCATION:
			return getStartlocation();
		case PicarPackage.PICAR__GEOFENCE_RANGE:
			return getGeofence_range();
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
		case PicarPackage.PICAR__ID:
			setId((String) newValue);
			return;
		case PicarPackage.PICAR__LOCATION:
			setLocation((Location) newValue);
			return;
		case PicarPackage.PICAR__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case PicarPackage.PICAR__STATUS:
			setStatus((Status) newValue);
			return;
		case PicarPackage.PICAR__STARTLOCATION:
			setStartlocation((Location) newValue);
			return;
		case PicarPackage.PICAR__GEOFENCE_RANGE:
			setGeofence_range((Double) newValue);
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
		case PicarPackage.PICAR__ID:
			setId(ID_EDEFAULT);
			return;
		case PicarPackage.PICAR__LOCATION:
			setLocation((Location) null);
			return;
		case PicarPackage.PICAR__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case PicarPackage.PICAR__STATUS:
			setStatus((Status) null);
			return;
		case PicarPackage.PICAR__STARTLOCATION:
			setStartlocation((Location) null);
			return;
		case PicarPackage.PICAR__GEOFENCE_RANGE:
			setGeofence_range(GEOFENCE_RANGE_EDEFAULT);
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
		case PicarPackage.PICAR__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case PicarPackage.PICAR__LOCATION:
			return location != null;
		case PicarPackage.PICAR__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case PicarPackage.PICAR__STATUS:
			return status != null;
		case PicarPackage.PICAR__STARTLOCATION:
			return startlocation != null;
		case PicarPackage.PICAR__GEOFENCE_RANGE:
			return geofence_range != GEOFENCE_RANGE_EDEFAULT;
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
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", geofence_range: ");
		result.append(geofence_range);
		result.append(')');
		return result.toString();
	}

} //PicarImpl
