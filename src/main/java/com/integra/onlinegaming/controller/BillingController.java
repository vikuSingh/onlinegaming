package com.integra.onlinegaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/getBill", method = RequestMethod.GET)
	public List<BillingRequestDto> getBillDetails(){
		List<BillingRequestDto> listBill=billingDetailsService.getBillingDetails();
		
		return listBill;
	}
	
	@RequestMapping(value="/getCancel", method = RequestMethod.GET)
	public List<BillingRequestDto> getCanceledBill(){
		List<BillingRequestDto> listBill=billingDetailsService.getCancelBilling();
		
		return listBill;
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public void eidtBill(@RequestBody BillingRequestDto billingRequestDto) {
		billingDetailsService.editBilling(billingRequestDto);
	}
	
	@RequestMapping(value = "/delete/{billingId}", method = RequestMethod.DELETE)
	public void deleteBill(@PathVariable Long billingId) {
		billingDetailsService.removeBilling(billingId);
	}
	
}


