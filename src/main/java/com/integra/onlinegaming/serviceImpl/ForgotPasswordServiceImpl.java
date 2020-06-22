package com.integra.onlinegaming.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integra.onlinegaming.dao.ForgotPasswordDao;
import com.integra.onlinegaming.service.ForgotPasswordService;

@Service
@Transactional
public class ForgotPasswordServiceImpl  implements ForgotPasswordService{
     @Autowired
	private ForgotPasswordDao forgotPasswordDao;
     
	public int updateUser(String username, String password, String confirmpassword) {
		int result=0;	
		if(password.equals(confirmpassword)) {
			 result=forgotPasswordDao.ForgotPassword(username, password, confirmpassword);
			
			return result;
		}
		return result;
	}

}
