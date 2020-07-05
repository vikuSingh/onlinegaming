package com.integra.onlinegaming.service;

import com.integra.onlinegaming.dto.BillingRequestDto;


public interface BillingService {

	public int persist(BillingRequestDto billingDetails);
}
