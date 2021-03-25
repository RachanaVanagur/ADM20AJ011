package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT_DETAILS")
public class Student {
 @Id
 @GeneratedValue
 @Column(name = "STUDENT_ID")
 private Integer studentId;
 
 @Column(name = "STUDENT_NAME")
 private String studentName;
 
 @Column(name = "STUDENT_RANK")
 private Integer studentRank;
}
