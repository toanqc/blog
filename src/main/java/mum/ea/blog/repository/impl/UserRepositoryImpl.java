package mum.ea.blog.repository.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mum.ea.blog.domain.User;
import mum.ea.blog.repository.UserRepository;

/**
 * 
 * @author Toan Quach
 *
 */
@Transactional
@Repository
public class UserRepositoryImpl extends BaseRepositoryImpl<User> implements UserRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User getByUsername(String username) {
		Query query = sessionFactory.getCurrentSession().createQuery("from User u where u.username = :username");
		query.setString("username", username);
		return (User) query.uniqueResult();
	}
}
