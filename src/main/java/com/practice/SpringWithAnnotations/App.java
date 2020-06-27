package com.practice.SpringWithAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.SpringWithAnnotations.Service.EmployeeService;

public class App {
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		employeeService.nameStartingWithS().forEach(e -> System.out.println(e.toString()));
		applicationContext.close();
	}
}
