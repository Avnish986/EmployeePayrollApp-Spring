package com.details.employeepayrollapp.exception;

public class EmpPayrollException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String message;

	     public EmpPayrollException(String message) {
	        super(message);
	        this.message = message;
	    }

}
