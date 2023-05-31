# Mob Class

The `Mob` class is a part of the `net.mojang.abstracts` package.

## Class Description

The `Mob` class is an abstract class that serves as a base for different types of mobs in the game.

## Properties

- `protected int health`: Represents the health points of the mob.
- `protected int strength`: Represents the strength points of the mob.

## Constructor

- `public Mob(int health, int strength)`: Initializes a new instance of the `Mob` class with the specified health and strength values.

## Abstract Method

- `public abstract void move()`: An abstract method that defines the movement behavior of the mob. Each subclass of `Mob` must implement this method according to its specific movement logic.

## Inherited Properties

The `Mob` class does not inherit any properties.

## Inherited Methods

The `Mob` class does not inherit any methods.

