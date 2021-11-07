package com.bridgelabz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bridgelabz.dto.EmployeePayrollDTO;
import com.bridgelabz.exceptions.EmployeePayrollException;
import com.bridgelabz.model.EmployeePayrollData;
import com.bridgelabz.repository.EmployeePayrollRepository;

@Service
public class EmployeePayrollService implements IEmployeePayrollService 
{

	@Autowired
	private EmployeePayrollRepository employeePayrollRepository;

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() 
	{
		return employeePayrollRepository.findAll();
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int employeeId) 
	{
		return employeePayrollRepository.findById(employeeId)
				.orElseThrow(() -> new EmployeePayrollException("Employee with id " + employeeId + " does'nt exist"));
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) 
	{
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
		return employeePayrollRepository.save(employeePayrollData);
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) 
	{
		EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(employeeId);
		employeePayrollData.updateEmployeePayrollData(employeePayrollDTO);
		return employeePayrollRepository.save(employeePayrollData);
	}

	@Override
	public void deleteEmployeePayrollData(int employeeId) 
	{
		employeePayrollRepository.findById(employeeId)
				.orElseThrow(() -> new EmployeePayrollException("Employee with id " + employeeId + " does'nt exist"));
		employeePayrollRepository.deleteById(employeeId);
	}
	
	@Override
	public List<EmployeePayrollData> getEmployeesByDepartment(String department) 
	{
		return employeePayrollRepository.findEmployeeByDepartment(department);
	}


}