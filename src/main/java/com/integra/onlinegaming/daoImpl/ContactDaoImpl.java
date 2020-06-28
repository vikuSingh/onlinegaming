package com.integra.onlinegaming.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.integra.onlinegaming.dao.ContactDao;
import com.integra.onlinegaming.model.Contact;

@Repository
public class ContactDaoImpl implements ContactDao {

	@Autowired
		private SessionFactory sessionFactory;

		public Integer save(Contact contactDetails) {

			Session session = this.sessionFactory.getCurrentSession();
			Serializable serializable = session.save(contactDetails);
			return serializable.hashCode();
		}
		
		
	}


