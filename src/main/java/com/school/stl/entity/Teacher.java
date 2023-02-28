package com.school.stl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Employeeid;
	private String FirstName;
	private String LastName;
	private String Subjectname;
	private int Phonenumber;
	private String ClassSection;
	public Long getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(Long employeeid) {
		Employeeid = employeeid;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getSubjectname() {
		return Subjectname;
	}
	public void setSubjectname(String subjectname) {
		Subjectname = subjectname;
	}
	public int getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getClassSection() {
		return ClassSection;
	}
	public void setClassSection(String classSection) {
		ClassSection = classSection;
	}
	public Teacher(Long employeeid, String firstName, String lastName, String subjectname, int phonenumber,
			String classSection) {
		super();
		Employeeid = employeeid;
		FirstName = firstName;
		LastName = lastName;
		Subjectname = subjectname;
		Phonenumber = phonenumber;
		ClassSection = classSection;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
