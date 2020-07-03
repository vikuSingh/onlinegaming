package com.integra.onlinegaming.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integra.onlinegaming.dto.RegisterRequestDto;
import com.integra.onlinegaming.service.LoginService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/getLogin", method = RequestMethod.POST)
	public boolean processForm(@RequestBody RegisterRequestDto registerRequestDto) {
		boolean flag = false;
		if (registerRequestDto != null) {
			flag = loginService.checkLogin(registerRequestDto);
		}
		return flag;
	}
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public int login(@RequestBody RegisterRequestDto registerRequestDto) {
		int flag=0;
		if (registerRequestDto != null) {
			flag = loginService.updateUser(registerRequestDto);
		}
		return flag;

	}
}
