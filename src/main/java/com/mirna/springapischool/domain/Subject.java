package com.mirna.springapischool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="SUBJECT")
public class Subject {

	@Id
	@Column(name="SUBJECT_ID")
	private Long id;
	
	@Id
	@Column(name="SUBJECT_NAME")
	private String name;

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
	
}
