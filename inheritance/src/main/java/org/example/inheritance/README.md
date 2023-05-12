# Inheritance

Inheritance is a fundamental principle of object-oriented programming (OOP) that allows a class to inherit properties
and behaviors from another class, known as the superclass or parent class. In Java, inheritance is implemented using the
keyword `extends`.

Here's an example to illustrate inheritance in Java:

```java
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
```

In this example, we have a parent class `Vehicle` that has a `brand` and `year` attributes, as well as a `honk()`
method. The child class `Car` extends the `Vehicle` class and adds an additional attribute `numberOfSeats` and a
method `drive()`.

When we create an instance of the `Car` class, it can access the inherited `honk()` method from the `Vehicle` class, as
well as its own `drive()` method. Additionally, it can access the `brand` and `year` attributes inherited from
the `Vehicle` class, as well as its own `numberOfSeats` attribute.

Output:

```
Honk honk!
The car is driving.
Brand: Toyota
Year: 2021
Number of seats: 5
```

This example demonstrates how the `Car` class inherits the properties and behaviors from the `Vehicle` class, allowing
code reuse and creating a hierarchical relationship between classes.

The working example can be found in [here](Main.java)