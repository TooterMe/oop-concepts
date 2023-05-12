# Encapsulation

Encapsulation is another important principle of object-oriented programming that focuses on bundling related data (attributes) and methods (behaviors) together within a class, and controlling access to that class's internal details. It helps in achieving data hiding and abstraction.

In Java, encapsulation is typically achieved by using access modifiers (e.g., `private`, `protected`, `public`) to restrict access to the internal state of an object, and providing public methods (getters and setters) to manipulate that state.

Here's an example to illustrate encapsulation in Java:

```java
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. New balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);
        
        // Accessing account details using public methods
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Current balance: " + account.getBalance());
        
        // Depositing and withdrawing money
        account.deposit(500.0);
        account.withdraw(200.0);
    }
}
```

In this example, we have a `BankAccount` class that encapsulates the account number and balance using private access modifiers. The class provides public methods `getAccountNumber()` and `getBalance()` to access the account details, while the `deposit()` and `withdraw()` methods provide controlled access to manipulate the account balance.

By encapsulating the account details and providing public methods, we hide the internal implementation details of the `BankAccount` class, allowing users of the class to interact with the object using a well-defined interface. This enhances data security, as the account balance can only be modified through the defined methods and according to the implemented logic.

Output:
```
Account number: 123456789
Current balance: 1000.0
500.0 deposited successfully. New balance: 1500.0
200.0 withdrawn successfully. New balance: 1300.0
```

In this way, encapsulation helps in organizing and protecting the internal state of an object, providing better control over how the data is accessed and modified. It also allows for easier modification of the internal implementation without affecting other parts of the program that use the class, promoting code maintainability and reducing dependencies.

The working example can be found in [here](Main.java)