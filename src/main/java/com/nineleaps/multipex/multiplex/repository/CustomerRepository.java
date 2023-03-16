package com.nineleaps.multipex.multiplex.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nineleaps.multipex.multiplex.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	Optional<Customer> findByUsernameAndPassword(String username, String password);

}
