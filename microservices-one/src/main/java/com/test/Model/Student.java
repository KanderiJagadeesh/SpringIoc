package com.test.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stuId;
	private String studentName;
	private String email;
	private String mobile;
	private String deptno;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(Integer stuId, String studentName, String email, String mobile, String deptno) {
		super();
		this.stuId = stuId;
		this.studentName = studentName;
		this.email = email;
		this.mobile = mobile;
		this.deptno = deptno;
	}


	public Integer getStuId() {
		return stuId;
	}


	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getDeptno() {
		return deptno;
	}


	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	
	
	
	

}
