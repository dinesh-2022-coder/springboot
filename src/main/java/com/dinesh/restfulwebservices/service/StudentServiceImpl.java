package com.dinesh.restfulwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinesh.restfulwebservices.entity.Student;
import com.dinesh.restfulwebservices.exception.StudentListEmptyException;
import com.dinesh.restfulwebservices.exception.StudentNotFoundException;
import com.dinesh.restfulwebservices.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudents() {
		List<Student> stundenList = studentRepo.findAll();
		
		if(stundenList.size()==0) {
			throw new StudentListEmptyException("Student list is Empty");
		}
		
		return stundenList;
	}

	@Override
	public Student showStudentDetail(int id) {
		
		Student student = studentRepo.findById(id).orElse(null);
		return student;
	}

	@Override
	public Student saveStudentInfo(Student student) {
		return studentRepo.save(student);

		
	}

	@Override
	public void deleteStudentbyId(int id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public Student updateStudentInfo(Student student) {
		
		return studentRepo.save(student);
	}

}
