package in.sunnyit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sunnyit.repo.PassportRepo;
import in.sunnyit.repo.PersonRepo;

@Service
public class PassportService {
	
	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private PassportRepo passportRepo;
	
//	//Constructor Injection
//	public PassportService (PersonRepo personRepo ,PassportRepo passportRepo)
//	{
//		this.personRepo=personRepo;
//		this.passportRepo= passportRepo;
//		
//	}
	
	

}
