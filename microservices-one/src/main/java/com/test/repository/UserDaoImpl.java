package com.test.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.Model.Userdata;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String addUser(Userdata user) {

		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		Userdata u = new Userdata();
		u.setUsername(user.getUsername());
		u.setEmail(user.getEmail());
		u.setMobile(user.getMobile());
		session.save(u);
		session.getTransaction().commit();
		session.close();
		return "1 Record add to database";
	}

	@Override
	public List<Userdata> allUser() {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		List<Userdata> list = session.createQuery("From User").list();

		return list;
	}

	@Override
	public Userdata userById(Integer userid) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		Userdata user = session.get(Userdata.class, userid);
		Userdata u = new Userdata();
		if (user != null)
			session.getClass();
		u.setUserid(user.getUserid());
		u.setUsername(user.getUsername());
		u.setEmail(user.getEmail());
		u.setMobile(user.getMobile());

		return u;
	}

	@Override
	public String updateUser(Userdata user) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		Userdata u = new Userdata();
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
