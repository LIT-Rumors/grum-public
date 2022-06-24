package validation;

public class Constraint implements IConstraint {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4886111336135277845L;
	private final String name;
	private final String code;
	private final String file;

	public Constraint(String file, String name, String code) {
		this.file = file;
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getFile() {
		return file;
	}

	@Override
	public String toString() {
		return getFile() + " | " + getName() + " | " + getCode().replace("\n", " ");
	}

}
