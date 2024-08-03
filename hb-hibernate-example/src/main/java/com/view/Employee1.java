package com.view;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="emp100")
@AttributeOverride(name="id",column=@Column(name="id"))
@AttributeOverride(name="name",column=@Column(name="name"))
@AttributeOverride(name="address",column=@Column(name="address"))
public class Employee1 extends Person1{
	@NotBlank(message="Designation should not be blank")
	private String designation;
	@NotNull(message="Please enter your salary")
	private float salary;
	@NotBlank(message="date of Joining should not be blank")
	String dtOfJoin;
	public Employee1(int id, String name, String address, String designation, float salary,
			String dtOfJoin) {
		super();
		this.designation = designation;
		this.salary = salary;
		this.dtOfJoin = dtOfJoin;
	}
	public Employee1(String designation, float salary, String dtOfJoin) {
		// TODO Auto-generated constructor stub
		super();
		this.designation = designation;
		this.salary = salary;
		this.dtOfJoin = dtOfJoin;
	}
	
	public Employee1() {
		super();
	}
	public Employee1(String name, String address, String designation, float salary, String dtOfJoin) {
		// TODO Auto-generated constructor stub
         super(name,address);
         this.designation=designation;
         this.salary=salary;
         this.dtOfJoin=dtOfJoin;
         
		
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDtOfJoin() {
		return dtOfJoin;
	}
	public void setDtOfJoin(String dtOfJoin) {
		this.dtOfJoin = dtOfJoin;
	}
	


}
