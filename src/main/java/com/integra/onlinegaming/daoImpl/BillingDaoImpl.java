package com.integra.onlinegaming.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.BillingDao;
import com.integra.onlinegaming.model.Billing;

@Repository
public class BillingDaoImpl implements BillingDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Integer save(Billing billingDetails) {

		Session session = this.sessionFactory.getCurrentSession();
		Serializable serializable = session.save(billingDetails);

		return serializable.hashCode();

	}

}
