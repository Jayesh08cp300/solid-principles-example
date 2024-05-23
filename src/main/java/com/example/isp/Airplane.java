package com.example.isp;

public class Airplane implements Vehicle {
	@Override
	public void startEngine() {
		System.out.println("Airplane started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Airplane stopped");
	}

	@Override
	public void drive() {
		throw new RuntimeException("Unable to Drive Airplane.");
	}

	@Override
	public void fly() {
		System.out.println("Airplane flying");
	}
}
