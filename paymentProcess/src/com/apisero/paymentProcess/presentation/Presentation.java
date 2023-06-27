package com.apisero.paymentProcess.presentation;
import com.apisero.paymentProcess.service.paymentServiceImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.apisero.paymentProcess.model.Payment;
public class Presentation {
	public static void main(String[] args)throws SQLException {

	
paymentServiceImpl servobj=new paymentServiceImpl() ;
int a;;
Scanner sc=new Scanner(System.in);
System.out.println("Select Option:\n"
		+ "1.Customer list\n"
		+ "2.Yearly Customer List\n"
		+ "3.All Customer Details\n"
		+ "4. Exit");
a=sc.nextInt();
switch(a)
{
case 1:System.out.println("Enter customer number");
		int custno=sc.nextInt();
		List<Payment> plist=servobj.findCustomerById(custno);
		for(Payment p:plist)
		{
			System.out.println("customer id fetched for year= :"+p);
		}
		break;
case 2:System.out.println("Enter year");
int year=sc.nextInt();
List<Payment> plisty=servobj.findCustomerByYear(year);
for(Payment p:plisty)
{
	System.out.println("customer id fetched="+p);
}
break;
case 3:System.out.println("Printing all records");
	   List<Payment>all=servobj.getAllRecord();
	   for(Payment p:all)
	   {
	   	System.out.println("customer id fetched for all records ="+p);
	   }
	   break;
	   


}
	// TODO Auto-generated method stub

}

}
