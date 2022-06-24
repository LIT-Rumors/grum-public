/**
 */
package at.jku.lit.grum.dronology.model.dronology;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>System Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getSystemStatus()
 * @model
 * @generated
 */
public enum SystemStatus implements Enumerator {
	/**
	 * The '<em><b>STANDBY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is grounded and on standby. It can be launched any time.
	 * <!-- end-model-doc -->
	 * @see #STANDBY_VALUE
	 * @generated
	 * @ordered
	 */
	STANDBY(0, "STANDBY", "STANDBY"),

	/**
	 * The '<em><b>UNINIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uninitialized system, state is unknown
	 * <!-- end-model-doc -->
	 * @see #UNINIT_VALUE
	 * @generated
	 * @ordered
	 */
	UNINIT(1, "UNINIT", "UNINIT"),

	/**
	 * The '<em><b>BOOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is booting up
	 * <!-- end-model-doc -->
	 * @see #BOOT_VALUE
	 * @generated
	 * @ordered
	 */
	BOOT(2, "BOOT", "BOOT"),

	/**
	 * The '<em><b>CALIBRATING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is calibrating and not flight-ready
	 * <!-- end-model-doc -->
	 * @see #CALIBRATING_VALUE
	 * @generated
	 * @ordered
	 */
	CALIBRATING(3, "CALIBRATING", "CALIBRATING"),

	/**
	 * The '<em><b>ACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is active and might be already airborne. Motors are engaged.
	 * <!-- end-model-doc -->
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(4, "ACTIVE", "ACTIVE"),

	/**
	 * The '<em><b>CRITICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is in a non-normal flight mode. It can however still navigate.
	 * <!-- end-model-doc -->
	 * @see #CRITICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL(5, "CRITICAL", "CRITICAL"),

	/**
	 * The '<em><b>EMERGENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is in a non-normal flight mode. It lost control over parts or over the whole airframe. It is in mayday and going down.
	 * <!-- end-model-doc -->
	 * @see #EMERGENCY_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCY(6, "EMERGENCY", "EMERGENCY"),

	/**
	 * The '<em><b>POWEROFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System just initialized its power-down sequence, will shut down now.
	 * <!-- end-model-doc -->
	 * @see #POWEROFF_VALUE
	 * @generated
	 * @ordered
	 */
	POWEROFF(7, "POWEROFF", "POWEROFF");

	/**
	 * The '<em><b>STANDBY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is grounded and on standby. It can be launched any time.
	 * <!-- end-model-doc -->
	 * @see #STANDBY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDBY_VALUE = 0;

	/**
	 * The '<em><b>UNINIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uninitialized system, state is unknown
	 * <!-- end-model-doc -->
	 * @see #UNINIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNINIT_VALUE = 1;

	/**
	 * The '<em><b>BOOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is booting up
	 * <!-- end-model-doc -->
	 * @see #BOOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOT_VALUE = 2;

	/**
	 * The '<em><b>CALIBRATING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is calibrating and not flight-ready
	 * <!-- end-model-doc -->
	 * @see #CALIBRATING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CALIBRATING_VALUE = 3;

	/**
	 * The '<em><b>ACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is active and might be already airborne. Motors are engaged.
	 * <!-- end-model-doc -->
	 * @see #ACTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 4;

	/**
	 * The '<em><b>CRITICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is in a non-normal flight mode. It can however still navigate.
	 * <!-- end-model-doc -->
	 * @see #CRITICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_VALUE = 5;

	/**
	 * The '<em><b>EMERGENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System is in a non-normal flight mode. It lost control over parts or over the whole airframe. It is in mayday and going down.
	 * <!-- end-model-doc -->
	 * @see #EMERGENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCY_VALUE = 6;

	/**
	 * The '<em><b>POWEROFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System just initialized its power-down sequence, will shut down now.
	 * <!-- end-model-doc -->
	 * @see #POWEROFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POWEROFF_VALUE = 7;

	/**
	 * An array of all the '<em><b>System Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SystemStatus[] VALUES_ARRAY = new SystemStatus[] { STANDBY, UNINIT, BOOT, CALIBRATING, ACTIVE,
			CRITICAL, EMERGENCY, POWEROFF, };

	/**
	 * A public read-only list of all the '<em><b>System Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SystemStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>System Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemStatus get(int value) {
		switch (value) {
		case STANDBY_VALUE:
			return STANDBY;
		case UNINIT_VALUE:
			return UNINIT;
		case BOOT_VALUE:
			return BOOT;
		case CALIBRATING_VALUE:
			return CALIBRATING;
		case ACTIVE_VALUE:
			return ACTIVE;
		case CRITICAL_VALUE:
			return CRITICAL;
		case EMERGENCY_VALUE:
			return EMERGENCY;
		case POWEROFF_VALUE:
			return POWEROFF;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SystemStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //SystemStatus
