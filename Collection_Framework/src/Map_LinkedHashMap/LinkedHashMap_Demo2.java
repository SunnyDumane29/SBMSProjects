package Map_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap_Demo2 {

	// create withe generics method key = integer and value value= String 
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhp= new LinkedHashMap<Integer,String>();
		
		lhp.put(1, "Ajay");
		lhp.put(2, "Soham");
		lhp.put(3, "Rohini");
		lhp.put(4, "Shanti");
		
		System.out.println("Before iterating LinkedHas map : "+lhp);
		
		//--------------------------------------------------------------------
		// iterating by enhanced for loop 
		System.out.println("Iterating by Enhanced For loop ");
		
		Set <Integer> se = lhp.keySet();
		
		for(Integer j:se)
		{
			System.out.println("Key : "+ j);
			System.out.println("Value : "+ lhp.get(j));
		}
		
		//-----------------------------------------------------------------------
		
		System.out.println("Java 1.8 fwatures ");
		//lhp.forEach((k,v) -> System.out.println(" Key : "+k + " Value : "+ v));
		
		lhp.forEach((k,v) -> System.out.println("Keye :"+k+"Valvue :"+v));
		
		//-----------------------------------------------------------------------
	}
	
}
