# Intro To Java: The 4 Main Concepts Of Object-Oriented Programming
The four main concepts of object-oriented programming (OOP) in Java are **inheritance**, **encapsulation**, **polymorphism**, and **abstraction**. These concepts form the foundation of object-oriented programming and provide powerful tools for designing modular, reusable, and flexible code.

## Inheritance: 
Inheritance is a concept that allows classes to inherit properties and behaviors from other classes. Think of it as a parent-child relationship, where the child class (subclass) can inherit the characteristics of the parent class (superclass). This promotes code reuse and helps create a hierarchical structure. For example, you can have a generic "Vehicle" class and specific "Car" and "Motorcycle" classes that inherit from it, inheriting common attributes like "brand" and "year," as well as behaviors like "drive" or "honk."  
[See more...](inheritance/src/main/java/org/example/inheritance/README.md)

## Encapsulation: 
Encapsulation focuses on bundling related data and methods together within a class and controlling access to them. It helps in hiding the internal implementation details of an object and exposing only the necessary interface. Think of it as enclosing an object in a protective capsule. By using access modifiers like "private," "protected," and "public," we can control how other parts of the program interact with the object's internal state. For example, a "BankAccount" class can encapsulate sensitive data like the account number and balance, allowing controlled access through methods like "deposit" and "withdraw."  
[See more...](encapsulation/src/main/java/org/example/encapsulation/README.md)

# Polymorphism: 
Polymorphism refers to the ability of objects of different classes to be treated as objects of a common superclass or interface. It allows us to write code that can handle objects of different types in a generic way. For example, you can have a superclass called "Animal" and subclasses like "Dog" and "Cat." Even though they are different types, you can treat them as "Animal" objects and call common methods like "makeSound." This promotes flexibility, extensibility, and code reuse.  
[See more...](polymorphism/src/main/java/org/example/polymorphism/README.md)

# Abstraction: 
Abstraction involves representing essential features or behaviors of real-world entities in a simplified manner, hiding unnecessary details. It allows us to work with objects at a higher level of understanding without worrying about the specific implementation. For example, you can have an abstract class called "Shape" that defines a method called "calculateArea," but the actual implementation is left to the subclasses like "Rectangle" or "Circle." Abstraction allows us to focus on the important aspects of an object and ignore the complexities, making the code more maintainable and adaptable.  
[See more...](abstraction/src/main/java/org/example/abstraction/README.md)