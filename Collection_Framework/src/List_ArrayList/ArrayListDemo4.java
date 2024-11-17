package List_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {
	
	// write a proggrame for dEmonstarrte a all methods 
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList ();
		al.add("ram");  //0th
		al.add("Mimbai"); //1th index
		al.add("Pune");   //2th index
		al.add("banglore");   //3th index
		al.add(123);     //4th index
		al.add(345);    //5th index
		al.add(null);    //6th index
		
		
		
		// which goves 3 al.get(3) index value from array list
		System.out.println(al.get(3)); 
		System.out.println(al.get(2));
		
		// al.remove(5),al.remove("banglore") = which used to emove String or particular index value From arrayLust
		System.out.println(al.remove(5));
		System.out.println(al.remove("banglore"));
		
		//al.contains("345") =used check particular content present or not Returns Boolean 
		System.out.println(al.contains(345));
		System.out.println(al.contains(123));
		System.out.println(al.contains("Thane"));
	}
	

}
