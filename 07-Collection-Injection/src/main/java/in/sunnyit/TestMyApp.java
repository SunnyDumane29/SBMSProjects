package in.sunnyit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyApp {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Student std1= context.getBean(Student.class);
		
		System.out.println(std1);
//		std1.setr
	}
}
