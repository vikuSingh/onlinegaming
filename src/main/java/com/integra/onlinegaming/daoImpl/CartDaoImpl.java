package com.integra.onlinegaming.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.CartDao;
import com.integra.onlinegaming.model.Cart;

@Repository
public class CartDaoImpl implements CartDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Integer save(Cart cartDetails) {

		Session session = this.sessionFactory.getCurrentSession();
		Serializable serializable = session.save(cartDetails);
		return serializable.hashCode();
	}

}
