package com.example.isp;

public class Car implements Vehicle {
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

	@Override
	public void fly() {
		throw new RuntimeException("Unable to fly car.");
	}
}
