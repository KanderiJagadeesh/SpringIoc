package com.test.repository;

import java.util.List;

import com.test.Model.Userdata;

public interface UserDao {

	String addUser(Userdata user);

	List<Userdata> allUser();

	Userdata userById(Integer userid);

	String updateUser(Userdata user);

	String deleteUser(Integer userid);

}
