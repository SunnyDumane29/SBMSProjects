package List_LinkedList;

import java.util.Vector;

public class List_VectorDemo2 {

	
	// take String generic method in Vector 
	
	
	public static void main(String[] args) {
		Vector <String> ve = new Vector<String> ();
		
		ve.add("Ram");
		ve.add("Shyam");
		ve.add("Rohan");
		ve.add("Priti");
		ve.add("Rohini");
		ve.add("Sonali");
		
		System.out.println(ve);
		System.out.println(ve.capacity());
		System.out.println(ve.size());  // get total size of elements
		
		System.out.println(ve.remove("Ram"));  // we cam remove element from Vector 
		
		while (ve.contains("Ram"))
		{
			ve.remove("Ram");
		}
	}
	
	
}
