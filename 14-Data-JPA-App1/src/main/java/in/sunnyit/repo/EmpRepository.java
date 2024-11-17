package in.sunnyit.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.sunnyit.entity.Employee;

@Repository
public interface EmpRepository extends CrudRepository<Employee, Integer> {
	
	//select * from employee where ename = :ename
	public List<Employee>  findByEname(String ename);
	
	//select * from employee where esalary = :esalary
	public List<Employee> findByEsalary(Double esalary);
	
	//select * from employee where esalary >= :esalary
	public List<Employee> findByEsalaryGreaterThanEqual(Double esalary);
	
	

}
 