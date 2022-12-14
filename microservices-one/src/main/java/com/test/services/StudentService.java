package com.test.services;

import java.util.List;
import java.util.Optional;

import com.test.Model.Student;

public interface StudentService {

	Student updateStudentById(Student stu);

	String deleteStudentById(Integer id);

	Optional<Student> getStudentById(Integer id);

	List<Student> getStudent();

	Student addStudent(Student student);

}
