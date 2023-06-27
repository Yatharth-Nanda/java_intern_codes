

package exception;

public class InvalidSeatNumberException extends Exception{
	/**
	 * Unique UID for serialization.
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSeatNumberException(String message) {
		super(message);
	}
}
