package com.test.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.Model.Employee;
import com.test.services.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
		
	}
	@GetMapping("/getemployee")
	public List<Employee> getEmployee()
	{
		return employeeService.getEmployee();
		
	}
	@GetMapping("/getemployee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer id)
	{
		return employeeService.getEmployeeById(id);
		
	}
	@DeleteMapping("/deleteemployee/{id}")
	public String deleteEmployeeById(@PathVariable Integer id)
	{
		return employeeService.deleteEmployeeById(id);
		
	}
	@PutMapping("/updateemployee")
	public Employee updateEmployeeById( @RequestBody Employee emp)
	{
		return employeeService.updateEmployeeById(emp);
		
	}
	

}
