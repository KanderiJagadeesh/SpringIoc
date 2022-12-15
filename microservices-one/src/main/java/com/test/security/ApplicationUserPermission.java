package com.test.security;

public enum ApplicationUserPermission {
	STUDENT_READ("Student:read"),
	STUDENT_WRITE("Student:write"),
	COURSE_READ("Course:read"),
	COURSE_WRITE("course:write");
	private final String permission;
	
	ApplicationUserPermission(String permission)
	{
		this.permission=permission;
	}
	public String getPermission()
	{
		return permission;
	}
}
