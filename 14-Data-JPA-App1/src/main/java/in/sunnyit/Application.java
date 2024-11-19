package in.sunnyit;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sunnyit.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmpService empService = context.getBean(EmpService.class);
		
		//empService.saveemployee();
		
		//empService.deleteEmployeeID(185);
		
		//empService.saveAllEmps();
		
		//empService.getEmpOnId(197); //data found
		
		//empService.getEmpOnId(400); //data found
		
		//empService.getMultipleEmploOnID(Arrays.asList(125,185,197,201,209)); //list of employees on given ids 
		
		//empService.allRecords();// get all records from DB
		
		//empService.findEmploByName("sunny"); // find by name
		
		//empService.findEmploBySalary(343788.84); // find by salary
		
		//empService.findEmploBySalaryGreaterThan(343788.84); //find salary Greater than
		
		
		empService.callCustomqyeries(); //custom all queries
		
		
		
		
		
	}

}
