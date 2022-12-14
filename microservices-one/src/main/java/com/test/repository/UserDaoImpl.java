package com.test.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.Model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String addUser(User user) {

		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		User u = new User();
		u.setUsername(user.getUsername());
		u.setEmail(user.getEmail());
		u.setMobile(user.getMobile());
		session.save(u);
		session.getTransaction().commit();
		session.close();
		return "1 Record add to database";
	}

	@Override
	public List<User> allUser() {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		List<User> list = session.createQuery("From User").list();

		return list;
	}

	@Override
	public User userById(Integer userid) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		User user = session.get(User.class, userid);
		User u = new User();
		if (user != null)
			session.getClass();
		u.setUserid(user.getUserid());
		u.setUsername(user.getUsername());
		u.setEmail(user.getEmail());
		u.setMobile(user.getMobile());

		return u;
	}

	@Override
	public String updateUser(User user) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		User u = new User();
		u.setUsername(user.getUsername());
		u.setEmail(user.getEmail());
		u.setMobile(user.getMobile());
		session.update(u);
		session.getTransaction().commit();
		session.close();
		return "1 Record update to database";
	}

	@Override
	public String deleteUser(Integer userid) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Query qry = session.createQuery(" delete from User u where u.userid=:userid");

		qry.setParameter("userid", userid);
		int res = qry.executeUpdate();
		return res + "delete data from database";
	}

}
