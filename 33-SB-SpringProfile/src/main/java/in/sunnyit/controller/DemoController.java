package in.sunnyit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@Value("${msgText}")
	private String msg;
	
	
	@GetMapping("/")
	@ResponseBody
	public String getMsg()
	{
		
		return msg;
	}

}
