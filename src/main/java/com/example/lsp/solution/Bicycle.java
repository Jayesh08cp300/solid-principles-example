package com.example.lsp.solution;

public class Bicycle implements BikeWithoutEngine {

	@Override
	public void accelerate(int speed) {
		System.out.println("Bicycle is running on -" + speed);
	}
}
