package com.integra.onlinegaming.service;

import com.integra.onlinegaming.dto.BillingRequestDto;


public interface BillingService {

	public Integer persist(BillingRequestDto billingDetails);
}
