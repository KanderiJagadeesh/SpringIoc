package com.test.services;

import java.util.List;

import com.test.Model.Userdata;

public interface UserService {

	String addUser(Userdata user);

	List<Userdata> allUser();

	Userdata userById(Integer userid);

	String updateUser(Userdata user);

	String deleteUser(Integer userid);

}
