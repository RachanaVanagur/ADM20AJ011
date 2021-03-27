package com.cognizant.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassengerInfo {
 private String name;
 private String from;
 private String to;
 private String doj;
 private String trainNo;
}
