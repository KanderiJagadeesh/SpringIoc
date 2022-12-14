package com.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Model.Employee;
import com.test.repository.EmployeeRepository;


@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeerepository;

	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeerepository.save(employee);
	}

	@Override
	public List<Employee> getEmployee() {
		
		return employeerepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer id) {
		
		return employeerepository.findById(id);
	}

	@Override
	public String deleteEmployeeById(Integer id) {
		Employee emp= new Employee();
		emp.setId(id);
		 employeerepository.delete(emp);
		 return "delete Successfully";
	}

	@Override
	public Employee updateEmployeeById( Employee emp) {
		Employee employee= new Employee ();
		employee.setId(emp.getId());
		employee.setEmpname(emp.getEmpname());
		employee.setEmail(emp.getEmail());
		employee.setMobile(emp.getMobile());
		
		return employeerepository.save(employee);
	}

}
