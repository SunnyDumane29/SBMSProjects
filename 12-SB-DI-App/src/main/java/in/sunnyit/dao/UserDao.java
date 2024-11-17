package in.sunnyit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	
	public UserDao ()
	{
		System.out.println("UserDao Calss ::0-Param Constructor");
	}
	
	public String findName(int id)
	{
		if (id ==100)
		{
			return "Jhon";
		}
		else {
			return "Smith";
		}
	}
}
