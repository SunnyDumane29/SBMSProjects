package in.sunnyit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sunnyit.entity.Address;

public interface AddressRepo extends JpaRepository<Address , Integer>{

}
