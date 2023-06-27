package prodmain;
import java.util.HashMap;
import java.util.Map;
import prod.model.Product;
import dao.prodDaoImpl;
import exceptions.ProductNotFoundException;
public class productmain  {
public static void main (String[] args) throws ProductNotFoundException {
	//System.out.println("Enter the value of 3 products");
	prodDaoImpl prodobj=new prodDaoImpl();
	Product p1=new Product(101, "Milk", 2,100.00);
	prodobj.addProduct(p1);
	prodobj.addProduct(new Product(202, "Juice", 5,37.50));
	prodobj.addProduct(new Product(303, "Bread", 3,40.00));
	
	prodobj.deleteProduct(101);
	prodobj.updateProduct(202);
	
	prodobj.findProductbyId(303);
	
	
}
}
