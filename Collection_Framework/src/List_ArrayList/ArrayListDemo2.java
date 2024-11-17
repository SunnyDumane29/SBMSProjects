package List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	
	//Design ageneric arrayList for Integer Type only 
	
	public static void main(String[] args) {
		
		ArrayList <Integer> al1= new ArrayList <Integer> ();
		al1.add(23);
		al1.add(567);
		al1.add(675);
		al1.add(null);
		
		// iterate using henhanced for loop 
		for(int i:al1)
		{
			System.out.println("Arry List element Using Enhanced For loop :"+i);
		}
		
		// using Iterator
		
		Iterator it=al1.iterator();
		while(it.hasNext())
		{
			System.out.println("Arry List element Using Iterator Method:"+it.next());
		}
		
		
		
		
	}

}
