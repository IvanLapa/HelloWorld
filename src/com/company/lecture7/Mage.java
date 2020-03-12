package com.company.lecture7;

public class Mage extends Hero{
    public Mage (String a){
        super(a);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        int damage=20;
        enemy.takeDamage(damage);
    }
}

