package Map_HashMap;

import java.util.HashMap;
import java.util.Set;

public class Importanat_Demo1 {

	//How to return Hasmap to the method 
	//Design method wich take Hashmap Object return type 
	// Integer and String Generics 
	
	
	public static HashMap getEmployeeDetails()
	{
		HashMap <Integer,String> hmp= new HashMap<Integer,String>();
		
		hmp.put(101, "Ramesh");
		hmp.put(102, "Suresh");
		hmp.put(103, "Rohan");
		hmp.put(104, "Suresh");
		
		return hmp;
		
		
	}
	
	public static void main(String[] args) {
		
	HashMap <Integer,String>	emp =getEmployeeDetails();
	
	System.out.println("Before Iterating hashmap : "+emp);
	
	// iterating bu enhanced for loop 
     Set <Integer>	se=emp.keySet();
     
     for(Integer j :se)
     {
    	 System.out.println("Key: "+j);
    	 System.out.println("Value: "+emp.get(j));
     }
     
     
     
     // iterating by Java 1.8 features 
	emp.forEach((k,v) -> System.out.println("Key: "+k+ " Value: "+v));
		
		
	}
	
	
	
}
