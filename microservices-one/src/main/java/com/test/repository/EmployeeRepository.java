package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.Model.Employee;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
