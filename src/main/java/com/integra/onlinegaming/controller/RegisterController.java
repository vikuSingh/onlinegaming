package com.integra.onlinegaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integra.onlinegaming.dto.RegisterRequestDto;
import com.integra.onlinegaming.service.RegistrationService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/registration")

public class RegisterController {

	@Autowired
	private RegistrationService registrationService;
	private static final String FAIL = "fail";
	private static final String PASS = "pass";

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String registrationdtls(@RequestBody RegisterRequestDto registerRequestDto) {

		if (registerRequestDto != null) {
			registrationService.registrationdtls(registerRequestDto);
			return PASS;
		}
		return FAIL;

	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<RegisterRequestDto> getProfileDtails() {
		List<RegisterRequestDto> list = registrationService.getDeatils();
		return list;
	}

}
