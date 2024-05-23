package com.example.ocp.solution;

public class InvoiceDaoDbImpl implements InvoiceDao {

	@Override
	public void save(Invoice invoice) {
		System.out.println("Save to database ->" + invoice);
	}
}
