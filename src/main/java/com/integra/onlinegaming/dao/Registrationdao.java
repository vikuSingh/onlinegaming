package com.integra.onlinegaming.dao;

import java.util.List;

import com.integra.onlinegaming.model.Registration;

public interface Registrationdao {
	
	
	public Integer save(Registration  registration);


	public List<Registration> getDetails();
		
}
