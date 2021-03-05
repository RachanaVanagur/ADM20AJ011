package com.cognizant.contact.dao;

import java.util.List;

import com.cognizant.contact.dto.Contact;

public interface ContactDAO {
 public String findContactNameById(Integer cid);
 public List<String> findContactNames();
 public Contact findContactById(Integer cid);
}
