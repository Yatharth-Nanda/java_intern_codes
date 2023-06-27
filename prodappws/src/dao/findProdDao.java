package dao;

import exceptions.ProductNotFoundException;

public interface findProdDao {
	public void findProductbyId(int prdId) throws ProductNotFoundException;
}
