package net.mojang.abstracts;

import net.mojang.interfaces.Combat;

public abstract class HostileMob extends Mob implements Combat {

    public HostileMob(int health, int strength) {
        super(health, strength);
    }
    
    @Override
    public int attack(){
        return strength;
    }

    @Override
    public void takeDamage(int attack){
        this.health -= attack;

        if(this.health < 0){
            this.health = 0;
        }

        System.out.println("ha recibido " + attack + " puntos de daño y tiene " + this.health + " puntos de vida restante");
    }
}
