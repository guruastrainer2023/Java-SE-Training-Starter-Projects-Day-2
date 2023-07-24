package com.training.bean;

public class DiscountCalculator {
	private double price=100.00;
	private int quantity=10;
	private double discountPercent;
	
	public DiscountCalculator(double discountPercent) {
		super();
		this.discountPercent = discountPercent;
	}
	
	public double getDiscountAmount() {
		return this.price*this.quantity*this.discountPercent;
	}

	@Override
	public String toString() {
		return "DiscountCalculator [price=" + price + ", quantity=" + quantity + ", discountPercent=" + discountPercent
				+ ", getDiscountAmount()=" + getDiscountAmount() + "]";
	}
	
	
	
}
