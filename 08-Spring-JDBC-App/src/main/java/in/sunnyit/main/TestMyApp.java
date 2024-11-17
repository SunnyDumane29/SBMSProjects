package in.sunnyit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sunnyit.service.BookService;

public class TestMyApp {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		BookService bookserviceObj =context.getBean(BookService.class);
		
		bookserviceObj.saveBook();
	}
}
