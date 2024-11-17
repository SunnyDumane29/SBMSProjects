package Map_LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashmap_Demo1 {
	
	//How to add element to linked HashMap
	
	public static void main(String[] args) {
		
		LinkedHashMap lhp= new LinkedHashMap();
		lhp.put(10, "Sunny");
		lhp.put(20, "Sagar");
		lhp.put(30, "Rohini");
		lhp.put(40, "Ram");
		
		// we can get the output order Preserved 
		System.out.println("Before Iterating Linkedhashmap : "+lhp);  
		
		// iterating an LinkedHash map By jav a1.68 feature 
		System.out.println("After Iterating By jav a1.8 feature ");;
		
		lhp.forEach((k,v) -> System.out.println(" Key : "+ k + " Value : "+ v));;
		
		
	}

}
