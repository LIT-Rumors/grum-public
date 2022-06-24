/**
 */
package at.jku.lit.grum.dronology.model.dronology;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Flight Plan Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.jku.lit.grum.dronology.model.dronology.DronologyPackage#getFlightPlanStatus()
 * @model
 * @generated
 */
public enum FlightPlanStatus implements Enumerator {
	/**
	 * The '<em><b>PLANNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNED_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNED(1, "PLANNED", "PLANNED"),

	/**
	 * The '<em><b>FLYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLYING_VALUE
	 * @generated
	 * @ordered
	 */
	FLYING(2, "FLYING", "FLYING"),

	/**
	 * The '<em><b>COMPLETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(0, "COMPLETED", "COMPLETED"),

	/**
	 * The '<em><b>ON HOLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_HOLD_VALUE
	 * @generated
	 * @ordered
	 */
	ON_HOLD(0, "ON_HOLD", "ON_HOLD");

	/**
	 * The '<em><b>PLANNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_VALUE = 1;

	/**
	 * The '<em><b>FLYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLYING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLYING_VALUE = 2;

	/**
	 * The '<em><b>COMPLETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 0;

	/**
	 * The '<em><b>ON HOLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_HOLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_HOLD_VALUE = 0;

	/**
	 * An array of all the '<em><b>Flight Plan Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FlightPlanStatus[] VALUES_ARRAY = new FlightPlanStatus[] { PLANNED, FLYING, COMPLETED,
			ON_HOLD, };

	/**
	 * A public read-only list of all the '<em><b>Flight Plan Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FlightPlanStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Flight Plan Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlightPlanStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlightPlanStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flight Plan Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlightPlanStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlightPlanStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flight Plan Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlightPlanStatus get(int value) {
		switch (value) {
		case PLANNED_VALUE:
			return PLANNED;
		case FLYING_VALUE:
			return FLYING;
		case COMPLETED_VALUE:
			return COMPLETED;
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
	private FlightPlanStatus(int value, String name, String literal) {
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

} //FlightPlanStatus
