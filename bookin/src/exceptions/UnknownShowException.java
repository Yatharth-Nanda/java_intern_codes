package exceptions;

public class UnknownShowException extends Exception {

	public UnknownShowException()
	{
		System.out.println("The show you are trying to find is not available ");
}
}
