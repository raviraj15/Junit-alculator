package com.example.demo.service;

import java.util.List;



import com.example.demo.dao.ContactDao;
import com.example.demo.entity.Contact;

public class ContactServiceImpl implements ContactService{
	
private ContactDao contactDao;
	
	public void setContactDao(ContactDao contactDao)
	{
		this.contactDao= contactDao;
	}

	@Override
	public String getContactNameById(Integer id) {
		String findNameById = contactDao.findNameById(id);
		String upperCase = findNameById.toUpperCase();
		return upperCase;
	}

	@Override
	public List<String> getAllContactNames() {
		List<String> findAllName = contactDao.findAllName();
		return findAllName;
	}

	@Override
	public Contact getContactById(Integer id) {
		Contact findContactById = contactDao.findContactById(id);
		return findContactById;
	}

}
