package watchesstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int custId;
	@NotEmpty(message="shipping address cannot left blank")
	private String shippingaddress;
	@NotEmpty(message="billing address cannot left blank")
	private String billingaddress;
	@NotEmpty(message="customer name cannot left blank")
	private String custName ;
	@NotEmpty(message="contact cannot left blank")
	private String contactNo;
	
	public int getCustId() {
		return custId;
	}
	public String getShippingaddress() {
		return shippingaddress;
	}
	public void setShippingaddress(String shippingaddress) {
		this.shippingaddress = shippingaddress;
	}
	public String getBillingaddress() {
		return billingaddress;
	}
	public void setBillingaddress(String billingaddress) {
		this.billingaddress = billingaddress;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
}
