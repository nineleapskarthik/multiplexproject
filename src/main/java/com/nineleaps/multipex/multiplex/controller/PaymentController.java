package com.nineleaps.multipex.multiplex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.multipex.multiplex.entity.Payment;
import com.nineleaps.multipex.multiplex.service.IPaymentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin("*")
@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private IPaymentService paySerivce;
	@GetMapping("/listpayment")
	public List<Payment> getAllPayment(){
		return paySerivce.getAllPayment();
	}
	
	@PostMapping("/savepayment")
	public Payment savePayment(@RequestBody Payment payment) {
		return paySerivce.savePayment(payment);
	}
	
	@PutMapping("/updatepayment/{pid}")
	public Payment updatePayment(@RequestBody Payment newPayment,@PathVariable("pid")Long transactionId){
	
		return paySerivce.updatePayment(newPayment);
	}
	
	
	@GetMapping("/findPayment/{pid}")
	public Payment getTransactionById(@PathVariable("pid")Long transactionId) {
		return paySerivce.getTransactionById(transactionId).get();
	}
	
	@DeleteMapping("/deletePayment/{pid}")
	public void deleteTransactionById(@PathVariable("pid")Long transactionId)
	{
		paySerivce.deleteTransactionById(transactionId);
	}
}
