package com.cognizant.contact.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;

import com.cognizant.contact.dao.ContactDAO;
import com.cognizant.contact.dto.Contact;
import com.cognizant.contact.exceptions.NoContactFoundException;

class ContactServiceTest_01 {
	private static ContactServiceImpl service;
	@BeforeAll
	public static void initialSetup() {
		//create a mock object for ContactDAO
		ContactDAO daoProxy = Mockito.mock(ContactDAO.class);
		
		//setting the behaviour for findContactById() for proxy object
		Mockito.when(daoProxy.findContactNameById(101)).thenReturn("sunil"); //recording
		Mockito.when(daoProxy.findContactNameById(102)).thenReturn("anil"); //recording
				
		//setting the behaviour for findContactNames()
		List<String> proxyList = Arrays.asList("Chris","Charles","Jefferey","Mark");		
		Mockito.when(daoProxy.findContactNames()).thenReturn(proxyList);
		
		Contact expContact = new Contact(101,"Sunil Joseph",1234567890L);
		Mockito.when(daoProxy.findContactById(101)).thenReturn(expContact);
		Mockito.when(daoProxy.findContactById(102)).thenReturn(new Contact(102,"Sanjay",9848586878L));
		
		
		Contact expContact1 = new Contact(101,"Sunil Joseph",1234567890L);
		Mockito.when(daoProxy.findContactById(101)).thenReturn(expContact1);

		service = new ContactServiceImpl();
		//injecting proxy object to service object
		service.setDao(daoProxy);
	}
	@Test
	void testGetContactNameById() {		
		//String name = service.getContactNameById(101);		
		String name = service.getContactNameById(102);
		assertNotNull(name);
		//assertNull(name);
	}
	
	@Test
	void testGetContactNames() {		
		List<String> contactNames = service.getContactNames();
		//assertNull(contactNames);
		//assertTrue(contactNames.size()==0);
		//assertNotNull(contactNames);
		assertTrue(contactNames.size()>0);
	}
	
	@Test
	void testGetContactById_01() {
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
		assertThrows(NoContactFoundException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				//Contact contact = service.getContactById(101);				
				Contact contact = service.getContactById(103);
			}			
		});
	}
	
	
	@Test
	public void testGetContactNameById_01() {
		//create mock object using Easy Mock
		ContactDAO daoProxy1 = EasyMock.createMock(ContactDAO.class);
		
		//setting the behaviour for the proxy object
		EasyMock.expect(daoProxy1.findContactNameById(101)).andReturn("Sunil");
		EasyMock.replay(daoProxy1);
		
		ContactServiceImpl serviceImpl = new ContactServiceImpl();
		serviceImpl.setDao(daoProxy1);
		
		assertNotNull(serviceImpl.getContactNameById(101));
	}
}
