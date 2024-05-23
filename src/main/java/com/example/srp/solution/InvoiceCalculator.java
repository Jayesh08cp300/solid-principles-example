package com.example.srp.solution;

public class InvoiceCalculator {
	private Invoice invoice;

	public InvoiceCalculator(Invoice invoice) {
		this.invoice = invoice;
	}

	public float invoiceCalculate() {

		if (null == invoice) {
			throw new RuntimeException("Invoice not set properly.");
		}

		return invoice.getQuantity() * invoice.getProduct()
				.getPrice();
	}
}
