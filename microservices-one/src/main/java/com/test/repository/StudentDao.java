package com.test.repository;

import java.util.List;
import java.util.Optional;

import com.test.Model.Student;

public interface StudentDao {

	Student updateStudentById(Student stu);

	Student addStudent(Student student);

	List<Student> getStudent();

	Optional<Student> getStudentById(Integer id);

	String deleteStudentById(Integer id);

}
