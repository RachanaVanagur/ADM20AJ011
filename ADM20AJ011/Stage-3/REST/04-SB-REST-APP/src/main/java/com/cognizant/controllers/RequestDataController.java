package com.cognizant.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestapp")
public class RequestDataController {
 @GetMapping("/data")	
 //public String readHeadData(@RequestHeader("deptt") String dept) {
 public String readHeadData(@RequestHeader(value = "dept", required = false, defaultValue = "HR") String dept, @RequestHeader("Host") String hostName) {
	 String msg="Department = "+dept+"\nHost = "+hostName;
	 return msg;
 }
 
 @PostMapping("/data1")
 public String readRequestBody(@RequestBody String data) {
	 String msg = "Body Data = "+data;
	 return msg;
 }
 
 @PostMapping("/data2")
 public String readHeaderAndRequestBody(@RequestHeader(value = "dept", required = false, defaultValue = "HR") String dept, @RequestHeader("Host") String hostName, @RequestBody String data) {
	 String msg="Department = "+dept+"\nHost = "+hostName+"\n"+"Body Data = "+data;	 
	 return msg;
 } 
}
