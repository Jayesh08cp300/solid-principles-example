package com.example.dip;

public class DipExample {
	public static void main(String[] args) {
		ShoppingCard shoppingCard = new ShoppingCard();
		shoppingCard.doPaymentCreditCard(1000);
		ShoppingCard shoppingCard2 = new ShoppingCard();
		shoppingCard2.doPaymentDebitCard(1000);
	}
}
