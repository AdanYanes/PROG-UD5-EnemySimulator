# Minecraft Mobs Interaction Simulation Project

In this project, we will develop a simulation of an old genre of games where the user interacts with the console to achieve a goal. Specifically, we will simulate the user's interaction with mobs from the game Minecraft.

## Project Description

The goal of this project is to develop a simulation where the user can interact with random mobs in Minecraft. Upon starting the program, a mob will be chosen from the implemented ones, and the in-game character will attempt to automatically eliminate it using random patterns.

This project utilizes abstract classes and interfaces to achieve a flexible and extensible implementation. The segregation of interfaces is maintained by dividing functionalities into smaller, specific interfaces, allowing each class to implement only the interfaces it requires. This avoids unnecessary dependencies, improves modularity, and facilitates code maintenance and evolution.

## Project Objectives

- Simulate the user's interaction with random mobs in Minecraft.
- Implement an automatic elimination strategy for the mobs using random patterns.
- Utilize abstract classes and interfaces for a flexible and extensible implementation.
- Adhere to the principle of interface segregation to enhance code modularity.

## Project Structure

The project is organized into the following classes:

- `Mob`: Class that defines the general actions mobs can perform.
- `HostileMob`: Class extending the `Mob` class, representing a mob with random behavior.
- `PassiveMob`: Class extending the `Mob` class, representing a mob with the only function being move.
- `Character`: Class that interacts with the mobs and performs automatic elimination using random patterns.
- `Enderman`: Class extending the `HostileMob` class.
- `Zombie`: Class extending the `HostileMob` class.
- `Sheep`: Class extending the `PassiveMob` class.

## Documentation

[App](./src/net/mojang/docs/App.md)
[Mob](./src/net/mojang/docs/abstracts/Mob.md)
[HostileMob](./src/net/mojang/docs/abstracts/HostileMob.md)
[PassiveMob](./src/net/mojang/docs/abstracts/PassiveMob.md)
[Combat](./src/net/mojang/docs/interfaces/Combat)
[Damage](./src/net/mojang/docs/interfaces/Damage.md)
[Character](./src/net/mojang/docs/lib/Character.md)
[Zombie](./src/net/mojang/docs/mobs/hostile/Zombie.md)
[Enderman](./src/net/mojang/docs/mobs/hostile/Enderman.md)
[Sheep](./src/net/mojang/docs/mobs/passive/Sheep.md)

