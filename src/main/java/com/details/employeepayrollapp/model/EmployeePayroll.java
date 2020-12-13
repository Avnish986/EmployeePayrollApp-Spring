package com.details.employeepayrollapp.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_payroll")
public class EmployeePayroll implements Serializable{
	
	  
	private static final long serialVersionUID = 1L;
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    public Long id;
        private String name;
//        private String profile;
        private String gender;
        private String department;
        private double basic_pay;
        private String start;
//        private String notes;
        
        public EmployeePayroll() {}
        
        public EmployeePayroll(String name, String gender, String department, double salary, String startDate) {
        	this.name = name;
//        	this.profile = profile;
        	this.gender = gender;
        	this.department = department;
        	this.basic_pay = salary;
        	this.start = startDate;
        	//this.notes = notes;
        }
        
}