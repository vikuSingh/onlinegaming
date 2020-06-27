package com.integra.onlinegaming.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.Registrationdao;
import com.integra.onlinegaming.model.Registration;
@Repository

public class RegistrationDaoImpl implements Registrationdao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public Integer save(Registration RegistrationDetails) {
		
	 
			Session session = this.sessionFactory.getCurrentSession();
			Serializable serializable = session.save(RegistrationDetails);

			return serializable.hashCode();
			
		

	

	}

}
