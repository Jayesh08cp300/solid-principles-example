package com.example.lsp.solution;

public class LspExample {

	private static void runMotorBike(BikeWithEngine bike, int speed) {
		bike.turnOnEngine();
		bike.accelerate(speed);
	}

	private static void runBicycle(BikeWithoutEngine bike, int speed) {
		bike.accelerate(speed);
	}

	public static void main(String[] args) {

		BikeWithEngine motorBike = new MotorBike();
		runMotorBike(motorBike, 40);

		BikeWithoutEngine bicycle = new Bicycle();
		runBicycle(bicycle, 10);
	}

}
