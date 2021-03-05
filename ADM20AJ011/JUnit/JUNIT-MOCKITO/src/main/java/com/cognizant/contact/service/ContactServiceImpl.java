package com.cognizant.contact.service;

import java.util.List;

import com.cognizant.contact.dao.ContactDAO;
import com.cognizant.contact.dto.Contact;
import com.cognizant.contact.exceptions.NoContactFoundException;

public class ContactServiceImpl implements ContactService {
	private ContactDAO dao;
	
	public void setDao(ContactDAO dao) {
		this.dao = dao;
	}

	public String getContactNameById(Integer cid) {
		String cname = dao.findContactNameById(cid);
		//our logic
		String formattedName = cname.toUpperCase();
		System.out.println(formattedName);
 		return formattedName;		
	}

	
	@Override
	public List<String> getContactNames() {
		List<String> names = dao.findContactNames();
		System.out.println(names);
		
		if(!names.isEmpty()) {
			return names;
		}
		return null;
	}

	@Override
	public Contact getContactById(Integer cid) {
		Contact contact = dao.findContactById(cid);
		System.out.println(contact);
		
		if(contact == null) {
			throw new NoContactFoundException("No Contact with Contact ID: "+cid);
		}
		return contact;
	}	
}
