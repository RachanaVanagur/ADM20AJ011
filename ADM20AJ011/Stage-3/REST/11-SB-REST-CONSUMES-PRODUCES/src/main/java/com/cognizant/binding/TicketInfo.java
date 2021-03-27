package com.cognizant.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketInfo {
 private String pnr;
 private String name;
 private String from;
 private String to;
 private String trainNo;
 private String status;
 private String dob; //date_of_booking
 private String doj; //date_of_journey
 private Float fare;
}
