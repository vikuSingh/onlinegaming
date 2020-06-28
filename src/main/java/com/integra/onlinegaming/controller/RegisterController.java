package com.integra.onlinegaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integra.onlinegaming.dto.RegisterRequestDto;
import com.integra.onlinegaming.service.RegistrationService;

@RestController
@RequestMapping(value = "/registration")
@CrossOrigin(origins = "*")
public class RegisterController {

	@Autowired
	private RegistrationService registrationService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<String> registrationdtls(@RequestBody RegisterRequestDto registerRequestDto) {
		if (registerRequestDto != null) {
			registrationService.registrationdtls(registerRequestDto);
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);

	}


}
