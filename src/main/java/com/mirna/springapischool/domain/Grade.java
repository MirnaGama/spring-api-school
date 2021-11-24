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

@Entity(name="GRADE")
public class Grade {

	@Id
	@Column(name="GRADE_ID")
	private Long id;
	
	@Id
	@Column(name="GRADE_NAME")
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	  @JoinTable(name="GRADE_STUDENT",
	             joinColumns={@JoinColumn(name="STUDENT_ID")},
	             inverseJoinColumns={@JoinColumn(name="GRADE_ID")})
	private List<Student> students;

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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
