package com.cognizant.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CUSTOMERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
 @Id
 @Column(name = "CUSTOMER_ID")
 private Integer customerId;
 
 @Column(name = "CUSTOMER_NAME")
 private String customerName;
 
 @Column(name = "CUSTOMER_EMAIL")
 private String customerEmail;
}
