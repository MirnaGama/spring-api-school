package com.mirna.springapischool.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="USER")
public class User {

	@Id
	@Column(name="USER_ID")
	private Long id;
	
	@Column(name="USER_NAME")
	private String fullname;
	
	@Column(name="USER_PASSWORD")
	private String password;
	
	@Column(name="USER_EMAIL")
	private String email;
	
	@Column(name="USER_PHONE")
	private String phone;
	
	@Column(name="USER_LAST_LOGIN")
	private Date lastLogin;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	
}
