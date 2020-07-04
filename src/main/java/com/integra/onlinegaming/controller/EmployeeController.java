package com.integra.onlinegaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integra.onlinegaming.dto.EmployeeRequestDto;
import com.integra.onlinegaming.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
@CrossOrigin(origins = "*")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	private static final String FAIL = "fail";
	private static final String PASS = "success";

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String persist(@RequestBody EmployeeRequestDto employeeRequestDto) {
		if (employeeRequestDto != null) {
			employeeService.persist(employeeRequestDto);
			return PASS;
		}
		return FAIL;
	}

	@RequestMapping(value = "/getEmp", method = RequestMethod.GET)
	public List<EmployeeRequestDto> getProfileDtails() {
		List<EmployeeRequestDto> list = employeeService.getDeatils();
		return list;
	}
}