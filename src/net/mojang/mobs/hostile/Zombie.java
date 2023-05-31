package net.mojang.mobs.hostile;

import net.mojang.abstracts.HostileMob;

public class Zombie extends HostileMob {

    public Zombie(int health, int strength) {
        super(health, strength);
    }

    @Override
    public void move() {
        System.out.println("Se mueve hacie el personaje");
    }

    public int getHealth(){
        return this.health;
    }
    
}
