package in.sunnyit.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient (value = "WELCOMEAPI")
public interface WelcomeApiFeignClient {

	@GetMapping(value = "/welcome")
	public String invokeWelcomeApi();
	
}
