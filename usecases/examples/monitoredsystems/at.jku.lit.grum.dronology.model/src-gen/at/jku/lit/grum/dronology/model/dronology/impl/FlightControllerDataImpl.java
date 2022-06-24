/**
 */
package at.jku.lit.grum.dronology.model.dronology.impl;

import at.jku.lit.grum.dronology.model.dronology.DronologyPackage;
import at.jku.lit.grum.dronology.model.dronology.FlightControllerData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Controller Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl#getNum_satellites <em>Num satellites</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl#getEph <em>Eph</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl#getEpv <em>Epv</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl#getYaw <em>Yaw</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.FlightControllerDataImpl#getFix_type <em>Fix type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightControllerDataImpl extends MinimalEObjectImpl.Container implements FlightControllerData {
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
	 * The default value of the '{@link #getNum_satellites() <em>Num satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_satellites()
	 * @generated
	 * @ordered
	 */
	protected static final double NUM_SATELLITES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNum_satellites() <em>Num satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_satellites()
	 * @generated
	 * @ordered
	 */
	protected double num_satellites = NUM_SATELLITES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEph() <em>Eph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEph()
	 * @generated
	 * @ordered
	 */
	protected static final double EPH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEph() <em>Eph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEph()
	 * @generated
	 * @ordered
	 */
	protected double eph = EPH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpv() <em>Epv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpv()
	 * @generated
	 * @ordered
	 */
	protected static final double EPV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEpv() <em>Epv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpv()
	 * @generated
	 * @ordered
	 */
	protected double epv = EPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected static final double ROLL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected double roll = ROLL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected static final double PITCH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected double pitch = PITCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYaw() <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYaw()
	 * @generated
	 * @ordered
	 */
	protected static final double YAW_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYaw() <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYaw()
	 * @generated
	 * @ordered
	 */
	protected double yaw = YAW_EDEFAULT;

	/**
	 * The default value of the '{@link #getFix_type() <em>Fix type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFix_type()
	 * @generated
	 * @ordered
	 */
	protected static final int FIX_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFix_type() <em>Fix type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFix_type()
	 * @generated
	 * @ordered
	 */
	protected int fix_type = FIX_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightControllerDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronologyPackage.Literals.FLIGHT_CONTROLLER_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_CONTROLLER_DATA__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNum_satellites() {
		return num_satellites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_satellites(double newNum_satellites) {
		double oldNum_satellites = num_satellites;
		num_satellites = newNum_satellites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DronologyPackage.FLIGHT_CONTROLLER_DATA__NUM_SATELLITES, oldNum_satellites, num_satellites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEph() {
		return eph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEph(double newEph) {
		double oldEph = eph;
		eph = newEph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_CONTROLLER_DATA__EPH, oldEph,
					eph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEpv() {
		return epv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpv(double newEpv) {
		double oldEpv = epv;
		epv = newEpv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_CONTROLLER_DATA__EPV, oldEpv,
					epv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRoll() {
		return roll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoll(double newRoll) {
		double oldRoll = roll;
		roll = newRoll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_CONTROLLER_DATA__ROLL,
					oldRoll, roll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPitch() {
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(double newPitch) {
		double oldPitch = pitch;
		pitch = newPitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_CONTROLLER_DATA__PITCH,
					oldPitch, pitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYaw() {
		return yaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYaw(double newYaw) {
		double oldYaw = yaw;
		yaw = newYaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_CONTROLLER_DATA__YAW, oldYaw,
					yaw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFix_type() {
		return fix_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFix_type(int newFix_type) {
		int oldFix_type = fix_type;
		fix_type = newFix_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.FLIGHT_CONTROLLER_DATA__FIX_TYPE,
					oldFix_type, fix_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__ID:
			return getId();
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__NUM_SATELLITES:
			return getNum_satellites();
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__EPH:
			return getEph();
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__EPV:
			return getEpv();
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__ROLL:
			return getRoll();
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__PITCH:
			return getPitch();
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__YAW:
			return getYaw();
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__FIX_TYPE:
			return getFix_type();
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
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__ID:
			setId((String) newValue);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__NUM_SATELLITES:
			setNum_satellites((Double) newValue);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__EPH:
			setEph((Double) newValue);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__EPV:
			setEpv((Double) newValue);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__ROLL:
			setRoll((Double) newValue);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__PITCH:
			setPitch((Double) newValue);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__YAW:
			setYaw((Double) newValue);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__FIX_TYPE:
			setFix_type((Integer) newValue);
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
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__ID:
			setId(ID_EDEFAULT);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__NUM_SATELLITES:
			setNum_satellites(NUM_SATELLITES_EDEFAULT);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__EPH:
			setEph(EPH_EDEFAULT);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__EPV:
			setEpv(EPV_EDEFAULT);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__ROLL:
			setRoll(ROLL_EDEFAULT);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__PITCH:
			setPitch(PITCH_EDEFAULT);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__YAW:
			setYaw(YAW_EDEFAULT);
			return;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__FIX_TYPE:
			setFix_type(FIX_TYPE_EDEFAULT);
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
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__NUM_SATELLITES:
			return num_satellites != NUM_SATELLITES_EDEFAULT;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__EPH:
			return eph != EPH_EDEFAULT;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__EPV:
			return epv != EPV_EDEFAULT;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__ROLL:
			return roll != ROLL_EDEFAULT;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__PITCH:
			return pitch != PITCH_EDEFAULT;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__YAW:
			return yaw != YAW_EDEFAULT;
		case DronologyPackage.FLIGHT_CONTROLLER_DATA__FIX_TYPE:
			return fix_type != FIX_TYPE_EDEFAULT;
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
		result.append(", num_satellites: ");
		result.append(num_satellites);
		result.append(", eph: ");
		result.append(eph);
		result.append(", epv: ");
		result.append(epv);
		result.append(", roll: ");
		result.append(roll);
		result.append(", pitch: ");
		result.append(pitch);
		result.append(", yaw: ");
		result.append(yaw);
		result.append(", fix_type: ");
		result.append(fix_type);
		result.append(')');
		return result.toString();
	}

} //FlightControllerDataImpl
