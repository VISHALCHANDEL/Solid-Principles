# SOLID Principles

This folder contains examples and explanations of the **SOLID Principles** of Object-Oriented Design.
SOLID principles help developers write **clean, maintainable, scalable, and loosely coupled code**.

These principles are widely used in **software engineering, system design, and large-scale applications**.

---

# What is SOLID?

**SOLID** is an acronym for five design principles introduced by **Robert C. Martin (Uncle Bob)** to improve object-oriented design.

| Letter | Principle                       |
| ------ | ------------------------------- |
| S      | Single Responsibility Principle |
| O      | Open/Closed Principle           |
| L      | Liskov Substitution Principle   |
| I      | Interface Segregation Principle |
| D      | Dependency Inversion Principle  |

---

# 1. Single Responsibility Principle (SRP)

**Definition**

A class should have **only one reason to change**, meaning it should have **only one responsibility**.

**Example**

❌ Bad Design

A class handling both **user data** and **database saving**.

```java
class User {
    String name;

    void saveToDatabase() {
        // database logic
    }
}
```

✅ Good Design

```java
class User {
    String name;
}

class UserRepository {
    void save(User user) {
        // database logic
    }
}
```

Now:

* `User` handles **user data**
* `UserRepository` handles **database operations**

---

# 2. Open Closed Principle (OCP)

**Definition**

Software entities should be **open for extension but closed for modification**.

This means:

* You should **extend behavior**
* Without **changing existing code**

**Example**

Instead of modifying a class every time we add a new shape, we extend it.

```java
interface Shape {
    double area();
}
```

```java
class Circle implements Shape {
    double radius;

    public double area() {
        return Math.PI * radius * radius;
    }
}
```

```java
class Rectangle implements Shape {
    double width, height;

    public double area() {
        return width * height;
    }
}
```

Now new shapes can be added **without modifying existing classes**.

---

# 3. Liskov Substitution Principle (LSP)

**Definition**

Objects of a subclass should be able to **replace objects of the parent class without breaking the program**.

**Example**

❌ Violation

If a `Bird` class has a `fly()` method, then a `Penguin` subclass cannot fly.

```java
class Bird {
    void fly() {}
}

class Penguin extends Bird {
    void fly() {
        throw new UnsupportedOperationException();
    }
}
```

✅ Correct Design

```java
class Bird {}

class FlyingBird extends Bird {
    void fly() {}
}

class Penguin extends Bird {}
```

---

# 4. Interface Segregation Principle (ISP)

**Definition**

A class should **not be forced to implement interfaces it does not use**.

Instead of one **large interface**, create **smaller specific interfaces**.

❌ Bad

```java
interface Worker {
    void work();
    void eat();
}
```

A robot worker does not eat.

✅ Good

```java
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}
```

---

# 5. Dependency Inversion Principle (DIP)

**Definition**

High-level modules should **not depend on low-level modules**.
Both should depend on **abstractions**.

**Example**

❌ Bad

```java
class LightBulb {
    void turnOn() {}
}

class Switch {
    LightBulb bulb = new LightBulb();
}
```

The switch directly depends on the bulb.

✅ Good

```java
interface Switchable {
    void turnOn();
}
```

```java
class LightBulb implements Switchable {
    public void turnOn() {}
}
```

```java
class Switch {
    Switchable device;

    Switch(Switchable device) {
        this.device = device;
    }
}
```

Now the switch can control **any device**.

---

# Why SOLID Principles Are Important

Using SOLID principles leads to:

* Cleaner code
* Better maintainability
* Easier testing
* Low coupling
* High cohesion
* Better scalability in large systems

These principles are commonly used in:

* **Java**
* **Spring Boot**
* **System Design**
* **Enterprise applications**

---

# Folder Structure

```
solid-principles/
│
├── SRP/
├── OCP/
├── LSP/
├── ISP/
└── DIP/
```

Each folder contains **examples and explanations** for the corresponding principle.

---

# References

* Clean Architecture – Robert C. Martin
* Clean Code – Robert C. Martin
* Design Principles in Object-Oriented Programming

---

⭐ If you find this helpful, consider giving the repository a star.
