package List_LinkedList;

import java.util.LinkedList;

public class LinkedList_Demo3 {
	
	
	// Prob3= Return ;inked List object to the method
	
	public static LinkedList getLinkedList()
	{
		LinkedList  ls= new LinkedList();
		
		ls.add(23);
		ls.add(567);
		ls.add(76);
		ls.add(67);
		ls.add(675);
		ls.add("Shyam");
		ls.add("Rohan");
		ls.add("Sohan");
		
		return ls;
		
	}

	
	public static void main(String[] args) {
		
		
		LinkedList lst=getLinkedList();
		
		System.out.println(lst);
	}
}
