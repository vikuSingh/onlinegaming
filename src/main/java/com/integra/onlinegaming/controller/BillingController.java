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
	public int save(@RequestBody BillingRequestDto billingDetailsRequestDto) {

		
		int result=0;
		if (billingDetailsRequestDto != null) {
			result= billingDetailsService.persist(billingDetailsRequestDto);
			
		}
		return result;
	}
}


