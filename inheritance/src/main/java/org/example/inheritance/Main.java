package org.example.inheritance;

// Parent class
class Vehicle {
	protected String brand;
	protected int year;

	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	public void honk() {
		System.out.println("Honk honk!");
	}
}

// Child class inheriting from the Vehicle class
class Car extends Vehicle {
	protected int numberOfSeats;

	public Car(String brand, int year, int numberOfSeats) {
		super(brand, year);
		this.numberOfSeats = numberOfSeats;
	}

	public void drive() {
		System.out.println("The car is driving.");
	}
}

// Main class to demonstrate the inheritance
public class Main {
	public static void main(String[] args) {
		Car myCar = new Car("Toyota", 2021, 5);

		myCar.honk();  // Inherited method from the Vehicle class
		myCar.drive(); // Method specific to the Car class

		System.out.println("Brand: " + myCar.brand);
		System.out.println("Year: " + myCar.year);
		System.out.println("Number of seats: " + myCar.numberOfSeats);
	}
}