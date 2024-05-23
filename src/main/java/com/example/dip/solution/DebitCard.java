package com.example.dip.solution;

public class DebitCard implements BankCard {
	public void doTransaction(long amount) {
		System.out.println("Debit Card Transaction ->" + amount);
	}
}
