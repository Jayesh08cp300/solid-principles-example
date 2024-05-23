package com.example.srp.solution;

public class InvoicePrinter {
	private Invoice invoice;

	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}

	public void invoicePrinter() {

		if (null == invoice) {
			throw new RuntimeException("Invoice not set properly.");
		}

		System.out.println("Invoice Printed -> " + invoice);
	}
}
