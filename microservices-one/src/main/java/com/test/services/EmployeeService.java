package com.test.services;

import java.util.List;
import java.util.Optional;

import com.test.Model.Employee;



public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> getEmployee();

	Optional<Employee> getEmployeeById(Integer id);

String deleteEmployeeById(Integer id);

	Employee updateEmployeeById( Employee emp);

}
