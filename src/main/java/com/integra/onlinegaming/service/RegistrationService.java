package com.integra.onlinegaming.service;

import java.util.List;

import com.integra.onlinegaming.dto.RegisterRequestDto;


public interface RegistrationService {

	public void registrationdtls(RegisterRequestDto registrationRequestDto);
	
	public List<RegisterRequestDto> getDeatils();
}
