package com.test.repository;

import java.util.List;
import java.util.Optional;

import com.test.Model.Student;

public interface StudentDao {

	String updateStudentById(Student stu);

	String addStudent(Student student);

	List<Student> getStudent();

	Student getStudentById(Integer id);

	String deleteStudentById(Integer id);

}
