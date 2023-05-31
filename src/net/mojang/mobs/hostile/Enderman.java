package net.mojang.mobs.hostile;

import net.mojang.abstracts.HostileMob;

public class Enderman extends HostileMob{

    public Enderman(int health, int strength) {
        super(health, strength);
    }

    @Override
    public void move() {
        System.out.println("Se teletransporta detras");
    }
    
    public int getHealth(){
        return this.health;
    }
    
}
