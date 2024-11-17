package in.sunnyit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private Integer eid;
	private String ename;
	private Double esalary;
	
	
	public Employee()
	{
		System.out.println("Employee Class :: 0-param constructor");
	}
	
	
	public Employee(Integer eid, String ename, Double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEsalary() {
		return esalary;
	}
	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}
	
	
	

}
