package com.cognizant.binding;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(value = Include.NON_NULL)
public class Customer {
  @JsonProperty("CID")
  private Integer customerId;
  
  @JsonProperty("NAME")
  private String customerName;
  
  @JsonProperty("EMAIL")
  private String customerEmail;
}
