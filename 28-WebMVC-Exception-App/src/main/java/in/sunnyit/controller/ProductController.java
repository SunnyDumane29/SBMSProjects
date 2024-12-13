package in.sunnyit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.sunnyit.exception.ProductNotFoundException;

@Controller
public class ProductController {

	@GetMapping("/product")
	public String getProduct() throws Exception
	{
		try {
			//logic
			throw new ProductNotFoundException("Invalid Data");

		}
		catch (Exception e)
		{
			//logger
		}
		
		
		return "index";
		
	}
	
}
