package in.sunnyit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sunnyit.entity.Person;
import in.sunnyit.entity.PersonPK;

public interface PersonRepo extends JpaRepository <Person, PersonPK>{

}
