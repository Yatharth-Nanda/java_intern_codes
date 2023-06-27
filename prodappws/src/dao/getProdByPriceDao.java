package dao;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Stream;

import prod.model.Product;

public interface getProdByPriceDao {
	Stream<Entry<Integer, Product>> getProdByPrice(int price);
}
