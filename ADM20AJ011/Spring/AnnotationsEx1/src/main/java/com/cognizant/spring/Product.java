package com.cognizant.spring;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("prod")
@Scope("singleton")
//@Scope("prototype")
//@Scope(scopeName = "prototype")
public class Product {
	//@Value("101")
	//@Value("#{101+1}")
	//@Value("#{10<20?100:101}")
	//@Value("#{T(java.lang.Integer).MAX_VALUE}")
	@Value("#{T(java.lang.Byte).MAX_VALUE}")
	private Integer productId;
	
	//@Value("Mobile")
	//@Value("#{'Mobile'.toUpperCase()}")
	@Value("#{new java.lang.String('Mobile')}")
	private String productName;
	
	@Value("#{models}")
	private List<String> models;
	
	public Product() {
		System.out.println("---inside constructor");
	}
	public List<String> getModels() {
		return models;
	}

	public void setModels(List<String> models) {
		this.models = models;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [ ID = " + productId + " | NAME = " + productName + " +  | MODELS = "+models + "]";
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("---User-defined init method");
	}
	@PreDestroy
	public void myDestroy() {
		System.out.println("---User-defined destructor");
	}
}
