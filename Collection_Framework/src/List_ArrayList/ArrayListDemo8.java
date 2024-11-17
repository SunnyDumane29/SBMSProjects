package List_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo8 {

	
	// cretae method which return the Array List object 
	//How to return arryalist in to method 
	
	public static ArrayList getArryalistMethod()
	{
		ArrayList <Integer> al = new ArrayList <Integer>();
		al.add(133);
		al.add(423);
		al.add(6353);
		al.add(null);
		
		return al;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList	arr=getArryalistMethod();
		
		System.out.println(arr);
		
		// we can use enhanced for loop also 
	}
	
	
}
