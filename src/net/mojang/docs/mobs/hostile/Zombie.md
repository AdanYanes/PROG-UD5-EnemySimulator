# Zombie Class

The `Zombie` class is a part of the `net.mojang.mobs.hostile` package and extends the `HostileMob` class.

## Class Description

The `Zombie` class represents a zombie mob in the game. It inherits from the `HostileMob` class and provides specific behavior and characteristics for zombie mobs.

## Constructors

- `public Zombie(int health, int strength)`: Initializes a new instance of the `Zombie` class with the specified health and strength values.

## Methods

- `public void move()`: Overrides the `move()` method from the `HostileMob` class and defines the movement behavior for the zombie. In this case, the zombie moves towards the character.
- `public int getHealth()`: Returns the current health of the zombie.

## Inherited Properties and Methods

The `Zombie` class inherits the following properties and methods from the `HostileMob` class:

- `protected int health`: Represents the health points of the zombie.
- `protected int strength`: Represents the strength points of the zombie's attacks.
- `public int attack()`: Overrides the `attack()` method from the `Combat` interface and returns the strength of the zombie's attack.
- `public void takeDamage(int attack)`: Overrides the `takeDamage(int attack)` method from the `Damage` interface and updates the health of the zombie after receiving an attack.

