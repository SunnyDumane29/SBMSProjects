package in.sunnyit;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public UserDao()
	{
		System.out.println("UserDao :: Constructor");
	}
	
}
