package com.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Model.Userdata;
import com.test.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;

	@Override
	public String addUser(Userdata user) {
		
		return userdao.addUser(user);
	}

	@Override
	public List<Userdata> allUser() {
		
		return userdao.allUser();
	}

	@Override
	public Userdata userById(Integer userid) {
		
		return userdao.userById(userid);
	}

	@Override
	public String updateUser(Userdata user) {
		
		return userdao.updateUser(user);
	}

	@Override
	public String deleteUser(Integer userid) {
		
		return userdao.deleteUser(userid);
	}



}
