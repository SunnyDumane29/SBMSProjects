package List_LinkedList;

import java.util.Iterator;
import java.util.Vector;

public class List_VectorDemo3 {

	// take the vector as return type in method 
	
	public static Vector getVector()
	{
		Vector ve = new Vector ();
		
		ve.add("Ram");
		ve.add("Shyam");
		ve.add("Rohan");
		ve.add("Priti");
		ve.add(23);
		ve.add(567);
		ve.add(76);
		
		return ve ;
	
	}
	
	public static void main(String[] args) {
		
		Vector vct= getVector();
		
		System.out.println(vct);
		
		// enhanced for loop Iterator
		
		Iterator it= vct.iterator();
		while(it.hasNext())
		{
			System.out.println("By iterator : "+it.next());
		}
	}
	
	
}
