package com.dinesh.restfulwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.restfulwebservices.entity.Student;
import com.dinesh.restfulwebservices.exception.StudentNotFoundException;
import com.dinesh.restfulwebservices.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student-list") 
	public List<Student> showStudentList() {
		List<Student> showStudentList = studentService.getAllStudents();		
		return showStudentList;
	}
		
	@GetMapping("/student/{id}")
	public Student showStudentDetail(@PathVariable int id) {
		Student student = studentService.showStudentDetail(id);	
		
		if(student==null) {
			throw new StudentNotFoundException("student id:"+id);
		}
		
		return student;
	}
	
	@PostMapping("/student")
	public Student saveAllStudents(@Valid @RequestBody Student student) {
		studentService.saveStudentInfo(student);
		return student;
	}
	
	@DeleteMapping("/student/{id}")
	public void saveAllStudents(@PathVariable int id) {
		studentService.deleteStudentbyId(id);
	}
	
	@PutMapping("/student")
	public Student editStudentInfo(@Valid @RequestBody Student student) {
		Student st = studentService.updateStudentInfo(student);
		return st;
	}
	

}
