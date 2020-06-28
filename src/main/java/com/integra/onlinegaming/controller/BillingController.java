package com.integra.onlinegaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.integra.onlinegaming.dto.BillingRequestDto;
import com.integra.onlinegaming.service.BillingService;

@Controller
@RequestMapping(value = "/billing")
public class BillingController {

	@Autowired
	private BillingService billingDetailsService;

	public ResponseEntity<BillingRequestDto> save(@ModelAttribute BillingRequestDto billingDetailsRequestDto) {

		if (billingDetailsRequestDto != null) {
			billingDetailsService.persist(billingDetailsRequestDto);
			return new ResponseEntity<BillingRequestDto>(HttpStatus.OK);
		}
		return new ResponseEntity<BillingRequestDto>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}


