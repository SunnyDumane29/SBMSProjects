package in.sunnyit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sunnyit.entity.User;

@Repository
public interface UserRepo  extends JpaRepository<User, Integer>{

	
	
	public User findByEmailAndPwd(String email,String pwd); //for login 
	
}
