package com.cognizant.contact.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;

import com.cognizant.contact.dao.ContactDAO;
import com.cognizant.contact.dto.Contact;
import com.cognizant.contact.exceptions.NoContactFoundException;

class ContactServiceTest {

	@Test
	void testGetContactNameById() {
		//create a mock object for ContactDAO
		ContactDAO daoProxy = Mockito.mock(ContactDAO.class);
		
		//setting the behaviour for proxy object
		Mockito.when(daoProxy.findContactNameById(101)).thenReturn("sunil"); //recording
		Mockito.when(daoProxy.findContactNameById(102)).thenReturn("anil"); //recording
		
		ContactServiceImpl service = new ContactServiceImpl();
		//injecting proxy object to service object
		service.setDao(daoProxy);
		
		//String name = service.getContactNameById(101);		
		String name = service.getContactNameById(102);
		assertNotNull(name);
		//assertNull(name);
	}
	
	@Test
	void testGetContactNames() {
		ContactDAO daoProxy = Mockito.mock(ContactDAO.class);
		
		List<String> proxyList = Arrays.asList("Chris","Charles","Jefferey","Mark");		
		Mockito.when(daoProxy.findContactNames()).thenReturn(proxyList);
		
		ContactServiceImpl service = new ContactServiceImpl();
		service.setDao(daoProxy);
		
		List<String> contactNames = service.getContactNames();
		//assertNull(contactNames);
		//assertTrue(contactNames.size()==0);
		//assertNotNull(contactNames);
		assertTrue(contactNames.size()>0);
	}
	
	@Test
	void testGetContactById_01() {
		ContactDAO daoProxy = Mockito.mock(ContactDAO.class);
		
		Contact expContact = new Contact(101,"Sunil Joseph",1234567890L);
		Mockito.when(daoProxy.findContactById(101)).thenReturn(expContact);
		Mockito.when(daoProxy.findContactById(102)).thenReturn(new Contact(102,"Sanjay",9848586878L));
		
		ContactServiceImpl service = new ContactServiceImpl();
		service.setDao(daoProxy);
		
		Contact contact = service.getContactById(101);
		//Contact contact = service.getContactById(102);
		assertNotNull(contact);
	}
	
	/*
	 * In JUnit 4
	 * @Test(expected = NoContactFoundException.class)
	 */
	@Test
	void testGetContactById_02() {
		ContactDAO daoProxy = Mockito.mock(ContactDAO.class);
		Contact expContact = new Contact(101,"Sunil Joseph",1234567890L);
		Mockito.when(daoProxy.findContactById(101)).thenReturn(expContact);
		
		ContactServiceImpl service = new ContactServiceImpl();
		service.setDao(daoProxy);		
				
		//assertNotNull(contact);
		assertThrows(NoContactFoundException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				//Contact contact = service.getContactById(101);				
				Contact contact = service.getContactById(102);
			}			
		});
	}
	
	//-----additional test cases -----
	@Test
	void testMockA() {
		Iterator<String> itr = Mockito.mock(Iterator.class);
		Mockito.when(itr.next()).thenReturn("Java").thenReturn("Python");
		/*
		System.out.println(itr.next());	
		System.out.println(itr.next());
		System.out.println(itr.next());
		*/
		String actual = itr.next()+" "+itr.next();
		assertEquals("Java Python", actual);
	}
	
	@Test
	void testMockB() {
		Comparable<String> comp = Mockito.mock(Comparable.class);
		Mockito.when(comp.compareTo("ABC")).thenReturn(10);
		Mockito.when(comp.compareTo("ADA")).thenReturn(-2);
		
		assertEquals(10, comp.compareTo("ABC"));
	}	
}
