package in.sunnyit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.sunnyit.entities.ContactMasterEntity;

@Repository
public interface ContactMasterRepo extends CrudRepository< ContactMasterEntity, Integer> {

}
