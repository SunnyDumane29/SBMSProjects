package in.sunnyit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sunnyit.dao.UserDao;
import in.sunnyit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
//		System.out.println(context.getClass().getName());
//		System.out.println(context.getBeanDefinitionCount());
		
//		UserDao obj1 = context.getBean(UserDao.class);  
//		String FindNAme=dao1.findName(100); 
		
		UserService obj2 = context.getBean(UserService.class);
		obj2.getName(100);
		
		//System.out.println();
	}

}
