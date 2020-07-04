package com.integra.onlinegaming.serviceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = formatter.parse(employeeRequestDto.getDob());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		employee.setDob(date);
		if (employee != null) {
			employeeDAO.save(employee);
		}
	}

	public List<EmployeeRequestDto> getDeatils() {
		List<Employee> listempregistration = employeeDAO.getDetails();
		List<EmployeeRequestDto> listRegisterReqestDto = new ArrayList<EmployeeRequestDto>();
		listempregistration.forEach(empreg -> {
			EmployeeRequestDto employeeRequestDto = new EmployeeRequestDto();
			employeeRequestDto.setEname(empreg.getEname());
			employeeRequestDto.setAddress(empreg.getAddress());
			employeeRequestDto.setAge(empreg.getAge());
			employeeRequestDto.setEmail(empreg.getEmail());
			employeeRequestDto.setGender(empreg.getGender());
			employeeRequestDto.setPhoneNumber(empreg.getPhoneNumber());
		});
		return listRegisterReqestDto;

	}
}
