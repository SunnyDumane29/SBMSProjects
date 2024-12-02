package in.sunnyit.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.sunnyit.entity.Contact;
import in.sunnyit.repo.ContactRepo;

@Component
public class MyAppRunner implements ApplicationRunner{

	@Autowired
	private ContactRepo contactRepo;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		
		Contact ct= new Contact();
		ct.setName("Mayuri");
		ct.setPhno(13254366L);
		
		Contact ct2= new Contact();
		ct2.setName("Sunny");
		ct2.setPhno(98643567L);
		
		contactRepo.saveAll(Arrays.asList(ct,ct2));
		
		
	}

}
