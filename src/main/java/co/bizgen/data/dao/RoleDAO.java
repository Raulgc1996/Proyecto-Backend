package co.bizgen.data.dao;

import java.util.List;

import co.bizgen.data.model.Role;;

public interface RoleDAO {
	public Role selectById(Long id);

	public List<Role> selectAll();

	public void insert(Role role);

	public void update(Role role);

	public void delete(Role role);

}
