package com.dinesh.restfulwebservices.service;

import java.util.List;

import com.dinesh.restfulwebservices.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student showStudentDetail(int id);

Student saveStudentInfo(Student student);

	void deleteStudentbyId(int id);

	Student updateStudentInfo(Student student);

}
