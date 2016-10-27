package helloworld.lifeline.dao;

import java.io.Serializable;
import java.util.List;

public interface IDao<Entity> {

	public Serializable save(Entity entity);

	public void delete(Entity entity);

	public List<Entity> getAll();

	public Entity getById(Integer id);

	public void update(Entity entity);

}
