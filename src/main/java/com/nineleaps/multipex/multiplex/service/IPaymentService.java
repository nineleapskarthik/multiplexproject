package com.nineleaps.multipex.multiplex.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.multipex.multiplex.entity.Payment;
import com.nineleaps.multipex.multiplex.exception.ResourceNotFoundException;



public interface IPaymentService {
	public List<Payment> getAllPayment();
	public Payment savePayment(Payment payment);
	public Payment updatePayment(Payment payment);
	public Optional<Payment> getTransactionById(Long transactionId);
	public void deleteTransactionById(Long transactionId);

}
