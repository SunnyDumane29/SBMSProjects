package in.sunnyit.binding;

public class Customer {
	
	private Integer id;
	private String name;
	private String email;
	
	
	public Customer() {
		
		
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}


	public Customer(Integer rid, String name, String email) {
		super();
		this.id = rid;
		this.name = name;
		this.email = email;
	}





	public Integer getRid() {
		return id;
	}





	public void setRid(Integer rid) {
		this.id = rid;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
	
}
