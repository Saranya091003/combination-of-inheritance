package com.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Customer")
public class Customer extends Person {
	@NotEmpty(message="Please enter your email Id")
	private String email;
	@NotNull(message="phone number field should not be empty")
	private long phNo;
	@NotBlank(message="customer type should not be blank")
	private String customertype;
	public Customer(int id, String name, String address, String email, long phNo, String customertype) {
		super(id, name, address);
		this.email = email;
		this.phNo = phNo;
		this.customertype=customertype;
	}
	
	public Customer(String email, long phNo, String customertype) {
		// TODO Auto-generated constructor stub
		super();
		this.email=email;
		this.phNo=phNo;
		this.customertype=customertype;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String address, String email, long phNo, String customertype) {
		// TODO Auto-generated constructor stub
         super(name,address);
         this.email=email;
         this.phNo=phNo;
         this.customertype=customertype;
         
		
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getCustomertype() {
		return customertype;
	}
	public void setPhNo(String customertype) {
		this.customertype = customertype;
	}
}
