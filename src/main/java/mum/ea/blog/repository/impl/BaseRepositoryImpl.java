package mum.ea.blog.repository.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mum.ea.blog.repository.BaseRepository;

/**
 * 
 * @author Toan Quach
 *
 * @param <T>
 */

@Transactional
@SuppressWarnings({ "unchecked", "rawtypes" })
public abstract class BaseRepositoryImpl<T> implements BaseRepository<T> {

	@Autowired
	protected SessionFactory sessionFactory;

	private Class<T> type;

	public BaseRepositoryImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];
	}

	public T add(T t) {
		sessionFactory.getCurrentSession().save(t);
		return t;
	}

	public T update(T t) {
		sessionFactory.getCurrentSession().saveOrUpdate(t);
		return t;
	}

	public boolean delete(long id) {
		sessionFactory.getCurrentSession().delete(this.load(id));
		return true;
	}

	public T get(long id) {
		return (T) sessionFactory.getCurrentSession().get(type, id);
	}

	public T load(long id) {
		return (T) sessionFactory.getCurrentSession().load(type, id);
	}
}
