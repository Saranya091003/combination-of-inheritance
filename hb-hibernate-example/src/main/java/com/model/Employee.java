package com.model;
import com.model.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotNull;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Employee")
public class Employee extends Person {
	@NotBlank(message="Designation should not be blank")
	private String designation;
	@NotNull(message="Please enter your salary")
	private float salary;
	@NotBlank(message="date of Joining should not be blank")
	String dtOfJoin;
	public Employee(int id, String name, String address, String designation, float salary,
			String dtOfJoin) {
		super(id, name, address);
		this.designation = designation;
		this.salary = salary;
		this.dtOfJoin = dtOfJoin;
	}
	public Employee(String designation, float salary, String dtOfJoin) {
		// TODO Auto-generated constructor stub
		super();
		this.designation = designation;
		this.salary = salary;
		this.dtOfJoin = dtOfJoin;
	}
	
	public Employee() {
		super();
	}
	public Employee(String name, String address, String designation, float salary, String dtOfJoin) {
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
