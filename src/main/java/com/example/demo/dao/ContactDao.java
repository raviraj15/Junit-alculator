package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Contact;

public interface ContactDao {

	
	public String findNameById(Integer id);
	
	public List<String> findAllName();
	
	public Contact findContactById(Integer id);
}
