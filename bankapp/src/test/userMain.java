package test;
import exception.InsufficientFundsException;
import exception.InvalidOTPException;
import exception.InvalidProfilePasswordException;
import exception.InvalidUpiPinException;
import model.User;
import java.util.Scanner;
public class userMain {
public static void main(String[] args) throws InsufficientFundsException,InvalidOTPException,InvalidProfilePasswordException, InvalidUpiPinException
{
User u1=new User("Yatharth","1052465",10000,"abcdef",4567);
System.out.println("Enter profile password to be set ");
Scanner sc=new Scanner(System.in);
String pp=sc.next();
u1.setProfilepassword(pp);
int otpuser=1234;
System.out.println("Enter the amount to be withdrawn");
int wd=sc.nextInt();
System.out.println("Enter the profile password ");
pp=sc.next();
System.out.println("Enter the upi pin for the user ");
int upi=sc.nextInt();
if(!(pp.equals(u1.getProfilepassword())))
	
		{
	throw new InvalidProfilePasswordException ();
		}
else if(u1.getCurr_bal()<wd)
{
	throw new InsufficientFundsException();
}
else if (upi!=u1.getUpipin())
	throw new InvalidUpiPinException();
else 
	{System.out.println("Enter the otp for the transaction");
	int count =0,flag=0;
	do
	{
	int otp=sc.nextInt();
	if(otp!=otpuser)
	{
		count++;
		System.out.println("Enter the right otp , you have "+(4-count)+" tries remaining");
	}
	else 
	{flag=1;
	break;
	}
	}while(count<=3);
	
	if(flag==0)
		throw new InvalidOTPException();
	else 
		{u1.setCurr_bal(u1.getCurr_bal()-wd);
		System.out.println("Succesful transaction of "+wd+ " rupees");
		}
	}
	
sc.close();
}
}
