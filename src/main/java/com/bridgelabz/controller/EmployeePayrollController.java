package com.bridgelabz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.Employee;


@RestController
public class EmployeePayrollController 
{
	@RequestMapping(value = { "", "/", "/home" })
	public ResponseEntity<String> sayHello() 
	{
		return new ResponseEntity<String>("Hello world!", HttpStatus.OK);
	}

	@RequestMapping(value = { "/query" })
	public String sayHi(@RequestParam(value = "fname", defaultValue = "Padmini") String fname,
			@RequestParam(value = "lname", defaultValue = "Sharma") String lname)
	{
		return "Welcome" + fname + " " + lname;
	}

	@GetMapping("/param/{name}")
	public String parameterName(@PathVariable String name) 
	{
		return "Hi " + name;
	}

	@GetMapping("/post")
	public String setUser(@RequestBody Employee employee) 
	{
		return "Hello " + employee.getFirstName() + " " + employee.getLastName();
	}

	@PutMapping("/put/{firstName}")
	public String sayHelloPutMethod(@PathVariable String firstName,
			@RequestParam(value = "lastName", defaultValue = "Sharma") String lastName) 
	{
		return "Hello " + firstName + " " + lastName;
	}
}
