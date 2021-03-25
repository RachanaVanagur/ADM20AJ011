package com.cognizant.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CUSTOMERS")
@Data
public class Customer {
 @Id
 @Column(name = "CUSTOMER_ID")
 private Integer customerId;
 
 @Column(name = "CUSTOMER_NAME")
 private String customerName;
 
 @Column(name = "CUSTOMER_EMAIL")
 private String customerEmail;

@Override
public String toString() {
	return "Customer [" + customerId + " | " + customerName + " | " + customerEmail	+ "]";
}
 
 
}
