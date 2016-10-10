package co.bizgen.data.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.bizgen.data.HibernateSession;
import co.bizgen.data.dao.*;
import co.bizgen.data.model.User;

/**
 * Hibernate specific Customer DAO
 * 
 * @author oskar
 *
 */
public class HibernateUserDAO implements UserDAO {
	/*
	 * selects one customer by Id
	 * 
	 * @param id
	 * 
	 * @return user
	 */
	public User selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		User user = (User) session.get(User.class, id);
		session.close();
		return user;
	}

	/*
	 * retrieves all customers from db
	 * 
	 * @return List of customers
	 */
	public List<User> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<User> users = session.createCriteria(User.class).list();
		session.close();
		return users;
	}

	/*
	 * inserts a new customer in database retrieves generated id and sets to
	 * customer instance
	 * 
	 * @param new customer
	 */
	public void insert(User user) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id = (Long) session.save(user);
		user.setId(id);
		session.getTransaction().commit();
		session.close();
	}

	/*
	 * updates user
	 * 
	 * @param user to update
	 */
	public void update(User user) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
	}

	/*
	 * delete given customer
	 * 
	 * @param customer to delete
	 */
	public void delete(User user) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(user);
		session.getTransaction().commit();
		session.close();
	}
}
