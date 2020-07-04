package com.integra.onlinegaming.service;

import java.util.List;

import com.integra.onlinegaming.dto.EmployeeRequestDto;

public interface EmployeeService {
	public void persist(EmployeeRequestDto employeeregistration);
	public List<EmployeeRequestDto> getDeatils();
}
