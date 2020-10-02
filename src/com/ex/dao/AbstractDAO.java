package com.ex.dao;

import java.util.List;

public abstract class AbstractDAO<E, K> {
	public abstract List<E> getAll();
	
	public abstract E getEntityById(K id);
	
	public abstract boolean create(E entity);

	public abstract E update(E entity);

	public abstract boolean delete(E entity);
	
}
