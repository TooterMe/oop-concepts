package org.example.abstraction;

// Abstract class
abstract class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	// Abstract method (no implementation)
	public abstract void makeSound();

	// Concrete method
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
}

// Interface
interface Jumpable {
	void jump();
}

// Concrete class implementing the abstract class and interface
class Cat extends Animal implements Jumpable {
	public Cat(String name) {
		super(name);
	}

	// Implementation of the abstract method
	@Override
	public void makeSound() {
		System.out.println(name + " meows.");
	}

	// Implementation of the interface method
	@Override
	public void jump() {
		System.out.println(name + " is jumping.");
	}
}

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("Whiskers");

		cat.makeSound(); // Calls the overridden method in the Cat class
		cat.jump();      // Calls the method defined in the Jumpable interface
		cat.sleep();     // Calls the method inherited from the Animal class
	}
}
