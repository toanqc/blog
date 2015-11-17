/**
 * 
 */
package mum.ea.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.ea.blog.domain.User;
import mum.ea.blog.repository.UserRepository;
import mum.ea.blog.service.UserService;

/**
 * @author Toan Quach
 *
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User getByUsername(String username) {
		return userRepository.getByUsername(username);
	}
}
