package com.integra.onlinegaming.dao;


import com.integra.onlinegaming.model.Registration;

public interface LoginDao {
	
 public boolean login(Registration registration);
 
 public  int ForgotPassword(Registration registration);
 
}
