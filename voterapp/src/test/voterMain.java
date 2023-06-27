package test;

import model.Voter;
import exception.voterException;
public class voterMain {
public static void main(String[] args) throws voterException{
	{
		Voter voter1=new Voter("Ram","Shankar",-17);
		
		if(voter1.getAge()>=18)
			System.out.println("Eligilbe for registration ");
		else if (voter1.getAge()<18&&voter1.getAge()>0)
			System.out.println("Not eligible for registration ");
		else if(voter1.getAge()<0)
			throw new voterException();
			
			
		
	
	
	}
}
}
