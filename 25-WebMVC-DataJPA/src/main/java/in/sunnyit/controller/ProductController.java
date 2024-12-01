package in.sunnyit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.sunnyit.bindingEntity.Product;
import in.sunnyit.service.ProductServiceImpl;

@Controller
public class ProductController {
	
	@Autowired
	private ProductServiceImpl prodService;
	
//	public ProductController (ProductService prodService)
//	{
//		this.prodService=prodService;
//		
//	}
	

	// load Form - GET 
	@GetMapping("/product")
	public ModelAndView loadForm()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("pobj",new Product());  // empty object for form Binding 
		mav.setViewName("index");
		
		return mav;
		
	}
	
	//save Product - POST 
	@PostMapping("/product")
	public ModelAndView saveproduct(Product prodObj)
	{
		ModelAndView mav = new ModelAndView();
		
		boolean status = prodService.saveProduct(prodObj); // calling service method to give data to service
		
		if(status)
		{
	     mav.addObject("smsg","Product saved ....");
			
		}else {
			mav.addObject("emsg","No Product saved ....");
		}
		
		mav.addObject("pobj",new Product());  // empty object for form Binding 

		mav.setViewName("index");
		
		System.out.println(">>>>> :"+prodObj);
		
		return mav;
		
		
	}
	
	//get products - GET
	@GetMapping("/allProducts")
	public ModelAndView viewAllproduct(Product prodObj)
	{
		List<Product> allProduct = prodService.getAllProduct(); // service method to get all products

		ModelAndView mav = new ModelAndView();
		mav.addObject("pList", allProduct);// giving product list to View 
		mav.setViewName("data");
		
		return mav;
		
	}
	
	
}
