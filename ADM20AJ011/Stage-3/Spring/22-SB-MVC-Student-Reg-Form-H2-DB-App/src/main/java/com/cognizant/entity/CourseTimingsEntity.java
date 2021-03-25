package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "COURSE_TIMINGS")
public class CourseTimingsEntity {
 @Id
 @Column(name = "TIMING_ID")
 private Integer timingId;
 
 @Column(name = "TIMIMG")
 private String timing;
}
