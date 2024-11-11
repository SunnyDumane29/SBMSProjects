package in.sunny.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingSector {
	
	
	@GetMapping("/")
	public String welcomeMsg()
	{
		return "Welcome to Spring Boot Security Project";
		
	}
	
	@GetMapping("/login")
	public String loginPage()
	{
		return "Welcome to Spring Boot Security Project";
		
	}
	
	@GetMapping("/about")	
	public String aboutBank()
	{
		return "Phone numbers : +91 35435432765328"
				+ "Location : Pune"
				+ "Region : India ";
	}
	
	@GetMapping("/withdraw")	
	public String transactionWithdraw()
	{
		return "Withdrawel Sucessfull";
	}
	
	@GetMapping("/deposite")	
	public String transactionDeposite()
	{
		return "Depositwe Sucessfull";
	}
	
	
}
