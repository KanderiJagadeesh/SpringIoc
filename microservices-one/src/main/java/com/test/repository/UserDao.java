package com.test.repository;

import java.util.List;

import com.test.Model.User;

public interface UserDao {

	String addUser(User user);

	List<User> allUser();

	User userById(Integer userid);

	String updateUser(User user);

	String deleteUser(Integer userid);

}
