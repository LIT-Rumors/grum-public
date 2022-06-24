package validation;

public class ValidationFactory {

	public static IViolation createViolation(String id, IConstraint constraint, Object underlying) {
		return new Violation(id, constraint,underlying.getClass(), underlying.toString());
	}

	public static IConstraint createConstraint(String file, String name, String code) {
		return new Constraint(file, name, code);
	}

}
