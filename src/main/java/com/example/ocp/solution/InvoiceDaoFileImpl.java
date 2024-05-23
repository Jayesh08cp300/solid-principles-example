package com.example.ocp.solution;

public class InvoiceDaoFileImpl implements InvoiceDao {

	@Override
	public void save(Invoice invoice) {
		System.out.println("Save to file ->" + invoice);
	}
}
