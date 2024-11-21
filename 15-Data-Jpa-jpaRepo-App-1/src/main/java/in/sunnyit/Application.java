package in.sunnyit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sunnyit.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeService empservice = context.getBean(EmployeeService.class);
		 
		//empservice.getAllEmps(); // getting all records 
		
		//empservice.getAllEmpsWithsort(); // getting all records in ascending order or descending order
		
		//empservice.getAllEmpsPagination();// pagination on perticular reciords
		
		empservice.getAllEmpsWithFilters();
		
		
	}

}
