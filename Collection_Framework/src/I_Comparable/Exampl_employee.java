package I_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Exampl_employee {

	
	
	public static void main(String[] args) {
		
		ArrayList <Comparable_Employee> cmp= new ArrayList<Comparable_Employee>();
		cmp.add(new Comparable_Employee(11, "Ajay", 15634));
		cmp.add(new Comparable_Employee(32, "Vijay", 41527));
		cmp.add(new Comparable_Employee(23, "Sunny", 98132));
		cmp.add(new Comparable_Employee(65, "Sanjay", 92845));
		cmp.add(new Comparable_Employee(87, "Chatur", 53746));
		cmp.add(new Comparable_Employee(98, "Raj", 23746));
		cmp.add(new Comparable_Employee(11, "Sanket", 98235));
		
		Collections.sort(cmp);
		
		for(Comparable_Employee emp:cmp)
		{
			System.out.println("Id :"+emp.getID());
			System.out.println("Name :"+emp.getName());
			System.out.println("Salary :"+emp.getSalary());
		}
		
		
		
	}
}
