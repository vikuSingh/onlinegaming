package com.integra.onlinegaming.serviceImpl;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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

	public int persist(BillingRequestDto billingDetailsRequestDto) {

		int result = 0;
		boolean status=false;

		Billing billingDetails = new Billing();
		billingDetails.setFirstName(billingDetailsRequestDto.getFirstName());
		billingDetails.setLastName(billingDetailsRequestDto.getLastName());
		billingDetails.setCity(billingDetailsRequestDto.getCity());
		billingDetails.setPinCode(billingDetailsRequestDto.getPinCode());
		billingDetails.setEmail(billingDetailsRequestDto.getEmail());
		billingDetails.setPhoneNo(billingDetailsRequestDto.getPhoneNo());
		billingDetails.setProduct(billingDetailsRequestDto.getProduct());
		billingDetails.setPrice(billingDetailsRequestDto.getPrice());
		
		//setting billing order Date
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date today = Calendar.getInstance().getTime();
		billingDetailsRequestDto.setOrderDate(today);		
		billingDetails.setOrderDate(billingDetailsRequestDto.getOrderDate());
		
		billingDetails.setSubTotal(billingDetailsRequestDto.getSubTotal());
		billingDetails.setTotal(billingDetailsRequestDto.getTotal());
		
		//purpose of deleting a record
		billingDetailsRequestDto.setBillingStatus(status);
		billingDetails.setBillingStatus(billingDetailsRequestDto.getBillingStatus());

		if (billingDetails != null) {
			result = billingDetailsDao.save(billingDetails);
			result=1;
		}
		return result;
	}

	
	public List<BillingRequestDto> getBillingDetails() {

		List<BillingRequestDto> listBillingRequestDtos=new ArrayList<BillingRequestDto>();
		
		List<Billing> listBilling=billingDetailsDao.getBillingDetails();
		
		listBilling.forEach(billing ->{
			BillingRequestDto billingRequestDto=new BillingRequestDto();
			
			billingRequestDto.setBillingId(billing.getBillingId());
			billingRequestDto.setProduct(billing.getProduct());
			billingRequestDto.setPrice(billing.getPrice());
			billingRequestDto.setPhoneNo(billing.getPhoneNo());
			billingRequestDto.setOrderDate(billing.getOrderDate());
			
			listBillingRequestDtos.add(billingRequestDto);
		});
		
		return listBillingRequestDtos;
	}
	
	public List<BillingRequestDto> getCancelBilling() {

		List<BillingRequestDto> listBillingRequestDtos=new ArrayList<BillingRequestDto>();
		
		List<Billing> listBilling=billingDetailsDao.getCancelBilling();
		
		listBilling.forEach(billing ->{
			BillingRequestDto billingRequestDto=new BillingRequestDto();
			
			billingRequestDto.setBillingId(billing.getBillingId());
			billingRequestDto.setProduct(billing.getProduct());
			billingRequestDto.setPrice(billing.getPrice());
			billingRequestDto.setPhoneNo(billing.getPhoneNo());
			billingRequestDto.setOrderDate(billing.getOrderDate());			
			
			listBillingRequestDtos.add(billingRequestDto);
		});
		
		return listBillingRequestDtos;
	}




	@Override
	public void editBilling(BillingRequestDto billingRequestDto) {
		billingDetailsDao.updateBilling(billingRequestDto);
		
	}


	@Override
	public void removeBilling(Long billingId) {
		billingDetailsDao.deleteBilling(billingId);
		
	}

}
