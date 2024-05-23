package com.example.ocp.solution;

public class Invoice {
	private String product;
	private int quantity;
	private float total;

	public Invoice(String product, int quantity, float total) {
		this.product = product;
		this.quantity = quantity;
		this.total = total;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Invoice{" + "product='" + product + '\'' + ", quantity=" + quantity + ", total=" + total + '}';
	}
}
