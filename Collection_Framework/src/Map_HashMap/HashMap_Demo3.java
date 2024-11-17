package Map_HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Demo3 {

	//design generics onluy in String both for key and value 
	
	public static void main(String[] args) {
		
		HashMap<String,String> hmp= new HashMap<String,String>();
		
		hmp.put("10th STD", "Ramesh");
		hmp.put("9th Std", "Suresh");
		hmp.put("8th Std ", "Rohan");
		hmp.put("7th STD", "Suresh");
		
		System.out.println("Before iterating Hashmap : "+ hmp);
		
		
		//1st Method ----------------------------------------------------------
		
		// iterate by enhanced for loop 
		// cumpolsaryly used the keySet() method for Set 
		
		Set <String> se= hmp.keySet();
		
		for(String jj:se)     // We can take data typeas object or Data type as Key (Which is String here )
		{
			System.out.println("Key : "+jj);
			System.out.println("Value : "+hmp.get(jj));
			
			
		}
		
		//----------------------------------------------------------------------
		
		//Impoerant Concept 
		//2nd Method -----------------------------------------------------------
		
		System.out.println("Iterated By Java 1.8 features ");
		
		hmp.forEach((k,v) -> System.out.println(" Key : "+ k +" Value : "+ v));

		
		
		
	}
}
