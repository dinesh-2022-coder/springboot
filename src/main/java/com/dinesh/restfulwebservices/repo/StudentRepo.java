package com.dinesh.restfulwebservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.restfulwebservices.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	

}
