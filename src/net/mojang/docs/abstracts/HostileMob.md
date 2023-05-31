# HostileMob Class

The `HostileMob` class is a part of the `net.mojang.abstracts` package and extends the `Mob` class while implementing the `Combat` interface.

## Class Description

The `HostileMob` class represents a hostile mob in the game. It is an abstract class that provides a common structure and behavior for all hostile mobs. It extends the `Mob` class, inheriting its properties and methods, and implements the `Combat` interface to define combat-related functionality.

## Constructors

- `public HostileMob(int health, int strength)`: Initializes a new instance of the `HostileMob` class with the specified health and strength values.

## Methods

- `public int attack()`: Overrides the `attack()` method from the `Combat` interface and returns the strength of the hostile mob's attack.
- `public void takeDamage(int attack)`: Overrides the `takeDamage(int attack)` method from the `Combat` interface and updates the health of the hostile mob after receiving an attack. If the health drops below 0, it is set to 0. The method also displays a message indicating the amount of damage received and the remaining health of the mob.

## Inherited Properties and Methods

The `HostileMob` class inherits the following properties and methods from the `Mob` class:

- `protected int health`: Represents the health points of the mob.
- `protected int strength`: Represents the strength of the mob's attacks.
- `public int getHealth()`: Returns the current health of the mob.
- `public int getStrength()`: Returns the strength of the mob's attacks.
- `public abstract void move()`: Abstract method that defines the movement behavior of the mob.

## Implemented Interface

The `HostileMob` class implements the `Combat` interface, which requires the following methods:

- `public int attack()`: Defines the attack behavior of the mob.
- `public void takeDamage(int attack)`: Defines the behavior of the mob when taking damage from an attack.

