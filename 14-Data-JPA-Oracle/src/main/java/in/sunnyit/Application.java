package in.sunnyit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sunnyit.entities.ContactMasterEntity;
import in.sunnyit.service.saveContact;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		saveContact save = context.getBean(saveContact.class);
		
		save.saveContactInfo();
		
		
		
	}

}
