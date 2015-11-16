package mum.ea.blog.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import mum.ea.blog.util.BlogConstant;

/**
 * <p>
 * User class.
 * </p>
 *
 * @author Toan Quach
 */
@Entity
public class User implements Serializable {

	private static final long serialVersionUID = -622855600192016623L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int userId;

	@NotBlank(message = BlogConstant.EMPTY_VALIDATION)
	@Column(name = "USERNAME", unique = true, length = 40)
	private String username;

	@Size(min = 5, max = 100, message = BlogConstant.RANGE_LETTERS_VALIDATION)
	@Column(name = "PASSWORD")
	private String password;

	@NotNull
	@Column(name = "ENABLED")
	private Boolean enabled;

	@Valid
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "EMAIL", referencedColumnName = "EMAIL")
	private List<Authority> authorities;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "USER_ID")
	private List<Entry> entries;

	/**
	 * <p>
	 * Constructor for User.
	 * </p>
	 */
	public User() {
		this.enabled = Boolean.TRUE;
		this.authorities = new ArrayList<>();
		this.entries = new ArrayList<>();
	}

	/**
	 * <p>
	 * Getter for the field <code>userId</code>.
	 * </p>
	 *
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * <p>
	 * Setter for the field <code>userId</code>.
	 * </p>
	 *
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * <p>
	 * Getter for the field <code>username</code>.
	 * </p>
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <p>
	 * Setter for the field <code>username</code>.
	 * </p>
	 *
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * <p>
	 * Getter for the field <code>password</code>.
	 * </p>
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <p>
	 * Setter for the field <code>password</code>.
	 * </p>
	 *
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * <p>
	 * Getter for the field <code>enabled</code>.
	 * </p>
	 *
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * <p>
	 * Setter for the field <code>enabled</code>.
	 * </p>
	 *
	 * @param enabled
	 *            the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * <p>
	 * Getter for the field <code>authorities</code>.
	 * </p>
	 *
	 * @return the authorities
	 */
	public List<Authority> getAuthorities() {
		return authorities;
	}

	/**
	 * <p>
	 * Setter for the field <code>authorities</code>.
	 * </p>
	 *
	 * @param authorities
	 *            the authorities to set
	 */
	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}

	/**
	 * @return the entries
	 */
	public List<Entry> getEntries() {
		return entries;
	}

	/**
	 * @param entries
	 *            the entries to set
	 */
	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
}
