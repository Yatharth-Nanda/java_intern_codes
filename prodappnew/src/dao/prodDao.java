package dao;
import prod.model.Product;

import exceptions.ProductNotFoundException;
public interface prodDao {
void addProduct(Product p);
void deleteProduct(int prdId );
void updateProduct(int prdId );
void findProductbyId(int prdId) throws ProductNotFoundException;
}
