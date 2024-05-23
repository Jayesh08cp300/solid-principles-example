package com.example.dip.solution;

public class CreditCard implements BankCard {
	public void doTransaction(long amount) {
		System.out.println("Credit Card Transaction ->" + amount);
	}
}
