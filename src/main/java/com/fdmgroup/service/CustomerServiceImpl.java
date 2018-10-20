package com.fdmgroup.service;

import java.util.List;

import com.fdmgroup.model.Customer;
import com.fdmgroup.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	
	public CustomerServiceImpl() {

	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.fdmgroup.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
