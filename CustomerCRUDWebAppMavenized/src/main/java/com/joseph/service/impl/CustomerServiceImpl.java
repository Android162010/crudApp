package com.joseph.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joseph.dao.CustomerDao;
import com.joseph.model.Customer;
import com.joseph.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	public void add(Customer customer) {
		customerDao.add(customer);
	}

	@Transactional
	public void edit(Customer customer) {
		customerDao.edit(customer);
	}

	@Transactional
	public void delete(int customerId) {
		customerDao.delete(customerId);
	}

	@Transactional
	public Customer getCustomer(int customerId) {
		return customerDao.getCustomer(customerId);
	}

	@Transactional
	public List getAllCustomer() {
		return customerDao.getAllCustomer();
	}

}
