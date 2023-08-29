package com.dinesh.restfulwebservices.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="studentdata")

public class Student {	
	
	@Size(min=3, message = "student name must be minimum 2 charecters")
	private String studentname;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Size(min=3, message = "coursename must be minimum 2 characters")
	private String coursename;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public Student(String studentname, int id, String coursename) {
		super();
		this.studentname = studentname;
		this.id = id;
		this.coursename = coursename;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", id=" + id + ", coursename=" + coursename + "]";
	}

}
