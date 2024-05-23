package com.example.isp.solution;

public class Car implements DrivableVehicle {
	@Override
	public void startEngine() {
		System.out.println("Car started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Car stopped");
	}

	@Override
	public void drive() {
		System.out.println("car driving");
	}

}
