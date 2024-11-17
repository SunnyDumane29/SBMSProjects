package Set_LinkedHashset;

import java.util.LinkedHashSet;

public class LinkedHashSet_Demo2 {

	
	
	// create the generics method for Lnked hashSet 
	
	public static LinkedHashSet getLinkedHashSet()
	{
          LinkedHashSet <Integer> lhs= new LinkedHashSet <Integer>();
		
		lhs.add(223);
		lhs.add(54);
		lhs.add(76);
		lhs.add(98);
		lhs.add(87);
	
		return lhs;
		
		
	}
	
	public static void main(String[] args) {
		LinkedHashSet lhsst=getLinkedHashSet();
		
		System.out.println("Begfore Iterating : "+lhsst);
		
		// iterated By enhanced for loop 
		for (Object ii: lhsst)
		{
			System.out.println("After Iterating Enhanced for loop : "+ii);
		}
		
		
		
	}
}
