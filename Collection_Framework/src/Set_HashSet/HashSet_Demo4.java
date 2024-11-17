package Set_HashSet;

import java.util.HashSet;

public class HashSet_Demo4 {

	
	// Create aobject of hash set 
	
	public static HashSet getHashset()
	{
       HashSet <Integer> hs= new HashSet<Integer>();
		hs.add(23);
		hs.add(54);
		hs.add(76);
		hs.add(76);
		hs.add(34);
		
		return hs;
		
	}
	
	public static void main(String[] args) {
		HashSet hst=getHashset();
		
		System.out.println("Before itterat : "+ hst);
		
		// iterate by using enhanced for looop
		for (Object str:hst)
		{
			System.out.println("Iterator by enhanced for loop : "+str);
		}
		 // note if we have generic method then can able to iterate by enhanced for loop use only the Object Data type in for loop 
		//, need to use iterator()
       }
	
	
	
}
