package validation;

import java.io.Serializable;

public interface IConstraint extends Serializable{

	String getCode();

	String getName();

	String getFile();

}
