package in.sunnyit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyApp {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		ATM atm1=context.getBean(ATM.class);
		
		atm1.withdraw();
	}
}
