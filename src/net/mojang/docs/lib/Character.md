# Character Class

The `Character` class is a part of the `net.mojang.lib` package and implements the `Combat` interface.

## Class Description

The `Character` class represents a character in the game. It implements the `Combat` interface to define combat-related functionality.

## Properties

- `private int health`: Represents the health points of the character.
- `private int defense`: Represents the defense points of the character.
- `private int strength`: Represents the strength points of the character.

## Constructor

- `public Character(int defense, int strength)`: Initializes a new instance of the `Character` class with the specified defense and strength values. The health is set to a default value of 12.

## Methods

- `public int getHealth()`: Returns the current health of the character.
- `public int attack()`: Overrides the `attack()` method from the `Combat` interface and returns the strength of the character's attack.
- `public void takeDamage(int attack)`: Overrides the `takeDamage(int attack)` method from the `Combat` interface and updates the health of the character after receiving an attack. The damage calculation takes the character's defense into account. If the health drops below 0, it is set to 0. The method also displays a message indicating the amount of damage received and the remaining health of the character.

## Implemented Interface

The `Character` class implements the `Combat` interface, which requires the following methods:

- `public int attack()`: Defines the attack behavior of the character.
- `public void takeDamage(int attack)`: Defines the behavior of the character when taking damage from an attack.

