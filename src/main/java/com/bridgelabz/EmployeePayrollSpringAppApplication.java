package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.Data;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeePayrollSpringAppApplication 
{
	public static void main(String[] args) 
	{
		  ApplicationContext context=SpringApplication.run(EmployeePayrollSpringAppApplication.class, args);
		  
		  log.info("Employee App Started in {} Environment",context.getEnvironment().getProperty("environment"));
	}

}



