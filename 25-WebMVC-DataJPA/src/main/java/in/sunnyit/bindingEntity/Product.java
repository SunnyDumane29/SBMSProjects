package in.sunnyit.bindingEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCT_APP")
public class Product {
	
//	@Id
//	@GeneratedValue (strategy = GenerationType.UUID)
//	private Integer pid;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
	
	private String pName;
	
	private Double pPrice;
	
	private Integer pQty;

	
	
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", pPrice=" + pPrice + ", pQty=" + pQty + "]";
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Double getpPrice() {
		return pPrice;
	}

	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}

	public Integer getpQty() {
		return pQty;
	}

	public void setpQty(Integer pQty) {
		this.pQty = pQty;
	}
	
	
	
	

}
