package com.example.srp.solution;

public class SrpExample {
	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Bat");
		product.setPrice(1000);

		Invoice invoice = new Invoice();
		invoice.setProduct(product);
		invoice.setQuantity(10);
		invoice.setTotal(new InvoiceCalculator(invoice).invoiceCalculate());

		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
		invoicePrinter.invoicePrinter();

		InvoiceDao invoiceDao = new InvoiceDao(invoice);
		invoiceDao.invoiceSave();
	}
}
