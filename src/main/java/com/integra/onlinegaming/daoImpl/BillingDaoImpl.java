package com.integra.onlinegaming.daoImpl;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.BillingDao;
import com.integra.onlinegaming.dto.BillingRequestDto;
import com.integra.onlinegaming.model.Billing;

@Repository
public class BillingDaoImpl implements BillingDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override	
	public Integer save(Billing billingDetails) {

		Session session = this.sessionFactory.getCurrentSession();
		Serializable serializable = session.save(billingDetails);

		return serializable.hashCode();

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Billing> getBillingDetails() {
		
		Session session=this.sessionFactory.getCurrentSession();
		List<Billing> listBilling=session.createQuery("from Billing where billingStatus=false").list();
		return listBilling;
	}

	@Override
	public void updateBilling(BillingRequestDto billingRequestDto) {

         Session session=this.sessionFactory.getCurrentSession();
         Billing billing=(Billing) session.load(Billing.class, billingRequestDto.getBillingId());
         billing.setFirstName(billingRequestDto.getFirstName());
         billing.setLastName(billingRequestDto.getLastName());
         billing.setEmail(billingRequestDto.getEmail());
         billing.setPhoneNo(billingRequestDto.getPhoneNo());
         billing.setCity(billingRequestDto.getCity());
         billing.setPinCode(billingRequestDto.getPinCode());
         
       //setting billing order Date
 		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 		Date today = Calendar.getInstance().getTime();
 		billingRequestDto.setOrderDate(today);		
 		billing.setOrderDate(billingRequestDto.getOrderDate());
        billing.setBillingStatus(billingRequestDto.getBillingStatus());
         session.saveOrUpdate(billing);         
		
	}

	@Override
	public void deleteBilling(Long billingId) {
		Session session=this.sessionFactory.getCurrentSession();
		String SQL_QUERY = "update Billing set billingStatus =true where billingId =?";
		Query query=session.createQuery(SQL_QUERY);
		//query.setParameter(0,true);
		query.setParameter(0, billingId);
		int result=query.executeUpdate();	
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Billing> getCancelBilling() {
		
		Session session=this.sessionFactory.getCurrentSession();
		List<Billing> listBilling=session.createQuery("from Billing where billingStatus=true").list();
		return listBilling;
	}
	
	

}
