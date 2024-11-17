package List_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo2 {
	
	
	//takke generics as Integer in Linked list 
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ls= new LinkedList<Integer> ();
		
		ls.add(20);  // 0th ele
		ls.add(30);  // 1st ele 
		ls.add(40);   // 2nd ele 
		ls.add(50);   // 3rd ele 
		
	  int indexValue=	ls.get(2);  // we can get perticular index value  by this method 
	  
	  System.out.println("We can take 2nd index Value : "+indexValue); 
	  
	  System.out.println(ls);
	  
	 // iterate LinkedList by using Iterarot 
	  
	 Iterator it= ls.iterator();
	 
	 while (it.hasNext())
	 {
		 System.out.println("By Iterator : "+it.next());
	 }
		
	//iterate by using enhanced for loop 
	 
	 for (Integer ss:ls)
	 {
		 System.out.println("By enhanced for loop : "+ss);
		 
	 }
		
		
	}

}
