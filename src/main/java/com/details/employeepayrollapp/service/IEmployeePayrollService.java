package com.details.employeepayrollapp.service;

import java.util.List;

import com.details.employeepayrollapp.model.*;
import com.details.employeepayrollapp.dto.EmployeePayrollDTO;
import com.details.employeepayrollapp.dto.User;
import com.details.employeepayrollapp.exception.EmpPayrollException;
import com.details.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	User CreateUser(User user) throws EmpPayrollException;

	User UpdateUser(User user) throws EmpPayrollException;

	User deleteUser(Long id) throws EmpPayrollException;

	List<User> getAllUser();
	
	User getUserById(Long id) throws EmpPayrollException;

}