package dao;
import java.util.Optional;

import prod.model.Product;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import exceptions.ProductNotFoundException;
public class prodDaoImpl implements addProdDao, deleteProdDao,findProdDao,updateProdDao,getProdByPriceDao
{
	Map<Integer, Product>m=new HashMap<>();
 static Scanner sc=new Scanner(System.in);
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		int i=Integer.valueOf(p.getProdId());
		m.put(i,p);
	
	}

	@Override
	public void deleteProduct(int prdId) {
		int flag=0;
		
		
		
		
		
		for(Map.Entry<Integer, Product> entry : m.entrySet())
		{ 
			if(entry.getKey()==prdId)
		{m.remove(prdId);
		flag=1;
		System.out.println("Successful product deletion");
		break;
		}
		}
		if(flag==0)
			System.out.println("invalid product ID");
		}
	

	@Override
	public void updateProduct(int prdId) {
		int flag=0;
		for(Map.Entry<Integer, Product> entry : m.entrySet())
		{ 
			if(entry.getKey()==prdId)
		{
				Product p=m.get(prdId);
		
		System.out.println("Enter the new value of pid,pname ,price ,qty to be updated ");
		int pid=sc.nextInt();
		String pname=sc.next();
		Double price=sc.nextDouble();
		int qty=sc.nextInt();
		p.setPrice(price);
		p.setProdId(pid);
		p.setQtyinHand(qty);
		p.setProdName(pname);
		System.out.println("Succesfully update details");
		flag=1;
		break;
		}
	}
		if(flag==0)
			System.out.println("invalid product ID");
	}

	@Override
	public void findProductbyId(int prdId) throws ProductNotFoundException
	{
		// TODO Auto-generated method stub
		
		
        
		Optional<Map.Entry<Integer, Product>> ele=m.entrySet().stream()
		        .filter(entry -> entry.getKey() == prdId)
		        .findFirst();
		if(!(ele.isPresent()))
				throw new ProductNotFoundException();
		
		
		
	
		
	
	}

	@Override
	public Stream<Map.Entry<Integer, Product>> getProdByPrice(int price) {
		// TODO Auto-generated method stub
		return m.entrySet().stream().filter(ele->ele.getValue().getPrice()>=price);
	}

}
