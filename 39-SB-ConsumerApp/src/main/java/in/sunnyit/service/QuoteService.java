package in.sunnyit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.sunnyit.binding.Product;
import in.sunnyit.binding.Quotes;

@Service
public class QuoteService {

	
	public void getQuotations()
	{
		String apiurl="https://dummyjson.com/quotes"; 
		
		//String apiurl="https://api.restful-api.dev/objects";
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Quotes[]> restEntity = rt.getForEntity(apiurl, Quotes[].class); //provider response body
		//ResponseEntity<String> restEntity = rt.getForEntity(apiurl, String.class);

		int value = restEntity.getStatusCode().value();
		if (value==200)
		{ 
			Quotes[] body = restEntity.getBody();
			
			
			for (Quotes q1 : body) 
			{
				System.out.println(q1.getQuote());
			}
			
		}

		
	}
	
	public Product getproduct(Integer pid)	
	{
		String apiUrl="https://api.restful-api.dev/objects/"+pid;
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Product> resEntity = rt.getForEntity(apiUrl, Product.class);
		
		int status = resEntity.getStatusCode().value();
		
		if(status==200)
		{
			Product product = resEntity.getBody();
			return product;
		}
		return null;
		
	}
	
	
}
