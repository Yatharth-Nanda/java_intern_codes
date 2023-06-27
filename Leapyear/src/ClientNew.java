import java.util.Scanner;
public class ClientNew {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year:");
	int year=sc.nextInt();

	if(isLeapYear(year))
		System.out.println("The entered year is a leap year");
	else 
		System.out.println("The entered year is not a leap year");
	sc.close();
		
	}
	
	public static boolean isLeapYear(int year)
	{ if (year<=0)
		return false;
		  if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		         return true;
		      else
		         return false;

}
}

