import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class presentation {
public static void main(String[] args) {
	
	List <Student> studentList=new ArrayList<>();
	  studentList.add(new Student(66, "Sophia", "B"));
	    studentList.add(new Student(67, "Ethan", "A"));
	    studentList.add(new Student(68, "Ava", "B"));
	    studentList.add(new Student(69, "Liam", "A"));
	studentList.add(new Student(65,"yatharth" ,"A"));
	studentList.add(new Student(65, "Yatharth", "A"));
  
    Collections.sort(studentList);
    studentList.stream().forEach(s->System.out.println(s));
    
	
	
}
}
