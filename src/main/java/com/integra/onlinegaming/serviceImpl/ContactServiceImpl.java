package com.integra.onlinegaming.serviceImpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integra.onlinegaming.dao.ContactDao;
import com.integra.onlinegaming.dto.ContactRequestDto;
import com.integra.onlinegaming.model.Contact;
import com.integra.onlinegaming.service.ContactService;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {
 
	@Autowired
	private ContactDao contactdao;
	
	
	public Integer persist(ContactRequestDto contactRequestDto) {
		
		Contact contact=new Contact();
		
		contact.setFirstName(contactRequestDto.getFirstName());
		contact.setLastName(contactRequestDto.getLastName());
		contact.setMobileNo(contactRequestDto.getMobileNo());
		contact.setCountry(contactRequestDto.getCountry());
		contact.setSubject(contactRequestDto.getSubject());
		
		
		Serializable contact1=null;
		if(contact!=null) {
		contact1=contactdao.save(contact);
			
			}
		
		return contact1.hashCode();
		}

}
