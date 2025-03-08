# Duck Behavior Simulation

## Introduction
This project is a Java-based simulation of different types of ducks and their behaviors, following the Strategy design pattern. Ducks exhibit different behaviors such as flying, swimming, and quacking, which are encapsulated using interfaces and separate implementations. This allows for dynamic behavior modification at runtime.

## Topics Used
- **Object-Oriented Programming (OOP)**
- **Interfaces and Polymorphism**
- **Strategy Design Pattern**
- **Encapsulation and Modularity**

## File Structure
```
DuckSimulation/
│── src/
│   ├── Main.java
│   ├── Duck.java
│   ├── FlyBehavior.java
│   ├── SwimBehavior.java
│   ├── QuackBehavior.java
│   ├── MallardDuck.java
│   ├── RedheadDuck.java
│   ├── RubberDuck.java
│   ├── DecoyDuck.java
│   ├── FlyWithWings.java
│   ├── NoFly.java
│   ├── Swim.java
│   ├── Float.java
│   ├── Drown.java
│   ├── Quack.java
│   ├── Squeak.java
│   ├── MuteQuack.java
```

## Description of Methods
### `Duck` Class
- `display()`: Abstract method implemented by all duck types to describe themselves.
- `performQuack()`: Calls the `quack()` method of the assigned `QuackBehavior`.
- `performSwim()`: Calls the `swim()` method of the assigned `SwimBehavior`.
- `performFly()`: Calls the `fly()` method of the assigned `FlyBehavior`.
- `setQuackBehavior(QuackBehavior qb)`: Allows changing the quack behavior dynamically.
- `setSwimBehavior(SwimBehavior sb)`: Allows changing the swim behavior dynamically.
- `setFlyBehavior(FlyBehavior fb)`: Allows changing the fly behavior dynamically.

### `FlyBehavior` Interface
- `fly()`: Implemented by `FlyWithWings` (ducks that fly) and `NoFly` (ducks that can't fly).

### `SwimBehavior` Interface
- `swim()`: Implemented by `Swim`, `Float`, and `Drown` to simulate different swimming behaviors.

### `QuackBehavior` Interface
- `quack()`: Implemented by `Quack`, `Squeak`, and `MuteQuack` to define different quacking styles.

### `Main` Class
- `testDuck(Duck duck)`: A helper method to test each duck’s behavior.
- `main(String[] args)`: Creates different duck objects and tests their behavior.

This project provides a flexible and scalable implementation of duck behaviors, adhering to clean code principles and modular design.

