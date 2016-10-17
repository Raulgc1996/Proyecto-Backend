package co.bizgen.data.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.bizgen.data.HibernateSession;
import co.bizgen.data.dao.AvatarDAO;
import co.bizgen.data.model.Avatar;
import co.bizgen.data.model.Role;


public class HibernateAvatarDAO implements AvatarDAO {

	public Avatar selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		Avatar avatar = (Avatar) session.get(Avatar.class, id);
		session.close();
		return avatar;
	}

	public List<Avatar> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Avatar> avatars = session.createCriteria(Avatar.class).list();
		session.close();
		return avatars;
	}

	public void insert(Avatar avatar) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id = (Long) session.save(avatar);
		avatar.setId(id);
		session.getTransaction().commit();
		session.close();
		
	}

	public void update(Avatar avatar) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(avatar);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(Avatar avatar) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(avatar);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
