package com.joseph.dao;

import java.util.List;

import com.joseph.model.Customer;

public interface CustomerDao {
	public void add(Customer customer);
	public void edit(Customer customer);
	public void delete(int customerId);
	public Customer getCustomer(int customerId);
	public List getAllCustomer();
}
