package mum.ea.blog.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;

import mum.ea.blog.util.BlogConstant;

@Entity
public class Entry implements Serializable {

	private static final long serialVersionUID = 2323057889877617972L;

	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
	private long id;

	@NotBlank(message = BlogConstant.EMPTY_VALIDATION)
	@Column(name = "TITLE", nullable = false, length = 100)
	private String title;

	@Column(name = "SHORT_DESCRIPTION", nullable = false, length = 300)
	private String shortDescription;

	@NotBlank(message = BlogConstant.EMPTY_VALIDATION)
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "CONTENT", nullable = false)
	private String content;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE", nullable = false)
	private Date createdDate;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = User.class)
	@JoinColumn(name = "USER_ID", insertable = false, updatable = false)
	private User user;

	public Entry() {
		// default constructor
	}

	public Entry(String title, String shortDescription, String content) {
		this.title = title;
		this.shortDescription = shortDescription;
		this.content = content;
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
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription
	 *            the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
}
