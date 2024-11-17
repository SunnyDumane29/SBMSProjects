package in.sunnyit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sunnyit.util.AppSecurity;

@Configuration
public class AppConfig {

	
	public AppConfig()
	{
		System.out.println("AppConfig  :: Constructor");
	}
	
	
	@Bean
	public AppSecurity security()
	{
		// here creating another class object using @Bean Annotation
		
		AppSecurity se = new AppSecurity();
		return se;
	}
}
