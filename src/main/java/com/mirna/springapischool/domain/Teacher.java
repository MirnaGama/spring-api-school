package com.mirna.springapischool.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity(name="TEACHER")
public class Teacher {

	@Id
	@Column(name="TEACHER_ID")
	private Long id;
	
	@OneToOne
	@Column(name="USER_ID")
	private User user;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	  @JoinTable(name="TEACHER_GRADE",
	             joinColumns={@JoinColumn(name="GRADE_ID")},
	             inverseJoinColumns={@JoinColumn(name="TEACHER_ID")})
	private List<Grade> grades;

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

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
	
}
