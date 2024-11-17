package Set_LinkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Demo1 {
	
	// how to take element 
	
	
	public static void main(String[] args) {
		LinkedHashSet lhs= new LinkedHashSet();
		
		lhs.add(223);
		lhs.add(54);
		lhs.add(76);
		lhs.add(98);
		lhs.add(87);
		lhs.add("Rohan");
		lhs.add("Sohan");
		lhs.add("Shyam");
		
		
		System.out.println("Before Iterating : "+lhs);
		
		//iterating By enhanced Fir loop 
		for(Object obj:lhs)
		{
			System.out.println("After Iterating By Enhanced for loop : "+obj);
		}
		
		// Iterating By iterator 
		Iterator it= lhs.iterator();
		while(it.hasNext())
		{
			System.out.println("Iterated By terator methoid : "+it.next());
		}
	}

}
