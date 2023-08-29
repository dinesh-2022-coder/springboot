package com.dinesh.restfulwebservices.exception;

public class ExceptionRespose {

	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ExceptionRespose(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public ExceptionRespose() {
		super();
	}
	
	
	
}
