package com.integra.onlinegaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RestController;

import com.integra.onlinegaming.dto.ToddlerRequestDto;
import com.integra.onlinegaming.service.ToddlerService;



	
@RestController
@CrossOrigin(origins="*")
	public class ToddlerController {

		@Autowired
		private ToddlerService toddlerDetailsService;

		public ResponseEntity<ToddlerRequestDto> save(@ModelAttribute ToddlerRequestDto toddlerDetailsRequestDto) {

			if (toddlerDetailsRequestDto != null) {
				toddlerDetailsService.persist(toddlerDetailsRequestDto);
				return new ResponseEntity<ToddlerRequestDto>(HttpStatus.OK);
			}
			return new ResponseEntity<ToddlerRequestDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}

