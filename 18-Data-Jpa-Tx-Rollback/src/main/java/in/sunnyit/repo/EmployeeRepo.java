package in.sunnyit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sunnyit.entity.Employee;

public interface EmployeeRepo extends JpaRepository <Employee, Integer>{

}
