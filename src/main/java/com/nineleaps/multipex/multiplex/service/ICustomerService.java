package com.nineleaps.multipex.multiplex.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.multipex.multiplex.entity.Customer;



public interface ICustomerService {
	public List<Customer> getAllCustomer();

	public Customer saveCustomer(Customer customer);

	public Optional<Customer> getCustomerById(Long customerId);

	public Customer updateCustomer(Customer customer);

	public void deleteCustomerById(Long customerId);

	public Optional<Customer> findByUsernameAndPassword(String username, String password);

}
