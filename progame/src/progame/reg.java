package progame;
import java.util.Scanner;


public class reg {
     int regid;
     player p1;
     reg (player p,int regist)
     {
      p1=p;
      regid=regist;
     }
     public static void validate(player p1)
 	{
 		if(p1.getPlayerAge()>=18)
 	{System.out.println("Valid registration");
 	reg r1=new reg(p1,101);
 	
 	}
 else 
 	System.out.println("invalid registration");
 	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		player p1=new player();
	
		String name,id;
		int age;
		System.out.println("Enter the name of the player ");
		name=sc.next();
		p1.setPlayerName(name);
		System.out.println("Enter the age of the player ");
		age=sc.nextInt();
		p1.setPlayerAge(age);
		System.out.println("Enter the proofid of the player ");
		id=sc.next();
		p1.setProofId(id);		
		sc.close();
		validate(p1);

	}
	

}
