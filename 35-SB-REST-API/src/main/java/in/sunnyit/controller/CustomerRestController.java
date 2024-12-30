package in.sunnyit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sunnyit.binding.Customer;

@RestController
public class CustomerRestController {
	
	@GetMapping(value = "/customer", produces="application/json")
	public ResponseEntity <Customer> getCustomer()
	{
		Customer c1= new Customer(1,"Sunny","sunnydumane12345@gmail.com");
		return new ResponseEntity<>(c1,HttpStatus.OK);
		
	}
	
	
	@GetMapping (
			value ="/ListCustomer",
			produces="application/json"
			)
   public ResponseEntity<List<Customer>> getListofCustomer ()
   {
		Customer c1= new Customer(1,"Sunny","sunnydumane12345@gmail.com");
		Customer c2= new Customer(2,"Mayuri","Mayu45@gmail.com");
		Customer c3= new Customer(3,"Shivani","Shivani46@gmail.com");

		List<Customer> li = Arrays.asList(c1,c2,c3);

		return new  ResponseEntity<>(li,HttpStatus.OK);
		
   }
	
	@PostMapping (
			value ="/customer", 
			consumes="application/json",
			produces = "application/json"
			)
	public ResponseEntity<String> createCustomer(@RequestBody Customer c)
	{ 
		System.out.println(c);
		//TODO : insert in DB
		
		return new ResponseEntity<>("product Saved ",HttpStatus.CREATED);
		
		
	}
	
	@DeleteMapping (
			value ="/delteCustomer/{id}",
			produces = "text/plain"
		)
	public ResponseEntity<String> deleteRecotdOnId(@PathVariable("id") Integer id)
	{
		//TODO : delete customer
		
		return new ResponseEntity <>(id+":Record is deleted",HttpStatus.OK);
		
	}
	
	@PutMapping(
			value = "/customer",
			consumes = "application/json",
			produces = "text/plain"
			)
	public ResponseEntity <String> updateCustomer(@RequestBody Customer c)
	{
		//TODO : update customer inDB
		
		return new ResponseEntity<>(c+"Record is updated",HttpStatus.OK);
		
	}
	

}
