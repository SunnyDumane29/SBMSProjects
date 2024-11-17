package Map_HashMap;

import java.util.HashMap;
import java.util.Set;

public class Important_Demo1_EmploObject {

	
	// take here Employee details class as akey 
	
	public static void main(String[] args) {
		//here we take employee details class as akey inside hashmap
	HashMap<Important_Demo1_EmployeeDetails,String> hmp= new HashMap<Important_Demo1_EmployeeDetails,String>();
	
	// take Object of Employee Details so we can get and set data
	Important_Demo1_EmployeeDetails emp= new Important_Demo1_EmployeeDetails();
	
	// 
	
	hmp.put(emp, emp.getId());
	hmp.put(emp, emp.getName());
	hmp.put(emp, emp.getSalary());
	
	System.out.println("Boefore Iterating hashmap : "+hmp.get(emp));
	 
	//Eterating by enhanced for loop 
    Set <Important_Demo1_EmployeeDetails>se=hmp.keySet();	
    
	for(Important_Demo1_EmployeeDetails jj:se)
	{
		System.out.println("Key :"+jj);
		System.out.println("Value :"+hmp.get(jj));
	}
	
	
	
	
	
	}
	
	
	
}
