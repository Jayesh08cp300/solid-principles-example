package com.example.ocp;

public class InvoiceDao {
	private Invoice invoice;

	public InvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}

	public void saveToDb() {
		System.out.println("Save to database ->" + invoice);
	}

	public void saveToFile() {
		System.out.println("Save to file ->" + invoice);
	}

	public void saveToWebService() {
		System.out.println("Save to webservice ->" + invoice);
	}
}
