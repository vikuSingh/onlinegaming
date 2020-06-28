package com.integra.onlinegaming.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.IndoorDao;
import com.integra.onlinegaming.model.Indoor;

@Repository
public class IndoorDaoImpl implements IndoorDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Integer save(Indoor indoorDetails) {

		Session session = this.sessionFactory.getCurrentSession();
		Serializable serializable = session.save(indoorDetails);
		return serializable.hashCode();
	}

}
