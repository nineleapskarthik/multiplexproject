package com.nineleaps.multipex.multiplex.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bill_id")
	private Long billId;
	@Column(name = "bill_total_amount",nullable = false)
	private Integer billTotalAmount;
	@Column(name ="bill_description")
	private String billDescription; 
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	

	
public Bill() {
		
	}

	public Bill( int billTotalAmount) {
		super();
		this.billTotalAmount = billTotalAmount;
	}
	
	

	public Bill(Long billId, int billTotalAmount, Customer customer) {
		super();
		this.billId = billId;
		this.billTotalAmount = billTotalAmount;
		this.customer = customer;
	}

	public Bill(Integer billTotalAmount, String billDescription, Customer customer) {
		super();
		this.billTotalAmount = billTotalAmount;
		this.billDescription = billDescription;
		this.customer = customer;
	}

	public String getBillDescription() {
		return billDescription;
	}

	public void setBillDescription(String billDescription) {
		this.billDescription = billDescription;
	}

	public void setBillTotalAmount(Integer billTotalAmount) {
		this.billTotalAmount = billTotalAmount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	
	
}
