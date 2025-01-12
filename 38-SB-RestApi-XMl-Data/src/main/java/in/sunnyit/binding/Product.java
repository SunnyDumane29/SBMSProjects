package in.sunnyit.binding;

public class Product {
	
	
	private Integer pid;
	private String name;
	private double price;
	
	
	public Product() {
		
		
	}
	
	public Product(Integer pid, String name, double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	

}
