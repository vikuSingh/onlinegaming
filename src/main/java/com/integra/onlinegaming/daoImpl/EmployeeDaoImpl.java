package com.integra.onlinegaming.daoImpl;

import java.io.Serializable;
import java.util.List;

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

	public Integer save(Employee employee) {
		Session session = this.sessionFactory.getCurrentSession();
		Serializable serializable = session.save(employee);
		return serializable.hashCode();

	}

	@SuppressWarnings("unchecked")
	public List<Employee> getDetails() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Employee> list = session.createQuery("from Employee").list();
		return list;
	}
}