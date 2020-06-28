package com.integra.onlinegaming.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.ToddlerDao;

import com.integra.onlinegaming.model.Toddler;

@Repository
public class ToddlerDaoImpl implements ToddlerDao {

	
	@Autowired
	private SessionFactory sessionFactory;

	public Integer save(Toddler toddlerDetails) {

		Session session = this.sessionFactory.getCurrentSession();
		Serializable serializable = session.save(toddlerDetails);
		return serializable.hashCode();
	}

}
