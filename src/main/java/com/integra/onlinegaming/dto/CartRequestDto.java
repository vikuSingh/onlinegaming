package com.integra.onlinegaming.dto;

public class CartRequestDto {

	private String item;
	private double price;
	private int quantity;
	private int total;
	private String couponCode;

	public CartRequestDto() {
		// TODO Auto-generated constructor stub
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	@Override
	public String toString() {
		return "CartDetails [item=" + item + ", price=" + price + ", quantity=" + quantity + ", total=" + total
				+ ", couponCode=" + couponCode + "]";
	}

}
