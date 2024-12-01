package in.sunnyit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.sunnyit.bindings.Book;

@Controller
public class BookController {
	
	
	//method 1 : to load form
	@GetMapping("/book")
	public ModelAndView loadForm()
	{
		ModelAndView mav= new ModelAndView();
		mav.addObject("bookObj",new Book());
		mav.setViewName("bookView");

		return mav;
		
	}
	
	//method 2 : to handel submission
	@PostMapping("/book")
	public ModelAndView handleBookSubmission(Book book)
	{
		System.out.println("Book Object :"+book);
		//todo : saveData in DB
		
		ModelAndView mav= new ModelAndView();
		
		mav.addObject("msg","Book saved sucessfulluy ....");
		mav.setViewName("success");

		return mav;
	}
	

	

}
