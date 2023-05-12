# Abstraction

Abstraction is a fundamental principle of object-oriented programming that focuses on hiding the complexity of an object's internal implementation and exposing only the essential details or behaviors to the outside world. It allows us to create abstract representations of real-world entities and interact with them at a higher level of abstraction.

In Java, abstraction is often achieved through abstract classes and interfaces. An abstract class is a class that cannot be instantiated and serves as a blueprint for its subclasses. It may contain abstract methods (methods without implementation) as well as concrete methods (methods with implementation). On the other hand, an interface defines a contract of methods that implementing classes must adhere to.

Here's an example to illustrate abstraction in Java using an abstract class and an interface:

```java
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
```

In this example, we have an abstract class `Animal` that defines an abstract method `makeSound()` and a concrete method `sleep()`. The class cannot be instantiated directly but serves as a base for its subclasses.

We also have an interface `Jumpable` that declares a single method `jump()`. The interface provides a contract that classes implementing it must fulfill.

The `Cat` class extends the `Animal` abstract class and implements the `Jumpable` interface. It provides implementations for the abstract method `makeSound()` and the interface method `jump()`. The class can also inherit and use the concrete method `sleep()` from the `Animal` class.

In the `main()` method, we create an instance of the `Cat` class and invoke the methods defined in the abstract class and interface. The abstraction allows us to interact with the `Cat` object at a higher level of abstraction, without worrying about the specific implementation details.

Output:
```
Whiskers meows.
Whiskers is jumping.
Whiskers is sleeping.
```

Abstraction helps in simplifying complex systems by providing a clear and concise interface to interact with objects. It allows for modular design, code reuse, and promotes separation of concerns. By focusing on the essential aspects of an object and hiding unnecessary details, abstraction enhances code maintainability and flexibility.

Working code can be found [here](Main.java)