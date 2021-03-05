package com.cognizant.contact.service;

import java.util.List;

import com.cognizant.contact.dto.Contact;

public interface ContactService {
 public String getContactNameById(Integer cid);
 public List<String> getContactNames();
 public Contact getContactById(Integer cid);
}
