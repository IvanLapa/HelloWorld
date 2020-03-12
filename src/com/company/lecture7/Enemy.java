package com.company.lecture7;

public class Enemy implements Mortal {
    public int health;
    public String name;
    public  Enemy(String name, int health) {
        this.name = name;
        this.health = health;
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
    public boolean isAlive (){
        return this.health>0;
    }
}
