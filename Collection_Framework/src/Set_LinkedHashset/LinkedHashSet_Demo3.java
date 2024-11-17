package Set_LinkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Demo3 {

	// generics STring , and taking Object return typr of LinkedHashset 
	
	public static LinkedHashSet getLinkedHasgset()
	{
		LinkedHashSet <String > lhs= new LinkedHashSet <String>();
		
		lhs.add("Sagar");
		lhs.add("Rohan");
		lhs.add("Soham");
		lhs.add("Summit");
		lhs.add(null);
		lhs.add("Rohan");
		
		return lhs;
		
	}
	
	public static void main(String[] args) {
		
		LinkedHashSet lsst=getLinkedHasgset();
		
		System.out.println("Before Iterating : "+lsst);
		
		// Enhanced loop for Iteration 
		for(Object obj:lsst)
		{
			System.out.println("After Iteration By Enhanced For loop : "+obj);
		}
		
		
		// by Itteration Method 
		Iterator it =lsst.iterator();
		
		while (it.hasNext())
		{
			System.out.println("After Iteration By Iterator Method : "+it.next());
		}
		
		
	}
	
	
}
