package in.sunnyit.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ProductNotFoundException extends Exception{
	
	
	public ProductNotFoundException ()
	{
		
	}
	
	public ProductNotFoundException (String msg)
	{
		super (msg);
	}

}
