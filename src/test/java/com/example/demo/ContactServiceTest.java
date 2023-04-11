package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.example.demo.entity.Contact;
import com.example.demo.dao.ContactDao;
import com.example.demo.service.ContactServiceImpl;

public class ContactServiceTest {

	public static ContactServiceImpl contactServiceImpl = null;

	@BeforeAll
	public static void init() {
		ContactDao daoProxy = EasyMock.createMock(ContactDao.class);

		// for first method
		EasyMock.expect(daoProxy.findNameById(101)).andReturn("raviraj");
		EasyMock.expect(daoProxy.findNameById(102)).andReturn("sagar");

		// for second method

		List<String> list = new ArrayList();
		list.add("satish");
		list.add("sachin");
		list.add("virat");

		EasyMock.expect(daoProxy.findAllName()).andReturn(list);

		// for third method

		Contact contact = new Contact();
		contact.setContactId(1);
		contact.setContactName("chetan");
		contact.setContactNumber(13232342525l);

		EasyMock.expect(daoProxy.findContactById(1)).andReturn(contact);

		EasyMock.replay(daoProxy);

		contactServiceImpl = new ContactServiceImpl();

		contactServiceImpl.setContactDao(daoProxy);

	}

	@Test
	public void testGetContactNameById() {
		String contactNameById = contactServiceImpl.getContactNameById(101);
		System.out.println(contactNameById);
		assertNotNull(contactNameById);
	}

	@Test
	public void testGetAllContactNames() {
		List<String> allContactNames = contactServiceImpl.getAllContactNames();
		System.out.println(allContactNames);
		assertNotNull(allContactNames);
	}

	@Test
	public void testGetContactById() {
		Contact contactById = contactServiceImpl.getContactById(1);
		System.out.println(contactById);
		assertNotNull(contactById);
	}
}
