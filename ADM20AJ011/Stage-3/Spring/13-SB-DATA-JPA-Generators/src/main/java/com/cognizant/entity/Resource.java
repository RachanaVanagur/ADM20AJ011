package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "RESOURCE_DTLS")
public class Resource {
 @Id
 @Column(name = "RESOURCE_ID")
 @GeneratedValue
 /*
 @SequenceGenerator(
		 name = "resource_sequence",
		 sequenceName = "cog_sequence",
		 allocationSize = 1
		 )
 @GeneratedValue(
		 generator = "resource_sequence",
		 strategy = GenerationType.SEQUENCE
		 )
  */
 private Integer resourceId;
 
 @Column(name = "RESOURCE_NAME")
 private String resourceName;
 
 @Column(name = "RESOURCE_EXP")
 private String resourceExp;
 
 @Column(name = "RESOURCE_SKILL")
 private String resourceSkill;
}
