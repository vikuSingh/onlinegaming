package com.integra.onlinegaming.dao;

public interface LoginDao {
	
 public boolean login(String username,String password);
 
 public int ForgotPassword(String username,String password,String confirmpPassword);
 
}
