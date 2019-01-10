package com.example.demo.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Parent {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	private String phoneNumber;
	private String email;
	private String address;
	
	//@OneToMany
	private ArrayList<Child> child = new ArrayList<>();

	public Parent() {}
	
	public Parent(String name, String number) {
		this.name=name;
		this.phoneNumber=number;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Child> getChild(){
		return this.child;
	}

	public void setChild(Child child){
		this.child.add(child);
	}
	
}
