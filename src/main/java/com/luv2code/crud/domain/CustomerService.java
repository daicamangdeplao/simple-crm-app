package com.luv2code.crud.domain;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

	private final CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public Customer getCustomer(int theId) {
		return customerRepository.findById((long) theId)
				.orElse(null);
	}

	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	public void saveCustomer(Customer theCustomer) {
		customerRepository.save(theCustomer);
	}

	public void deleteCustomer(int theId) {
		customerRepository.deleteById((long) theId);
	}
}
