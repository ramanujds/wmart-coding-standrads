
## **Increment 1: Basics of Java Programming**
### **1.1 Variables and Data Types**
#### **Concept**
- Variables store data values.
- Java has primitive and reference data types.

#### **Primitive Data Types**
- `int` (integer), `double` (floating point), `char` (character), `boolean` (true/false), `float`, `long`, `short`, `byte`

#### **Reference Data Types**
- Objects, Arrays, Strings, etc.

#### **Example**
```java
public class ProductExample {
    public static void main(String[] args) {
        String productName = "Laptop";
        double price = 800.50;
        int quantity = 2;
        boolean inStock = true;
        
        System.out.println("Product: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity Available: " + quantity);
        System.out.println("In Stock: " + inStock);
    }
}
```

#### **TODOs:**
- Implement a `Customer` class with attributes `name`, `email`, and `phoneNumber`.
- Add a method to display customer details.

### **1.2 Control Flow (Conditional Statements and Loops)**
#### **Concept**
- `if-else`, `switch-case`
- Loops: `for`, `while`, `do-while`

#### **Example**
```java
public class ShoppingCartExample {
    public static void main(String[] args) {
        int quantity = 3;
        double price = 500.75;
        double totalCost = quantity * price;

        if (totalCost > 1000) {
            System.out.println("Eligible for free shipping!");
        } else {
            System.out.println("Shipping charges apply.");
        }

        String category = "Electronics";
        switch (category) {
            case "Electronics":
                System.out.println("This product belongs to Electronics category.");
                break;
            case "Clothing":
                System.out.println("This product belongs to Clothing category.");
                break;
            case "Groceries":
                System.out.println("This product belongs to Groceries category.");
                break;
            default:
                System.out.println("Unknown category.");
        }

        System.out.println("Product Price Breakdown:");
        for (int i = 1; i <= quantity; i++) {
            System.out.println("Item " + i + " Price: $" + price);
        }
    }
}
```

#### **TODOs:**
- Implement logic to calculate total price based on a product list using loops.
- Use a switch case to categorize products into `Electronics`, `Clothing`, and `Groceries`.



## **Increment 2: Object-Oriented Programming (OOP) Concepts**
### **2.1 Classes and Objects**
#### **Concept**
- A class is a blueprint for objects.
- An object is an instance of a class.

#### **Example**
```java
class Product {
    String name;
    double price;
    
    void displayProduct() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Laptop";
        product1.price = 800.50;
        
        product1.displayProduct();
    }
}
```

#### **TODOs:**
- Create a `Customer` class and link it to a `ShoppingCart`.
- Implement methods to add and remove items from the cart.

### **2.2 Encapsulation, Inheritance, and Polymorphism**
#### **Concepts**
- **Encapsulation**: Wrapping data and methods in a single unit.
- **Inheritance**: Deriving a new class from an existing one.
- **Polymorphism**: Method overloading and overriding.

#### **Example**
```java
class Item {
    String name;
    double price;
    
    void displayItem() {
        System.out.println("Item: " + name + ", Price: " + price);
    }
}

class Electronics extends Item {
    int warranty;
    
    void displayItem() {
        super.displayItem();
        System.out.println("Warranty: " + warranty + " years");
    }
}

public class ShoppingTest {
    public static void main(String[] args) {
        Electronics laptop = new Electronics();
        laptop.name = "MacBook";
        laptop.price = 1200.99;
        laptop.warranty = 2;
        
        laptop.displayItem();
    }
}
```

#### **TODOs:**
- Add a `DiscountedProduct` class that extends `Product`.
- Override the `displayProduct()` method to show discounted price.

## **Increment 3: Exception Handling & Java Collection Framework**
### **3.1 Exception Handling**
#### **Concept**
- Handling runtime errors using `try`, `catch`, `finally`, and `throws`.

#### **Example**
```java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } finally {
            System.out.println("Execution Completed");
        }
    }
}
```

#### **TODOs:**
- Add exception handling for out-of-stock products.
- Implement a custom exception `ProductNotFoundException`.

### **3.2 Java Collection Framework (JCF)**
#### **Concept**
- Collections manage groups of objects efficiently.
- Common collections: `ArrayList`, `HashSet`, `HashMap`.

#### **TODOs:**
- Store product inventory using `HashMap`.
- Implement a `Set` to track unique customers.


## **Increment 4: Maven & Unit Testing**
### **4.1 Introduction to Maven**
#### **Concept**
- Maven is a build automation tool used in Java projects.
- It manages dependencies, builds, and runs projects efficiently.

#### **Example: Setting Up Maven**
- Install Maven and create a `pom.xml` file with dependencies.
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.shoppingcart</groupId>
    <artifactId>shopping-cart</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

#### **TODOs:**
- Set up a Maven project for the shopping cart system.
- Manage dependencies using `pom.xml`.

### **4.2 Unit Testing with JUnit**
#### **Concept**
- JUnit is a framework for writing and running Java unit tests.
- Helps validate the correctness of code.

#### **Example: Writing a JUnit Test**
```java
import static org.junit.Assert.*;
import org.junit.Test;

public class ProductTest {
    @Test
    public void testProductPrice() {
        Product product = new Product();
        product.setPrice(100.0);
        assertEquals(100.0, product.getPrice(), 0);
    }
}
```

#### **TODOs:**
- Write unit tests for `ShoppingCart` methods.
- Implement test cases for exception handling.



## **Final Case Study - Shopping Cart System**
### **Case Study Implementation**
#### **Concept**
A complete shopping cart system using OOP, collections, and exception handling.

#### **Example**
```java
import java.util.ArrayList;

class Product {
    String name;
    double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class Cart {
    private ArrayList<Product> products = new ArrayList<>();
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product product : products) {
            product.displayProduct();
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("Laptop", 1200.99));
        cart.addProduct(new Product("Phone", 699.49));
        
        cart.displayCart();
    }
}
```

#### **TODOs:**
- Implement a checkout system that calculates total cost and applies discounts.
- Allow users to remove products from the cart.
- Store order history using a `List`.
- Add logging and error handling for a robust system.
- Unit test the core functionalities of the shopping cart system.
- Build the project using Maven and run it from the command line.
- Document the project structure and usage in a README file.
- Share the project on GitHub for collaboration and feedback.



