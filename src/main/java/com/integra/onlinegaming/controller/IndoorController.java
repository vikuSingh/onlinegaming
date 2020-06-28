package com.integra.onlinegaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import com.integra.onlinegaming.dto.IndoorRequestDto;
import com.integra.onlinegaming.service.IndoorService;


	
	@RestController
	@CrossOrigin(origins="*")
	public class IndoorController {

		@Autowired
		private IndoorService indoorDetailsService;

		public ResponseEntity<IndoorRequestDto> save(@ModelAttribute IndoorRequestDto indoorDetailsRequestDto) {

			if (indoorDetailsRequestDto != null) {
				indoorDetailsService.persist(indoorDetailsRequestDto);
				return new ResponseEntity<IndoorRequestDto>(HttpStatus.OK);
			}
			return new ResponseEntity<IndoorRequestDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	
	
