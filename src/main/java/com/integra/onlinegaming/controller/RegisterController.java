package com.integra.onlinegaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.integra.onlinegaming.dto.RegisterRequestDto;
import com.integra.onlinegaming.service.RegistrationService;

@Controller
@RequestMapping(value ="/registration")

public class RegisterController {
	@Autowired
	private  RegistrationService registrationService;
	public ResponseEntity<RegisterRequestDto> employeereg(@ModelAttribute RegisterRequestDto registerRequestDto) {
		if(registerRequestDto==null) {
			registrationService.registrationdtls(registerRequestDto);
			return new ResponseEntity<RegisterRequestDto>(HttpStatus.OK);
		}
		return new ResponseEntity<RegisterRequestDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
