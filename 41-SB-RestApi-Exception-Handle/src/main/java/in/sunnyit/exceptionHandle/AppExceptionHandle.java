package in.sunnyit.exceptionHandle;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandle {

	@ExceptionHandler( value = Exception.class)
	public ResponseEntity<ExceptionInfo> handleException (Exception e)
	{
		ExceptionInfo exInfo= new ExceptionInfo();
		
		exInfo.setExCode("SBI0000");
		exInfo.setExMsg(e.getMessage());
		exInfo.setExDate(LocalDate.now());
		
		//String msg= e.getMessage();
		
		return new ResponseEntity<>(exInfo,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler( value = ProductNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handleException (ProductNotFoundException e)
	{
		ExceptionInfo exInfo= new ExceptionInfo();
		
		exInfo.setExCode("SBI0004");
		exInfo.setExMsg(e.getMessage());
		exInfo.setExDate(LocalDate.now());
		
		//String msg= e.getMessage();
		
		return new ResponseEntity<>(exInfo,HttpStatus.BAD_REQUEST);
	}
	
}
