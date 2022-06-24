package api;

public class PublishException extends Exception {

	public PublishException(Exception e) {
		super(e);
	}

	public PublishException(String message) {
		super(message);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
