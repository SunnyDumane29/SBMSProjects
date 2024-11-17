package List_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo8_Dependon7 {
	
	
	
	//Here we can take class as Data type reffrence in Array List 
	
	
	public static void main(String[] args) {
		
		ArrayList <ArrayListDemo7_Employee> alClass= new ArrayList <ArrayListDemo7_Employee>();
		
		alClass.add(new ArrayListDemo7_Employee(12,"Sunny","ABCD","34976000"));
		alClass.add(new ArrayListDemo7_Employee(43,"Rohan","C","342543"));
		alClass.add(new ArrayListDemo7_Employee(54,"Sagar","SS","8464"));
		alClass.add(new ArrayListDemo7_Employee(55,"Shetty","FD","876"));
		alClass.add(new ArrayListDemo7_Employee(76,"SOHAM","uu","876"));
		alClass.add(new ArrayListDemo7_Employee(233,"Arun","ugg","234"));
		
		//System.out.println(alClass);
		
		// iterate by using enhanced for Loop 
		for(ArrayListDemo7_Employee emp : alClass)
		{
			System.out.println("Details :"+emp);
		}
		
	}

}
