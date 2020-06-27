package com.integra.onlinegaming.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integra.onlinegaming.dao.EmployeeDao;
import com.integra.onlinegaming.dto.EmployeeRequestDto;
import com.integra.onlinegaming.model.Employee;
import com.integra.onlinegaming.service.EmployeeService;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDAO;

	public void persist(EmployeeRequestDto employeeRequestDto) {
		Employee employee = new Employee();
		employee.setEname(employeeRequestDto.getEname());
		employee.setAddress(employeeRequestDto.getAddress());
		employee.setAge(employeeRequestDto.getAge());
		employee.setEmail(employeeRequestDto.getEmail());
		employee.setGender(employeeRequestDto.getGender());
		employee.setPhoneNumber(employeeRequestDto.getPhoneNumber());
		employee.setDob(employeeRequestDto.getDob());
		if (employee != null) {
			employeeDAO.save(employee);
		}
	}

}
