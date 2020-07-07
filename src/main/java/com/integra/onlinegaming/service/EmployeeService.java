package com.integra.onlinegaming.service;

import java.util.List;

import com.integra.onlinegaming.dto.EmployeeRequestDto;

public interface EmployeeService {
	public void persist(EmployeeRequestDto employeeReqeustDto);
	public void edit(EmployeeRequestDto employeeReqeustDto);

	public void remove(Long cid);
	public List<EmployeeRequestDto> getDeatils();
}
