# Polymorphism

Polymorphism is another important principle of object-oriented programming that allows objects of different classes to be treated as objects of a common superclass or interface. It enables the same method to be used for objects of different types, providing flexibility and extensibility to the code.

In Java, polymorphism is typically achieved through method overriding and method overloading.

Method overriding occurs when a subclass provides its own implementation of a method that is already defined in its superclass. The subclass method must have the same name, return type, and parameters as the superclass method. The `@Override` annotation is commonly used to indicate that a method is intended to override a superclass method.

Here's an example to illustrate method overriding and polymorphism in Java:

```java
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Calls the overridden method in the Dog class
        animal2.makeSound(); // Calls the overridden method in the Cat class
    }
}
```

In this example, we have a superclass `Animal` with a `makeSound()` method. The `Dog` and `Cat` classes extend the `Animal` class and override the `makeSound()` method with their own implementations.

In the `main()` method, we create instances of `Dog` and `Cat` but assign them to variables of type `Animal`. When we call the `makeSound()` method on these variables, the overridden method in the respective subclass is invoked, based on the actual object type.

Output:
```
The dog barks.
The cat meows.
```

Method overloading, on the other hand, occurs when a class has multiple methods with the same name but different parameters. The compiler determines the appropriate method to call based on the arguments passed to it.

Here's an example to illustrate method overloading and polymorphism in Java:

```java
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(2, 3); // Invokes the int version of the method
        double result2 = calculator.add(2.5, 3.5); // Invokes the double version of the method

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
```

In this example, the `Calculator` class has two `add()` methods, one accepting two integers and the other accepting two doubles. The methods have the same name but different parameter types.

In the `main()` method, we create an instance of the `Calculator` class and invoke the `add()` method with different arguments. The compiler determines which version of the method to call based on the argument types.

Output:
```
Result 1: 5
Result 2: 6.0
```

Polymorphism allows for writing more generic code that can handle objects of different types, making the code more flexible and adaptable. It facilitates code reuse, simplifies code maintenance, and promotes the concept of "programming to interfaces" rather than specific implementations, which leads to more modular and extensible code.

Working code for our animal example can be found [here](Main.java)