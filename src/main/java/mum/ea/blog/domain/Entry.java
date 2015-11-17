package mum.ea.blog.domain;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Calendar;
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
import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

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

	@NotBlank(message = BlogConstant.EMPTY_VALIDATION)
	@Column(name = "SHORT_DESCRIPTION", nullable = false, length = 300)
	private String shortDescription;

	@NotBlank(message = BlogConstant.EMPTY_VALIDATION)
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "CONTENT", nullable = false)
	private String content;

	@NotNull(message = BlogConstant.EMPTY_VALIDATION)
	@DateTimeFormat(pattern = BlogConstant.DATE_FORMAT)
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

	@PrePersist
	public void updatDate() throws ParseException {
		createdDate = Calendar.getInstance().getTime();
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
}
