package com.nineleaps.multipex.multiplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nineleaps.multipex.multiplex.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
