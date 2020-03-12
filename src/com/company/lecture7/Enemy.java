package com.company.lecture7;

public class Enemy {
    public int health;
    public Enemy(int a){
        this.health=a;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth(){
        return this.health;
    }
    public int takeDamage(int damage){
       return this.health-damage;
    }
}
