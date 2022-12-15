package com.test.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.test.Model.Users;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String addAdmin(Users users) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		Users u = new Users();
		u.setUsername(users.getUsername());
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(users.getPassword());
		u.setPassword(encodedPassword);
		u.setRole(users.getRole());
		u.setEnabled(1);
		session.save(u);
		session.getTransaction().commit();
		session.close();
		return "1 Record add to database";
	}

}
