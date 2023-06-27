class Parent
{
	public void show()
	{
		System.out.println("I am in parent");
	}
}
class Child extends Parent
{
	public int show(int a)
	{
		return a;
	}
}
public class InheriDemo {
	public static void main(String[] args) {
		
		//Parent childObj= new Parent();
		Child childObj= new Child();
		
		childObj.show();
		System.out.println(childObj.show(10));
	}
}














