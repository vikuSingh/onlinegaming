package com.integra.onlinegaming.service;

import com.integra.onlinegaming.dto.RegisterRequestDto;

public interface LoginService {
	
  public boolean checkLogin(RegisterRequestDto registerRequestDto);
  
public boolean updateUser(RegisterRequestDto registerRequestDto);

}
