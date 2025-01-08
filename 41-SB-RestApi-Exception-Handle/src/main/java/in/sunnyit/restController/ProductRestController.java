package in.sunnyit.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.sunnyit.binding.Products;
import in.sunnyit.exceptionHandle.ProductNotFoundException;

@RestController
public class ProductRestController {
	
	
	@GetMapping(value = "/product/{pid}")
	public ResponseEntity<Products> getProduct(@PathVariable("pid") Integer pid) throws Exception
	{
		//int i =19/0;
		
		if (pid == 1)
		{
		Products p1= new Products();
		p1.setId(1);
		p1.setName("Monitor");
		p1.setPrice(500.50);
		
		return new ResponseEntity<> (p1,HttpStatus.OK);
		
		}
		
		else {
			
			throw new ProductNotFoundException("Invalid ID");
			
		}
		
	}

}
