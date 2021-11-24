package com.mirna.springapischool.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="STUDENT")
public class Student {

	@Id
	@Column(name="STUDENT_ID")
	private Long id;
	
	@OneToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@Column(name="STUDENT_DT_JOIN")
	private Date dateOfJoin;
	
	@OneToMany(mappedBy="student")
	private List<ExamResult> exams;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
	

}
