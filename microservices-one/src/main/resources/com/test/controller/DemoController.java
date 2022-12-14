package com.test.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	List<User> list= Arrays.asList(new User(101,"Jagadeesh","9492326804","jaga@gmail.com"),
			new User(102,"mahesh","9492986804","mahesh@gmail.com"));
	
	@GetMapping("/users")
	public List<User> allUsers()
	{
		return list;
		
	}

}
