package in.sunnyit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.sunnyit.binding.Product;
import in.sunnyit.service.Productservice;
import reactor.core.publisher.Mono;

@RestController
public class ProductRestController {

	@Autowired
	private Productservice service;
	
	@GetMapping("/product/{pid}")
	public ResponseEntity<Mono<String>> getProducts(@PathVariable ("pid") Integer pid)
	{
		Mono<String> product = service.getProduct(pid);
		
		return new ResponseEntity<>(product,HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/productDetails/{pid}",
			   produces = "application/json")
	public ResponseEntity<Mono<Product>> getProductDetails(@PathVariable ("pid") Integer pid)
	{
		Mono<Product> productDetails = service.getProductDetails(pid);
		
		return new ResponseEntity<>(productDetails,HttpStatus.OK);
		
	}
	
}
