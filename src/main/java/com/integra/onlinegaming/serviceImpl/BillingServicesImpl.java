package com.integra.onlinegaming.serviceImpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integra.onlinegaming.dao.BillingDao;
import com.integra.onlinegaming.dto.BillingRequestDto;
import com.integra.onlinegaming.model.Billing;
import com.integra.onlinegaming.service.BillingService;

@Service
@Transactional
public class BillingServicesImpl implements BillingService {

	@Autowired
	private BillingDao billingDetailsDao;

	public Integer persist(BillingRequestDto billingDetailsRequestDto) {

		Serializable serializable = null;

		Billing billingDetails = new Billing();
		billingDetails.setFirstName(billingDetailsRequestDto.getFirstName());
		billingDetails.setLastName(billingDetailsRequestDto.getLastName());
		billingDetails.setPhoneNumber(billingDetailsRequestDto.getPhoneNumber());
		billingDetails.setEmail(billingDetailsRequestDto.getEmail());
		billingDetails.setCity(billingDetailsRequestDto.getCity());
		billingDetails.setPinCode(billingDetailsRequestDto.getPinCode());
		billingDetails.setPrice(billingDetailsRequestDto.getPrice());
		billingDetails.setProduct(billingDetailsRequestDto.getProduct());
		billingDetails.setSubTotal(billingDetailsRequestDto.getSubTotal());
		billingDetails.setTotal(billingDetailsRequestDto.getTotal());

		if (billingDetails != null) {
			serializable = billingDetailsDao.save(billingDetails);
		}
		return serializable.hashCode();
	}

}
