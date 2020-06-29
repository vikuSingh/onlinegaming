package com.integra.onlinegaming.dao;

import java.util.List;

import com.integra.onlinegaming.model.Employee;

public interface EmployeeDao {
	public Integer save(Employee employee);
	
	public List<Employee> getDetails();

}
