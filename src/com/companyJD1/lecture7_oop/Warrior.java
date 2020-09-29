package com.companyJD1.lecture7_oop;

public class Warrior extends Hero {
    public Warrior (String a){
        super(a);
    }
    public void attackEnemy(Enemy enemy) {
            int damage=15;
            enemy.takeDamage(damage);
            System.out.println("Archer атакует врага");
        }
    }
