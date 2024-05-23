package com.example.srp.solution;

public class Invoice {
	private Product product;
	private int quantity;
	private float total;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
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
		return "Invoice{" + "product=" + product + ", quantity=" + quantity + ", total=" + total + '}';
	}
}
