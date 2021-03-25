package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "GENDER_DETAILS")
public class GenderDtlsEntity {
 @Id
 @Column(name = "GENDER_ID")
 private Integer genderId;
 
 @Column(name = "GENDER_TEXT")
 private String genderText;
}
