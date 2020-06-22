package com.integra.onlinegaming.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.integra.onlinegaming.dto.LoginRequestDto;
import com.integra.onlinegaming.model.Login;
import com.integra.onlinegaming.service.LoginService;

@Controller
@RequestMapping(value ="/login")

public class LoginController {
	
	@Autowired
	private LoginService loginService;
	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map model) {
		Login login = new Login();
		model.put("login", login);
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@Validated Login loginForm, BindingResult result,
			Map model) {

		
		if (result.hasErrors()) {
			return "login";
		}
		
		/*
		String userName = "UserName";
		String password = "password";
		loginForm = (LoginForm) model.get("loginForm");
		if (!loginForm.getUserName().equals(userName)
				|| !loginForm.getPassword().equals(password)) {
			return "login";
		}
		*/
		boolean userExists = loginService.checkLogin(loginForm.getUsername(),
                loginForm.getPassword());
		if(userExists){
			model.put("loginForm", loginForm);
			return "loginsuccess";
		}else{
			result.rejectValue("userName","invaliduser");
			return "loginform";
		}

	}
	

	
}

