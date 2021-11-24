package com.mirna.springapischool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.security.auth.Subject;

@Entity(name="EXAM_RESULT")
public class ExamResult {

	@Id
	@Column(name="EXAM_RESULT_ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="EXAM_ID")
	private Exam exam;
	
	@Column(name="SUBJECT_ID")
	private Subject subject;
	
	@Column(name="GRADE_ID")
	private Grade grade;
	
	@ManyToOne
	@JoinColumn(name="STUDENT_ID")
	private Student student;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
