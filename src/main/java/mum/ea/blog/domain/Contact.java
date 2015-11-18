package mum.ea.blog.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import mum.ea.blog.util.BlogConstant;

/**
 * 
 * @author Toan Quach
 *
 */
public class Contact implements Serializable {

	private static final long serialVersionUID = 3019797240613047066L;

	@NotBlank(message = BlogConstant.EMPTY_VALIDATION)
	private String name;

	@NotBlank(message = BlogConstant.EMPTY_VALIDATION)
	@Email(message = BlogConstant.EMAIL_VALIDATION)
	private String email;

	@NotBlank(message = BlogConstant.EMPTY_VALIDATION)
	private String title;

	@NotBlank(message = BlogConstant.EMPTY_VALIDATION)
	private String message;

	public Contact() {
		// default constructor
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
