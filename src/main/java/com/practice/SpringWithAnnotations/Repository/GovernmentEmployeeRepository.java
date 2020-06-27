package com.practice.SpringWithAnnotations.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.practice.SpringWithAnnotations.Model.Employee;

@Repository("governmentEmployeeRepository")
//@Component
//@Primary
public class GovernmentEmployeeRepository implements IEmployeeRepository {

	public List<Employee> findAllEmployee() {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Abhishek Murmu");
		employee1.setDepartment("BIS");
		employee1.setMobileNumber(9477448546L);
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Sagar Sengupta");
		employee2.setDepartment("Government Contractors");
		employee2.setMobileNumber(8777461036L);
		
		employees.add(employee1);
		employees.add(employee2);
		
		return employees;
	}

}
