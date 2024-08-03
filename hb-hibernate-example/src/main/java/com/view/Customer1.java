package com.view;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="customer1 00")
@AttributeOverride(name="id",column=@Column(name="id"))
@AttributeOverride(name="name",column=@Column(name="name"))
@AttributeOverride(name="address",column=@Column(name="address"))
 
public class Customer1 extends Person1{
	@NotEmpty(message="Please enter your email Id")
	private String email;
	@NotNull(message="phone number field should not be empty")
	private long phNo;
	@NotBlank(message="customer type should not be blank")
	private String customertype;
	public Customer1(int id, String name, String address, String email, long phNo, String customertype) {
		super(id, name, address);
		this.email = email;
		this.phNo = phNo;
		this.customertype=customertype;
	}
	
	public Customer1(String email, long phNo, String customertype) {
		// TODO Auto-generated constructor stub
		super();
		this.email=email;
		this.phNo=phNo;
		this.customertype=customertype;
	}

	public Customer1() {
		// TODO Auto-generated constructor stub
	}

	public Customer1(String name, String address, String email, long phNo, String customertype) {
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
	public long getphNo()
	{
		return phNo;
	}
	public void setphNo(long phNo) {
		this.phNo=phNo;
	}
	public String getCustomertype() {
		return customertype;
	}
	public void setPhNo(String customertype) {
		this.customertype = customertype;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	
}
