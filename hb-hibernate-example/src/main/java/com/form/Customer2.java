package com.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
@Entity
@Table(name="customer200")
@PrimaryKeyJoinColumn(name="ID")
public class Customer2 extends Person2{
	@NotEmpty(message="Please enter your email Id")
	private String email;
	@NotNull(message="phone number field should not be empty")
	private long phNo;
	@NotBlank(message="customer type should not be blank")
	private String customertype;
	public Customer2(int id, String name, String address, String email, long phNo, String customertype) {
		super(id, name, address);
		this.email = email;
		this.phNo = phNo;
		this.customertype=customertype;
	}
	
	
	public Customer2(int id, String name, String address) {
		super(id, name, address);
	}


	public Customer2(String email, long phNo, String customertype) {
		// TODO Auto-generated constructor stub
		super();
		this.email=email;
		this.phNo=phNo;
		this.customertype=customertype;
	}

	public Customer2() {
		// TODO Auto-generated constructor stub
	}

	public Customer2(String name, String address, String email, long phNo, String customertype) {
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
	public String getcustomertype() {
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
