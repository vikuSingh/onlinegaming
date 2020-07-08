package com.integra.onlinegaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integra.onlinegaming.dto.ContactRequestDto;
import com.integra.onlinegaming.service.ContactService;




@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/contact")
public class ContactController {
	

	@Autowired
		private ContactService contactService;
	private static final String FAIL = "fail";
	private static final String PASS = "success";
       
	 @RequestMapping(value="/save", method = RequestMethod.POST)
		public String save(@RequestBody ContactRequestDto contactRequestDto) {

			if (contactRequestDto != null) {
				contactService.persist(contactRequestDto);
			
				return PASS;
			}
			return FAIL;
		}
	 
	 @RequestMapping(value = "/getContact", method = RequestMethod.GET)
		public List<ContactRequestDto> getProfileDtails() {
			List<ContactRequestDto> list = contactService.getDeatils();
			return list;
		}
	
	}
