package in.sunnyit.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
		
	    //Sort sort = Sort.by("esalary").descending(); //Descending order >> High to Low
		
		Sort sort = Sort.by("esalary", "ename").descending(); //Descending order >> High to Low


		List<Employee> emps = empRepo.findAll(sort);
		emps.forEach(e -> System.out.println(e));
		
	}
	
	public void getAllEmpsPagination()
	{
		int pageSize = 10; // 3 records per page (fixed value)
		int pageNumber = 1; //(will come from UI) page start from 0=1 (for proggramer start sfrom 0 , and end user startds from 1)
		
		//PageRequest pg = PageRequest.of(pageNumber, pageSize);
		
		PageRequest pg = PageRequest.of(pageNumber-1, pageSize);
		
		Page<Employee> page = empRepo.findAll(pg);
		 
		List<Employee> content = page.getContent();
		
		content.forEach(e -> System.out.println(e));
		
		
		
	}
	public void getAllEmpsWithFilters()
	{
		Employee em = new Employee();
		
		//if emp Id taking from UI serch
		em.setEid(102);
		
		//if employee name taking from UI serch
		em.setEname("sunny");
		
		//if Salary taking from UI Filter
		em.setEsalary(7004654667.67);
		
		Example<Employee> filterdEmps = Example.of(em);
		
		List<Employee> allEmps = empRepo.findAll(filterdEmps);
		
		allEmps.forEach(e -> System.out.println(e));
		
		
	}
 
}
