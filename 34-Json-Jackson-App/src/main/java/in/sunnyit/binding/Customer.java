package in.sunnyit.binding;

public class Customer {
	
	private Integer id;
	private String name;
	private Long phno;
	
	
	public Customer() {
		
	}

	public Customer(Integer id, String name, Long phno) 
	{
		this.id = id;
		this.name = name;
		this.phno = phno;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phno=" + phno + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}
	
	

}
