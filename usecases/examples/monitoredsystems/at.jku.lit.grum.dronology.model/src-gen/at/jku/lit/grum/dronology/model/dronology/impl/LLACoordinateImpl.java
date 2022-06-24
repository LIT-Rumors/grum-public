/**
 */
package at.jku.lit.grum.dronology.model.dronology.impl;

import at.jku.lit.grum.dronology.model.dronology.DronologyPackage;
import at.jku.lit.grum.dronology.model.dronology.LLACoordinate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LLA Coordinate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.LLACoordinateImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.LLACoordinateImpl#getY <em>Y</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.LLACoordinateImpl#getZ <em>Z</em>}</li>
 *   <li>{@link at.jku.lit.grum.dronology.model.dronology.impl.LLACoordinateImpl#getX <em>X</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LLACoordinateImpl extends MinimalEObjectImpl.Container implements LLACoordinate {
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
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Double Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected Double z = Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Double X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Double x = X_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LLACoordinateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronologyPackage.Literals.LLA_COORDINATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.LLA_COORDINATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Double newY) {
		Double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.LLA_COORDINATE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(Double newZ) {
		Double oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.LLA_COORDINATE__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Double newX) {
		Double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronologyPackage.LLA_COORDINATE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DronologyPackage.LLA_COORDINATE__ID:
			return getId();
		case DronologyPackage.LLA_COORDINATE__Y:
			return getY();
		case DronologyPackage.LLA_COORDINATE__Z:
			return getZ();
		case DronologyPackage.LLA_COORDINATE__X:
			return getX();
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
		case DronologyPackage.LLA_COORDINATE__ID:
			setId((String) newValue);
			return;
		case DronologyPackage.LLA_COORDINATE__Y:
			setY((Double) newValue);
			return;
		case DronologyPackage.LLA_COORDINATE__Z:
			setZ((Double) newValue);
			return;
		case DronologyPackage.LLA_COORDINATE__X:
			setX((Double) newValue);
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
		case DronologyPackage.LLA_COORDINATE__ID:
			setId(ID_EDEFAULT);
			return;
		case DronologyPackage.LLA_COORDINATE__Y:
			setY(Y_EDEFAULT);
			return;
		case DronologyPackage.LLA_COORDINATE__Z:
			setZ(Z_EDEFAULT);
			return;
		case DronologyPackage.LLA_COORDINATE__X:
			setX(X_EDEFAULT);
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
		case DronologyPackage.LLA_COORDINATE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DronologyPackage.LLA_COORDINATE__Y:
			return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
		case DronologyPackage.LLA_COORDINATE__Z:
			return Z_EDEFAULT == null ? z != null : !Z_EDEFAULT.equals(z);
		case DronologyPackage.LLA_COORDINATE__X:
			return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
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
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(", x: ");
		result.append(x);
		result.append(')');
		return result.toString();
	}

} //LLACoordinateImpl
