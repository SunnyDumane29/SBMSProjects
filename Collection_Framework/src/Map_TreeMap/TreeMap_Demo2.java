package Map_TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Demo2 {

	//iterate tree map using for each loop 
	
	public static void main(String[] args) {

		TreeMap tmp= new TreeMap ();
		
		tmp.put(1, "Ajay");
		tmp.put(2, "Soham");
		tmp.put(3, "Rohini");
		tmp.put(4, "Shanti");
		
		//tmp.put(null, "Rohan"); // we can get null pointr exceptions 
		
		System.out.println("Before Iterating : "+tmp);
		
		//Iterate by using for each loop 
		
		Set se= tmp.keySet();
		
		for(Object j:se)
		{
			System.out.println("Key : "+j);
			System.out.println("Value : "+tmp.get(j));
		}

		
		//-------------------------------------------------------
		//iterate by using java 1.8 features 
		
		tmp.forEach((k,v)-> System.out.println(" Key :"+k + "Value : "+v));
	
	}
	
	
}
