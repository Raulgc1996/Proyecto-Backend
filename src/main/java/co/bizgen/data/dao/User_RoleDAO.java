package CO.BIZGEN.data.dao;

import java.util.List;
import CO.BIZGEN.data.model.User_Role;

public interface User_RoleDAO {
	public User_Role selectById(Long id);

	public List<User_Role> selectAll();

	public void insert(User_Role user_role);

	public void update(User_Role user_role);

	public void delete(User_Role user_role);

}
