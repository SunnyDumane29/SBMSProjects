package in.sunnyit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.sunnyit.bindings.User;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public ModelAndView loadForm()
	{
		ModelAndView mav= new ModelAndView();
		
		mav.addObject("userObj",new User());
		
		mav.setViewName("index");
		
		return mav;
		
	}	
	
	@PostMapping("/user")
	public ModelAndView handelUserForm(User user)
	{
		System.out.println("Form data >>"+user);
		//Save data in DB
		
		
        ModelAndView mav= new ModelAndView();
        mav.addObject("msg","User Details saved");
        mav.setViewName("success");
        
		
		return mav;
	}

}
