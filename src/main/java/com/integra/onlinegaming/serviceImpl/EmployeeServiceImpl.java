package com.integra.onlinegaming.serviceImpl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integra.onlinegaming.dao.EmployeeDao;
import com.integra.onlinegaming.dto.EmployeeRequestDto;
import com.integra.onlinegaming.model.Employee;
import com.integra.onlinegaming.service.EmployeeService;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService  {

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

		DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
				Date date = null;
				try {
					date = format.parse(employeeRequestDto.getDob());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
		employee.setDob(date);
		if (employee != null) {
			employeeDAO.save(employee);
		}
	}
		public List<EmployeeRequestDto> getDeatils() {
			return null;
	}

}
