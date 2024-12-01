package in.sunnyit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sunnyit.bindingEntity.Product;
import in.sunnyit.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productRepo;
	
//	public ProductService (ProductRepo productRepo)
//	{
//		this.productRepo=productRepo;
//		
//	}
	
	
	public boolean saveProduct(Product product)
	{
		Product savedProd = productRepo.save(product);
		
		return  savedProd.getPid()!=null;
		
	}
	
	public List<Product> getAllProduct()
	{
		List<Product> allProds = productRepo.findAll();
		
		return allProds;
		
		
	}
	
	
	

}
