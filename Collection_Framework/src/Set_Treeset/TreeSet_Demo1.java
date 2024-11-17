package Set_Treeset;

import java.util.TreeSet;

public class TreeSet_Demo1 {

	//how to add Element to tree set 
	
	public static void main(String[] args) {
		
		TreeSet ts= new TreeSet ();
		
		ts.add(20);
		ts.add(10);
		ts.add(15);
		ts.add(10);
//		ts.add("Pune");
//		ts.add("Shyam");
//		ts.add(null);
		
		// in this treset Heterogeniois element are not allowd ,
		// we can get class cast exception
		//Also we cant take Null element , we get null pointer exception 
		
		
		System.out.println(ts);
		
	}
	
	
}

