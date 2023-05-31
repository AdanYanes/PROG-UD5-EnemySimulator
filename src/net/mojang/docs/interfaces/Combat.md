# Combat Interface

The `Combat` interface is a part of the `net.mojang.interfaces` package and extends the `Damage` interface.

## Interface Description

The `Combat` interface defines the behavior related to combat in the game.

## Methods

- `public int attack()`: Represents the attack behavior. Classes that implement this interface must provide an implementation of this method.

## Inherited Methods

The `Combat` interface inherits the following methods from the `Damage` interface:

- `public void takeDamage(int attack)`: Represents the behavior of taking damage from an attack. Classes that implement this interface must provide an implementation of this method.

