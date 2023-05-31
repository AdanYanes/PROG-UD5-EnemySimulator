# Enderman Class

The `Enderman` class is a part of the `net.mojang.mobs.hostile` package and extends the `HostileMob` class.

## Class Description

The `Enderman` class represents an Enderman mob in the game. It inherits from the `HostileMob` class and provides specific behavior and characteristics for Enderman mobs.

## Constructors

- `public Enderman(int health, int strength)`: Initializes a new instance of the `Enderman` class with the specified health and strength values.

## Methods

- `public void move()`: Overrides the `move()` method from the `HostileMob` class and defines the movement behavior for the Enderman. In this case, the Enderman teleports behind its target.
- `public int getHealth()`: Returns the current health of the Enderman.

## Inherited Properties and Methods

The `Enderman` class inherits the following properties and methods from the `HostileMob` class:

- `protected int health`: Represents the health points of the Enderman.
- `protected int strength`: Represents the strength points of the Enderman's attacks.
- `public int attack()`: Overrides the `attack()` method from the `Combat` interface and returns the strength of the Enderman's attack.
- `public void takeDamage(int attack)`: Overrides the `takeDamage(int attack)` method from the `Damage` interface and updates the health of the Enderman after receiving an attack.

