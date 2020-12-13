package com.details.employeepayrollapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.employeepayrollapp.model.EmployeePayroll;


public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll, Long> {

}
