package in.sunnyit.entity;

import java.security.Identity;
import java.time.LocalDate;

import org.springframework.cglib.core.Local;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "passport_tbl")
public class Passport {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long passportid;
	
	private String passportNum;
	
	private LocalDate issuedDate;
	
	private LocalDate expDate;
	
	@OneToOne
	@JoinColumn (name ="person_id")
	private Person person;
	
	
	

	@Override
	public String toString() {
		return "Passport [passportid=" + passportid + ", passportNum=" + passportNum + ", issuedDate=" + issuedDate
				+ ", expDate=" + expDate + ", person=" + person + "]";
	}

	public Long getPassportid() {
		return passportid;
	}

	public void setPassportid(Long passportid) {
		this.passportid = passportid;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	} 
	
	
	
	
	
	
	

}
