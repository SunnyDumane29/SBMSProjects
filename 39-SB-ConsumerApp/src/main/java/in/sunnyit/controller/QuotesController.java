package in.sunnyit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.sunnyit.binding.Product;
import in.sunnyit.binding.Quotes;
import in.sunnyit.service.QuoteService;

//@RestController
@Controller
public class QuotesController {
	
	
	@Autowired
	private QuoteService service;
	
	@GetMapping ("/")
	public String index(Model model)
	{
		service.getQuotations();
		
		return "index";
		
	}
	
	@GetMapping ("/AllQuotes")
	public ResponseEntity<Quotes> getallQutation(Quotes qt)
	{
		service.getQuotations();
		
		return new ResponseEntity<>(qt,HttpStatus.OK);
		
	}
	
	@GetMapping ("/product/{pid}")
	public String getProduct(@PathVariable("pid")Integer pid,Model model)
	{
		Product product = service.getproduct(pid);
		
		System.out.println(product);
		model.addAttribute("p", product);
		
		return "index";
		//return new ResponseEntity<>(product,HttpStatus.OK);
		
	}

}
