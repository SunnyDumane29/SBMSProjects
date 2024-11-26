package in.sunnyit.seervice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sunnyit.entity.Person;
import in.sunnyit.entity.PersonPK;
import in.sunnyit.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo personrepo;
	
	
//	public PersonService(PersonRepo personrepo)
//	{
//		this.personrepo= personrepo;
//	}
	

	public void savePerson()
	{
		//Pks class Embedded class
		PersonPK pks= new PersonPK();
		pks.setPersonId(101);
		pks.setPassportNum("asdhgas1234rzdmjad67");
		
		//person class entity 
		Person p = new Person();
		p.setName("Sunny");
		p.setGender("Male");
		p.setEmail("sunny435342@gmail.com");
		
		p.setPersonPk(pks);// setting pks in person class
	
		
		personrepo.save(p);
		
		System.out.println("Person saved .....");
	}

	
	public void getPerson()
	{
		//Pks class Embedded class
				PersonPK pks= new PersonPK();
				pks.setPersonId(101);
				pks.setPassportNum("asdhgas1234rzdmjad67");
				
		    Optional<Person> findById = personrepo.findById(pks);
		    
		    if (findById.isPresent())
		    {
		    	Person person = findById.get();
		    	System.out.println(person);
		    	
		    }
		
		
	}
	
	
	
}
