package in.sunnyit.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import in.sunnyit.entity.Product;
import in.sunnyit.repo.ProductRepo;

@Service
public class Productservice {

	private ProductRepo productRepo;
	
	public Productservice (ProductRepo productRepo)
	{
		this.productRepo=productRepo;
		
	}
	
	public void saveproduct()
	{
		Product p= new Product();
		
		//p.setPid(3);
		p.setName("Chock");
		p.setPrice(500.00);
		
//		p.setCreatedDate(LocalDate.now());
//		p.setUpdatedDate(LocalDate.now());
		
		productRepo.save(p);
		
	}
}
