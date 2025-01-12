package in.sunnyit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sunnyit.clients.WelcomeApiFeignClient;

@RestController
public class GreetingsRestController {
	
	@Autowired
	private WelcomeApiFeignClient weclomeClient;
	
	
	@GetMapping(value = "/greet", produces = "text/plain")
	public ResponseEntity<String> getGreetApi()
	{
		String responseWelcomeApi = weclomeClient.invokeWelcomeApi();
		
		String msg = "Good Morning Sunny.. ! :: "+responseWelcomeApi;
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}

} 
