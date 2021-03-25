package com.cognizant.binding;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
  @XmlElement(name = "cust_id")	
  private Integer customerId;
  
  @XmlElement(name = "cust_name")	
  private String customerName;  

  @XmlElement(name = "cust_email")	
  private String customerEmail;
}
