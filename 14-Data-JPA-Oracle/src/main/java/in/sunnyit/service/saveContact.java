package in.sunnyit.service;

import org.springframework.stereotype.Service;

import in.sunnyit.entities.ContactMasterEntity;
import in.sunnyit.repositories.ContactMasterRepo;

@Service
public class saveContact {
	
	private ContactMasterRepo contactMasterRepo;
	
	
	public saveContact(ContactMasterRepo contactMasterRepo)
	{
		this.contactMasterRepo=contactMasterRepo;
	}

	
	public void saveContactInfo()
	{
		ContactMasterEntity entity= new ContactMasterEntity();
		
		entity.setContactId(2324);
		entity.setContact_name("sunny");
		entity.setContact_number(9049185110L);
		
		contactMasterRepo.save(entity);
		
		System.out.println("Records are saved .....");
		
	}
	
}
