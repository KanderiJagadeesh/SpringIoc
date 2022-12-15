package com.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.Model.Userdata;
import com.test.services.UserService;

@RestController

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody Userdata user)
	{
		return userService.addUser(user);
	}
	
	@GetMapping("/allUser")
	public List<Userdata> allUser()
	{
		return userService.allUser();
	}
	@GetMapping("/user/{userid}")
	public Userdata userById(@PathVariable Integer userid )
	{
		return userService.userById(userid);
	}
	@PutMapping("/updateUser")
	public String  updateUser(@RequestBody Userdata user)
	{
		return userService.updateUser(user);
	}
	@DeleteMapping("/deleteUser/{userid}")
	public String deleteUser(@PathVariable Integer userid)
	{
		return userService.deleteUser(userid);
	}
	

}
