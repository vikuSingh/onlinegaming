package com.integra.onlinegaming.dto;

import java.util.Calendar;
import java.util.Date;

public class BillingRequestDto {		
		
	    private long billingId;	
		private String firstName;
		private String lastName;
		private String city;
		private String pinCode;
		private String email;
		private long phoneNo;
		private String product;
		private double price;
		private Date orderDate;
		private int subTotal;
		private int total;
		private boolean billingStatus;
		
		public BillingRequestDto() {
			// TODO Auto-generated constructor stub
		}

		public long getBillingId() {
			return billingId;
		}

		public void setBillingId(long billingId) {
			this.billingId = billingId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getPinCode() {
			return pinCode;
		}

		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public long getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getProduct() {
			return product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		public Date getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		public int getSubTotal() {
			return subTotal;
		}

		public void setSubTotal(int subTotal) {
			this.subTotal = subTotal;
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}

		public boolean getBillingStatus() {
			return billingStatus;
		}

		public void setBillingStatus(boolean billingStatus) {
			this.billingStatus = billingStatus;
		}

		@Override
		public String toString() {
			return "BillingRequestDto [billingId=" + billingId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", city=" + city + ", pinCode=" + pinCode + ", email=" + email + ", phoneNo=" + phoneNo
					+ ", product=" + product + ", price=" + price + ", orderDate=" + orderDate + ", subTotal="
					+ subTotal + ", total=" + total + ", billingStatus=" + billingStatus + "]";
		}

		
	}


