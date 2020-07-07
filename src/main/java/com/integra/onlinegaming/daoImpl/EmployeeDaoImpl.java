package com.integra.onlinegaming.daoImpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.EmployeeDao;
import com.integra.onlinegaming.dto.EmployeeRequestDto;
import com.integra.onlinegaming.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;

	
	public Integer save(Employee employee) {
		Session session = this.sessionFactory.getCurrentSession();
		Serializable serializable = session.save(employee);
		return serializable.hashCode();
	}

	@Override
	public void upateEmployee(EmployeeRequestDto employeeRequestDto) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee2 = (Employee) session.load(Employee.class, employeeRequestDto.getEid());
		employee2.setEname(employeeRequestDto.getEname());
		employee2.setAddress(employeeRequestDto.getAddress());
		employee2.setAge(employeeRequestDto.getAge());
		employee2.setEmail(employeeRequestDto.getEmail());
		employee2.setPhoneNumber(employeeRequestDto.getPhoneNumber());
		employee2.setDob(employeeRequestDto.getDob());
		employee2.setGender(employeeRequestDto.getGender());
		session.saveOrUpdate(employee2);
		
	}

	
	public void deleteEmployee(long eid) {

		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.load(Employee.class, eid);
		if (employee != null) {
			session.delete(employee);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getDetails() {

		Session session = this.sessionFactory.getCurrentSession();
		List<Employee> list = session.createQuery("from Employee").list();
		return list;
	}

}
