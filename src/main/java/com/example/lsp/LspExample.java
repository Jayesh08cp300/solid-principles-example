package com.example.lsp;

public class LspExample {

	private static void runBike(Bike bike, int speed) {
		bike.turnOnEngine();
		bike.accelerate(speed);
	}

	public static void main(String[] args) {

		Bike motorBike = new MotorBike();
		runBike(motorBike, 40);

		Bike bicycle = new Bicycle();
		runBike(bicycle, 10);
	}

}
