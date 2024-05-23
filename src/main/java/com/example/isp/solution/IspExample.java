package com.example.isp.solution;

public class IspExample {
	public static void main(String[] args) {
		FlyableVehicle flyableVehicle = new Airplane();
		flyableVehicle.startEngine();
		flyableVehicle.fly();
		flyableVehicle.stopEngine();

		DrivableVehicle drivableVehicle = new Car();
		drivableVehicle.startEngine();
		drivableVehicle.drive();
		drivableVehicle.stopEngine();
	}
}
