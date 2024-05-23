package com.example.srp;

public class SrpExample {
	public static void main(String[] args) {
		InvoiceOperation invoiceOperation = new InvoiceOperation(new Product("Bat", 200), 10);
		invoiceOperation.invoiceCalculate();
		invoiceOperation.invoiceSave();
		invoiceOperation.invoicePrinter();
	}
}
