package com.cognizant.students.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTS")
public class StudentsEntity {
	@Id
	@Column(name = "STUDENT_ID")
	private Integer studentId;
	
	@Column(name = "STUDENT_NAME")
	private String studentName;
	
	@Column(name = "STUDENT_EMAIL")
	private String studentEmail;

	public Integer getStudentId() {
		return studentId;
	}
	
	public StudentsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentsEntity(Integer studentId, String studentName, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	@Override
	public String toString() {
		return "StudentsEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail="
				+ studentEmail + "]";
	}

}
