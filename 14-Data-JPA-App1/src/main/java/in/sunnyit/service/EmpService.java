package in.sunnyit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sunnyit.entity.Employee;
import in.sunnyit.repo.EmpRepository;

@Service
public class EmpService {
	
	
	private EmpRepository empRepo;
	
  @Autowired
  public EmpService(EmpRepository empRepo)
  {
	  this.empRepo=empRepo;
	  
  }
	
	
	public void saveemployee()
	{
		System.out.println("Impl class :"+ empRepo.getClass().getName());
		
		Employee e = new Employee();
		
		e.setEid(197);
		e.setEname("Leena"); 
		e.setEsalary(544654667.67);
		
		empRepo.save(e);
		
		System.out.println("Record saved ......");
			
	}
	
	public void saveAllEmps()
	{
		Employee e1= new Employee(201, "Ritika", 294358.24);
		Employee e2= new Employee(209, "MOrrien", 343788.84);
		Employee e3= new Employee(245, "Lusef", 7945.45);
		Employee e4= new Employee(257, "Kiran", 35796.34);
		
		List<Employee> listEmplo = Arrays.asList(e1,e2,e3,e4);
		
		empRepo.saveAll(listEmplo);
		
		System.out.println(listEmplo.size()+" : records saved...");
		
	}
	
	public void getEmpOnId(int id)
	{
		Optional<Employee> findById = empRepo.findById(id);
		
		if (findById.isPresent())
		{
			Employee emplo1 = findById.get();
			System.out.println(emplo1);
			
		}
		else {
			System.out.println("Records not found....");
		} 
			
		
		
	}
	
	//Multiple records
	public void getMultipleEmploOnID(List<Integer>eids)
	{
		Iterable<Employee> listEmplos = empRepo.findAllById(eids);
		
		listEmplos.forEach(e -> System.out.println(e)); //Lambda expressions
		
		
		//listEmplos.forEach(System.out::println); // method reffrence
		
	}
	
	public void allRecords ()
	{
		Iterable<Employee> findAll = empRepo.findAll();
		
		findAll.forEach(e -> System.out.println(e));
		
	}
	
	//--------------Find By Abstract Method ------------------------------------------------
	 
	public void findEmploByName(String naame)
	{
		List<Employee> findByEname = empRepo.findByEname(naame);
		
		findByEname.forEach(e -> System.out.println(e));
		
	}
	
	public void findEmploBySalary(double sal)
	{
		List<Employee> findbySalary = empRepo.findByEsalaryGreaterThanEqual(sal);
		
		findbySalary.forEach(e -> System.out.println(e));
	}
	
	public void findEmploBySalaryGreaterThan(double sal)
	{
		
		List<Employee> greaterThan = empRepo.findByEsalaryGreaterThanEqual(sal);
		greaterThan.forEach(e -> System.out.println(e));
	}
	
	
	//-----------Custom queries methods----------------------------------------------------------

	public void callCustomqyeries()
	{
//		List<Employee> getallEmp = empRepo.getAllEmplos();
//		getallEmp.forEach(e -> System.out.println(e));
		
		
//		Employee emoById = empRepo.getEmoById(102);
//		System.out.println(emoById);
		
		
		List<Employee> allEmplosSQL = empRepo.getAllEmplosSQL();
		
		allEmplosSQL.forEach(e -> System.out.println(e));
	}
	
	
	
	//-----------Delete OperAtion----------------------------------------------------------
	public void deleteEmployeeID(int id)
	{
		
		empRepo.deleteById(id);
		
		
		System.out.println("Employee deleted Id:"+id);
		
		
	}
	
	
}
