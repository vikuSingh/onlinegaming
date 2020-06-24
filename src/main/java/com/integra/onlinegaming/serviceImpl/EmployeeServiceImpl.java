package com.integra.onlinegaming.serviceimpl;

import java.io.Serializable;

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
	private EmployeeDao employeeregistrationDao;

	public void employeereg(EmployeeRequestDto employeeRegistrationrequestDto) {
		Serializable serializable = null;
		Employee employeereg = new Employee();
		employeereg.setEmployeename(employeeRegistrationrequestDto.getEmployeename());
		employeereg.setEmployeeId(employeeRegistrationrequestDto.getEmployeeId());
		employeereg.setAddress(employeeRegistrationrequestDto.getAddress());
		employeereg.setAge(employeeRegistrationrequestDto.getAge());
		employeereg.setEmail(employeeRegistrationrequestDto.getEmail());
		employeereg.setPhonenumber(employeeRegistrationrequestDto.getPhonenumber());
		employeereg.setDateofbirth(employeeRegistrationrequestDto.getDateofbirth());
		employeereg.setGender(employeeRegistrationrequestDto.getGender());
		
		


	if (employeereg != null) {
			serializable = employeeregistrationDao.save(employeereg);
		}
		return;
		
	}

}
