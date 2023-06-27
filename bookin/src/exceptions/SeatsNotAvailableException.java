package exceptions;

public class SeatsNotAvailableException extends Exception {

	public SeatsNotAvailableException()
	{
		System.out.println(" The show you are trying to book for does not have enough seats available");
	}
}
