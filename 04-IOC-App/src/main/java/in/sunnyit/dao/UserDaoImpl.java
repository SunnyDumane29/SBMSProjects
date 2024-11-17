package in.sunnyit.dao;

public class UserDaoImpl implements IUserDao {

	
	public String findName(int id) {
		//DB logic here 
		if (id == 100)
		{
			return "Raju";
		}
		else if (id == 101)
		{
			return "Rani";
		}
		
		return "there is no any user on this ID";
	}

}
