package com.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="person200")
@Inheritance(strategy=InheritanceType.JOINED)
public class Person2 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	@NotEmpty(message="Please enter your name.")
    private String name;
	@NotBlank(message="address should not be blank")
    private String address;
	public Person2(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Person2(String name, String address) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
		this.address=address;
	}
	public Person2() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    



}