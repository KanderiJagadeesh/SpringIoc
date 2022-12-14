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

import com.test.Model.Student;
import com.test.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private  StudentService studentService;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student Student)
	{
		return studentService.addStudent(Student);
		
	}
	@GetMapping("/getStudent")
	public List<Student> getStudent()
	{
		return studentService.getStudent();
		
	}
	@GetMapping("/getStudent/{id}")
	public Optional<Student> getStudentById(@PathVariable Integer id)
	{
		return studentService.getStudentById(id);
		
	}
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudentById(@PathVariable Integer id)
	{
		return studentService.deleteStudentById(id);
		
	}
	@PutMapping("/updateStudent")
	public Student updateStudentById( @RequestBody Student stu)
	{
		return studentService.updateStudentById(stu);
		
	}
	
	
}
