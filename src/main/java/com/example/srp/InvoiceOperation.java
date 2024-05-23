package com.example.srp;

public class InvoiceOperation {
	private Product product;
	private int quantity;

	public InvoiceOperation(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public void invoiceCalculate() {
		System.out.println("Invoice Calculated -> " + quantity * product.getPrice());
	}

	public void invoiceSave() {
		System.out.println("Invoice Saved -> " + this);
	}

	public void invoicePrinter() {
		System.out.println("Invoice Printed -> " + this);
	}

	@Override
	public String toString() {
		return "Invoice{" + "product=" + product + ", quantity=" + quantity + '}';
	}
}
