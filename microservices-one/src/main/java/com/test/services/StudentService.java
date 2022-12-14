package com.test.services;

import java.util.List;
import java.util.Optional;

import com.test.Model.Student;

public interface StudentService {

	String updateStudentById(Student stu);

	String deleteStudentById(Integer id);

	Student getStudentById(Integer id);

	List<Student> getStudent();

	String addStudent(Student student);

}
