package com.bridgelabz.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;


public @Data class EmployeePayrollDTO 
{
	@NotNull
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee Name is Invalid!")
	public String name;
	
	@NotNull
	@Min(value=500,message="Minimum wage should be more than 500")
	public long salary;

	@NotNull
	@Pattern(regexp = "male|female", message = "Gender has to be male or female")
	public String gender;

	@JsonFormat(pattern = "dd MMM yyyy")
	
	@NotNull(message = "Start Date should not be Null")
	
	@PastOrPresent(message = "Start date should be Past or Todays date")
	public LocalDate startDate;

	@NotNull(message = "Note cannot be Null")
	public String note;

	@NotNull(message = "ProfilePic cannot not be Null")
	public String profilePic;

	@NotNull(message = "department should not be Null")
	public List<String> departments;
	
}