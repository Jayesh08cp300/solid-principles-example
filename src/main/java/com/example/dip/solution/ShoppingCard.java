package com.example.dip.solution;

public class ShoppingCard {
	private BankCard bankCard;

	public ShoppingCard(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void doPayment(long amount) {
		bankCard.doTransaction(amount);
	}
}
