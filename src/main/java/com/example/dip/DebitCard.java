package com.example.dip;

public class DebitCard implements BankCard {
	public void doTransaction(long amount) {
		System.out.println("Debit Card Transaction ->" + amount);
	}
}
