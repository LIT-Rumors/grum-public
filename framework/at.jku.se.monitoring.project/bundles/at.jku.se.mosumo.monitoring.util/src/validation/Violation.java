package validation;

public class Violation implements IViolation {

	private IConstraint constraint;
	private String id;
	private Class classz;
	private String elem;

	public Violation(String id,IConstraint constraint, Class classz, String elem) {
		this.id = id;
		this.classz= classz;
		this.constraint = constraint;
		this.elem = elem;
	}
	
	
	@Override
	public String toString() {
		return 	constraint + " ==> " + elem;
	}
	
	@Override
	public IConstraint getConstraint() {
		return constraint;
	}

}
