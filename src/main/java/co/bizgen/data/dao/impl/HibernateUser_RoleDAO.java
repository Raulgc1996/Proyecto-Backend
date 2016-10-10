package co.bizgen.data.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.bizgen.data.HibernateSession;
import co.bizgen.data.dao.User_RoleDAO;
import co.bizgen.data.model.User_Role;

public class HibernateUser_RoleDAO implements User_RoleDAO {

	public User_Role selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		User_Role user_role = (User_Role) session.get(User_Role.class, id);
		session.close();
		return user_role;
	}

	public List<User_Role> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<User_Role> users_roles = session.createCriteria(User_Role.class).list();
		session.close();
		return users_roles;
	}

	public void insert(User_Role user_role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id = (Long) session.save(user_role);
		//user_role.setId(id);
		session.getTransaction().commit();
		session.close();
		
	}

	public void update(User_Role user_role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(user_role);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(User_Role user_role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(user_role);
		session.getTransaction().commit();
		session.close();
		
	}

}
