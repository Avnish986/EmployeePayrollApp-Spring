package com.details.employeepayrollapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.details.employeepayrollapp.dto.EmployeePayrollDTO;
import com.details.employeepayrollapp.dto.ResponseDTO;
import com.details.employeepayrollapp.dto.User;
import com.details.employeepayrollapp.exception.EmpPayrollException;
import com.details.employeepayrollapp.model.EmployeePayrollData;
import com.details.employeepayrollapp.service.IEmployeePayrollService;

@RestController
public class EmployeePayrollController {

	@Autowired
	private IEmployeePayrollService empPayrollService;

	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(empPayrollService.CreateUser(user));
		} catch (EmpPayrollException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@PutMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(empPayrollService.UpdateUser(user));
		} catch (EmpPayrollException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") Long id) {
		try {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(empPayrollService.deleteUser(id));
		} catch (EmpPayrollException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@GetMapping("/get")
	public ResponseEntity<List<User>> getAllUser() {
		try {
		return ResponseEntity.status(HttpStatus.OK).body(empPayrollService.getAllUser());
		}catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(empPayrollService.getUserById(id));
			}catch(Exception e) {
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
	}
}