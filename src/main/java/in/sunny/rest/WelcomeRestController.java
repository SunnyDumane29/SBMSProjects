package in.sunny.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	
	@GetMapping("/")
	public String welcomeMsg()
	{
		return "Welcome to Spring Boot Security Project";
		
	}

	
	
}
