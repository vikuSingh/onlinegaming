package com.integra.onlinegaming.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integra.onlinegaming.service.ForgotPasswordService;
@Controller
@RestController
public class ForgotPasswordController {
	@Autowired
	private ForgotPasswordService forgotPasswordService;
	@RequestMapping (value="/update",method=RequestMethod.POST )
	public String updateUser(HttpServletRequest request,HttpServletResponse response,Model model) {
		
		int result=forgotPasswordService.updateUser(request.getParameter("username"), request.getParameter("password"), request.getParameter("confirmpassword"));
		
		return "";
	}
	

	}
	


