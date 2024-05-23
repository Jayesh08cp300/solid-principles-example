package com.example.ocp;

public class OcpExample {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("Bat", 10, 1000);
		InvoiceDao invoiceDao = new InvoiceDao(invoice);
		invoiceDao.saveToDb();
		invoiceDao.saveToFile();
		invoiceDao.saveToWebService();
	}
}
