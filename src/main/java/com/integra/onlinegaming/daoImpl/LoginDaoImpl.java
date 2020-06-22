package com.integra.onlinegaming.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.LoginDao;
import com.integra.onlinegaming.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao {
    @Autowired 
	private SessionFactory sessionFactory;
    
	public boolean login(String username, String password) {
		boolean userFound=false;
		Session session = this.sessionFactory.getCurrentSession();
		String SQL_QUERY =" from register  where username=? and password=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,username);
		query.setParameter(1,password);
		List<Login> list = query.list();
		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		return userFound;  
		
	}

 
		
		
	
	

}
