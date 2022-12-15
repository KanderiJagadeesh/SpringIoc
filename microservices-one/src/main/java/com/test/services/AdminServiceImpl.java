package com.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Model.Users;
import com.test.repository.AdminDao;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao admindao;

	@Override
	public String addAdmin(Users users) {
		
		return admindao.addAdmin(users);
	}

}
