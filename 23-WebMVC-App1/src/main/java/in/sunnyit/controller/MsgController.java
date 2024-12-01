package in.sunnyit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	
	@GetMapping("/greet")
	public  ModelAndView getMsg2()
	{

		ModelAndView mav = new ModelAndView();

		mav.addObject("Msg2", "Good Morning....");

		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/welcome")
	public  ModelAndView getMsg1()
	{
		ModelAndView mav = new ModelAndView();

		mav.addObject("Msg1", "Welcome to sunny's App");

		mav.setViewName("index");

		return mav;

	}

}
