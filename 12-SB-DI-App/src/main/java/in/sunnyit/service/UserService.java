package in.sunnyit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sunnyit.dao.UserDao;

@Service
public class UserService {
	
	private UserDao userDao;
	
	//Autowiring at setter Injection
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		System.out.println("setUserDao() - Called ....");
		this.userDao = userDao;
	}
 
	
	public UserService()
	{
		System.out.println("UserService Class :: 0-Param Constructor");
	}

	@Autowired
	public UserService(UserDao userDao)
	{
		System.out.println("UserService Class :: 1-Param Constructor");
		this.userDao=userDao;
	}
	
	
	public void getName(int id)
	{
		String findName=userDao.findName(id);
		System.out.println("Name ::"+findName);
	}

}
