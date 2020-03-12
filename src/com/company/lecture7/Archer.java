package com.company.lecture7;

public class Archer extends Hero{
    public Archer (String a){
        super(a);
    }
    public void attackEnemy(Enemy enemy) {
        int damage=10;
        enemy.takeDamage(damage);
        System.out.println("Archer атакует врага");
    }
}
