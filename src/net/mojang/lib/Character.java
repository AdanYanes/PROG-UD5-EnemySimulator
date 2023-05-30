package net.mojang.lib;

import net.mojang.interfaces.Combat;

public class Character implements Combat{
    
    private int health;
    private int defense;
    private int strength;

    public Character(int defense, int strength){
        this.health = 12;
        this.defense = defense;
        this.strength = strength;
    }

    @Override
    public int attack(){
        return this.strength;
    }

    @Override
    public void takeDamage(int attack) {
        int totalDamage = 0;
        if(attack > this.defense){
            totalDamage = attack - this.defense;
            this.health -= totalDamage;
        }

        if(this.health < 0){
            this.health = 0;
        }

        System.out.println("Ha recibido " + totalDamage + " y tiene " + this.health + " puntos de vida restante");
    }
}
