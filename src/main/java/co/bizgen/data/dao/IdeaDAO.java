package co.bizgen.data.dao;

import java.util.List;
import co.bizgen.data.model.Idea;

public interface IdeaDAO {
	public Idea selectById(Long id);

	public List<Idea> selectAll();

	public void insert(Idea idea);

	public void update(Idea idea);

	public void delete(Idea idea);
}
