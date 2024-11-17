package Map_HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Demo2 {

	//design aenerics of method Integer and string 
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hmp= new HashMap<Integer, String>();
		
		hmp.put(1, "Ajay");
		hmp.put(2, "Soham");
		hmp.put(3, "Rohini");
		hmp.put(4, "Shanti");
		
		System.out.println("Befotre iterating hashmap : "+hmp);
		
		//iterate by using enhanced for loop 
		
	    Set<Integer> se=hmp.keySet();    // cumpolsary to add keyset method before iterating 
	    
		
		for(int j:se)    // we can take object or int as of Key data type 
		{
			System.out.println("Key : "+j);
			System.out.println("Value : "+ hmp.get(j));
			
		}
		 
		
	}
	
	
	
}
