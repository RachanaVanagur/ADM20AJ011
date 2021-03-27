package com.cognizant.exceptions;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError {
 private Integer errorCode;
 private String errorMsg;
 private Date errorDate;
}
