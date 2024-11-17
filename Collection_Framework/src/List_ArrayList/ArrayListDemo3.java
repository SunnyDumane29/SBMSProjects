package List_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {

	//Design a array List for generic String Method
	
	public static void main(String[] args) {
		
		ArrayList <String> al1= new ArrayList<String>();
		al1.add("Ram");
		al1.add("Lakshamn");
		al1.add("Lakhan");
		al1.add("Rohan");
		al1.add("Sagar");
		al1.add("Shital");
		al1.add("Sony");
		al1.add(null);
		
		
		// iterate using enhanced For loop 
		for(String str:al1)
		{
			System.out.println("ArrayList element Al1:"+str);
		}
	}
	
	
	
	
}
