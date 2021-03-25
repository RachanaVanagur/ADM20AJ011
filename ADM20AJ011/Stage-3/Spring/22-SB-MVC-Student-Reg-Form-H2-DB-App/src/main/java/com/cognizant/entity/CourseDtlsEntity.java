package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "COURSE_DETAILS")
public class CourseDtlsEntity {
 @Id
 @Column(name = "COURSE_ID")
 private Integer courseId;
 
 @Column(name = "COURSE_NAME")
 private String courseName;
}
