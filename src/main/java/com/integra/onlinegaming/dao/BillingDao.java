package com.integra.onlinegaming.dao;

import java.util.List;

import com.integra.onlinegaming.dto.BillingRequestDto;
import com.integra.onlinegaming.model.Billing;

public interface BillingDao {
	
	public Integer save(Billing billingDetails);
    public List<Billing> getBillingDetails();
    public void updateBilling(BillingRequestDto billingRequestDto);
    public void deleteBilling(Long billingId);
	List<Billing> getCancelBilling();
}
