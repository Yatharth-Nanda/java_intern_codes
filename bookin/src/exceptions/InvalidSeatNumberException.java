package exceptions;

public class InvalidSeatNumberException extends Exception{

	public InvalidSeatNumberException()
	{
		System.out.println(" The seat number entered is invalid");
	}
}
