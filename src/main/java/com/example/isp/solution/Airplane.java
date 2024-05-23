package com.example.isp.solution;

public class Airplane implements FlyableVehicle {
	@Override
	public void startEngine() {
		System.out.println("Airplane started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Airplane stopped");
	}

	@Override
	public void fly() {
		System.out.println("Airplane flying");
	}
}
