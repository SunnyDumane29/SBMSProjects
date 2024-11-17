package I_Comparable;

public class Comparable_Employee implements Comparable<Comparable_Employee> {

	
	
	int ID;
	String name;
	int Salary ;
	
	
	// Stp -1 Generate Counstructor using all fields
	//Right Click >>> Source >>>Generate Constructor using Fiels >> Enter  
	
	public Comparable_Employee(int iD, String name, int salary) {
		super();
		ID = iD;
		this.name = name;
		Salary = salary;
	}


	
	
	//Step- 2  Generat Getter and Setter method 
	//Right Click >>> Source >>>GenerateGetter Setter method  >> Enter 


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}



	
	// Sort  On the Basis of Salary 

	@Override
	public int compareTo(Comparable_Employee employee) {
		
		if(Salary == employee.Salary)
		{
			return 0;
			
		}
		
		else if (Salary > employee.Salary)
		{
			return 1 ;
			
		}
		
		else 
		{   return -1 ; }    
	}

	


	}
	
	
	
	
	
	
	
	
	
	

