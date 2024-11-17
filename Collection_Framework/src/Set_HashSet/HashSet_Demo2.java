package Set_HashSet;

import java.util.HashSet;

public class HashSet_Demo2 {

	
	// create the generics method for Integer in HashSet method
	
	public static HashSet getHashsetMethod()
	{
		HashSet <Integer> hs= new HashSet<Integer>();
		
		hs.add(23);
		hs.add(65);
		hs.add(56);
		hs.add(23);
		
		return hs;
		
	}
	
	public static void main(String[] args) {
		
		HashSet  <Integer> hsst=getHashsetMethod();
		
		System.out.println(hsst);
		
		//iterate by enhanced for loop 
		for(int hash:hsst)
		{
			System.out.println("Iterated by Enhanced forloop : "+hash);
		}
	}
	
	
}
