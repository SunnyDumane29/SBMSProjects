package List_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo5 {

	//Sort the array List 
	
	public static void main(String[] args) {
		
		
		ArrayList <String> al= new ArrayList <String> ();
		al.add("Sagar");
		al.add("Badnaam");
		al.add("Akshay");
		al.add("Asha");
		al.add("Rohan");
		
		
		// alphabetically soorting the arrayList 
		
		Collections.sort(al);
		System.out.println(al);
		
		//we can iterare by using enhanced for loop 
		for(String str: al)
		{
			System.out.println(str);
		}
	}
	
	
}
