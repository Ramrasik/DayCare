package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Child {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	private Date birthDate;
	private Date enrollmentDate;
	private String[] race = {"American Indian or Asian Native","Asian", "Black or African American", "Native Hawaiian or other Pacific Islander", "White"};
	private String[] ethnicity = {"Hispanic or Latino", "Not Hispanic or Latino"};
	
	private int age;
	private char gender;
	
	//@ManyToOne
	private ArrayList<Parent> parent = new ArrayList<>();
	
	
	public ArrayList<Parent> getParent() {
		return this.parent;
	}

	public void setParent(Parent parent) {
		this.parent.add(parent);
	}

	public Child() {}
	
	public Child(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Child(int id, String name, Date birthDate, Date enrollmentDate, String[] race, String[] ethnicity, int age,
			char gender) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.enrollmentDate = enrollmentDate;
		this.race = race;
		this.ethnicity = ethnicity;
		this.age = age;
		this.gender = gender;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Child [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String[] getRace() {
		return race;
	}

	public void setRace(String[] race) {
		this.race = race;
	}

	public String[] getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String[] ethnicity) {
		this.ethnicity = ethnicity;
	}

	
}
