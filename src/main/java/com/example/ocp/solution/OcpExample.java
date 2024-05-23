package com.example.ocp.solution;

public class OcpExample {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("Bat", 10, 1000);

		InvoiceDao invoiceDao = new InvoiceDaoDbImpl();
		invoiceDao.save(invoice);

		invoiceDao = new InvoiceDaoWSImpl();
		invoiceDao.save(invoice);

		invoiceDao = new InvoiceDaoFileImpl();
		invoiceDao.save(invoice);
	}
}
