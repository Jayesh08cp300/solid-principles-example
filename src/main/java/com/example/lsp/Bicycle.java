package com.example.lsp;

public class Bicycle implements Bike {

	@Override
	public void turnOnEngine() {
		throw new AssertionError("There is no Engine.");
	}

	@Override
	public void accelerate(int speed) {
		System.out.println("Bicycle is running on -" + speed);
	}
}
