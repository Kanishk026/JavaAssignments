package com.login.repo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.login.entity.Login;

public class Repo {

	private SessionFactory sf;

	public Repo() {
		sf = new Configuration().configure().addAnnotatedClass(Login.class).buildSessionFactory();
	}

	public Login addUser(Login user) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(user);
		tx.commit();
		session.close();

		return user;
	}

	public Login removeUser(Login user) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Login existingUser = session.get(Login.class, user.getUsername());
		if (existingUser != null) {
			session.delete(existingUser);
			tx.commit();
		} else {
			System.out.println("User not found");
		}
		session.close();

		return existingUser;
	}

	@SuppressWarnings("deprecation")
	public boolean validateUser(Login user) {
		Session session = sf.openSession();
		/*
		 * Login existingUser = (Login) session.
		 * createQuery("FROM Login WHERE username = :username AND password = :password")
		 * .setParameter("username", user.getUsername()) .setParameter("password",
		 * user.getPassword()) .uniqueResult();
		 */

		@SuppressWarnings({ "deprecation", "rawtypes" })
		Query q = session.createQuery("FROM Login WHERE username = :username AND password = :password");
		q.setParameter("username", user.getUsername());
		q.setParameter("password", user.getPassword());
		Object val = q.uniqueResult();

		session.close();
		return val != null;
//      if val == null it should return false validation failed
	}

	public boolean signOut(Login user) {
		System.out.println("Logged out successfully");
		return true;
	}
}
