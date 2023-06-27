package exception;

public class InvalidProfilePasswordException extends Exception{

	public InvalidProfilePasswordException()
	{
	System.out.println("The entered profile password is invalid ");
	}
}
