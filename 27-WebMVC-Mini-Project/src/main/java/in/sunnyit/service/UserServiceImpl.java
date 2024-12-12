package in.sunnyit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sunnyit.entity.User;
import in.sunnyit.repo.UserRepo;
import in.sunnyit.utils.EmailUtils;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private EmailUtils emailutils;
	
	
//	public UserServiceImpl(UserRepo userRepo,EmailUtils emailutils)
//	{
//		this.userRepo=userRepo;
//		this.emailutils=emailutils;
//		
//	}
	
	@Override
	public boolean saveUser(User user)
	{
		User saveduser = userRepo.save(user);

		if (saveduser.getUid() != null) {
			String subject = "Your account creted - Sunny IT";
			String body = "Congratulation , You are on board..";

			emailutils.sendEmail(user.getEmail(), subject, body);

		}
		return true;
	}

	@Override
	public User getUser(String email, String pwd)
	{
		// login functionality

		return userRepo.findByEmailAndPwd(email, pwd);

	}

	
	
	
	
	
	
	
	
	
	
	
	
}
