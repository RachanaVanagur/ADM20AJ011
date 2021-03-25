package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "PRODUCTS")
public class ProductEntity {
 @Id
 @Column(name = "PRODUCT_ID")
 @GenericGenerator(name = "prodIdGen", strategy = "com.cognizant.util.ProductIdGenerator")
 @GeneratedValue(generator = "prodIdGen")
 private String productId;
 
 @Column(name = "PRODUCT_NAME")
 private String productName;
 
 @Column(name = "PRODUCT_UNIT_PRICE")
 private Float productPrice;
}
