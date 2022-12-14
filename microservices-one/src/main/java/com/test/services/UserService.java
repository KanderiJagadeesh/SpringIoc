package com.test.services;

import java.util.List;

import com.test.Model.User;

public interface UserService {

	String addUser(User user);

	List<User> allUser();

	User userById(Integer userid);

	String updateUser(User user);

	String deleteUser(Integer userid);

}
