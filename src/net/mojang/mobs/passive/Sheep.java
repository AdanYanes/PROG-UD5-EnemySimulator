package net.mojang.mobs.passive;

import net.mojang.abstracts.PassiveMob;

public class Sheep extends PassiveMob{

    public Sheep(int health, int strength) {
        super(health, strength);
    }

    @Override
    public void move() {
        System.out.println("Se mueve por el campo");
    }
    public int getHealth(){
        return this.health;
    }
    
}
