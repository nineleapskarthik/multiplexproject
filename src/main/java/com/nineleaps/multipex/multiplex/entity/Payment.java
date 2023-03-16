package com.nineleaps.multipex.multiplex.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "payment")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private Long transactionId;
	@Column(name = "payment_cvvnumber",nullable = false)
	private int cvvNumber;
	@Column(name = "payment_cardnumber",nullable = false)
	private Long cardNumber;
	@Column(name="payment_amount",nullable = false)
	private double amount;
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	public Payment(Long transactionId, int cvvNumber, Long cardNumber, double amount) {
		super();
		this.transactionId = transactionId;
		this.cvvNumber = cvvNumber;
		this.cardNumber = cardNumber;
		this.amount = amount;
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public int getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

	

}
