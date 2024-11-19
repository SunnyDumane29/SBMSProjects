package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class mainTest {
	
	public static void main(String[] args) {
		
       List<Employee> emploList= new ArrayList<>();
		
		emploList.add(new Employee(111, "Jennifer", 22, "Female", "HR", 2017, 55000.0));
		emploList.add(new Employee(112, "Rohit", 35, "Male", "Sales And Marketing", 2019, 23500.0));
		emploList.add(new Employee(113, "Shubman", 29, "Male", "Infrastructure", 2019, 28000.0));
		emploList.add(new Employee(114, "Rinku", 28, "Male", "Product Development", 2020, 62500.0));
		emploList.add(new Employee(115, "Aaditi", 41, "Female", "HR", 2022, 29700.0));
		emploList.add(new Employee(116, "Mahendra", 43, "Male", "Security And Transport", 2023, 20500.0));
		emploList.add(new Employee(117, "Nitish", 35, "Male", "Account And Finance", 2019, 37000.0));
		emploList.add(new Employee(118, "Aditya", 31, "Male", "Product Development", 2019, 34500.0));
		emploList.add(new Employee(119, "Monika", 24, "Female", "Sales And Marketing", 2021, 21500.0));
		emploList.add(new Employee(120, "Aman", 38, "Male", "Security And Transport", 2021, 31000.5));
		emploList.add(new Employee(121, "Sangeeta", 27, "Female", "Infrastructure", 2021, 35000.0));
		emploList.add(new Employee(122, "Joshi", 25, "Male", "Product Development", 2020, 29000.0));
		emploList.add(new Employee(123, "Jeddy", 27, "Female", "Account And Finance", 2020, 29000.0));
		emploList.add(new Employee(124, "Niden", 24, "Male", "Sales And Marketing", 2020, 30200.5));
		emploList.add(new Employee(125, "Saig", 23, "Male", "Infrastructure", 2019, 42700.0));
		emploList.add(new Employee(126, "Saey", 26, "Female", "Product Development", 2018, 38900.0));
		emploList.add(new Employee(127, "Shreyas", 25, "Male", "Product Development", 2018, 35700.0));
		
		
		
		
		//========================================================================================================
		// 1) How many employees are there in the organization?
		
		long totalEmployee=emploList.stream().count();
		System.out.println("Using == Method >>.count() >>>> Total Employee :"+totalEmployee);
		
		long totalEmplo=emploList.stream().collect(Collectors.counting());
		System.out.println("Using == Method >>.collect(Collectors.counting() >>>> Total Employee :"+totalEmplo);
		
		System.out.println("========================================================================================================");
		
		// 2) Sort the List of Employee objects based on >> Salary << in Ascending order
		
		List <Employee> AscendingOnSalary = emploList.stream().sorted((e1,e2) ->  (int) (e1.getSalary() - e2.getSalary())).collect(Collectors.toList());
		
		System.out.println("Sort Ascending on Basisi of Salary :" +AscendingOnSalary);

	   System.out.println("========================================================================================================");
		
		// 3) Sort the List of Employee objects based on >> Salary << in Decending order
	  List <Employee> DecendingOnSalary =emploList.stream().sorted((e1,e2) -> (int) (e2.getSalary() - e1.getSalary())).collect(Collectors.toList());
	   
	  System.out.println("Sort Decending on Basisi of Salary :" +DecendingOnSalary);
	   
	  System.out.println("========================================================================================================");
		
	  // 4) How many male and female employees are there in the organization?
	Map<String,Long> CountMaleFemale= emploList.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
	                               
	System.out.println("Counting of male female :"+CountMaleFemale);
	   
	  System.out.println("========================================================================================================");
		
	  // 5) How many employees are there in each department
	  Map<String,Long> DepartmentCount=emploList.stream().collect(Collectors.groupingBy(Employee :: getDepartment , Collectors.counting()));
	  
	  System.out.println("Counting of Employe in department :"+DepartmentCount);
	   
	  System.out.println("========================================================================================================");
		
	  // 6) get The all department Department
	 List <String> allDepartment = emploList.stream().map(Employee :: getDepartment).collect(Collectors.toList());
	  System.out.println("TotalDepartment :"+allDepartment);
	   
	   
	  System.out.println("========================================================================================================");
		
	  // 7)  get the avg slary of male and femal employe 
	 Map<String, Double> avgSalary= emploList.stream().collect(Collectors.groupingBy(Employee :: getGender ,Collectors.averagingDouble(Employee :: getSalary)));
	 
	 System.out.println("Avg salary of each male and female :"+avgSalary);

	  System.out.println("========================================================================================================");
		
	  // 8) Fetch the highest-paid male and female employee
	   
	 Map<String, Optional<Employee>> eachHighsalary= emploList.stream().collect(Collectors.groupingBy(Employee :: getGender ,Collectors.maxBy((e1,e2) -> (int) (e1.getSalary() - e2.getSalary()))));
	   
	 System.out.println("highest mald and femald slary :"+eachHighsalary);
	 
	}   
	   
	   

}
