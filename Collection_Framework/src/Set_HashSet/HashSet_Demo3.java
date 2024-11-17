package Set_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo3 {

	// create the generics method for Integer in HashSet method
	
	public static HashSet getHashset()
	{
       HashSet <String> hs= new HashSet<String>();
		hs.add("Ram");
		hs.add("Shyam");
		hs.add("Rohan");
		hs.add("Sohan");
		hs.add("Shyam");
		
		return hs;
		
	}
	
	public static void main(String[] args) {
		HashSet hst=getHashset();
		
		System.out.println("Before itterat : "+ hst);
		
		// iterate by using enhanced for looop
//		for (Object str:hst)
//		{
//			
//		}
		 // note if we have generic method then can able to iterate by enhanced for loop use only the Object Data type in for loop 
		//, need to use iterator()

		Iterator it= hst.iterator();
		
		while(it.hasNext())
		{
			System.out.println("Iterator By : "+it.next());
		}
		
	}
	
	
}
