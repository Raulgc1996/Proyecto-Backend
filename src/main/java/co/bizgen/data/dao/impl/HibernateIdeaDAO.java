package co.bizgen.data.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.bizgen.data.HibernateSession;
import co.bizgen.data.dao.IdeaDAO;
import co.bizgen.data.model.Avatar;
import co.bizgen.data.model.Idea;

public class HibernateIdeaDAO implements IdeaDAO {

	public Idea selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		Idea idea = (Idea) session.get(Idea.class, id);
		session.close();
		return idea;
	}

	public List<Idea> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Idea>ideas = session.createCriteria(Idea.class).list();
		session.close();
		return ideas;
	}

	public void insert(Idea idea) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id = (Long) session.save(idea);
		idea.setId(id);
		session.getTransaction().commit();
		session.close();
		
		
	}

	public void update(Idea idea) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(idea);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(Idea idea) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(idea);
		session.getTransaction().commit();
		session.close();	
	}

}
