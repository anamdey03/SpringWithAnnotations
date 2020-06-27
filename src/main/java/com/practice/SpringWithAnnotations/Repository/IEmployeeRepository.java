package com.practice.SpringWithAnnotations.Repository;

import java.util.List;

import com.practice.SpringWithAnnotations.Model.Employee;

public interface IEmployeeRepository {

	List<Employee> findAllEmployee();
}
