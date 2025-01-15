package in.sunnyit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sunnyit.clients.WelcomeApiFeignClient;

@RestController
public class GreetingsRestController {
	
	@Autowired
	private WelcomeApiFeignClient weclomeClient;
	
	@Autowired
	private Environment env;
	
	
	
	@GetMapping(value = "/greet", produces = "text/plain")
	public ResponseEntity<String> getGreetApi()
	{
		String serverPortNum = env.getProperty("server.port");
		String responseWelcomeApi = weclomeClient.invokeWelcomeApi();
		
		String msg = serverPortNum+" < Good Morning Sunny.. ! :: "+responseWelcomeApi;
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}

} 
