package com.example.dip.solution;

public class DipExample {
	public static void main(String[] args) {
		ShoppingCard shoppingCard = new ShoppingCard(new CreditCard());
		shoppingCard.doPayment(1000);
		ShoppingCard shoppingCard2 = new ShoppingCard(new DebitCard());
		shoppingCard2.doPayment(1000);
	}
}
