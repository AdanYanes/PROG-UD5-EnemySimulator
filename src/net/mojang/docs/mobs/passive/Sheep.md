# Sheep Class

The `Sheep` class is a part of the `net.mojang.mobs.passive` package and extends the `PassiveMob` class.

## Class Description

The `Sheep` class represents a sheep mob in the game. It inherits from the `PassiveMob` class and provides specific behavior and characteristics for sheep mobs.

## Constructors

- `public Sheep(int health, int strength)`: Initializes a new instance of the `Sheep` class with the specified health and strength values.

## Methods

- `public void move()`: Overrides the `move()` method from the `PassiveMob` class and defines the movement behavior for the sheep. In this case, the sheep moves around in the field.
- `public int getHealth()`: Returns the current health of the sheep.

## Inherited Properties and Methods

The `Sheep` class inherits the following properties and methods from the `PassiveMob` class:

- `protected int health`: Represents the health points of the sheep.
- `protected int strength`: Represents the strength points of the sheep's attacks.
- `public void takeDamage(int attack)`: Overrides the `takeDamage(int attack)` method from the `Damage` interface and updates the health of the sheep after receiving an attack.

