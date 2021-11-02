package com.bridgelabz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.dto.EmployeePayrollDTO;
import com.bridgelabz.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService 
{

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() 
	{
		return null;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int employeeId) 
	{
		return null;
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) 
	{
		return null;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) 
	{
		return null;
	}

	@Override
	public void deleteEmployeePayrollData(int employeeId) 
	{
		
	}

}
