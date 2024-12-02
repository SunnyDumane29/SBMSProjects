package in.sunnyit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sunnyit.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact,Integer> {
	
	
	
	

}
