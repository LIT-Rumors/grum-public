package validation;

import java.io.Serializable;

public interface IViolation extends Serializable {

	IConstraint getConstraint();

}
