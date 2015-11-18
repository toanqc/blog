package mum.ea.blog.service;

import mum.ea.blog.domain.Contact;

/**
 * 
 * @author Toan Quach
 *
 */
public interface JMSService {

	public void send(Contact contact);
}
