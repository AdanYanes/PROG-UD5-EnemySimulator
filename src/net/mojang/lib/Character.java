package net.mojang.lib;

public class Character {
    
    private int health;
    private int defense;
    private int strength;

    public Character(int defense, int strength){
        this.health = 12;
        this.defense = defense;
        this.strength = strength;
    }

}
