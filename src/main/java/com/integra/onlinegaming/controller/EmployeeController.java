package com.integra.onlinegaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<String> persist(@RequestBody EmployeeRequestDto employeeRequestDto) {
		if (employeeRequestDto != null) {
			employeeService.persist(employeeRequestDto);
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<EmployeeRequestDto> getProfileDtails() {
		List<EmployeeRequestDto> list = employeeService.getDeatils();
		return list;
}
}