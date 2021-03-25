package com.cognizant.bindings;

import lombok.Data;

@Data
public class Student {
 private Integer studentId;
 private String studentName;
 private String studentGender;
 private String courseName;
 private String[] timings;
}
