package com.aop.entity;

public class Product {

	private String name;
	private int stoctAmount;
	private double unitPrice;

	public Product() {

	}

	public Product(String name, int stoctAmount, double unitPrice) {
		this.name = name;
		this.stoctAmount = stoctAmount;
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStoctAmount() {
		return stoctAmount;
	}

	public void setStoctAmount(int stoctAmount) {
		this.stoctAmount = stoctAmount;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", stoctAmount=" + stoctAmount + ", unitPrice=" + unitPrice + "]";
	}

}
