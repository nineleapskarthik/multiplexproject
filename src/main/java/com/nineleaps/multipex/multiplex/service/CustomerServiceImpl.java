package com.nineleaps.multipex.multiplex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nineleaps.multipex.multiplex.entity.Coupon;
import com.nineleaps.multipex.multiplex.entity.Customer;
import com.nineleaps.multipex.multiplex.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Customer> getCustomerById(Long customerId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomerById(Long customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Customer> findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	}
	
	


