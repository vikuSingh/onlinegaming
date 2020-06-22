package com.integra.onlinegaming.service;

import com.integra.onlinegaming.dto.LoginRequestDto;

public interface LoginService {
	
  public boolean checkLogin(String username, String password);
}
