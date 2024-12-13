package in.sunnyit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	
	@GetMapping("/greet")
	public String getGreet(Model model)
	{
		model.addAttribute("msg", "Good Morning .....");

		return "index";

	}
	
	
	@GetMapping("/welcome")
	public String getWelcome(Model model)
	{
		int i= 10/0; //exception occured
		
		model.addAttribute("msg", "Welcome to app");
		
		return "index";
		
	}
	
	@ExceptionHandler(value = ArithmeticException.class)
	public String handleArithmException(ArithmeticException ae)
	{
		//logic
		// Stoaring exception in log files
		return "exView";
		
	}
	
	@ExceptionHandler(value = Exception.class)
	public String handleAnyException(Exception ae)
	{
		//logic
		// Stoaring exception in log files
		return "exView";
		
	}

}
