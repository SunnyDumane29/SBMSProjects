package in.sunnyit.converter;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.sunnyit.binding.Customer;

public class AppTest {

	public void convertJavaToJson() throws StreamWriteException, DatabindException, IOException
	{
		Customer cm = new Customer( 101,"sunny",12432763L);
			
		//convert java object to json 
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), cm);
		 
		System.out.println("serialization complete");
		
		
		
	}
	
	public void convertJsonToJava() throws StreamWriteException, DatabindException, IOException
	{
		
		ObjectMapper mapper = new ObjectMapper();
		Customer cmObj = mapper.readValue(new File("customer.json"), Customer.class);
		
		System.out.println(cmObj);
		System.out.println("De-serialization complete");
		
		
		
	}
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		AppTest t= new AppTest();
		t.convertJavaToJson();
		
		t.convertJsonToJava();
	}
	
}
