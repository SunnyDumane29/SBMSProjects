package in.sunnyit.restControllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class WelcomeRestController {
	
	@Value("${msg}")
	private String msgText;
	
	@GetMapping (value = "/welcome")   
	public String getwelcomeMsg()
	{
		
		return msgText;
		
	}

}
