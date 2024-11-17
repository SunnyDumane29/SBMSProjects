package List_LinkedList;

import java.util.Stack;

public class List_StackDemo1 {

	// LIFO= Last in first out 
	//push ----------- Add element 
	//pop -------------remove Element 
	
	
	public static void main(String[] args) {
		Stack st =new Stack ();
		
		st.add(34);
		st.add(87);
		st.add(657);
		st.add(87);  // duplicate int 
		st.add(null);
		st.add("Shyam");    // heterogenious element 
		st.add("Ram");
		st.add("Rohan");
		st.add("Sachin");
		st.add("Rohan");  // duplicate String 
		st.add(null);
		
		System.out.println(st);  // we get output , and get duplictae also , but order is preserved
	}
	
}
