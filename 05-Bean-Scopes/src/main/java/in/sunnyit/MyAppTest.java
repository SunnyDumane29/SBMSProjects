package in.sunnyit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppTest {

	
	public static void main(String[] args) {
		
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		//==================================================================================

		Engine eng = context.getBean(Engine.class);
		
		eng.dowork();
		
		ConfigurableApplicationContext configContext = (ConfigurableApplicationContext)context;
		configContext.close();
		
		//================================================================================== 
//		PwdService pwd1= context.getBean(PwdService.class);
//        String encryptedPwd=pwd1.ecryptPwd("Sunny@123");
//		
//		System.out.println("Encrypted Pwd :"+encryptedPwd);
		 
		//==================================================================================

//		PwdService pwd2= context.getBean(PwdService.class);
//		
//		UserDao pwd3= context.getBean(UserDao.class);
//		UserDao pwd4= context.getBean(UserDao.class);
//
//
//		
//		System.out.println( "Prototype :"+pwd1.hashCode());
//		System.out.println("Prototype :"+pwd2.hashCode());
//		System.out.println("Singleton :"+pwd3.hashCode());
//		System.out.println("Singleton :"+pwd4.hashCode());

		
		//==================================================================================

		
	}
}
