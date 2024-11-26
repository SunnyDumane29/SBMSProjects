package in.sunnyit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sunnyit.entity.Person;

@Repository
public interface PersonRepo extends  JpaRepository<Long ,Person>{

}
