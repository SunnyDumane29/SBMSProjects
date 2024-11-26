package in.sunnyit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sunnyit.entity.Address;
import in.sunnyit.entity.Employee;
import in.sunnyit.repo.AddressRepo;
import in.sunnyit.repo.EmployeeRepo;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private AddressRepo addRepo;
	
	
	@Transactional(rollbackOn= Exception.class)
	public void saveEmps()
	{
		//Employeee=====
		Employee em= new Employee();
		
		em.setName("Mayuri");
		em.setSalary(2800000.00);
		
		Employee savedEmp = empRepo.save(em); // saving employee data 
		System.out.println(savedEmp);
		
	   int i =10/0; // exception occured
		
		//Address ====
		Address add= new Address();
		add.setCity("Pune");
		add.setState("Maharshtra");
		add.setCountry("IND");
		
		add.setEid(savedEmp.getEid()); //after saving employee get eid from employee
		
		addRepo.save(add); // saving Adress data 
		
	}

}
