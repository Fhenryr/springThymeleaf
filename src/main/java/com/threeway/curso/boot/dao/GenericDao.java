package com.threeway.curso.boot.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



public class GenericDao<T> {
	
	
	@SuppressWarnings("unchecked")
	private final Class<T> entytiClass = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void save(T entity) {
		entityManager.persist(entity);
	}

	public void update(T entity) {
		entityManager.merge(entity);
	}
	
	public void delete (Long id) {
		entityManager.remove(entityManager.getReference(entytiClass, id));
	}
	
	public T findById(Long id) {
		return entityManager.find(entytiClass, id);
	}
	
	public List<T> findAll(){
		return entityManager.createQuery("from " + entytiClass.getSimpleName(), entytiClass).getResultList();
	}
}
