package IMPORTANT_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ProblemDemo2 {

	
	
	
	
	public static void main(String[] args) {
		
		ArrayList <String> ComuterAccessories= new ArrayList<String>();
		ComuterAccessories.add("Laptop");
		ComuterAccessories.add("Mouse");
		ComuterAccessories.add("Keyboard");
		
		ArrayList <String> ElectronocsAccessories= new ArrayList<String>();
		ElectronocsAccessories.add("Watch");
		ElectronocsAccessories.add("Printer");
		ElectronocsAccessories.add("Speaker");
		
		ArrayList <String> FurnitureAccessories= new ArrayList<String>();
		FurnitureAccessories.add("Bed");
		FurnitureAccessories.add("Chair");
		FurnitureAccessories.add("Sofa");
		
		//ArrayList Convert in to Hashmap 
		// ArrayList Take as Vaulyue 
		
		HashMap <String, ArrayList <String> > Categories = new HashMap <String, ArrayList <String> >();
		
		Categories.put("Computer", ComuterAccessories);
		Categories.put("Electronics", ElectronocsAccessories);
		Categories.put("Furniture", FurnitureAccessories);
		
		
		// Take E-Store as Key And abou Hashmap As value 
		// in to hashmap
		
		HashMap<String, HashMap <String, ArrayList <String> > > eshop= new HashMap <String, HashMap <String, ArrayList <String> > >();
		
		eshop.put("E-Store", Categories);
		
		
		// Itterarte by using enhanced for loop 
		
		Set <String> s= eshop.keySet();
		
		for(String str:s)
		{
			System.out.println("Key :"+ str);
			System.out.println("Value:"+ eshop.get(str));
			
		}
		
		
		
		
	}
}
