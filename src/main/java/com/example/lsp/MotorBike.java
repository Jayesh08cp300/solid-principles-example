package com.example.lsp;

public class MotorBike implements Bike {
	private boolean isEngineOn;

	@Override
	public void turnOnEngine() {
		isEngineOn = true;
	}

	@Override
	public void accelerate(int speed) {
		if (isEngineOn) {
			System.out.println("MotorBike is running on -" + speed);
		} else {
			System.out.println("Please Turn On the Engine.");
		}
	}
}
