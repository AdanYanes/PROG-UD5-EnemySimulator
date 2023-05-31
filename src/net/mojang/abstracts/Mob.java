package net.mojang.abstracts;

public abstract class Mob {
    
    protected int health;
    protected int strength;

    public Mob(int health, int strength){
        this.health = health;
        this.strength = strength;
    }

    public abstract void move();

}
