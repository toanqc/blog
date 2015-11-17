package mum.ea.blog.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.validator.constraints.NotBlank;

import mum.ea.blog.util.BlogConstant;

/**
 * 
 * @author Toan Quach
 *
 */
@Entity
public class EntryDetail implements Serializable {

	private static final long serialVersionUID = 1548724507423454366L;

	@Id
	@GeneratedValue
	private long id;

	@NotBlank(message = BlogConstant.EMPTY_VALIDATION)
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "CONTENT", nullable = false)
	private String content;

	public EntryDetail() {
		// default constructor
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
	 * @return the id
	 */
	public long getId() {
		return id;
	}
}
