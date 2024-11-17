package StreamApi;

public class Employee {

	
	public Employee(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	private int ID;
	private String EmployeeName;
	private String EmployeeCity;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeCity() {
		return EmployeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		EmployeeCity = employeeCity;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", EmployeeName=" + EmployeeName + ", EmployeeCity=" + EmployeeCity + "]";
	}
	
	
}
