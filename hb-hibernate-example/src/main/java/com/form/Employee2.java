package com.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="emp200")
@PrimaryKeyJoinColumn(name="ID")
public class Employee2 extends Person2{
	@NotBlank(message="Designation should not be blank")
	private String designation;
	@NotNull(message="Please enter your salary")
	private float salary;
	@NotBlank(message="date of Joining should not be blank")
	String dtOfJoin;
	public Employee2(int id, String name, String address, String designation, float salary,
			String dtOfJoin) {
		super();
		this.designation = designation;
		this.salary = salary;
		this.dtOfJoin = dtOfJoin;
	}
	public Employee2(String designation, float salary, String dtOfJoin) {
		// TODO Auto-generated constructor stub
		super();
		this.designation = designation;
		this. salary= salary;
		this.dtOfJoin = dtOfJoin;
	}
	public Employee2(String name, String address, String designation, float salary, String dtOfJoin) {
		// TODO Auto-generated constructor stub
         super(name,address);
         this.designation=designation;
         this.salary=salary;
         this.dtOfJoin=dtOfJoin;
    }

	public Employee2() {
		super();
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