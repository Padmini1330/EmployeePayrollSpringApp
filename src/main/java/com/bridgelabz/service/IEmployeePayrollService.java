package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.dto.EmployeePayrollDTO;
import com.bridgelabz.model.EmployeePayrollData;

public interface IEmployeePayrollService 
{
	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollDataById(int employeeId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

	EmployeePayrollData updateEmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO);

	void deleteEmployeePayrollData(int employeeId);
	
	List<EmployeePayrollData> getEmployeesByDepartment(String department);
}