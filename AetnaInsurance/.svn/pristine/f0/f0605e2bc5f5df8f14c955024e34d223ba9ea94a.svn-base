package com.bcj.memberportal.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;




@Entity
//@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.PROPERTY   )
public class Member {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Address_ID")
    private Address address;
	@Id 
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	private String firstName;
	private String lastName;
	public String ssn;
	private String plan;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//@XmlTransient
	private String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
}
