package in.sunnyit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
@Autowired
private Environment env;

	
	@GetMapping (value = "/welcome" , produces = "text/Plain")
	public ResponseEntity<String> getwelcomeApi()
	{
		String portNum = env.getProperty("server.port");
		
		String msg = "welcome to sunny IT Clasess, from port Num:"+portNum;
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
	
}
