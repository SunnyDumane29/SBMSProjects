package in.sunnyit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class CircuitBreakerRestController {

	
	
	//Main Logic
	@GetMapping(value = "/fetchData")
	@CircuitBreaker(fallbackMethod = "getDataFromDB", name = "Sunny's_CircuiteBreaker")
	public String getDataFromRedis()
	{
		//logic to fetcg data from redis server
		
		//Give exception Is 
		
				int i= 10/0;
		
		System.out.println("**** Resdiss () - method exicuted (Main Logic)");
		
		return "Data Fetched from reddis server";
	}
	
	
	//Fallback Logic
	public String getDataFromDB(Throwable t)
	{
		//logic to fetcg data from DB server
		System.out.println("**** DB () - method exicuted ( Fallback Logic )");
		
		return "Data Fetched from Db server";
	}

}
