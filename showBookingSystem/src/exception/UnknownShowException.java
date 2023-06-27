

package exception;

public class UnknownShowException extends Exception{
	/**
	 * Unique UID for serialization.
	 */
	private static final long serialVersionUID = 1L;

	public UnknownShowException(String message) {
		super(message);
	}
}