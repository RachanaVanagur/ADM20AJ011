package com.cognizant.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
 @XmlElement(name = "bid")	
 @JsonProperty("bid")
 private Integer bookId;
 
 @XmlElement(name = "bname")
 private String bookName;
 
 @XmlElement(name = "author")
 private String bookAuthor;
 
 @XmlElement(name = "price")
 private Float bookPrice;
}
