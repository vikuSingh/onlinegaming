package com.integra.onlinegaming.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.ForgotPasswordDao;
import com.integra.onlinegaming.model.Login;

@Repository
public class ForgotPasswordDaoImpl implements ForgotPasswordDao {
	@Autowired
	private SessionFactory sessionFactory; 
     
	public int ForgotPassword(String username, String password, String confirmpassword) {
    
		Session session = this.sessionFactory.getCurrentSession();
		String SQL_QUERY ="  update login set PASSWORD = :pwd where USER_NAME = :name; ";
		Query query = session.createQuery(SQL_QUERY);
		if(password.equals(confirmpassword)) {
			query.setParameter(0,password);	
		}
		query.setParameter(1,username);
		
		int result=query.executeUpdate();
		
		
		return result;
	}
	
	

}
