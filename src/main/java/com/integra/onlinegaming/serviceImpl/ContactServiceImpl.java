package com.integra.onlinegaming.serviceImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
		
		contact.setFullName(contactRequestDto.getFullName());
		 
		contact.setMobileNo(contactRequestDto.getMobileNo());
		contact.setCity(contactRequestDto.getCity());
		contact.setSubject(contactRequestDto.getSubject());
		
		
		Serializable contact1=null;
		if(contact!=null) {
		contact1=contactdao.save(contact);
			
			}
		
		return contact1.hashCode();
		}
	
	public List<ContactRequestDto> getDeatils() {
		List<Contact> listContact = contactdao.getDetails();
		List<ContactRequestDto> listContactRequestDto = new ArrayList<ContactRequestDto>();
		listContact.forEach(reg -> {
			ContactRequestDto contactRequestDto = new ContactRequestDto();
			contactRequestDto.setFullName(reg.getFullName());
			
			contactRequestDto.setMobileNo(reg.getMobileNo());
			contactRequestDto.setCity(reg.getCity());
			contactRequestDto.setSubject(reg.getSubject());
			
			});

		
		return listContactRequestDto;
	}
}



