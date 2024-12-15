package in.sunnyit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgController {

	@GetMapping ("/greet")
	public String greetMethod(Model model)
	{
		model.addAttribute("msg", "Good Morning");
		return "index";
	}
	
	@GetMapping ("/welcome")
	@ResponseBody
	public String welcomeMethod(@RequestParam ("name") String name)
	{
		return "welcome "+name+" to sunny's It Course";
		
	}
	
	@GetMapping ("/greetUser/{name}")
	@ResponseBody
	public String greetToUser(@PathVariable("name") String name)
	{
		return name+" Good Morning......";
		
	}
	
	
}
