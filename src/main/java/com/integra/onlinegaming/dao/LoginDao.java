package com.integra.onlinegaming.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.integra.onlinegaming.model.Login;

import sun.reflect.generics.tree.ReturnType;

public interface LoginDao {
	
 public boolean login(String username,String password);
 
}
