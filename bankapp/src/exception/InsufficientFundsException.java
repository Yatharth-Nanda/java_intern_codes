package exception;

public class InsufficientFundsException extends Exception{
	public InsufficientFundsException()
	{
	System.out.println("The funds cannot be drawn due to insufficient balance  ");
	}
}
