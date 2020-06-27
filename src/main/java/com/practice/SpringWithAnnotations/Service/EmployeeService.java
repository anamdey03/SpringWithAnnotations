package com.practice.SpringWithAnnotations.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.practice.SpringWithAnnotations.Model.Employee;
import com.practice.SpringWithAnnotations.Repository.IEmployeeRepository;

@Service("employeeService")
public class EmployeeService implements IEmployeeService {
	
//	@Resource(name = "softwareEmployeeRepository")
	@Autowired
	@Qualifier("governmentEmployeeRepository")
	private IEmployeeRepository employeeRepository;

	public List<Employee> nameStartingWithS() {
		List<Employee> employees = employeeRepository.findAllEmployee();
		return employees.stream().filter(e -> e.getName().startsWith("S")).collect(Collectors.toList());
	}
}
