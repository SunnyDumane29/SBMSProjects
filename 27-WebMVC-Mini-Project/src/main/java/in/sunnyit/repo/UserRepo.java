package in.sunnyit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sunnyit.entity.User;

public interface UserRepo  extends JpaRepository<User, Integer>{

	
	
	public User findByEmailAndPwd(String email,String pwd); //for login 
	
}
