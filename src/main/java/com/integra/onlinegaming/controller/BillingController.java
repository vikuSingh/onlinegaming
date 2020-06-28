package com.integra.onlinegaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integra.onlinegaming.dto.BillingRequestDto;
import com.integra.onlinegaming.service.BillingService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/billing")
public class BillingController {

	@Autowired
	private BillingService billingDetailsService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<BillingRequestDto> save(@RequestBody BillingRequestDto billingDetailsRequestDto) {

		
		
		if (billingDetailsRequestDto != null) {
			billingDetailsService.persist(billingDetailsRequestDto);
			return new ResponseEntity<BillingRequestDto>(HttpStatus.OK);
		}
		return new ResponseEntity<BillingRequestDto>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
