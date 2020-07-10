package com.integra.onlinegaming.service;

import java.util.List;

import com.integra.onlinegaming.dto.BillingRequestDto;


public interface BillingService {

	public int persist(BillingRequestDto billingDetails);
	public List<BillingRequestDto> getBillingDetails();
	public List<BillingRequestDto> getCancelBilling();
	public void editBilling(BillingRequestDto billingRequestDto);
	public void removeBilling(Long billingId);
	
}
