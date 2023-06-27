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
	prodobj.addProduct(new Product(301, "Bread", 3,40.00));
	prodobj.addProduct(new Product(303, "Bread", 3, 40.00));
    prodobj.addProduct(new Product(101, "Laptop", 1, 1500.00));
    prodobj.addProduct(new Product(205, "Headphones", 2, 80.00));
    prodobj.addProduct(new Product(408, "Camera", 1, 500.00));
	
	prodobj.deleteProduct(101);
	prodobj.updateProduct(202);
	System.out.println("Printing elements that cost over 100");
	prodobj.getProdByPrice(100).forEach(ele->System.out.println(ele));
	
	
  
	
	
}
}
