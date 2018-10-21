package com.fdmgroup.repository;

import java.util.List;
import java.util.ArrayList;

import com.fdmgroup.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	private String dbUsername;
	
	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Charlie");
		customer.setLastName("Botello");
		
		customers.add(customer);
		return customers;
	}
	
}
