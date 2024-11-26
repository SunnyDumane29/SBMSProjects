package in.sunnyit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sunnyit.entity.Passport;
import in.sunnyit.entity.Person;
import in.sunnyit.repo.PassportRepo;
import in.sunnyit.repo.PersonRepo;

@Service
public class PersonService {

	
	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private PassportRepo passportRepo;
	
//	//Constructor Injection
//	public PersonService (PersonRepo personRepo ,PassportRepo passportRepo)
//	{
//		this.personRepo=personRepo;
//		this.passportRepo= passportRepo;
//		
//	}
	
	
	public void getPerson()
	{
		personRepo.findById(1);
	}
	
	
	public void savePerson() 
	{
		Person pr= new Person();
		pr.setName("Sunny Dumane");
		pr.setGender("Male"); 
		
		Passport po= new Passport();
		po.setPassportNum("ADR123D");
		po.setIssuedDate(LocalDate.now());
		po.setExpDate(LocalDate.now().plusYears(10));

		//Associating Person with passport
		pr.setPassport(po);
		
		//Associating passport with person
		po.setPerson(pr);
		
		//saving person record parent (automatically child class record also saved)
		personRepo.save(pr);
		
		
	}
	
}
