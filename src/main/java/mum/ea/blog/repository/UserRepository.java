package mum.ea.blog.repository;

import mum.ea.blog.domain.User;

/**
 * 
 * @author Toan Quach
 *
 */
public interface UserRepository extends BaseRepository<User> {

	/**
	 * 
	 * @param username
	 * @return
	 */
	public User getByUsername(String username);
}
