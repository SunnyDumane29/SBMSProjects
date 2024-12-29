package in.sunnyit.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	//Query-parameter
	@GetMapping("/welcome")
	public String getWelcomeMsg(@RequestParam ("name")String name)
	{
		String msg= name+":Welcome to Rest-API";
		return msg;
		
	}
	
	//Path-parameter
	@GetMapping("/greet/{name}")
	public String getGreetMsg(@PathVariable("name")String name)
	{
		String msg= "Good Morning...!!";
		return msg;
		
	}
	
	
	@PostMapping("/date")
	public String getDate()
	{
		LocalDate now = LocalDate.now();
		
		return String.valueOf(now);
		
	}

	@GetMapping(value="/msg", produces ="text/plain")
	public ResponseEntity<String> getMsg()
	{
		String msg= "Welcome to Sunny IT";
		return new ResponseEntity<>(msg,HttpStatus.OK);
		//return new ResponseEntity<>(msg,HttpStatus.NO_CONTENT);

	}
	
	
	
	
}
