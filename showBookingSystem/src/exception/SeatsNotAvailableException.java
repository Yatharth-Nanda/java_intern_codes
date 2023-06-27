

package exception;

public class SeatsNotAvailableException extends Exception{
	/**
	 * Unique UID for serialization.
	 */
	private static final long serialVersionUID = 1L;

	public SeatsNotAvailableException(String message) {
		super(message);
	}
}
