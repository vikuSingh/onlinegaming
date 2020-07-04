package com.integra.onlinegaming.serviceImpl;

import java.util.ArrayList;
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
		employee.setEid(employeeRequestDto.getEid());
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

	public List<EmployeeRequestDto> getDeatils() {
		List<Employee> listempregistration = employeeDAO.getDetails();
		List<EmployeeRequestDto> listRegisterReqestDto = new ArrayList<EmployeeRequestDto>();
		listempregistration.forEach(empreg -> {
			EmployeeRequestDto employeeRequestDto = new EmployeeRequestDto();
			employeeRequestDto.setEid(empreg.getEid());
			employeeRequestDto.setEname(empreg.getEname());
			employeeRequestDto.setAddress(empreg.getAddress());
			employeeRequestDto.setAge(empreg.getAge());
			employeeRequestDto.setEmail(empreg.getEmail());
			employeeRequestDto.setGender(empreg.getGender());
			employeeRequestDto.setDob(empreg.getDob());
			employeeRequestDto.setPhoneNumber(empreg.getPhoneNumber());
			listRegisterReqestDto.add(employeeRequestDto);
		});
		return listRegisterReqestDto;

	}
}
