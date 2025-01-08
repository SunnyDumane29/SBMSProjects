package in.sunnyit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.sunnyit.binding.Product;
import reactor.core.publisher.Mono;

@Service
public class Productservice {
	
	
	//Get Request to server
	public Mono<Product> getProductDetails(Integer pid)
	{
		String apiUrl="http://api.restful-api.dev/objects/"+pid;
		
		WebClient webClient = WebClient.create();
		
		Mono<Product> bodyToMono = webClient.get()
		.uri(apiUrl)
		.retrieve()
		.bodyToMono(Product.class);
		
		return bodyToMono ;
		
		
	}
	public Mono<String> getProduct(Integer pid)
	{
		String apirl="http://api.restful-api.dev/objects/"+pid;
		  //1) >> http://localhost:9191/product/
		  //2) >> http://api.restful-api.dev/objects/1
		
		WebClient webClient = WebClient.create(); //implimentationclassobject
		
		Mono<String> bodytoMono = webClient.get()
				                   .uri(apirl) 
				                   .retrieve()
				                   .bodyToMono(String.class);
		
		return bodytoMono;
		
		//.accept() //bydefault it gives application/json format
		
	}
	
}
