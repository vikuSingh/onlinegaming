package com.integra.onlinegaming.dao;

import java.util.List;

import com.integra.onlinegaming.model.Contact;


public interface ContactDao {
	public Integer save(Contact contactDetails);
    
	public List<Contact> getDetails();
}
