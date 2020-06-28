package com.integra.onlinegaming.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class BillingRequestDto {		
		
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
		
		public BillingRequestDto() {
			// TODO Auto-generated constructor stub
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

		@Override
		public String toString() {
			return "BillingDetails [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", pinCode="
					+ pinCode + ", email=" + email + ", phoneNumber=" + phoneNo + ", product=" + product + ", price="
					+ price + ", subTotal=" + subTotal + ", total=" + total + "]";
		}
		
		

	}


