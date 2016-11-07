package co.bizgen.data.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import co.bizgen.data.dao.RoleDAO;
import co.bizgen.data.model.Role;

public class HibernateRoleDAO extends GenericDAOHibernate<Role> implements RoleDAO{
}
