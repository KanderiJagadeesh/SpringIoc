package com.test.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.Model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired 
	private  JdbcTemplate jdbcTemplate;

	@Override
	public Student updateStudentById(Student stu) {
		
		return null;
	}

	@Override
	public Student addStudent(Student student) {
		
	String sql="INSERT INTO student  VALUES (?,?,?,?,?)";
		return null;
	}

	@Override
	public List<Student> getStudent() {
		
		return null;
	}

	@Override
	public Optional<Student> getStudentById(Integer id) {
		
		return null;
	}

	@Override
	public String deleteStudentById(Integer id) {
		
		return null;
	}

}
