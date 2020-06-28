package com.integra.onlinegaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
		private ContactService contactDetailsService;
       
	 @RequestMapping(value="/save", method = RequestMethod.POST)
		public ResponseEntity<ContactRequestDto>save(@RequestBody ContactRequestDto contactDetailsRequestDto) {

			if (contactDetailsRequestDto != null) {
				contactDetailsService.persist(contactDetailsRequestDto);
				return new ResponseEntity<ContactRequestDto>(HttpStatus.OK);
			}
			return new ResponseEntity<ContactRequestDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	
	}
