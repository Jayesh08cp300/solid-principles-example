package com.example.dip;

public class ShoppingCard {

	public void doPaymentCreditCard(long amount) {
		new CreditCard().doTransaction(amount);
	}

	public void doPaymentDebitCard(long amount) {
		new DebitCard().doTransaction(amount);
	}
}
