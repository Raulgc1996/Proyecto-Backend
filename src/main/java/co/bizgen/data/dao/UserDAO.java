package co.bizgen.data.dao;

import java.util.List;

import co.bizgen.data.model.User;

/**
 * UserDAO interface
 * 
 * @author Oskar
 *
 */
public interface UserDAO {

	public User selectById(Long id);

	public List<User> selectAll();

	public void insert(User user);

	public void update(User user);

	public void delete(User user);

}
