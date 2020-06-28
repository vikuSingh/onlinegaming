package com.integra.onlinegaming.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integra.onlinegaming.dao.LoginDao;
import com.integra.onlinegaming.dto.LoginRequestDto;
import com.integra.onlinegaming.service.LoginService;
@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	@Autowired
  private LoginDao loginDao;
	
	  
       public boolean checkLogin(String username, String password){
    	   
    	   if(username!=null&&password!=null) {
    		   
    	   
              return loginDao.login(username, password);
              
       }
    	
    	   return loginDao.login(username, password);
}
       
       public int updateUser(String username, String password, String confirmPassword) {
   		int result=0;	
   		if(password.equals(confirmPassword)) {
   			 result=loginDao.ForgotPassword(username, password, confirmPassword);
   			
   			return result;
   		}
   		return result;
   	}
  
}
