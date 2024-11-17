package Map_TreeMap;

import java.util.TreeMap;

public class TreeMap_Demo1 {

	//Add Element To tree map
	
	public static void main(String[] args) {
		TreeMap tmp= new TreeMap ();
		
		tmp.put(1, "Ajay");
		tmp.put(2, "Soham");
		tmp.put(3, "Rohini");
		tmp.put(4, "Shanti");
		
		//tmp.put(null, "Rohan"); // we can get null pointr exceptions 
		
		System.out.println(tmp);

	}
	
	
}
