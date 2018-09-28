package com.luv2code.crud.dao;

import java.util.List;

import com.luv2code.crud.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	
	public Customer getCustomer(int theId);
	
	public void saveCustomer(Customer theCustomer);
	
	public void deleteCustomer(int theId);

}
