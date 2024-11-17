package I_Comparator_BestApproach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import I_Comparable.Comparable_Employee;

public class TestMain {

	
	
	public static void main(String[] args) {
		ArrayList <Students> cmp = new ArrayList<Students> ();
		
		cmp.add(new Students(34, "Ajay", 435627));
		cmp.add(new Students(46, "sunny", 6734));
		cmp.add(new Students(65, "Tushar", 7243));
		cmp.add(new Students(76, "Sagar", 2385));
		
		Collections.sort(cmp, new HandleComparator());
		
		for(Students std:cmp)
		{
			System.out.println("Id :"+std.getID());
			System.out.println("Name :"+std.getName());
			System.out.println("Salary :"+std.getSalary());
		}
		
		
		
		
		
	}
}
