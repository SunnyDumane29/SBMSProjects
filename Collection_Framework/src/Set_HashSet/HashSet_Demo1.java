package Set_HashSet;

import java.util.HashSet;

public class HashSet_Demo1 {
	
//-------- main 4 constrictors in Hash set ----------------------
//	HashSet hs1 = new HashSet ();
//	HashSet hs2= new HashSet(int initialCapacity);
//	HashSet hs3= new HashSet(int initialCapacity, float Loadfactor);
//	HashSet hs4= new HashSet (Collection c);
//----------------------------------------------------------------------------
	
//	problem demo 1 = How to add element in hashset
	
	public static void main(String[] args) {

		HashSet hs= new HashSet();
		
		hs.add(23);
		hs.add(65);
		hs.add(56);
		hs.add(23);      // duplicate int 
		hs.add(null);    // take null value 
		hs.add("Ram");
		hs.add("Shyam");   // hetero geniuous data 
		hs.add("Rohan");
		hs.add("Roshni");
		hs.add("Rohan");    // duplicate string 
		hs.add(null);
		
		
		System.out.println(hs);  // we gate unique value bt not in sequentioal manner
		
		for(Object h:hs)
		{
			System.out.println(h);
		}
		
		
	}

}
