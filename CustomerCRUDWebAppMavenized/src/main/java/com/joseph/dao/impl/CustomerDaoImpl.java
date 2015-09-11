
package com.joseph.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.joseph.dao.CustomerDao;
import com.joseph.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Customer customer) {
		session.getCurrentSession().save(customer);
	}

	@Override
	public void edit(Customer customer) {
		session.getCurrentSession().update(customer);
	}

	@Override
	public void delete(int customerId) {		
		session.getCurrentSession().delete(getCustomer(customerId));
	}

	@Override
	public Customer getCustomer(int customerId) {
		return (Customer)session.getCurrentSession().get(Customer.class, customerId);
	}

	@Override
	public List getAllCustomer() {
		return session.getCurrentSession().createQuery("from Customer").list();
	}

}
