package List_LinkedList;

import java.util.LinkedList;

public class LinkedList_Demo1 {

//---------------- main constructor Linked Lis 
//	LinkedList ls1= new LinkedList ();
//	LinkedList ls2= new LinkedList (Collection c);
//----------------------------------------------------------------
	
//	Problem 1 = how to add element in linked list 
	
	
	public static void main(String[] args) {
		
		LinkedList ls= new LinkedList();
		
		ls.add(34);
		ls.add(87);
		ls.add(657);
		ls.add(87);  // duplicate int 
		ls.add(null);
		ls.add("Shyam");    // heterogenious element 
		ls.add("Ram");
		ls.add("Rohan");
		ls.add("Sachin");
		ls.add("Rohan");  // duplicate String 
		ls.add(null);
		
		
		ls.addFirst("Adedd FirstEle");   // we can ad First element 
		ls.addLast("Added LAstEle");     // we can Add last element
		
		
		System.out.println(ls);  // we get the sequentioal manner output but duplicates are there 
		
   
		
		
		
	}
	
	
	
	
	
}
