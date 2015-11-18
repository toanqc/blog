package mum.ea.blog.service.impl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.log4j.Logger;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import mum.ea.blog.domain.Contact;
import mum.ea.blog.service.JMSService;

/**
 * 
 * @author Toan Quach
 *
 */
public class JMSServiceImpl implements JMSService {

	private static final Logger LOGGER = Logger.getLogger(JMSServiceImpl.class);

	private JmsTemplate jmsTemplate;

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	@Override
	public void send(Contact contact) {
		jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(contact);
			}
		});
		LOGGER.info("Message has been sent to queue with email: " + contact.getEmail() + " and message: "
				+ contact.getMessage());
	}
}
