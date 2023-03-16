package com.nineleaps.multipex.multiplex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="customer_id", nullable = false)
	  private Long customerId;
	  
	  @Size(min=3,message="cutomer name should contain minimum three alphabet")
	  @Column(name = "customer_first_name",nullable = false)
	  private String customerFirstName;
	  @Column(name = "customer_middle_name")
	  private String customerMiddleName;
	  @Size(min=3,message="cutomer last name should contain minimum three alphabet")
	  @Column(name = "customer_last_name",nullable = false)
	  private String customerLastName;
	  @Size(min=10,max=10,message="phone number must be of 10 digit")
	  @Column(name = "customer_phone_number",nullable = false)
	  private String customerPhoneNumber;
	  @Email
	  @Column(name = "customer_email",nullable = false)
	  private String customerEmail;
	  @Size(min=4,max=6)
	  @Column(name = "customer_gender",nullable = false)
	  private String customerGender;
	  @Column(name = "customer_age")
	  private int customerAge;
	  @Column(name = "username",nullable = false)
	  private String username;
	  @Column(name = "password",nullable = false)
	  private String password;
	  
	  public Customer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName
				+ ", customerMiddleName=" + customerMiddleName + ", customerLastName=" + customerLastName
				+ ", customerPhoneNumber=" + customerPhoneNumber + ", customerEmail=" + customerEmail
				+ ", customerGender=" + customerGender + ", customerAge=" + customerAge + ", username=" + username
				+ ", password=" + password + "]";
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerMiddleName() {
		return customerMiddleName;
	}

	public void setCustomerMiddleName(String customerMiddleName) {
		this.customerMiddleName = customerMiddleName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	  

}
