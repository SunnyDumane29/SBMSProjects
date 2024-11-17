package in.sunnyit.service;

import in.sunnyit.dao.IUserDao;

public class UserServiceImpl implements IUserService {

	
	private IUserDao userDao;
	
	public UserServiceImpl()
	{
		System.out.println(" UserServiceImpl :: no arg Constructor");
	}
	
	public UserServiceImpl(IUserDao userdao)
	{
		System.out.println(" UserServiceImpl :: One arg Constructor ()");
		this.userDao = userdao;
	}
	
	public String getName(int id) {

		String name=userDao.findName(id);
		
		return name;
	}

}
