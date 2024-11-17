package List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	
	
	
	
	// Generic Methods for array List
	
	public static void main(String[] args) {
		
		
		ArrayList <Integer> al1= new ArrayList<Integer>();
		
		al1.add(23);
		al1.add(45);
		al1.add(67);
		al1.add(676);
		al1.add(null);
		
		System.out.println("al1 elements :"+al1);
		
		ArrayList <Integer> al2= new ArrayList<Integer>();
		
		al2.add(23);
		al2.add(45);
		al2.add(67);
		al2.add(676);
		al2.add(null);
		
		System.out.println("al2 elements :"+al2);

		// copy all element from al1 to al2
		al1.addAll(al2);
		
		// by using iterator
	  Iterator it=al1.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
		
		
		
	}

}
