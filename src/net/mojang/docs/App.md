# App Class

The `App` class represents the main entry point of the program.

## Description

The program simulates a combat scenario between a character and a zombie in a text-based game. The user can choose a weapon and armor for the character, and the combat proceeds with both the character and the zombie taking turns attacking each other. The combat continues until either the character or the zombie is defeated.

## Class Structure

- `App` class:
  - Main method: `public static void main(String[] args)`
  - Class variables:
    - `Scanner scanner`: Used for user input
    - `Random random`: Used for generating random numbers
    - `String option`: Stores user input for weapon and armor options
    - `int strength`: Stores the strength of the chosen weapon
    - `int defense`: Stores the defense of the chosen armor
    - `int counter`: Counts the number of turns in the combat
  - Methods:
    - `main(String[] args)`: Contains the main logic for the combat simulation

## Main Logic

1. User Input:
   - Prompt the user to choose a weapon from the available options.
   - Prompt the user to choose an armor from the available options.
   - Store the user's choices in the `option` variable.

2. Weapon Selection:
   - Use a `switch` statement to assign the appropriate strength value based on the chosen weapon.
   - If the chosen weapon is not available, assign a default strength value of 1.

3. Armor Selection:
   - Use another `switch` statement to assign the appropriate defense value based on the chosen armor.
   - If the chosen armor is not available, assign a default defense value of 0.

4. Character and Zombie Creation:
   - Create a `Character` object with the chosen defense and strength values.
   - Create a `Zombie` object with predefined health and strength values.

5. Combat Simulation:
   - Start a loop that continues as long as both the zombie and character have positive health.
   - Inside the loop:
     - Attack the zombie using the character's attack strength and print the result.
     - Determine if the zombie will move or attack based on a random number.
     - If the zombie moves, print the movement message.
     - If the zombie attacks, let the character take damage and print the result.
     - Increment the turn counter.

6. Combat Outcome:
   - Determine the winner based on the remaining health of the character and zombie.
   - Print a message indicating the number of turns and the victorious party.

## External Dependencies

- `java.util.Scanner`: Used for user input
- `java.util.Random`: Used for generating random numbers
- `net.mojang.lib.Character`: Represents the character in the combat
- `net.mojang.mobs.hostile.Zombie`: Represents the zombie in the combat
