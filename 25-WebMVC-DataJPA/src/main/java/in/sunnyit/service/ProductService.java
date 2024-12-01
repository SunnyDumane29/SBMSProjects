package in.sunnyit.service;

import java.util.List;

import in.sunnyit.bindingEntity.Product;

public interface ProductService {

	public boolean saveProduct(Product product);
	
	public List<Product> getAllProduct();
	
	
}
