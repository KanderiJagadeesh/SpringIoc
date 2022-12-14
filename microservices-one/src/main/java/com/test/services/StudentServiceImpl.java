package com.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Model.Student;
import com.test.repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public String updateStudentById(Student stu) {
		
		return studentDao.updateStudentById(stu);
	}

	@Override
	public String deleteStudentById(Integer id) {
		
		return studentDao.deleteStudentById(id);
	}

	@Override
	public Student getStudentById(Integer id) {
		
		return studentDao.getStudentById(id) ;
	}

	@Override
	public List<Student> getStudent() {
		
		return studentDao.getStudent();
	}

	@Override
	public String addStudent(Student student) {
		
		return studentDao.addStudent(student) ;
	}
	

}
