package mum.ea.blog.service;

import mum.ea.blog.domain.User;

/**
 * 
 * @author Toan Quach
 *
 */
public interface UserService {

	/**
	 * 
	 * @param username
	 * @return
	 */
	public User getByUsername(String username);
}
