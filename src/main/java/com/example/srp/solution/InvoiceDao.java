package com.example.srp.solution;

public class InvoiceDao {
	private Invoice invoice;

	public InvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}

	public void invoiceSave() {

		if (null == invoice) {
			throw new RuntimeException("Invoice not set properly.");
		}

		System.out.println("Invoice Saved -> " + invoice);
	}
}
