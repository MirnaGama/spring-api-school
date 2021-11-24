package com.mirna.springapischool.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity(name="CLASSROOM")
public class Classroom {

	@Id
	@Column(name="CLASSROOM_ID")
	private Long id;
	
	@Id
	@Column(name="CLASSROOM_NAME")
	private String name;
	
	@OneToOne
	@Column(name="GRADE_ID")
	private Grade grade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
