package in.sunnyit.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = ProductNotFoundException.class)
	public String handleProductExc(ProductNotFoundException pne)
	{
		//logic
		
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
