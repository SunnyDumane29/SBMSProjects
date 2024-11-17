package List_ArrayList;

public class ArrayListDemo7_Employee {

	
	int ID;
	String FirtNamr;
	String LastName;
	String Salary;
	
	//1St Step
		//here first we need to get constructor 
		//right click >>> Source >>> generateConstructor >> using Fields 
	
	public ArrayListDemo7_Employee(int iD, String firtNamr, String lastName, String salary) {
		super();
		ID = iD;
		FirtNamr = FirtNamr;
		LastName = lastName;
		Salary = salary;
	}


	//2nd step
	// we need to generate to string method , so we can get exact index value and not addres
	// right click >> Source >> generate To String method
	
	@Override
	public String toString() {
		return "ArrayListDemo7_Employee [ID=" + ID + ", FirtNamr=" + FirtNamr + ", LastName=" + LastName + ", Salary="
				+ Salary + "]";
	}
	
	
}
