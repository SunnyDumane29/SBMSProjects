package in.sunnyit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sunnyit.service.IUserService;

public class MyAppTest {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		IUserService service = context.getBean(IUserService.class); // here we can get ambiquity problem while we use multiple implimentation classess for one interface
		
		System.out.println(service.getClass().getName()); // it getting name of class holding object 
		
		String name=service.getName(102);
		System.out.println("User Name show :"+name);
	}
}
