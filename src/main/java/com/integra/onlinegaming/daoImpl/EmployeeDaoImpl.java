package com.integra.onlinegaming.daoimpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.EmployeeDao;
import com.integra.onlinegaming.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;
	public Integer save(Employee employeeregistraion) {
		Session session = this.sessionFactory.getCurrentSession();
		Serializable serializable = session.save(employeeregistraion);

		return serializable.hashCode();
		
	}

}
