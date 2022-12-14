package com.test.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.Model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired 
	private  JdbcTemplate jdbcTemplate;

	@Override
	public String updateStudentById(Student stu) {
		String sql="UPDATE microservice.student SET  student_name= ?,email =?,mobile=?,deptno=?  WHERE stu_id = ?";
		  jdbcTemplate.update(sql, new Object[] {
				stu.getStudentName(),stu.getEmail(),stu.getMobile(),stu.getDeptno()	,stu.getStuId()
				});	
		  
		  return "1  record update succesfully";
		
		
	}

	@Override
	public String addStudent(Student student) {
	String sql="INSERT INTO microservice.student (student_name,email,mobile,deptNo) VALUES (?,?,?,?)";
	
		  jdbcTemplate.update(sql, new Object[] {
				student.getStudentName(),student.getEmail(),student.getMobile(),student.getDeptno()	
				});
		 return "1 record add database";
	}

	@Override
	public List<Student> getStudent() {
		String sql="Select * from student";
		BeanPropertyRowMapper<Student> row= new BeanPropertyRowMapper<Student>(Student.class);
		
		
		return jdbcTemplate.query(sql, row);
	}

	@Override
	public Student getStudentById(Integer id) {
		String sql="Select * from microservice.student where stu_id= ?";
		BeanPropertyRowMapper<Student> row= new BeanPropertyRowMapper<Student>(Student.class);
		
		
		return jdbcTemplate.queryForObject(sql, row,id);
	}

	@Override
	public String deleteStudentById(Integer id) {
		String sql="delete from microservice.student where stu_id= ?";
		
		 jdbcTemplate.update(sql,id);
		 return "1 record delete";
				 
	}
	

}
