# PassiveMob Class

The `PassiveMob` class is a part of the `net.mojang.abstracts` package and extends the `Mob` class while implementing the `Damage` interface.

## Class Description

The `PassiveMob` class represents a passive mob in the game. It is an abstract class that provides a common structure and behavior for all passive mobs. It extends the `Mob` class, inheriting its properties and methods, and implements the `Damage` interface to define damage-related functionality.

## Constructors

- `public PassiveMob(int health, int strength)`: Initializes a new instance of the `PassiveMob` class with the specified health and strength values.

## Methods

- `public void takeDamage(int attack)`: Overrides the `takeDamage(int attack)` method from the `Damage` interface and updates the health of the passive mob after receiving an attack. If the health drops below 0, it is set to 0. The method also displays a message indicating the amount of damage received and the remaining health of the mob.

## Inherited Properties and Methods

The `PassiveMob` class inherits the following properties and methods from the `Mob` class:

- `protected int health`: Represents the health points of the mob.
- `protected int strength`: Represents the strength points of the mob's attacks.
- `public abstract void move()`: Abstract method that defines the movement behavior of the mob.

## Implemented Interface

The `PassiveMob` class implements the `Damage` interface, which requires the following method:

- `public void takeDamage(int attack)`: Defines the behavior of the mob when taking damage from an attack.

