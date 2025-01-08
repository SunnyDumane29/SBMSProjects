package in.sunnyit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sunnyit.binding.Product;

@RestController
public class ProductRestcontroller
{
	
	

	@GetMapping(value = "/product",produces = {"application/json","application/xml"}) //
	public ResponseEntity<Product> getProduct()
	{ 
		Product p1= new  Product(101, "monitor", 1000.00);
		System.out.println(p1);
		return  new ResponseEntity<>(p1,HttpStatus.OK);
		
	}
	 
	
	@PostMapping (value ="/addProduct", 
			consumes={"application/json" ,"application/xml" },
			produces = "text/plain")
	public ResponseEntity<String> addProduct (@RequestBody  Product p)
	{
		System.out.println(p);

		return new ResponseEntity<> ("Product added to Catlog", HttpStatus.CREATED);
		
	}
}
