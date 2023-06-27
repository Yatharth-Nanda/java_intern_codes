package exception;

public class InvalidUpiPinException extends Exception {
public InvalidUpiPinException()
{
	System.out.println(" You've exceeded the allowed number of entries for upi pin");
}
}
