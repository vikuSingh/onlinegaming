package com.integra.onlinegaming.controller;
import com.integra.onlinegaming.dto.EmployeeRequestDto;
import com.integra.onlinegaming.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/employee")
public class EmployeeController {
	@Autowired
	private  EmployeeService employeeService;
	public ResponseEntity<EmployeeRequestDto> employeereg(@ModelAttribute EmployeeRequestDto employeeRequestDto) {
		if(employeeRequestDto==null) {
			employeeService.employeereg(employeeRequestDto);
			return new ResponseEntity<EmployeeRequestDto>(HttpStatus.OK);
		}
		return new ResponseEntity<EmployeeRequestDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
