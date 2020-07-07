package com.integra.onlinegaming.dao;

import java.util.List;

import com.integra.onlinegaming.dto.EmployeeRequestDto;
import com.integra.onlinegaming.model.Employee;

public interface EmployeeDao {
	public Integer save(Employee employee);
	public void upateEmployee(EmployeeRequestDto employeeRequestDto);
	public void deleteEmployee(long eid);
	public List<Employee> getDetails();

}
