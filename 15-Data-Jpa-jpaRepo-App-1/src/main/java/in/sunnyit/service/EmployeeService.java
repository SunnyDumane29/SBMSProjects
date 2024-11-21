package in.sunnyit.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.sunnyit.entity.Employee;
import in.sunnyit.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	private EmployeeRepo empRepo;
	
	public EmployeeService (EmployeeRepo empRepo)
	{
		this.empRepo=empRepo;
		
		
	}
	
	//Fetching all records
	public void getAllEmps()
	{
		List<Employee> emps = empRepo.findAll();
		
		emps.forEach(e -> System.out.println(e));
	}
	
	//sorting on salary 
	public void getAllEmpsWithsort()
	{
		//Sort sort = Sort.by("esalary").ascending(); //Ascending order >> Low to High
		
	//	Sort sort = Sort.by("esalary").descending(); //Descending order >> High to Low
		
		Sort sort = Sort.by("esalary", "ename").descending(); //Descending order >> High to Low


		
		List<Employee> emps = empRepo.findAll(sort);
		
		emps.forEach(e -> System.out.println(e));
	}
 
}
