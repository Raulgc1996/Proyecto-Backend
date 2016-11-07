package co.bizgen.data.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import co.bizgen.data.dao.*;
import co.bizgen.data.model.User;

/**
 * Hibernate specific Customer DAO
 * 
 * @author oskar
 *
 */
public class HibernateUserDAO extends GenericDAOHibernate<User> implements UserDAO {
	

}
