package com.dinesh.restfulwebservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(StudentListEmptyException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public @ResponseBody ExceptionRespose handleStudentlistnotfound(StudentListEmptyException ex) {
		
		ExceptionRespose exceptionRespose = new ExceptionRespose();
		exceptionRespose.setErrorMessage(ex.getMessage());
		return exceptionRespose;
		
	}
	


}
