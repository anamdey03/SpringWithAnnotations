package com.practice.SpringWithAnnotations.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.practice.SpringWithAnnotations.Model.Employee;

@Repository("softwareEmployeeRepository")
//@Component
//@Primary
public class SoftwareEmployeeRepository implements IEmployeeRepository {

	public List<Employee> findAllEmployee() {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Anamitra Dey");
		employee1.setDepartment("Java");
		employee1.setMobileNumber(8617776093L);
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Sagarika Paul");
		employee2.setDepartment("Ruby on Rails");
		employee2.setMobileNumber(8013100910L);
		
		employees.add(employee1);
		employees.add(employee2);
		
		return employees;
	}

}
