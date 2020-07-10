package com.integra.onlinegaming.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BILLING_DETAILS")
public class Billing implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	private long billingId;	
	private String firstName;	
	private String lastName;	
	private String city;	
	private String pinCode;	
	private String email;	
	private long phoneNo;	
	private String product;	
	private double price;	
	private int subTotal;	
	private int total;	
	private Date orderDate;
	private boolean billingStatus;

	

	public Billing() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BILLING_ID")
	public long getBillingId() {
		return billingId;
	}

	public void setBillingId(long billingId) {
		this.billingId = billingId;
	}

	@Column(name = "FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "CITY")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "PINCODE")
	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PHONE_NUM")
	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "PRODUCT")
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Column(name = "PRICE")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name="ORDER_DATE")
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	@Column(name = "SUB_TOTAL")
	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}

	@Column(name = "TOTAL")
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Column(name="BILLING_STATUS")
	public boolean getBillingStatus() {
		return billingStatus;
	}

	public void setBillingStatus(boolean billingStatus) {
		this.billingStatus = billingStatus;
	}

	@Override
	public String toString() {
		return "BillingDetails [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", pinCode="
				+ pinCode + ", email=" + email + ", phoneNumber=" + phoneNo+ ", product=" + product + ", price="
				+ price + ", subTotal=" + subTotal + ", total=" + total + "]";
	}

}
