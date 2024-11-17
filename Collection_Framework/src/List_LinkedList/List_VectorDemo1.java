package List_LinkedList;

import java.util.Vector;

public class List_VectorDemo1 {

	
	// how to add elementin vector
	
	public static void main(String[] args) {
		
		Vector v= new Vector();
		
		System.out.println("Vector capacity is : "+v.capacity()); // this method shows vector capacity
		
	     // add elemnent 1- 10 by for loop 
		for (int i= 1; i<=10; i++)
		{
			v.add(i);  // we can add element 
		}
		
		System.out.println(v);
	}
}
