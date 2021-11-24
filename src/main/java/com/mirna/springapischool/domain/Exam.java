package com.mirna.springapischool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.security.auth.Subject;

@Entity(name="EXAM")
public class Exam {

	@Id
	@Column(name="EXAM_ID")
	private Long id;
	
	@Column(name="EXAM_NAME")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	private Subject subject;
	
	@ManyToOne
	@JoinColumn(name="GRADE_ID")
	private Grade grade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
}
