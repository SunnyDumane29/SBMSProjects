package IMPORTANT_Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ProblemDemo1 {

	//Assume we have arryalist in which contaons duplicates element,
	//i want to remove duplicates from list ,
	//so we can convert Arraylist in to >>>>>> Hashset>>> and then conert in to >>> LinkedHasgSet
	
	//Arraylist >>>>>> HashSet >>>>>> LinkedHashSet
	
	
	public static void main(String[] args) {
		
		// ArrayList 
		ArrayList al=new ArrayList ();
		
		al.add(23);
		al.add(76);
		al.add(87);
		al.add(876);
		al.add(67);
		al.add(87);
		al.add(876);
		al.add(123);
		al.add(90);
		al.add(76);
		al.add(76);
		al.add(896);
		al.add(876);
		
		System.out.println("ArrayList Output : "+al);
		
		// ArrayList >>>>> HashSet 
		HashSet hs= new HashSet(al);
		
		System.out.println("ArrayList Converted in to HashSet Output : "+hs);
		
		// ArrayList >>>>> HashSet >>>>>>LinkedHashSet
		
		LinkedHashSet lhs=new LinkedHashSet (hs);
		
		System.out.println("ArrayList Converted in to HashSet then comnverted in to LinkedHashset Output : "+lhs);
		
		
	}
	
	
}
