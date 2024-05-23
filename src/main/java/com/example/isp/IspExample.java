package com.example.isp;

public class IspExample {
	public static void main(String[] args) {
		try {
			Vehicle vehicle = new Airplane();
			vehicle.startEngine();
			vehicle.drive();
			vehicle.fly();
			vehicle.stopEngine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Vehicle vehicle = new Car();
			vehicle.startEngine();
			vehicle.drive();
			vehicle.fly();
			vehicle.stopEngine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
