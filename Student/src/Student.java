
public class Student implements Comparable<Student> {

	private int marks ;
	private String name ;
	private String classname;
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return -this.marks+o.marks;
		
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + ", classname=" + classname + "]";
	}
	public Student(int marks, String name, String classname) {
		super();
		this.marks = marks;
		this.name = name;
		this.classname = classname;
	}
	
}
