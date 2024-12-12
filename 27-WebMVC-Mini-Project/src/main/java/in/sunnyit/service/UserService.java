package in.sunnyit.service;

import in.sunnyit.entity.User;

public interface UserService {

	
	public boolean saveUser(User user); // user registration
	
	public User getUser(String email, String pwd); // for login
	
	//public User findByEmailAndPasswor();
	
	
}
