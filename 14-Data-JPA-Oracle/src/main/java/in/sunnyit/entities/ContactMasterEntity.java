package in.sunnyit.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "contact_master")
public class ContactMasterEntity {

	 @Id
	 @Column (name = "contactId")
	 private Integer contactId;
	 
	 @Column (name = "contact_name")
	 private String contact_name;
	 
	 @Column (name = "contact_number")
	 private Long contact_number;
	 
	 
	 

	@Override
	public String toString() {
		return "ContactMasterEntity [contactId=" + contactId + ", contact_name=" + contact_name + ", contact_number="
				+ contact_number + "]";
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public Long getContact_number() {
		return contact_number;
	}

	public void setContact_number(Long contact_number) {
		this.contact_number = contact_number;
	}
	 
	 
	 
	
}
