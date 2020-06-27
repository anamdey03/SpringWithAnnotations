package com.practice.SpringWithAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.practice.SpringWithAnnotations"})
public class AppConfig {

	/*
	 * @Bean public IEmployeeService employeeService() { return new
	 * EmployeeService(); }
	 */
	
}
