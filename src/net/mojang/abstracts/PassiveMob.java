package net.mojang.abstracts;

import net.mojang.interfaces.Damage;

public abstract class PassiveMob extends Mob implements Damage {

    public PassiveMob(int health, int strength) {
        super(health, strength);
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
