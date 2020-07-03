package com.integra.onlinegaming.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.LoginDao;
import com.integra.onlinegaming.dto.RegisterRequestDto;
import com.integra.onlinegaming.model.Registration;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public boolean login(Registration registration) {
		boolean userFound = false;
		Session session = this.sessionFactory.getCurrentSession();

		List<RegisterRequestDto> list = session.createQuery("from Registration where email='" + registration.getEmail()
				+ "' and password='" + registration.getPassword() + "'").list();
		if ((list != null) && (list.size() > 0)) {
			userFound = true;
		}
		return userFound;
	}

	public int ForgotPassword(Registration registration) {
		
		Session session = this.sessionFactory.getCurrentSession();
		String SQL_QUERY = "update Registration set PASSWORD = ? where EMAIL = ?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(1, registration.getEmail());
		query.setParameter(0,registration.getPassword());
		int result = query.executeUpdate();
		return result;
		 
	}
	
}
