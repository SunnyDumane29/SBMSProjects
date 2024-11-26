package in.sunnyit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sunnyit.entity.Passport;

@Repository
public interface PassportRepo extends JpaRepository<Long , Passport> {

}
