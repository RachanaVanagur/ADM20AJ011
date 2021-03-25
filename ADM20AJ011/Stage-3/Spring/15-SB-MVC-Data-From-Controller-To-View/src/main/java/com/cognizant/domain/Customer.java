package com.cognizant.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
 private Long customerId;
 private String customerName;
 private String customerEmail;
}
