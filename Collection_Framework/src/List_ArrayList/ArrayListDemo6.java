package List_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo6 {
	
	//merging two arraylist in to the Third array list and print all elements 
	// array list A
	//ArrayList B
	//ArrayList C= A+B
	
	public static void main(String[] args) {
		
		ArrayList <Integer> A= new ArrayList <Integer>();
		A.add(123);
		A.add(5125);
		A.add(334);
		A.add(22);
		A.add(54);
		A.add(76);
		A.add(12);
		A.add(45);
		
		//we can sort by using Integers also 
//		Collections.sort(A);
//		System.out.println(A);
		
		ArrayList <Integer> B= new ArrayList <Integer>();
		B.add(2222);
		B.add(2234);
		B.add(22345);
		B.add(22644);
		B.add(2287);
		B.add(2234);
		B.add(2298);
		B.add(22034);
		
		ArrayList <Integer> C= new ArrayList <Integer>();
		
		A.addAll(B);   // Add all element From B in to A 
		C.addAll(A);   // after All element from A on to C
		
		//we can sort by using Integers also 
		Collections.sort(C);
	
		
		System.out.println(C);  // ewe can print after Sorting 
	}
	
	
	
	
	
}
