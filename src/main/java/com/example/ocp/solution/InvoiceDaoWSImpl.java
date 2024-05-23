package com.example.ocp.solution;

public class InvoiceDaoWSImpl implements InvoiceDao {

	@Override
	public void save(Invoice invoice) {
		System.out.println("Save to webservice ->" + invoice);
	}
}
