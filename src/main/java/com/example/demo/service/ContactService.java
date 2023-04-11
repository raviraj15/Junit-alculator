package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Contact;

public interface ContactService {

	public String getContactNameById(Integer id);
	
	public List<String> getAllContactNames();
	
	public Contact getContactById(Integer id);
}
