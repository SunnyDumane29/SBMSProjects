package in.sunnyit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.sunnyit.entityBinding.User;
import jakarta.validation.Valid;

@Controller
public class UserController {

	
	@GetMapping("/")
	public String loadForm(Model model)
	{
		model.addAttribute("user", new User());
		
		return "index";
		
	}
	
	@PostMapping("/user")
	public String handleSubmit (@Valid User user, BindingResult result,Model model)
	{
       if (result.hasErrors())
		{
    	   // Validation failed
			return "index";

		} 
       else {
    	   //validation Passed
			System.out.println(user);

			model.addAttribute("msg", "user Saved");

			// logic

			return "index";
		}
	}
}
