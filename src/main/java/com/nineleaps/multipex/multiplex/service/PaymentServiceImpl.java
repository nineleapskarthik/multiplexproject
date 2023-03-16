package com.nineleaps.multipex.multiplex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.multipex.multiplex.entity.Payment;
import com.nineleaps.multipex.multiplex.repository.PaymentRepository;


@Service
public class PaymentServiceImpl implements IPaymentService{
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public List<Payment> getAllPayment() {
		return paymentRepository.findAll();
	}

	@Override
	public Payment savePayment(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public Optional<Payment> getTransactionById(Long transactionId) {
		return paymentRepository.findById(transactionId);
	}

	@Override
	public void deleteTransactionById(Long transactionId) {
		paymentRepository.deleteById(transactionId);
		
	}

	@Override
	public Payment updatePayment(Payment payment)  {
		return paymentRepository.save(payment);

	}

}
